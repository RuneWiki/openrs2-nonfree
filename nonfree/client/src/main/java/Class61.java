import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class61 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[B")
	private final byte[] aByteArray10 = new byte[32];

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	private int anInt1364 = 0;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	private int anInt1366 = 0;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "[B")
	private final byte[] aByteArray11 = new byte[64];

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	private void method1140() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray6[local7] = Static507.method6973(Static507.method6973(Static507.method6973(Static513.method6921((long) this.aByteArray11[local9 + 5], 255L) << 16, Static507.method6973(Static507.method6973(Static507.method6973(Static513.method6921((long) this.aByteArray11[local9 + 2] << 40, 0xFFL << 40), Static507.method6973((long) this.aByteArray11[local9] << 56, Static513.method6921(0xFFL << 48, (long) this.aByteArray11[local9 + 1] << 48))), Static513.method6921((long) this.aByteArray11[local9 + 3], 255L) << 32), Static513.method6921((long) this.aByteArray11[local9 + 4] << 24, 0xFFL << 24))), Static513.method6921(0xFFL << 8, (long) this.aByteArray11[local9 + 6] << 8)), Static513.method6921(255L, (long) this.aByteArray11[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray5[local121] = Static507.method6973(this.aLongArray6[local121], this.aLongArray8[local121] = this.aLongArray9[local121]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray7[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray7[local153] = Static507.method6973(this.aLongArray7[local153], Class6_Sub45.aLongArrayArray1[local162][(int) (this.aLongArray8[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray8[local162] = this.aLongArray7[local162];
			}
			this.aLongArray8[0] = Static507.method6973(this.aLongArray8[0], Class6_Sub45.aLongArray19[local149]);
			@Pc(248) int local248;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray7[local164] = this.aLongArray8[local164];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray7[local164] = Static507.method6973(this.aLongArray7[local164], Class6_Sub45.aLongArrayArray1[local248][(int) (this.aLongArray5[local164 - local248 & 0x7] >>> local250) & 0xFF]);
					local248++;
					local250 -= 8;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray5[local248] = this.aLongArray7[local248];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray9[local153] = Static507.method6973(this.aLongArray9[local153], Static507.method6973(this.aLongArray6[local153], this.aLongArray5[local153]));
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BJ)V")
	public void method1141(@OriginalArg(1) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt1366 & 0x7;
		@Pc(24) long local24 = arg1;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray10[local26] & 0xFF);
			this.aByteArray10[local26] = (byte) local28;
			local24 >>>= 0x8;
			local28 >>>= 0x8;
			local26--;
		}
		@Pc(84) int local84;
		while (arg1 > 8L) {
			local84 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local84 < 0 || local84 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray11[this.anInt1364] = (byte) (this.aByteArray11[this.anInt1364] | local84 >>> local22);
			this.anInt1364++;
			this.anInt1366 += 8 - local22;
			if (this.anInt1366 == 512) {
				this.method1140();
				this.anInt1366 = this.anInt1364 = 0;
			}
			this.aByteArray11[this.anInt1364] = (byte) (local84 << 8 - local22 & 0xFF);
			local7++;
			arg1 -= 8L;
			this.anInt1366 += local22;
		}
		if (arg1 <= 0L) {
			local84 = 0;
		} else {
			local84 = arg0[local7] << local17 & 0xFF;
			this.aByteArray11[this.anInt1364] = (byte) (this.aByteArray11[this.anInt1364] | local84 >>> local22);
		}
		if ((long) local22 + arg1 < (long) 8) {
			this.anInt1366 = (int) ((long) this.anInt1366 + arg1);
			return;
		}
		this.anInt1366 += 8 - local22;
		this.anInt1364++;
		arg1 -= 8 - local22;
		if (this.anInt1366 == 512) {
			this.method1140();
			this.anInt1366 = this.anInt1364 = 0;
		}
		this.aByteArray11[this.anInt1364] = (byte) (local84 << 8 - local22 & 0xFF);
		this.anInt1366 += (int) arg1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI[B)V")
	public void method1142(@OriginalArg(2) byte[] arg0) {
		this.aByteArray11[this.anInt1364] = (byte) (this.aByteArray11[this.anInt1364] | 0x80 >>> (this.anInt1366 & 0x7));
		this.anInt1364++;
		if (this.anInt1364 > 32) {
			while (true) {
				if (this.anInt1364 >= 64) {
					this.method1140();
					this.anInt1364 = 0;
					break;
				}
				this.aByteArray11[this.anInt1364++] = 0;
			}
		}
		while (this.anInt1364 < 32) {
			this.aByteArray11[this.anInt1364++] = 0;
		}
		Static596.method7719(this.aByteArray10, 0, this.aByteArray11, 32, 32);
		this.method1140();
		@Pc(90) int local90 = 0;
		@Pc(98) int local98 = 0;
		while (local90 < 8) {
			@Pc(105) long local105 = this.aLongArray9[local90];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local90++;
			local98 += 8;
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method1144() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray10[local7] = 0;
		}
		this.aByteArray11[0] = 0;
		this.anInt1366 = this.anInt1364 = 0;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			this.aLongArray9[local35] = 0L;
		}
	}
}
