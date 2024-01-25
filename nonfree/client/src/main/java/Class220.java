import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class220 {

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	private int anInt5726 = 0;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[B")
	private final byte[] aByteArray55 = new byte[32];

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[B")
	private final byte[] aByteArray56 = new byte[64];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt5723 = 0;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	private void method5042() {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		while (local11 < 8) {
			this.aLongArray15[local11] = Static83.method9515(Static582.method7519(255L, (long) this.aByteArray56[local13 + 7]), Static83.method9515(Static83.method9515(Static83.method9515(Static83.method9515(Static582.method7519(0xFFL << 32, (long) this.aByteArray56[local13 + 3] << 32), Static83.method9515(Static83.method9515(Static582.method7519(255L, (long) this.aByteArray56[local13 + 1]) << 48, (long) this.aByteArray56[local13] << 56), Static582.method7519((long) this.aByteArray56[local13 + 2], 255L) << 40)), Static582.method7519(0xFFL << 24, (long) this.aByteArray56[local13 + 4] << 24)), Static582.method7519((long) this.aByteArray56[local13 + 5], 255L) << 16), Static582.method7519((long) this.aByteArray56[local13 + 6] << 8, 0xFFL << 8)));
			local11++;
			local13 += 8;
		}
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			this.aLongArray13[local127] = Static83.method9515(this.aLongArray15[local127], this.aLongArray16[local127] = this.aLongArray12[local127]);
		}
		@Pc(165) int local165;
		for (@Pc(159) int local159 = 1; local159 <= 10; local159++) {
			@Pc(174) int local174;
			@Pc(176) int local176;
			for (local165 = 0; local165 < 8; local165++) {
				this.aLongArray14[local165] = 0L;
				local174 = 0;
				local176 = 56;
				while (local174 < 8) {
					this.aLongArray14[local165] = Static83.method9515(this.aLongArray14[local165], Class87.aLongArrayArray4[local174][(int) (this.aLongArray16[local165 - local174 & 0x7] >>> local176) & 0xFF]);
					local174++;
					local176 -= 8;
				}
			}
			for (local174 = 0; local174 < 8; local174++) {
				this.aLongArray16[local174] = this.aLongArray14[local174];
			}
			this.aLongArray16[0] = Static83.method9515(this.aLongArray16[0], Class87.aLongArray19[local159]);
			@Pc(269) int local269;
			for (local176 = 0; local176 < 8; local176++) {
				this.aLongArray14[local176] = this.aLongArray16[local176];
				local269 = 0;
				@Pc(271) int local271 = 56;
				while (local269 < 8) {
					this.aLongArray14[local176] = Static83.method9515(this.aLongArray14[local176], Class87.aLongArrayArray4[local269][(int) (this.aLongArray13[local176 - local269 & 0x7] >>> local271) & 0xFF]);
					local271 -= 8;
					local269++;
				}
			}
			for (local269 = 0; local269 < 8; local269++) {
				this.aLongArray13[local269] = this.aLongArray14[local269];
			}
		}
		for (local165 = 0; local165 < 8; local165++) {
			this.aLongArray12[local165] = Static83.method9515(this.aLongArray12[local165], Static83.method9515(this.aLongArray13[local165], this.aLongArray15[local165]));
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BJI)V")
	public void method5043(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt5726 & 0x7;
		@Pc(31) long local31 = arg1;
		@Pc(33) int local33 = 31;
		@Pc(35) int local35 = 0;
		while (local33 >= 0) {
			local35 += (this.aByteArray55[local33] & 0xFF) + ((int) local31 & 0xFF);
			this.aByteArray55[local33] = (byte) local35;
			local35 >>>= 0x8;
			local31 >>>= 0x8;
			local33--;
		}
		@Pc(101) int local101;
		while (arg1 > 8L) {
			local101 = arg0[local7] << local16 & 0xFF | (arg0[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local101 < 0 || local101 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray56[this.anInt5723] = (byte) (this.aByteArray56[this.anInt5723] | local101 >>> local21);
			this.anInt5723++;
			this.anInt5726 += 8 - local21;
			if (this.anInt5726 == 512) {
				this.method5042();
				this.anInt5726 = this.anInt5723 = 0;
			}
			this.aByteArray56[this.anInt5723] = (byte) (local101 << 8 - local21 & 0xFF);
			this.anInt5726 += local21;
			local7++;
			arg1 -= 8L;
		}
		if (arg1 <= 0L) {
			local101 = 0;
		} else {
			local101 = arg0[local7] << local16 & 0xFF;
			this.aByteArray56[this.anInt5723] = (byte) (this.aByteArray56[this.anInt5723] | local101 >>> local21);
		}
		if ((long) local21 + arg1 < 8L) {
			this.anInt5726 = (int) ((long) this.anInt5726 + arg1);
			return;
		}
		arg1 -= (long) (8 - local21);
		this.anInt5726 += 8 - local21;
		this.anInt5723++;
		if (this.anInt5726 == 512) {
			this.method5042();
			this.anInt5726 = this.anInt5723 = 0;
		}
		this.aByteArray56[this.anInt5723] = (byte) (local101 << 8 - local21 & 0xFF);
		this.anInt5726 += (int) arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public void method5044() {
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			this.aByteArray55[local8] = 0;
		}
		this.aByteArray56[0] = 0;
		this.anInt5726 = this.anInt5723 = 0;
		for (@Pc(38) int local38 = 0; local38 < 8; local38++) {
			this.aLongArray12[local38] = 0L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BI)V")
	public void method5045(@OriginalArg(1) byte[] arg0) {
		this.aByteArray56[this.anInt5723] = (byte) (this.aByteArray56[this.anInt5723] | 0x80 >>> (this.anInt5726 & 0x7));
		this.anInt5723++;
		if (this.anInt5723 > 32) {
			while (true) {
				if (this.anInt5723 >= 64) {
					this.method5042();
					this.anInt5723 = 0;
					break;
				}
				this.aByteArray56[this.anInt5723++] = 0;
			}
		}
		while (this.anInt5723 < 32) {
			this.aByteArray56[this.anInt5723++] = 0;
		}
		Static732.method6320(this.aByteArray55, 0, this.aByteArray56, 32, 32);
		this.method5042();
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		while (local110 < 8) {
			@Pc(119) long local119 = this.aLongArray12[local110];
			arg0[local112] = (byte) (int) (local119 >>> 56);
			arg0[local112 + 1] = (byte) (int) (local119 >>> 48);
			arg0[local112 + 2] = (byte) (int) (local119 >>> 40);
			arg0[local112 + 3] = (byte) (int) (local119 >>> 32);
			arg0[local112 + 4] = (byte) (int) (local119 >>> 24);
			arg0[local112 + 5] = (byte) (int) (local119 >>> 16);
			arg0[local112 + 6] = (byte) (int) (local119 >>> 8);
			arg0[local112 + 7] = (byte) (int) local119;
			local112 += 8;
			local110++;
		}
	}
}
