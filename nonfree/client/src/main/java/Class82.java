import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class82 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	private final int[] anIntArray441 = new int[256];

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
	private final int[] anIntArray442 = new int[256];

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	private int anInt3852;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "I")
	private int anInt3856;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	private int anInt3858;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "([I)V")
	public Class82(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray441[local13] = arg0[local13];
		}
		this.method2923();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	private void method2923() {
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
			local28 ^= local26 >>> 2;
			local22 += local28;
			local24 += local29;
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
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local22 += this.anIntArray441[local31 + 4];
			local20 += this.anIntArray441[local31 + 5];
			local16 += this.anIntArray441[local31 + 7];
			local24 += this.anIntArray441[local31 + 3];
			local29 += this.anIntArray441[local31];
			local26 += this.anIntArray441[local31 + 2];
			local18 += this.anIntArray441[local31 + 6];
			local28 += this.anIntArray441[local31 + 1];
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
			local22 ^= local20 << 10;
			local18 += local24;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			this.anIntArray442[local31] = local29;
			this.anIntArray442[local31 + 1] = local28;
			local26 += local16;
			this.anIntArray442[local31 + 2] = local26;
			this.anIntArray442[local31 + 3] = local24;
			this.anIntArray442[local31 + 4] = local22;
			this.anIntArray442[local31 + 5] = local20;
			this.anIntArray442[local31 + 6] = local18;
			this.anIntArray442[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local16 += this.anIntArray442[local31 + 7];
			local26 += this.anIntArray442[local31 + 2];
			local20 += this.anIntArray442[local31 + 5];
			local28 += this.anIntArray442[local31 + 1];
			local24 += this.anIntArray442[local31 + 3];
			local22 += this.anIntArray442[local31 + 4];
			local29 += this.anIntArray442[local31];
			local18 += this.anIntArray442[local31 + 6];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
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
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray442[local31] = local29;
			this.anIntArray442[local31 + 1] = local28;
			this.anIntArray442[local31 + 2] = local26;
			this.anIntArray442[local31 + 3] = local24;
			this.anIntArray442[local31 + 4] = local22;
			this.anIntArray442[local31 + 5] = local20;
			this.anIntArray442[local31 + 6] = local18;
			this.anIntArray442[local31 + 7] = local16;
		}
		this.method2928();
		this.anInt3858 = 256;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
	public int method2927() {
		if (this.anInt3858-- == 0) {
			this.method2928();
			this.anInt3858 = 255;
		}
		return this.anIntArray441[this.anInt3858];
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	private void method2928() {
		this.anInt3852 += ++this.anInt3856;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(29) int local29 = this.anIntArray442[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt3855 ^= this.anInt3855 << 13;
				} else {
					this.anInt3855 ^= this.anInt3855 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt3855 ^= this.anInt3855 << 2;
			} else {
				this.anInt3855 ^= this.anInt3855 >>> 16;
			}
			this.anInt3855 += this.anIntArray442[local23 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray442[local23] = local115 = this.anInt3855 + this.anIntArray442[local29 >> 2 & 0xFF] + this.anInt3852;
			this.anIntArray441[local23] = this.anInt3852 = local29 + this.anIntArray442[local115 >> 8 >> 2 & 0xFF];
		}
	}
}
