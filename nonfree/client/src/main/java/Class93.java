import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class93 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
	private int anInt2875;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	private Class93() {
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([I)V")
	public Class93(@OriginalArg(0) int[] arg0) {
		this.anIntArray264 = new int[256];
		this.anIntArray262 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray264[local13] = arg0[local13];
		}
		this.method2730();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	public int method2729() {
		if (this.anInt2875-- == 0) {
			this.method2731();
			this.anInt2875 = 255;
		}
		return this.anIntArray264[this.anInt2875];
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	private void method2730() {
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(29) int local29 = -1640531527;
		@Pc(31) int local31;
		for (local31 = 0; local31 < 4; local31++) {
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local20 += this.anIntArray264[local31 + 5];
			local24 += this.anIntArray264[local31 + 3];
			local18 += this.anIntArray264[local31 + 6];
			local29 += this.anIntArray264[local31];
			local26 += this.anIntArray264[local31 + 2];
			local16 += this.anIntArray264[local31 + 7];
			local28 += this.anIntArray264[local31 + 1];
			local22 += this.anIntArray264[local31 + 4];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray262[local31] = local29;
			this.anIntArray262[local31 + 1] = local28;
			this.anIntArray262[local31 + 2] = local26;
			this.anIntArray262[local31 + 3] = local24;
			this.anIntArray262[local31 + 4] = local22;
			this.anIntArray262[local31 + 5] = local20;
			this.anIntArray262[local31 + 6] = local18;
			this.anIntArray262[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local18 += this.anIntArray262[local31 + 6];
			local28 += this.anIntArray262[local31 + 1];
			local22 += this.anIntArray262[local31 + 4];
			local26 += this.anIntArray262[local31 + 2];
			local16 += this.anIntArray262[local31 + 7];
			local24 += this.anIntArray262[local31 + 3];
			local20 += this.anIntArray262[local31 + 5];
			local29 += this.anIntArray262[local31];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray262[local31] = local29;
			this.anIntArray262[local31 + 1] = local28;
			this.anIntArray262[local31 + 2] = local26;
			this.anIntArray262[local31 + 3] = local24;
			this.anIntArray262[local31 + 4] = local22;
			this.anIntArray262[local31 + 5] = local20;
			this.anIntArray262[local31 + 6] = local18;
			this.anIntArray262[local31 + 7] = local16;
		}
		this.method2731();
		this.anInt2875 = 256;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
	private void method2731() {
		this.anInt2872 += ++this.anInt2869;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray262[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt2871 ^= this.anInt2871 << 13;
				} else {
					this.anInt2871 ^= this.anInt2871 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt2871 ^= this.anInt2871 << 2;
			} else {
				this.anInt2871 ^= this.anInt2871 >>> 16;
			}
			this.anInt2871 += this.anIntArray262[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray262[local19] = local116 = this.anInt2871 + this.anIntArray262[local26 >> 2 & 0xFF] + this.anInt2872;
			this.anIntArray264[local19] = this.anInt2872 = this.anIntArray262[local116 >> 8 >> 2 & 0xFF] + local26;
		}
	}
}
