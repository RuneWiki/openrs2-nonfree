import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class87 {

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
	private int anInt2401 = 0;

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "[B")
	private final byte[] aByteArray22 = new byte[32];

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "[B")
	private final byte[] aByteArray23 = new byte[64];

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
	private int anInt2405 = 0;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B[BI)V")
	public void method2027(@OriginalArg(1) byte[] arg0) {
		this.aByteArray23[this.anInt2405] = (byte) (this.aByteArray23[this.anInt2405] | 0x80 >>> (this.anInt2401 & 0x7));
		this.anInt2405++;
		if (this.anInt2405 > 32) {
			while (true) {
				if (this.anInt2405 >= 64) {
					this.method2032();
					this.anInt2405 = 0;
					break;
				}
				this.aByteArray23[this.anInt2405++] = 0;
			}
		}
		while (this.anInt2405 < 32) {
			this.aByteArray23[this.anInt2405++] = 0;
		}
		Static600.method3768(this.aByteArray22, 0, this.aByteArray23, 32, 32);
		this.method2032();
		@Pc(88) int local88 = 0;
		@Pc(98) int local98 = 0;
		while (local88 < 8) {
			@Pc(105) long local105 = this.aLongArray6[local88];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local88++;
			local98 += 8;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([BJI)V")
	public void method2030(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(11) int local11 = 0;
		@Pc(21) int local21 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(26) int local26 = this.anInt2401 & 0x7;
		@Pc(28) long local28 = arg1;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += (this.aByteArray22[local30] & 0xFF) + ((int) local28 & 0xFF);
			this.aByteArray22[local30] = (byte) local32;
			local28 >>>= 0x8;
			local32 >>>= 0x8;
			local30--;
		}
		@Pc(88) int local88;
		while (arg1 > 8L) {
			local88 = arg0[local11] << local21 & 0xFF | (arg0[local11 - -1] & 0xFF) >>> 8 - local21;
			if (local88 < 0 || local88 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray23[this.anInt2405] = (byte) (this.aByteArray23[this.anInt2405] | local88 >>> local26);
			this.anInt2401 += 8 - local26;
			this.anInt2405++;
			if (this.anInt2401 == 512) {
				this.method2032();
				this.anInt2401 = this.anInt2405 = 0;
			}
			this.aByteArray23[this.anInt2405] = (byte) (local88 << 8 - local26 & 0xFF);
			local11++;
			this.anInt2401 += local26;
			arg1 -= 8L;
		}
		if (arg1 <= 0L) {
			local88 = 0;
		} else {
			local88 = arg0[local11] << local21 & 0xFF;
			this.aByteArray23[this.anInt2405] = (byte) (this.aByteArray23[this.anInt2405] | local88 >>> local26);
		}
		if (arg1 + (long) local26 < 8L) {
			this.anInt2401 = (int) ((long) this.anInt2401 + arg1);
			return;
		}
		arg1 -= 8 - local26;
		this.anInt2401 += 8 - local26;
		this.anInt2405++;
		if (this.anInt2401 == 512) {
			this.method2032();
			this.anInt2401 = this.anInt2405 = 0;
		}
		this.aByteArray23[this.anInt2405] = (byte) (local88 << 8 - local26 & 0xFF);
		this.anInt2401 += (int) arg1;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	public void method2031() {
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			this.aByteArray22[local15] = 0;
		}
		this.anInt2401 = this.anInt2405 = 0;
		this.aByteArray23[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray6[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	private void method2032() {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		while (local13 < 8) {
			this.aLongArray7[local13] = Static420.method6359(Static420.method6359(Static420.method6359(Static420.method6359(Static420.method6359(Static213.method3551(0xFFL << 32, (long) this.aByteArray23[local15 + 3] << 32), Static420.method6359(Static213.method3551(255L, (long) this.aByteArray23[local15 + 2]) << 40, Static420.method6359((long) this.aByteArray23[local15] << 56, Static213.method3551((long) this.aByteArray23[local15 + 1], 255L) << 48))), Static213.method3551((long) this.aByteArray23[local15 + 4], 255L) << 24), Static213.method3551(0xFFL << 16, (long) this.aByteArray23[local15 + 5] << 16)), Static213.method3551(0xFFL << 8, (long) this.aByteArray23[local15 + 6] << 8)), Static213.method3551(255L, (long) this.aByteArray23[local15 + 7]));
			local15 += 8;
			local13++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray9[local123] = Static420.method6359(this.aLongArray7[local123], this.aLongArray8[local123] = this.aLongArray6[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray5[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray5[local153] = Static420.method6359(this.aLongArray5[local153], Class3_Sub3.aLongArrayArray1[local162][(int) (this.aLongArray8[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray8[local162] = this.aLongArray5[local162];
			}
			this.aLongArray8[0] = Static420.method6359(this.aLongArray8[0], Class3_Sub3.aLongArray10[local149]);
			@Pc(246) int local246;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray5[local164] = this.aLongArray8[local164];
				local246 = 0;
				@Pc(248) int local248 = 56;
				while (local246 < 8) {
					this.aLongArray5[local164] = Static420.method6359(this.aLongArray5[local164], Class3_Sub3.aLongArrayArray1[local246][(int) (this.aLongArray9[local164 - local246 & 0x7] >>> local248) & 0xFF]);
					local246++;
					local248 -= 8;
				}
			}
			for (local246 = 0; local246 < 8; local246++) {
				this.aLongArray9[local246] = this.aLongArray5[local246];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray6[local153] = Static420.method6359(this.aLongArray6[local153], Static420.method6359(this.aLongArray7[local153], this.aLongArray9[local153]));
		}
	}
}
