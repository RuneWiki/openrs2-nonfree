import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class86 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
	private int[] anIntArray268 = new int[256];

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	private int anInt3564;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	private int anInt3568;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	private int anInt3574;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[I")
	private int[] anIntArray269 = new int[256];

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([I)V")
	public Class86(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray269[local13] = arg0[local13];
		}
		this.method2677();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	private void method2675() {
		this.anInt3568 += ++this.anInt3573;
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(29) int local29 = this.anIntArray268[local22];
			if ((local22 & 0x2) == 0) {
				if ((local22 & 0x1) == 0) {
					this.anInt3564 ^= this.anInt3564 << 13;
				} else {
					this.anInt3564 ^= this.anInt3564 >>> 6;
				}
			} else if ((local22 & 0x1) == 0) {
				this.anInt3564 ^= this.anInt3564 << 2;
			} else {
				this.anInt3564 ^= this.anInt3564 >>> 16;
			}
			this.anInt3564 += this.anIntArray268[local22 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray268[local22] = local121 = this.anInt3568 + this.anInt3564 + this.anIntArray268[local29 >> 2 & 0xFF];
			this.anIntArray269[local22] = this.anInt3568 = this.anIntArray268[local121 >> 8 >> 2 & 0xFF] + local29;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I")
	public int method2676() {
		if (this.anInt3574-- == 0) {
			this.method2675();
			this.anInt3574 = 255;
		}
		return this.anIntArray269[this.anInt3574];
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	private void method2677() {
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray269[local23 + 5];
			local21 += this.anIntArray269[local23];
			local8 += this.anIntArray269[local23 + 7];
			local18 += this.anIntArray269[local23 + 2];
			local14 += this.anIntArray269[local23 + 4];
			local20 += this.anIntArray269[local23 + 1];
			local10 += this.anIntArray269[local23 + 6];
			local16 += this.anIntArray269[local23 + 3];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray268[local23] = local21;
			this.anIntArray268[local23 + 1] = local20;
			this.anIntArray268[local23 + 2] = local18;
			this.anIntArray268[local23 + 3] = local16;
			this.anIntArray268[local23 + 4] = local14;
			this.anIntArray268[local23 + 5] = local12;
			this.anIntArray268[local23 + 6] = local10;
			this.anIntArray268[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray268[local23 + 5];
			local10 += this.anIntArray268[local23 + 6];
			local16 += this.anIntArray268[local23 + 3];
			local21 += this.anIntArray268[local23];
			local8 += this.anIntArray268[local23 + 7];
			local20 += this.anIntArray268[local23 + 1];
			local18 += this.anIntArray268[local23 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += this.anIntArray268[local23 + 4];
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray268[local23] = local21;
			this.anIntArray268[local23 + 1] = local20;
			this.anIntArray268[local23 + 2] = local18;
			this.anIntArray268[local23 + 3] = local16;
			this.anIntArray268[local23 + 4] = local14;
			this.anIntArray268[local23 + 5] = local12;
			this.anIntArray268[local23 + 6] = local10;
			this.anIntArray268[local23 + 7] = local8;
		}
		this.method2675();
		this.anInt3574 = 256;
	}
}
