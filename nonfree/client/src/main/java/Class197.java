import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class197 {

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	private int anInt5386;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private int anInt5387;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	private int anInt5389;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private int anInt5390;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	private Class197() {
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([I)V")
	public Class197(@OriginalArg(0) int[] arg0) {
		this.anIntArray298 = new int[256];
		this.anIntArray297 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray298[local13] = arg0[local13];
		}
		this.method4902();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I")
	public int method4900() {
		if (this.anInt5390 == 0) {
			this.method4901();
			this.anInt5390 = 256;
		}
		return this.anIntArray298[--this.anInt5390];
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	private void method4901() {
		this.anInt5389 += ++this.anInt5387;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(30) int local30 = this.anIntArray297[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt5386 ^= this.anInt5386 << 13;
				} else {
					this.anInt5386 ^= this.anInt5386 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt5386 ^= this.anInt5386 << 2;
			} else {
				this.anInt5386 ^= this.anInt5386 >>> 16;
			}
			this.anInt5386 += this.anIntArray297[local17 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray297[local17] = local120 = this.anInt5389 + this.anIntArray297[local30 >> 2 & 0xFF] + this.anInt5386;
			this.anIntArray298[local17] = this.anInt5389 = local30 + this.anIntArray297[local120 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	private void method4902() {
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
			local20 += local18;
			local16 += local21;
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
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local12 += this.anIntArray298[local31 + 5];
			local14 += this.anIntArray298[local31 + 4];
			local10 += this.anIntArray298[local31 + 6];
			local16 += this.anIntArray298[local31 + 3];
			local8 += this.anIntArray298[local31 + 7];
			local18 += this.anIntArray298[local31 + 2];
			local20 += this.anIntArray298[local31 + 1];
			local21 += this.anIntArray298[local31];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray297[local31] = local21;
			this.anIntArray297[local31 + 1] = local20;
			this.anIntArray297[local31 + 2] = local18;
			this.anIntArray297[local31 + 3] = local16;
			this.anIntArray297[local31 + 4] = local14;
			this.anIntArray297[local31 + 5] = local12;
			this.anIntArray297[local31 + 6] = local10;
			this.anIntArray297[local31 + 7] = local8;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local18 += this.anIntArray297[local31 + 2];
			local20 += this.anIntArray297[local31 + 1];
			local16 += this.anIntArray297[local31 + 3];
			local10 += this.anIntArray297[local31 + 6];
			local21 += this.anIntArray297[local31];
			local12 += this.anIntArray297[local31 + 5];
			local8 += this.anIntArray297[local31 + 7];
			local14 += this.anIntArray297[local31 + 4];
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
			local10 += local16;
			local14 += local12;
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
			local21 += local20;
			local18 += local8;
			this.anIntArray297[local31] = local21;
			this.anIntArray297[local31 + 1] = local20;
			this.anIntArray297[local31 + 2] = local18;
			this.anIntArray297[local31 + 3] = local16;
			this.anIntArray297[local31 + 4] = local14;
			this.anIntArray297[local31 + 5] = local12;
			this.anIntArray297[local31 + 6] = local10;
			this.anIntArray297[local31 + 7] = local8;
		}
		this.method4901();
		this.anInt5390 = 256;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
	public int method4903() {
		if (this.anInt5390 == 0) {
			this.method4901();
			this.anInt5390 = 256;
		}
		return this.anIntArray298[this.anInt5390 - 1];
	}
}
