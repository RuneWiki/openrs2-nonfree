import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class74 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
	private final int[] anIntArray295 = new int[256];

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	private int anInt2718;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	private int anInt2723;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[I")
	private final int[] anIntArray296 = new int[256];

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt2725;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	private int anInt2730;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([I)V")
	public Class74(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray295[local13] = arg0[local13];
		}
		this.method2030();
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I")
	public int method2028() {
		if (this.anInt2725-- == 0) {
			this.method2029();
			this.anInt2725 = 255;
		}
		return this.anIntArray295[this.anInt2725];
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	private void method2029() {
		this.anInt2718 += ++this.anInt2730;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray296[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt2723 ^= this.anInt2723 << 13;
				} else {
					this.anInt2723 ^= this.anInt2723 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt2723 ^= this.anInt2723 << 2;
			} else {
				this.anInt2723 ^= this.anInt2723 >>> 16;
			}
			this.anInt2723 += this.anIntArray296[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray296[local23] = local123 = this.anIntArray296[local30 >> 2 & 0xFF] + this.anInt2723 + this.anInt2718;
			this.anIntArray295[local23] = this.anInt2718 = this.anIntArray296[local123 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	private void method2030() {
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
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local18 += this.anIntArray295[local27 + 4];
			local14 += this.anIntArray295[local27 + 6];
			local25 += this.anIntArray295[local27];
			local24 += this.anIntArray295[local27 + 1];
			local22 += this.anIntArray295[local27 + 2];
			local20 += this.anIntArray295[local27 + 3];
			local25 ^= local24 << 11;
			local16 += this.anIntArray295[local27 + 5];
			local12 += this.anIntArray295[local27 + 7];
			local24 += local22;
			local20 += local25;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local18 += local24;
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
			local24 += local14;
			local25 += local16;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray296[local27] = local25;
			this.anIntArray296[local27 + 1] = local24;
			this.anIntArray296[local27 + 2] = local22;
			this.anIntArray296[local27 + 3] = local20;
			this.anIntArray296[local27 + 4] = local18;
			this.anIntArray296[local27 + 5] = local16;
			this.anIntArray296[local27 + 6] = local14;
			this.anIntArray296[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local18 += this.anIntArray296[local27 + 4];
			local20 += this.anIntArray296[local27 + 3];
			local12 += this.anIntArray296[local27 + 7];
			local14 += this.anIntArray296[local27 + 6];
			local22 += this.anIntArray296[local27 + 2];
			local24 += this.anIntArray296[local27 + 1];
			local25 += this.anIntArray296[local27];
			local25 ^= local24 << 11;
			local24 += local22;
			local16 += this.anIntArray296[local27 + 5];
			local24 ^= local22 >>> 2;
			local18 += local24;
			local20 += local25;
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
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray296[local27] = local25;
			this.anIntArray296[local27 + 1] = local24;
			this.anIntArray296[local27 + 2] = local22;
			this.anIntArray296[local27 + 3] = local20;
			this.anIntArray296[local27 + 4] = local18;
			this.anIntArray296[local27 + 5] = local16;
			this.anIntArray296[local27 + 6] = local14;
			this.anIntArray296[local27 + 7] = local12;
		}
		this.method2029();
		this.anInt2725 = 256;
	}
}
