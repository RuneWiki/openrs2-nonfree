import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class67 {

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private int anInt3036;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private int anInt3043;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	private final int[] anIntArray324 = new int[256];

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
	private final int[] anIntArray325 = new int[256];

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([I)V")
	public Class67(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray325[local13] = arg0[local13];
		}
		this.method2034();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
	public int method2030() {
		if (this.anInt3041-- == 0) {
			this.method2032();
			this.anInt3041 = 255;
		}
		return this.anIntArray325[this.anInt3041];
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	private void method2032() {
		this.anInt3036 += ++this.anInt3043;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray324[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt3038 ^= this.anInt3038 << 13;
				} else {
					this.anInt3038 ^= this.anInt3038 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt3038 ^= this.anInt3038 << 2;
			} else {
				this.anInt3038 ^= this.anInt3038 >>> 16;
			}
			this.anInt3038 += this.anIntArray324[local24 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray324[local24] = local126 = this.anInt3036 + this.anIntArray324[local31 >> 2 & 0xFF] + this.anInt3038;
			this.anIntArray325[local24] = this.anInt3036 = local31 + this.anIntArray324[local126 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	private void method2034() {
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
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray325[local23 + 1];
			local8 += this.anIntArray325[local23 + 7];
			local16 += this.anIntArray325[local23 + 3];
			local12 += this.anIntArray325[local23 + 5];
			local14 += this.anIntArray325[local23 + 4];
			local10 += this.anIntArray325[local23 + 6];
			local21 += this.anIntArray325[local23];
			local21 ^= local20 << 11;
			local16 += local21;
			local18 += this.anIntArray325[local23 + 2];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray324[local23] = local21;
			this.anIntArray324[local23 + 1] = local20;
			this.anIntArray324[local23 + 2] = local18;
			this.anIntArray324[local23 + 3] = local16;
			this.anIntArray324[local23 + 4] = local14;
			this.anIntArray324[local23 + 5] = local12;
			this.anIntArray324[local23 + 6] = local10;
			this.anIntArray324[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray324[local23 + 1];
			local18 += this.anIntArray324[local23 + 2];
			local16 += this.anIntArray324[local23 + 3];
			local10 += this.anIntArray324[local23 + 6];
			local21 += this.anIntArray324[local23];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local8 += this.anIntArray324[local23 + 7];
			local14 += this.anIntArray324[local23 + 4];
			local20 ^= local18 >>> 2;
			local12 += this.anIntArray324[local23 + 5];
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray324[local23] = local21;
			this.anIntArray324[local23 + 1] = local20;
			this.anIntArray324[local23 + 2] = local18;
			this.anIntArray324[local23 + 3] = local16;
			this.anIntArray324[local23 + 4] = local14;
			this.anIntArray324[local23 + 5] = local12;
			this.anIntArray324[local23 + 6] = local10;
			this.anIntArray324[local23 + 7] = local8;
		}
		this.method2032();
		this.anInt3041 = 256;
	}
}
