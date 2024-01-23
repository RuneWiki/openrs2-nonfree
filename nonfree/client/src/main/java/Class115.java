import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class115 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private int anInt3272;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private int anInt3280;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	private int[] anIntArray310 = new int[256];

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
	private int[] anIntArray311 = new int[256];

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([I)V")
	public Class115(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray310[local13] = arg0[local13];
		}
		this.method2689();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	private void method2689() {
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
			local18 ^= local16 << 8;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray310[local23 + 7];
			local10 += this.anIntArray310[local23 + 6];
			local20 += this.anIntArray310[local23 + 1];
			local14 += this.anIntArray310[local23 + 4];
			local12 += this.anIntArray310[local23 + 5];
			local21 += this.anIntArray310[local23];
			local21 ^= local20 << 11;
			local16 += this.anIntArray310[local23 + 3];
			local18 += this.anIntArray310[local23 + 2];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
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
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local21 += local20;
			local18 += local8;
			this.anIntArray311[local23] = local21;
			this.anIntArray311[local23 + 1] = local20;
			this.anIntArray311[local23 + 2] = local18;
			this.anIntArray311[local23 + 3] = local16;
			this.anIntArray311[local23 + 4] = local14;
			this.anIntArray311[local23 + 5] = local12;
			this.anIntArray311[local23 + 6] = local10;
			this.anIntArray311[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray311[local23 + 4];
			local16 += this.anIntArray311[local23 + 3];
			local20 += this.anIntArray311[local23 + 1];
			local18 += this.anIntArray311[local23 + 2];
			local10 += this.anIntArray311[local23 + 6];
			local12 += this.anIntArray311[local23 + 5];
			local21 += this.anIntArray311[local23];
			local8 += this.anIntArray311[local23 + 7];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
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
			this.anIntArray311[local23] = local21;
			this.anIntArray311[local23 + 1] = local20;
			local18 += local8;
			this.anIntArray311[local23 + 2] = local18;
			this.anIntArray311[local23 + 3] = local16;
			this.anIntArray311[local23 + 4] = local14;
			this.anIntArray311[local23 + 5] = local12;
			this.anIntArray311[local23 + 6] = local10;
			this.anIntArray311[local23 + 7] = local8;
		}
		this.method2694();
		this.anInt3272 = 256;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)I")
	public int method2691() {
		if (this.anInt3272-- == 0) {
			this.method2694();
			this.anInt3272 = 255;
		}
		return this.anIntArray310[this.anInt3272];
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	private void method2694() {
		this.anInt3276 += ++this.anInt3274;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(27) int local27 = this.anIntArray311[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3280 ^= this.anInt3280 << 13;
				} else {
					this.anInt3280 ^= this.anInt3280 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3280 ^= this.anInt3280 << 2;
			} else {
				this.anInt3280 ^= this.anInt3280 >>> 16;
			}
			this.anInt3280 += this.anIntArray311[local19 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray311[local19] = local121 = this.anInt3276 + this.anIntArray311[local27 >> 2 & 0xFF] + this.anInt3280;
			this.anIntArray310[local19] = this.anInt3276 = this.anIntArray311[local121 >> 8 >> 2 & 0xFF] + local27;
		}
	}
}
