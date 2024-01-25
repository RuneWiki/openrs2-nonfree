import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class40 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	private int anInt1097;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	private int anInt1098;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	private int anInt1099;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "([I)V")
	public Class40(@OriginalArg(0) int[] arg0) {
		this.anIntArray124 = new int[256];
		this.anIntArray123 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray123[local13] = arg0[local13];
		}
		this.method922();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	private void method920() {
		this.anInt1097 += ++this.anInt1099;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray124[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt1098 ^= this.anInt1098 << 13;
				} else {
					this.anInt1098 ^= this.anInt1098 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt1098 ^= this.anInt1098 << 2;
			} else {
				this.anInt1098 ^= this.anInt1098 >>> 16;
			}
			this.anInt1098 += this.anIntArray124[local25 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray124[local25] = local126 = this.anIntArray124[local32 >> 2 & 0xFF] + this.anInt1098 + this.anInt1097;
			this.anIntArray123[local25] = this.anInt1097 = local32 + this.anIntArray124[local126 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	private void method922() {
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
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
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
			local29 += this.anIntArray123[local31];
			local26 += this.anIntArray123[local31 + 2];
			local22 += this.anIntArray123[local31 + 4];
			local28 += this.anIntArray123[local31 + 1];
			local20 += this.anIntArray123[local31 + 5];
			local18 += this.anIntArray123[local31 + 6];
			local16 += this.anIntArray123[local31 + 7];
			local24 += this.anIntArray123[local31 + 3];
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
			local18 += local24;
			local22 += local20;
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
			this.anIntArray124[local31] = local29;
			this.anIntArray124[local31 + 1] = local28;
			this.anIntArray124[local31 + 2] = local26;
			this.anIntArray124[local31 + 3] = local24;
			this.anIntArray124[local31 + 4] = local22;
			this.anIntArray124[local31 + 5] = local20;
			this.anIntArray124[local31 + 6] = local18;
			this.anIntArray124[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local29 += this.anIntArray124[local31];
			local26 += this.anIntArray124[local31 + 2];
			local18 += this.anIntArray124[local31 + 6];
			local22 += this.anIntArray124[local31 + 4];
			local28 += this.anIntArray124[local31 + 1];
			local24 += this.anIntArray124[local31 + 3];
			local16 += this.anIntArray124[local31 + 7];
			local20 += this.anIntArray124[local31 + 5];
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
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
			this.anIntArray124[local31] = local29;
			this.anIntArray124[local31 + 1] = local28;
			this.anIntArray124[local31 + 2] = local26;
			this.anIntArray124[local31 + 3] = local24;
			this.anIntArray124[local31 + 4] = local22;
			this.anIntArray124[local31 + 5] = local20;
			this.anIntArray124[local31 + 6] = local18;
			this.anIntArray124[local31 + 7] = local16;
		}
		this.method920();
		this.anInt1091 = 256;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
	public int method923() {
		if (this.anInt1091-- == 0) {
			this.method920();
			this.anInt1091 = 255;
		}
		return this.anIntArray123[this.anInt1091];
	}
}
