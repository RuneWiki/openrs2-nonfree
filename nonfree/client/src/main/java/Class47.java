import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class47 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	private int anInt1891;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	private int anInt1894;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	private int anInt1895;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	private final int[] anIntArray244 = new int[256];

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
	private final int[] anIntArray245 = new int[256];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray244[local13] = arg0[local13];
		}
		this.method1131();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
	public int method1129() {
		if (this.anInt1889-- == 0) {
			this.method1134();
			this.anInt1889 = 255;
		}
		return this.anIntArray244[this.anInt1889];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	private void method1131() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(31) int local31;
		for (local31 = 0; local31 < 4; local31++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local18 += this.anIntArray244[local31 + 2];
			local14 += this.anIntArray244[local31 + 4];
			local12 += this.anIntArray244[local31 + 5];
			local20 += this.anIntArray244[local31 + 1];
			local10 += this.anIntArray244[local31 + 6];
			local16 += this.anIntArray244[local31 + 3];
			local8 += this.anIntArray244[local31 + 7];
			local21 += this.anIntArray244[local31];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray245[local31] = local21;
			this.anIntArray245[local31 + 1] = local20;
			this.anIntArray245[local31 + 2] = local18;
			this.anIntArray245[local31 + 3] = local16;
			this.anIntArray245[local31 + 4] = local14;
			this.anIntArray245[local31 + 5] = local12;
			this.anIntArray245[local31 + 6] = local10;
			this.anIntArray245[local31 + 7] = local8;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local14 += this.anIntArray245[local31 + 4];
			local12 += this.anIntArray245[local31 + 5];
			local18 += this.anIntArray245[local31 + 2];
			local10 += this.anIntArray245[local31 + 6];
			local20 += this.anIntArray245[local31 + 1];
			local8 += this.anIntArray245[local31 + 7];
			local21 += this.anIntArray245[local31];
			local21 ^= local20 << 11;
			local16 += this.anIntArray245[local31 + 3];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray245[local31] = local21;
			this.anIntArray245[local31 + 1] = local20;
			this.anIntArray245[local31 + 2] = local18;
			this.anIntArray245[local31 + 3] = local16;
			this.anIntArray245[local31 + 4] = local14;
			this.anIntArray245[local31 + 5] = local12;
			this.anIntArray245[local31 + 6] = local10;
			this.anIntArray245[local31 + 7] = local8;
		}
		this.method1134();
		this.anInt1889 = 256;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	private void method1134() {
		this.anInt1891 += ++this.anInt1895;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray245[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1894 ^= this.anInt1894 << 13;
				} else {
					this.anInt1894 ^= this.anInt1894 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1894 ^= this.anInt1894 << 2;
			} else {
				this.anInt1894 ^= this.anInt1894 >>> 16;
			}
			this.anInt1894 += this.anIntArray245[local19 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray245[local19] = local119 = this.anInt1894 + this.anIntArray245[local26 >> 2 & 0xFF] + this.anInt1891;
			this.anIntArray244[local19] = this.anInt1891 = local26 + this.anIntArray245[local119 >> 8 >> 2 & 0xFF];
		}
	}
}
