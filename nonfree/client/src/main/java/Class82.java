import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class82 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	private int anInt3412;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	private final int[] anIntArray295 = new int[256];

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	private int anInt3419;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	private int anInt3420;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
	private final int[] anIntArray296 = new int[256];

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
	public Class82(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray295[local13] = arg0[local13];
		}
		this.method2371();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	private void method2371() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray295[local23];
			local14 += this.anIntArray295[local23 + 4];
			local16 += this.anIntArray295[local23 + 3];
			local10 += this.anIntArray295[local23 + 6];
			local20 += this.anIntArray295[local23 + 1];
			local12 += this.anIntArray295[local23 + 5];
			local8 += this.anIntArray295[local23 + 7];
			local21 ^= local20 << 11;
			local18 += this.anIntArray295[local23 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray296[local23] = local21;
			local18 += local8;
			this.anIntArray296[local23 + 1] = local20;
			this.anIntArray296[local23 + 2] = local18;
			this.anIntArray296[local23 + 3] = local16;
			this.anIntArray296[local23 + 4] = local14;
			this.anIntArray296[local23 + 5] = local12;
			this.anIntArray296[local23 + 6] = local10;
			this.anIntArray296[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray296[local23 + 6];
			local20 += this.anIntArray296[local23 + 1];
			local16 += this.anIntArray296[local23 + 3];
			local14 += this.anIntArray296[local23 + 4];
			local8 += this.anIntArray296[local23 + 7];
			local12 += this.anIntArray296[local23 + 5];
			local18 += this.anIntArray296[local23 + 2];
			local21 += this.anIntArray296[local23];
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
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray296[local23] = local21;
			this.anIntArray296[local23 + 1] = local20;
			this.anIntArray296[local23 + 2] = local18;
			this.anIntArray296[local23 + 3] = local16;
			this.anIntArray296[local23 + 4] = local14;
			this.anIntArray296[local23 + 5] = local12;
			this.anIntArray296[local23 + 6] = local10;
			this.anIntArray296[local23 + 7] = local8;
		}
		this.method2375();
		this.anInt3420 = 256;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
	public int method2373() {
		if (this.anInt3420-- == 0) {
			this.method2375();
			this.anInt3420 = 255;
		}
		return this.anIntArray295[this.anInt3420];
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	private void method2375() {
		this.anInt3412 += ++this.anInt3413;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray296[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3419 ^= this.anInt3419 << 13;
				} else {
					this.anInt3419 ^= this.anInt3419 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3419 ^= this.anInt3419 << 2;
			} else {
				this.anInt3419 ^= this.anInt3419 >>> 16;
			}
			this.anInt3419 += this.anIntArray296[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray296[local19] = local118 = this.anInt3412 + this.anInt3419 + this.anIntArray296[local26 >> 2 & 0xFF];
			this.anIntArray295[local19] = this.anInt3412 = local26 + this.anIntArray296[local118 >> 8 >> 2 & 0xFF];
		}
	}
}
