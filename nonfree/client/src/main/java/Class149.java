import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class149 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	private int anInt4518;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	private int anInt4519;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	private int anInt4523;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
	private int anInt4529;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	private Class149() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([I)V")
	public Class149(@OriginalArg(0) int[] arg0) {
		this.anIntArray357 = new int[256];
		this.anIntArray356 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray357[local13] = arg0[local13];
		}
		this.method4076();
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)I")
	public int method4073() {
		if (this.anInt4529-- == 0) {
			this.method4075();
			this.anInt4529 = 255;
		}
		return this.anIntArray357[this.anInt4529];
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	private void method4075() {
		this.anInt4523 += ++this.anInt4519;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray356[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4518 ^= this.anInt4518 << 13;
				} else {
					this.anInt4518 ^= this.anInt4518 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4518 ^= this.anInt4518 << 2;
			} else {
				this.anInt4518 ^= this.anInt4518 >>> 16;
			}
			this.anInt4518 += this.anIntArray356[local25 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray356[local25] = local122 = this.anInt4518 + this.anIntArray356[local32 >> 2 & 0xFF] + this.anInt4523;
			this.anIntArray357[local25] = this.anInt4523 = local32 + this.anIntArray356[local122 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
	private void method4076() {
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
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local16 += this.anIntArray357[local31 + 3];
			local18 += this.anIntArray357[local31 + 2];
			local21 += this.anIntArray357[local31];
			local8 += this.anIntArray357[local31 + 7];
			local20 += this.anIntArray357[local31 + 1];
			local10 += this.anIntArray357[local31 + 6];
			local12 += this.anIntArray357[local31 + 5];
			local14 += this.anIntArray357[local31 + 4];
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
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray356[local31] = local21;
			this.anIntArray356[local31 + 1] = local20;
			this.anIntArray356[local31 + 2] = local18;
			this.anIntArray356[local31 + 3] = local16;
			this.anIntArray356[local31 + 4] = local14;
			this.anIntArray356[local31 + 5] = local12;
			this.anIntArray356[local31 + 6] = local10;
			this.anIntArray356[local31 + 7] = local8;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local20 += this.anIntArray356[local31 + 1];
			local21 += this.anIntArray356[local31];
			local8 += this.anIntArray356[local31 + 7];
			local12 += this.anIntArray356[local31 + 5];
			local10 += this.anIntArray356[local31 + 6];
			local18 += this.anIntArray356[local31 + 2];
			local14 += this.anIntArray356[local31 + 4];
			local16 += this.anIntArray356[local31 + 3];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray356[local31] = local21;
			this.anIntArray356[local31 + 1] = local20;
			this.anIntArray356[local31 + 2] = local18;
			this.anIntArray356[local31 + 3] = local16;
			this.anIntArray356[local31 + 4] = local14;
			this.anIntArray356[local31 + 5] = local12;
			this.anIntArray356[local31 + 6] = local10;
			this.anIntArray356[local31 + 7] = local8;
		}
		this.method4075();
		this.anInt4529 = 256;
	}
}
