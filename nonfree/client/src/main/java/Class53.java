import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class53 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	private int anInt1413 = 0;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "[B")
	private final byte[] aByteArray16 = new byte[64];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[B")
	private final byte[] aByteArray17 = new byte[32];

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	private int anInt1414 = 0;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method1364() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray17[local3] = 0;
		}
		this.anInt1413 = this.anInt1414 = 0;
		this.aByteArray16[0] = 0;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			this.aLongArray6[local35] = 0L;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[BI)V")
	public void method1367(@OriginalArg(1) byte[] arg0) {
		this.aByteArray16[this.anInt1414] = (byte) (this.aByteArray16[this.anInt1414] | 0x80 >>> (this.anInt1413 & 0x7));
		this.anInt1414++;
		if (this.anInt1414 > 32) {
			while (true) {
				if (this.anInt1414 >= 64) {
					this.method1369();
					this.anInt1414 = 0;
					break;
				}
				this.aByteArray16[this.anInt1414++] = 0;
			}
		}
		while (this.anInt1414 < 32) {
			this.aByteArray16[this.anInt1414++] = 0;
		}
		Static679.method4129(this.aByteArray17, 0, this.aByteArray16, 32, 32);
		this.method1369();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		while (local98 < 8) {
			@Pc(107) long local107 = this.aLongArray6[local98];
			arg0[local100] = (byte) (int) (local107 >>> 56);
			arg0[local100 + 1] = (byte) (int) (local107 >>> 48);
			arg0[local100 + 2] = (byte) (int) (local107 >>> 40);
			arg0[local100 + 3] = (byte) (int) (local107 >>> 32);
			arg0[local100 + 4] = (byte) (int) (local107 >>> 24);
			arg0[local100 + 5] = (byte) (int) (local107 >>> 16);
			arg0[local100 + 6] = (byte) (int) (local107 >>> 8);
			arg0[local100 + 7] = (byte) (int) local107;
			local100 += 8;
			local98++;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	private void method1369() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray7[local7] = Static578.method6235(Static578.method6235(Static578.method6235(Static430.method7040(255L, (long) this.aByteArray16[local9 + 5]) << 16, Static578.method6235(Static578.method6235(Static578.method6235(Static430.method7040(0xFFL << 40, (long) this.aByteArray16[local9 + 2] << 40), Static578.method6235(Static430.method7040((long) this.aByteArray16[local9 + 1], 255L) << 48, (long) this.aByteArray16[local9] << 56)), Static430.method7040(255L, (long) this.aByteArray16[local9 + 3]) << 32), Static430.method7040(255L, (long) this.aByteArray16[local9 + 4]) << 24)), Static430.method7040((long) this.aByteArray16[local9 + 6], 255L) << 8), Static430.method7040(255L, (long) this.aByteArray16[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray5[local123] = Static578.method6235(this.aLongArray7[local123], this.aLongArray3[local123] = this.aLongArray6[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray4[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray4[local153] = Static578.method6235(this.aLongArray4[local153], Class107_Sub4.aLongArrayArray1[local162][(int) (this.aLongArray3[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local164 -= 8;
					local162++;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray3[local162] = this.aLongArray4[local162];
			}
			this.aLongArray3[0] = Static578.method6235(this.aLongArray3[0], Class107_Sub4.aLongArray21[local149]);
			@Pc(248) int local248;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray4[local164] = this.aLongArray3[local164];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray4[local164] = Static578.method6235(this.aLongArray4[local164], Class107_Sub4.aLongArrayArray1[local248][(int) (this.aLongArray5[local164 - local248 & 0x7] >>> local250) & 0xFF]);
					local248++;
					local250 -= 8;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray5[local248] = this.aLongArray4[local248];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray6[local153] = Static578.method6235(this.aLongArray6[local153], Static578.method6235(this.aLongArray7[local153], this.aLongArray5[local153]));
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BJ[B)V")
	public void method1372(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt1413 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray17[local26] & 0xFF);
			this.aByteArray17[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(84) int local84;
		while (arg0 > 8L) {
			local84 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local84 < 0 || local84 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray16[this.anInt1414] = (byte) (this.aByteArray16[this.anInt1414] | local84 >>> local22);
			this.anInt1413 += 8 - local22;
			this.anInt1414++;
			if (this.anInt1413 == 512) {
				this.method1369();
				this.anInt1413 = this.anInt1414 = 0;
			}
			this.aByteArray16[this.anInt1414] = (byte) (local84 << 8 - local22 & 0xFF);
			this.anInt1413 += local22;
			local7++;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local84 = arg1[local7] << local17 & 0xFF;
			this.aByteArray16[this.anInt1414] = (byte) (this.aByteArray16[this.anInt1414] | local84 >>> local22);
		} else {
			local84 = 0;
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt1413 = (int) ((long) this.anInt1413 + arg0);
			return;
		}
		this.anInt1413 += 8 - local22;
		arg0 -= (long) (8 - local22);
		this.anInt1414++;
		if (this.anInt1413 == 512) {
			this.method1369();
			this.anInt1413 = this.anInt1414 = 0;
		}
		this.aByteArray16[this.anInt1414] = (byte) (local84 << 8 - local22 & 0xFF);
		this.anInt1413 += (int) arg0;
	}
}
