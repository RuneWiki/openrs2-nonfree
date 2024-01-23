import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class96 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private int anInt4079;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	private int anInt4080;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
	private int[] anIntArray531 = new int[256];

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
	private int[] anIntArray532 = new int[256];

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([I)V")
	public Class96(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray531[local13] = arg0[local13];
		}
		this.method2979();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	private void method2979() {
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
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray531[local23 + 4];
			local20 += this.anIntArray531[local23 + 1];
			local18 += this.anIntArray531[local23 + 2];
			local10 += this.anIntArray531[local23 + 6];
			local16 += this.anIntArray531[local23 + 3];
			local12 += this.anIntArray531[local23 + 5];
			local21 += this.anIntArray531[local23];
			local21 ^= local20 << 11;
			local8 += this.anIntArray531[local23 + 7];
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray532[local23] = local21;
			this.anIntArray532[local23 + 1] = local20;
			this.anIntArray532[local23 + 2] = local18;
			this.anIntArray532[local23 + 3] = local16;
			this.anIntArray532[local23 + 4] = local14;
			this.anIntArray532[local23 + 5] = local12;
			this.anIntArray532[local23 + 6] = local10;
			this.anIntArray532[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray532[local23 + 7];
			local21 += this.anIntArray532[local23];
			local20 += this.anIntArray532[local23 + 1];
			local12 += this.anIntArray532[local23 + 5];
			local14 += this.anIntArray532[local23 + 4];
			local10 += this.anIntArray532[local23 + 6];
			local21 ^= local20 << 11;
			local16 += this.anIntArray532[local23 + 3];
			local16 += local21;
			local18 += this.anIntArray532[local23 + 2];
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray532[local23] = local21;
			this.anIntArray532[local23 + 1] = local20;
			this.anIntArray532[local23 + 2] = local18;
			this.anIntArray532[local23 + 3] = local16;
			this.anIntArray532[local23 + 4] = local14;
			this.anIntArray532[local23 + 5] = local12;
			this.anIntArray532[local23 + 6] = local10;
			this.anIntArray532[local23 + 7] = local8;
		}
		this.method2984();
		this.anInt4077 = 256;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	private void method2984() {
		this.anInt4080 += ++this.anInt4078;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray532[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4079 ^= this.anInt4079 << 13;
				} else {
					this.anInt4079 ^= this.anInt4079 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4079 ^= this.anInt4079 << 2;
			} else {
				this.anInt4079 ^= this.anInt4079 >>> 16;
			}
			this.anInt4079 += this.anIntArray532[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray532[local25] = local125 = this.anIntArray532[local32 >> 2 & 0xFF] + this.anInt4079 + this.anInt4080;
			this.anIntArray531[local25] = this.anInt4080 = local32 + this.anIntArray532[local125 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	public int method2985() {
		if (this.anInt4077-- == 0) {
			this.method2984();
			this.anInt4077 = 255;
		}
		return this.anIntArray531[this.anInt4077];
	}
}
