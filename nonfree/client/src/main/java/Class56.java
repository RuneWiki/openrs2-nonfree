import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class56 {

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	public static int[] anIntArray267 = new int[99];

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	private int anInt2421;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	private int anInt2422;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[I")
	private final int[] anIntArray266 = new int[256];

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
	private final int[] anIntArray268 = new int[256];

	static {
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 99; local28++) {
			@Pc(33) int local33 = local28 + 1;
			@Pc(46) int local46 = (int) (Math.pow(2.0D, (double) local33 / 7.0D) * 300.0D + (double) local33);
			local26 += local46;
			anIntArray267[local28] = local26 / 4;
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
	public Class56(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray266[local13] = arg0[local13];
		}
		this.method1540();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
	public int method1533() {
		if (this.anInt2419-- == 0) {
			this.method1537();
			this.anInt2419 = 255;
		}
		return this.anIntArray266[this.anInt2419];
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	private void method1537() {
		this.anInt2423 += ++this.anInt2422;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray268[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt2421 ^= this.anInt2421 << 13;
				} else {
					this.anInt2421 ^= this.anInt2421 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt2421 ^= this.anInt2421 << 2;
			} else {
				this.anInt2421 ^= this.anInt2421 >>> 16;
			}
			this.anInt2421 += this.anIntArray268[local24 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray268[local24] = local126 = this.anInt2423 + this.anInt2421 + this.anIntArray268[local31 >> 2 & 0xFF];
			this.anIntArray266[local24] = this.anInt2423 = this.anIntArray268[local126 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	private void method1540() {
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local25 += this.anIntArray266[local27];
			local24 += this.anIntArray266[local27 + 1];
			local22 += this.anIntArray266[local27 + 2];
			local20 += this.anIntArray266[local27 + 3];
			local12 += this.anIntArray266[local27 + 7];
			local18 += this.anIntArray266[local27 + 4];
			local16 += this.anIntArray266[local27 + 5];
			local25 ^= local24 << 11;
			local14 += this.anIntArray266[local27 + 6];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local20 += local25;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local25 += local24;
			this.anIntArray268[local27] = local25;
			this.anIntArray268[local27 + 1] = local24;
			local22 += local12;
			this.anIntArray268[local27 + 2] = local22;
			this.anIntArray268[local27 + 3] = local20;
			this.anIntArray268[local27 + 4] = local18;
			this.anIntArray268[local27 + 5] = local16;
			this.anIntArray268[local27 + 6] = local14;
			this.anIntArray268[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local22 += this.anIntArray268[local27 + 2];
			local20 += this.anIntArray268[local27 + 3];
			local24 += this.anIntArray268[local27 + 1];
			local16 += this.anIntArray268[local27 + 5];
			local12 += this.anIntArray268[local27 + 7];
			local25 += this.anIntArray268[local27];
			local25 ^= local24 << 11;
			local20 += local25;
			local18 += this.anIntArray268[local27 + 4];
			local14 += this.anIntArray268[local27 + 6];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray268[local27] = local25;
			this.anIntArray268[local27 + 1] = local24;
			this.anIntArray268[local27 + 2] = local22;
			this.anIntArray268[local27 + 3] = local20;
			this.anIntArray268[local27 + 4] = local18;
			this.anIntArray268[local27 + 5] = local16;
			this.anIntArray268[local27 + 6] = local14;
			this.anIntArray268[local27 + 7] = local12;
		}
		this.method1537();
		this.anInt2419 = 256;
	}
}
