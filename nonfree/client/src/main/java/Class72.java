import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class72 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[B")
	private final byte[] aByteArray21 = new byte[32];

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[B")
	private final byte[] aByteArray22 = new byte[64];

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	private int anInt2605 = 0;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	private int anInt2607 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BZI)V")
	public void method2348(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22[this.anInt2605] = (byte) (this.aByteArray22[this.anInt2605] | 0x80 >>> (this.anInt2607 & 0x7));
		this.anInt2605++;
		if (this.anInt2605 > 32) {
			while (true) {
				if (this.anInt2605 >= 64) {
					this.method2350();
					this.anInt2605 = 0;
					break;
				}
				this.aByteArray22[this.anInt2605++] = 0;
			}
		}
		while (this.anInt2605 < 32) {
			this.aByteArray22[this.anInt2605++] = 0;
		}
		Static604.method5910(this.aByteArray21, 0, this.aByteArray22, 32, 32);
		this.method2350();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray5[local96];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local96++;
			local98 += 8;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public void method2349() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray21[local3] = 0;
		}
		this.aByteArray22[0] = 0;
		this.anInt2607 = this.anInt2605 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray5[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	private void method2350() {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		while (local13 < 8) {
			this.aLongArray4[local13] = Static325.method5043(Static325.method5043(Static325.method5043(Static535.method7038((long) this.aByteArray22[local15 + 5] << 16, 0xFFL << 16), Static325.method5043(Static535.method7038(255L, (long) this.aByteArray22[local15 + 4]) << 24, Static325.method5043(Static535.method7038(255L, (long) this.aByteArray22[local15 + 3]) << 32, Static325.method5043(Static535.method7038(0xFFL << 40, (long) this.aByteArray22[local15 + 2] << 40), Static325.method5043((long) this.aByteArray22[local15] << 56, Static535.method7038(255L, (long) this.aByteArray22[local15 + 1]) << 48))))), Static535.method7038(255L, (long) this.aByteArray22[local15 + 6]) << 8), Static535.method7038(255L, (long) this.aByteArray22[local15 + 7]));
			local15 += 8;
			local13++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray6[local123] = Static325.method5043(this.aLongArray4[local123], this.aLongArray2[local123] = this.aLongArray5[local123]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray3[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray3[local155] = Static325.method5043(this.aLongArray3[local155], Class60_Sub8.aLongArrayArray1[local164][(int) (this.aLongArray2[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local164++;
					local166 -= 8;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray2[local164] = this.aLongArray3[local164];
			}
			this.aLongArray2[0] = Static325.method5043(this.aLongArray2[0], Class60_Sub8.aLongArray13[local151]);
			@Pc(248) int local248;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray3[local166] = this.aLongArray2[local166];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray3[local166] = Static325.method5043(this.aLongArray3[local166], Class60_Sub8.aLongArrayArray1[local248][(int) (this.aLongArray6[local166 - local248 & 0x7] >>> local250) & 0xFF]);
					local248++;
					local250 -= 8;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray6[local248] = this.aLongArray3[local248];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray5[local155] = Static325.method5043(this.aLongArray5[local155], Static325.method5043(this.aLongArray4[local155], this.aLongArray6[local155]));
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ[B)V")
	public void method2351(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt2607 & 0x7;
		@Pc(32) long local32 = arg0;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += ((int) local32 & 0xFF) + (this.aByteArray21[local34] & 0xFF);
			this.aByteArray21[local34] = (byte) local36;
			local32 >>>= 0x8;
			local36 >>>= 0x8;
			local34--;
		}
		@Pc(92) int local92;
		while (arg0 > 8L) {
			local92 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray22[this.anInt2605] = (byte) (this.aByteArray22[this.anInt2605] | local92 >>> local22);
			this.anInt2607 += 8 - local22;
			this.anInt2605++;
			if (this.anInt2607 == 512) {
				this.method2350();
				this.anInt2607 = this.anInt2605 = 0;
			}
			this.aByteArray22[this.anInt2605] = (byte) (local92 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			local7++;
			this.anInt2607 += local22;
		}
		if (arg0 > 0L) {
			local92 = arg1[local7] << local17 & 0xFF;
			this.aByteArray22[this.anInt2605] = (byte) (this.aByteArray22[this.anInt2605] | local92 >>> local22);
		} else {
			local92 = 0;
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt2607 = (int) ((long) this.anInt2607 + arg0);
			return;
		}
		arg0 -= 8 - local22;
		this.anInt2607 += 8 - local22;
		this.anInt2605++;
		if (this.anInt2607 == 512) {
			this.method2350();
			this.anInt2607 = this.anInt2605 = 0;
		}
		this.aByteArray22[this.anInt2605] = (byte) (local92 << 8 - local22 & 0xFF);
		this.anInt2607 += (int) arg0;
	}
}
