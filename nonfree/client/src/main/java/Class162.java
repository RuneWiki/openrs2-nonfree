import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class162 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
	private int anInt4166 = 0;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[32];

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "[B")
	private final byte[] aByteArray37 = new byte[64];

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
	private int anInt4168 = 0;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([BJI)V")
	public void method3788(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt4168 & 0x7;
		@Pc(28) long local28 = arg1;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += (this.aByteArray36[local30] & 0xFF) + ((int) local28 & 0xFF);
			this.aByteArray36[local30] = (byte) local32;
			local28 >>>= 0x8;
			local32 >>>= 0x8;
			local30--;
		}
		@Pc(88) int local88;
		while (arg1 > 8L) {
			local88 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local88 < 0 || local88 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray37[this.anInt4166] = (byte) (this.aByteArray37[this.anInt4166] | local88 >>> local21);
			this.anInt4166++;
			this.anInt4168 += 8 - local21;
			if (this.anInt4168 == 512) {
				this.method3791();
				this.anInt4168 = this.anInt4166 = 0;
			}
			this.aByteArray37[this.anInt4166] = (byte) (local88 << 8 - local21 & 0xFF);
			this.anInt4168 += local21;
			arg1 -= 8L;
			local7++;
		}
		if (arg1 > 0L) {
			local88 = arg0[local7] << local16 & 0xFF;
			this.aByteArray37[this.anInt4166] = (byte) (this.aByteArray37[this.anInt4166] | local88 >>> local21);
		} else {
			local88 = 0;
		}
		if ((long) local21 + arg1 < 8L) {
			this.anInt4168 = (int) ((long) this.anInt4168 + arg1);
			return;
		}
		this.anInt4168 += 8 - local21;
		this.anInt4166++;
		arg1 -= (long) (8 - local21);
		if (this.anInt4168 == 512) {
			this.method3791();
			this.anInt4168 = this.anInt4166 = 0;
		}
		this.aByteArray37[this.anInt4166] = (byte) (local88 << 8 - local21 & 0xFF);
		this.anInt4168 += (int) arg1;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([BII)V")
	public void method3789(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37[this.anInt4166] = (byte) (this.aByteArray37[this.anInt4166] | 0x80 >>> (this.anInt4168 & 0x7));
		this.anInt4166++;
		if (this.anInt4166 > 32) {
			while (true) {
				if (this.anInt4166 >= 64) {
					this.method3791();
					this.anInt4166 = 0;
					break;
				}
				this.aByteArray37[this.anInt4166++] = 0;
			}
		}
		while (this.anInt4166 < 32) {
			this.aByteArray37[this.anInt4166++] = 0;
		}
		Static655.method4109(this.aByteArray36, 0, this.aByteArray37, 32, 32);
		this.method3791();
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		while (local90 < 8) {
			@Pc(99) long local99 = this.aLongArray10[local90];
			arg0[local92] = (byte) (int) (local99 >>> 56);
			arg0[local92 + 1] = (byte) (int) (local99 >>> 48);
			arg0[local92 + 2] = (byte) (int) (local99 >>> 40);
			arg0[local92 + 3] = (byte) (int) (local99 >>> 32);
			arg0[local92 + 4] = (byte) (int) (local99 >>> 24);
			arg0[local92 + 5] = (byte) (int) (local99 >>> 16);
			arg0[local92 + 6] = (byte) (int) (local99 >>> 8);
			arg0[local92 + 7] = (byte) (int) local99;
			local90++;
			local92 += 8;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
	private void method3791() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray9[local3] = Static43.method744(Static43.method744(Static533.method379((long) this.aByteArray37[local5 + 6], 255L) << 8, Static43.method744(Static533.method379((long) this.aByteArray37[local5 + 5], 255L) << 16, Static43.method744(Static43.method744(Static43.method744(Static533.method379(255L, (long) this.aByteArray37[local5 + 2]) << 40, Static43.method744((long) this.aByteArray37[local5] << 56, Static533.method379((long) this.aByteArray37[local5 + 1], 255L) << 48)), Static533.method379(0xFFL << 32, (long) this.aByteArray37[local5 + 3] << 32)), Static533.method379((long) this.aByteArray37[local5 + 4], 255L) << 24))), Static533.method379(255L, (long) this.aByteArray37[local5 + 7]));
			local3++;
			local5 += 8;
		}
		for (@Pc(118) int local118 = 0; local118 < 8; local118++) {
			this.aLongArray7[local118] = Static43.method744(this.aLongArray9[local118], this.aLongArray8[local118] = this.aLongArray10[local118]);
		}
		@Pc(150) int local150;
		for (@Pc(146) int local146 = 1; local146 <= 10; local146++) {
			@Pc(159) int local159;
			@Pc(161) int local161;
			for (local150 = 0; local150 < 8; local150++) {
				this.aLongArray11[local150] = 0L;
				local159 = 0;
				local161 = 56;
				while (local159 < 8) {
					this.aLongArray11[local150] = Static43.method744(this.aLongArray11[local150], Class5_Sub2_Sub12.aLongArrayArray2[local159][(int) (this.aLongArray8[local150 - local159 & 0x7] >>> local161) & 0xFF]);
					local159++;
					local161 -= 8;
				}
			}
			for (local159 = 0; local159 < 8; local159++) {
				this.aLongArray8[local159] = this.aLongArray11[local159];
			}
			this.aLongArray8[0] = Static43.method744(this.aLongArray8[0], Class5_Sub2_Sub12.aLongArray13[local146]);
			@Pc(241) int local241;
			for (local161 = 0; local161 < 8; local161++) {
				this.aLongArray11[local161] = this.aLongArray8[local161];
				local241 = 0;
				@Pc(243) int local243 = 56;
				while (local241 < 8) {
					this.aLongArray11[local161] = Static43.method744(this.aLongArray11[local161], Class5_Sub2_Sub12.aLongArrayArray2[local241][(int) (this.aLongArray7[local161 - local241 & 0x7] >>> local243) & 0xFF]);
					local241++;
					local243 -= 8;
				}
			}
			for (local241 = 0; local241 < 8; local241++) {
				this.aLongArray7[local241] = this.aLongArray11[local241];
			}
		}
		for (local150 = 0; local150 < 8; local150++) {
			this.aLongArray10[local150] = Static43.method744(this.aLongArray10[local150], Static43.method744(this.aLongArray7[local150], this.aLongArray9[local150]));
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	public void method3793() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray36[local7] = 0;
		}
		this.aByteArray37[0] = 0;
		this.anInt4168 = this.anInt4166 = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray10[local33] = 0L;
		}
	}
}
