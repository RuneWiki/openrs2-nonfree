import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class90 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
	private final int[] anIntArray334 = new int[256];

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
	private final int[] anIntArray335 = new int[256];

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	private int anInt3916;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
	private int anInt3917;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	private int anInt3918;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
	private int anInt3920;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([I)V")
	public Class90(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray334[local13] = arg0[local13];
		}
		this.method3023();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	private void method3021() {
		this.anInt3918 += ++this.anInt3916;
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(27) int local27 = this.anIntArray335[local21];
			if ((local21 & 0x2) == 0) {
				if ((local21 & 0x1) == 0) {
					this.anInt3917 ^= this.anInt3917 << 13;
				} else {
					this.anInt3917 ^= this.anInt3917 >>> 6;
				}
			} else if ((local21 & 0x1) == 0) {
				this.anInt3917 ^= this.anInt3917 << 2;
			} else {
				this.anInt3917 ^= this.anInt3917 >>> 16;
			}
			this.anInt3917 += this.anIntArray335[local21 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray335[local21] = local116 = this.anInt3918 + this.anIntArray335[local27 >> 2 & 0xFF] + this.anInt3917;
			this.anIntArray334[local21] = this.anInt3918 = this.anIntArray335[local116 >> 8 >> 2 & 0xFF] + local27;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	private void method3023() {
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
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray334[local23 + 7];
			local21 += this.anIntArray334[local23];
			local16 += this.anIntArray334[local23 + 3];
			local10 += this.anIntArray334[local23 + 6];
			local18 += this.anIntArray334[local23 + 2];
			local14 += this.anIntArray334[local23 + 4];
			local20 += this.anIntArray334[local23 + 1];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local12 += this.anIntArray334[local23 + 5];
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
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
			this.anIntArray335[local23] = local21;
			this.anIntArray335[local23 + 1] = local20;
			this.anIntArray335[local23 + 2] = local18;
			this.anIntArray335[local23 + 3] = local16;
			this.anIntArray335[local23 + 4] = local14;
			this.anIntArray335[local23 + 5] = local12;
			this.anIntArray335[local23 + 6] = local10;
			this.anIntArray335[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray335[local23 + 7];
			local14 += this.anIntArray335[local23 + 4];
			local16 += this.anIntArray335[local23 + 3];
			local21 += this.anIntArray335[local23];
			local20 += this.anIntArray335[local23 + 1];
			local10 += this.anIntArray335[local23 + 6];
			local12 += this.anIntArray335[local23 + 5];
			local21 ^= local20 << 11;
			local18 += this.anIntArray335[local23 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
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
			this.anIntArray335[local23] = local21;
			this.anIntArray335[local23 + 1] = local20;
			this.anIntArray335[local23 + 2] = local18;
			this.anIntArray335[local23 + 3] = local16;
			this.anIntArray335[local23 + 4] = local14;
			this.anIntArray335[local23 + 5] = local12;
			this.anIntArray335[local23 + 6] = local10;
			this.anIntArray335[local23 + 7] = local8;
		}
		this.method3021();
		this.anInt3920 = 256;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
	public int method3025() {
		if (this.anInt3920-- == 0) {
			this.method3021();
			this.anInt3920 = 255;
		}
		return this.anIntArray334[this.anInt3920];
	}
}
