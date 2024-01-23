import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class74 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private int anInt3016;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
	private int[] anIntArray203 = new int[256];

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
	private int[] anIntArray204 = new int[256];

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	private int anInt3020;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	private int anInt3024;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private int anInt3025;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
	public Class74(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray204[local13] = arg0[local13];
		}
		this.method2403();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	private void method2403() {
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
			local12 += local18;
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
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray204[local23 + 1];
			local18 += this.anIntArray204[local23 + 2];
			local16 += this.anIntArray204[local23 + 3];
			local21 += this.anIntArray204[local23];
			local21 ^= local20 << 11;
			local8 += this.anIntArray204[local23 + 7];
			local12 += this.anIntArray204[local23 + 5];
			local14 += this.anIntArray204[local23 + 4];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local10 += this.anIntArray204[local23 + 6];
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
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
			local21 += local20;
			this.anIntArray203[local23] = local21;
			local18 += local8;
			this.anIntArray203[local23 + 1] = local20;
			this.anIntArray203[local23 + 2] = local18;
			this.anIntArray203[local23 + 3] = local16;
			this.anIntArray203[local23 + 4] = local14;
			this.anIntArray203[local23 + 5] = local12;
			this.anIntArray203[local23 + 6] = local10;
			this.anIntArray203[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray203[local23 + 5];
			local14 += this.anIntArray203[local23 + 4];
			local21 += this.anIntArray203[local23];
			local10 += this.anIntArray203[local23 + 6];
			local18 += this.anIntArray203[local23 + 2];
			local8 += this.anIntArray203[local23 + 7];
			local20 += this.anIntArray203[local23 + 1];
			local21 ^= local20 << 11;
			local16 += this.anIntArray203[local23 + 3];
			local20 += local18;
			local16 += local21;
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
			local18 += local8;
			local21 += local20;
			this.anIntArray203[local23] = local21;
			this.anIntArray203[local23 + 1] = local20;
			this.anIntArray203[local23 + 2] = local18;
			this.anIntArray203[local23 + 3] = local16;
			this.anIntArray203[local23 + 4] = local14;
			this.anIntArray203[local23 + 5] = local12;
			this.anIntArray203[local23 + 6] = local10;
			this.anIntArray203[local23 + 7] = local8;
		}
		this.method2405();
		this.anInt3025 = 256;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	private void method2405() {
		this.anInt3016 += ++this.anInt3024;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray203[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3020 ^= this.anInt3020 << 13;
				} else {
					this.anInt3020 ^= this.anInt3020 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3020 ^= this.anInt3020 << 2;
			} else {
				this.anInt3020 ^= this.anInt3020 >>> 16;
			}
			this.anInt3020 += this.anIntArray203[local19 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray203[local19] = local115 = this.anInt3020 + this.anIntArray203[local26 >> 2 & 0xFF] + this.anInt3016;
			this.anIntArray204[local19] = this.anInt3016 = local26 + this.anIntArray203[local115 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
	public int method2407() {
		if (this.anInt3025-- == 0) {
			this.method2405();
			this.anInt3025 = 255;
		}
		return this.anIntArray204[this.anInt3025];
	}
}
