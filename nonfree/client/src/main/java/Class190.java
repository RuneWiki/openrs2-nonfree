import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class190 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
	private int anInt4504 = 0;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "[B")
	private final byte[] aByteArray48 = new byte[32];

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
	private int anInt4506 = 0;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "[B")
	private final byte[] aByteArray49 = new byte[64];

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	private void method3965() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray9[local1] = Static137.method2049(Static563.method7703(255L, (long) this.aByteArray49[local3 + 7]), Static137.method2049(Static563.method7703(255L, (long) this.aByteArray49[local3 + 6]) << 8, Static137.method2049(Static137.method2049(Static137.method2049(Static137.method2049(Static563.method7703((long) this.aByteArray49[local3 + 2], 255L) << 40, Static137.method2049(Static563.method7703((long) this.aByteArray49[local3 + 1], 255L) << 48, (long) this.aByteArray49[local3] << 56)), Static563.method7703(255L, (long) this.aByteArray49[local3 + 3]) << 32), Static563.method7703(0xFFL << 24, (long) this.aByteArray49[local3 + 4] << 24)), Static563.method7703(0xFFL << 16, (long) this.aByteArray49[local3 + 5] << 16))));
			local3 += 8;
			local1++;
		}
		for (@Pc(114) int local114 = 0; local114 < 8; local114++) {
			this.aLongArray6[local114] = Static137.method2049(this.aLongArray9[local114], this.aLongArray10[local114] = this.aLongArray7[local114]);
		}
		@Pc(147) int local147;
		for (@Pc(144) int local144 = 1; local144 <= 10; local144++) {
			@Pc(155) int local155;
			@Pc(157) int local157;
			for (local147 = 0; local147 < 8; local147++) {
				this.aLongArray8[local147] = 0L;
				local155 = 0;
				local157 = 56;
				while (local155 < 8) {
					this.aLongArray8[local147] = Static137.method2049(this.aLongArray8[local147], Class11_Sub2.aLongArrayArray2[local155][(int) (this.aLongArray10[local147 - local155 & 0x7] >>> local157) & 0xFF]);
					local155++;
					local157 -= 8;
				}
			}
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray10[local155] = this.aLongArray8[local155];
			}
			this.aLongArray10[0] = Static137.method2049(this.aLongArray10[0], Class11_Sub2.aLongArray24[local144]);
			@Pc(235) int local235;
			for (local157 = 0; local157 < 8; local157++) {
				this.aLongArray8[local157] = this.aLongArray10[local157];
				local235 = 0;
				@Pc(237) int local237 = 56;
				while (local235 < 8) {
					this.aLongArray8[local157] = Static137.method2049(this.aLongArray8[local157], Class11_Sub2.aLongArrayArray2[local235][(int) (this.aLongArray6[local157 - local235 & 0x7] >>> local237) & 0xFF]);
					local235++;
					local237 -= 8;
				}
			}
			for (local235 = 0; local235 < 8; local235++) {
				this.aLongArray6[local235] = this.aLongArray8[local235];
			}
		}
		for (local147 = 0; local147 < 8; local147++) {
			this.aLongArray7[local147] = Static137.method2049(this.aLongArray7[local147], Static137.method2049(this.aLongArray9[local147], this.aLongArray6[local147]));
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[B)V")
	public void method3967(@OriginalArg(2) byte[] arg0) {
		this.aByteArray49[this.anInt4506] = (byte) (this.aByteArray49[this.anInt4506] | 0x80 >>> (this.anInt4504 & 0x7));
		this.anInt4506++;
		if (this.anInt4506 > 32) {
			while (true) {
				if (this.anInt4506 >= 64) {
					this.method3965();
					this.anInt4506 = 0;
					break;
				}
				this.aByteArray49[this.anInt4506++] = 0;
			}
		}
		while (this.anInt4506 < 32) {
			this.aByteArray49[this.anInt4506++] = 0;
		}
		Static685.method8328(this.aByteArray48, 0, this.aByteArray49, 32, 32);
		this.method3965();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 0;
		while (local89 < 8) {
			@Pc(97) long local97 = this.aLongArray7[local89];
			arg0[local91] = (byte) (int) (local97 >>> 56);
			arg0[local91 + 1] = (byte) (int) (local97 >>> 48);
			arg0[local91 + 2] = (byte) (int) (local97 >>> 40);
			arg0[local91 + 3] = (byte) (int) (local97 >>> 32);
			arg0[local91 + 4] = (byte) (int) (local97 >>> 24);
			arg0[local91 + 5] = (byte) (int) (local97 >>> 16);
			arg0[local91 + 6] = (byte) (int) (local97 >>> 8);
			arg0[local91 + 7] = (byte) (int) local97;
			local89++;
			local91 += 8;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
	public void method3969() {
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			this.aByteArray48[local11] = 0;
		}
		this.aByteArray49[0] = 0;
		this.anInt4504 = this.anInt4506 = 0;
		for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
			this.aLongArray7[local36] = 0L;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(J[BI)V")
	public void method3972(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5 = 0;
		@Pc(14) int local14 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(19) int local19 = this.anInt4504 & 0x7;
		@Pc(21) long local21 = arg0;
		@Pc(23) int local23 = 31;
		@Pc(25) int local25 = 0;
		while (local23 >= 0) {
			local25 += (this.aByteArray48[local23] & 0xFF) + ((int) local21 & 0xFF);
			this.aByteArray48[local23] = (byte) local25;
			local21 >>>= 0x8;
			local25 >>>= 0x8;
			local23--;
		}
		@Pc(87) int local87;
		while (arg0 > 8L) {
			local87 = arg1[local5] << local14 & 0xFF | (arg1[local5 + 1] & 0xFF) >>> 8 - local14;
			if (local87 < 0 || local87 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray49[this.anInt4506] = (byte) (this.aByteArray49[this.anInt4506] | local87 >>> local19);
			this.anInt4504 += 8 - local19;
			this.anInt4506++;
			if (this.anInt4504 == 512) {
				this.method3965();
				this.anInt4504 = this.anInt4506 = 0;
			}
			this.aByteArray49[this.anInt4506] = (byte) (local87 << 8 - local19 & 0xFF);
			this.anInt4504 += local19;
			arg0 -= 8L;
			local5++;
		}
		if (arg0 > 0L) {
			local87 = arg1[local5] << local14 & 0xFF;
			this.aByteArray49[this.anInt4506] = (byte) (this.aByteArray49[this.anInt4506] | local87 >>> local19);
		} else {
			local87 = 0;
		}
		if (arg0 + (long) local19 < 8L) {
			this.anInt4504 = (int) ((long) this.anInt4504 + arg0);
			return;
		}
		this.anInt4504 += 8 - local19;
		arg0 -= (long) (8 - local19);
		this.anInt4506++;
		if (this.anInt4504 == 512) {
			this.method3965();
			this.anInt4504 = this.anInt4506 = 0;
		}
		this.aByteArray49[this.anInt4506] = (byte) (local87 << 8 - local19 & 0xFF);
		this.anInt4504 += (int) arg0;
	}
}
