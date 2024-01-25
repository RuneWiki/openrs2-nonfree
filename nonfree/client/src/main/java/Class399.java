import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class399 {

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
	private int anInt11005;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
	private int anInt11006;

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
	private int anInt11009;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	private int anInt11013;

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	private Class399() {
	}

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "([I)V")
	public Class399(@OriginalArg(0) int[] arg0) {
		this.anIntArray616 = new int[256];
		this.anIntArray617 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray617[local13] = arg0[local13];
		}
		this.method9193();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I")
	public int method9191() {
		if (this.anInt11006 == 0) {
			this.method9196();
			this.anInt11006 = 256;
		}
		return this.anIntArray617[this.anInt11006 - 1];
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
	private void method9193() {
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
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
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
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local28 += this.anIntArray617[local31 + 1];
			local18 += this.anIntArray617[local31 + 6];
			local24 += this.anIntArray617[local31 + 3];
			local20 += this.anIntArray617[local31 + 5];
			local29 += this.anIntArray617[local31];
			local16 += this.anIntArray617[local31 + 7];
			local26 += this.anIntArray617[local31 + 2];
			local22 += this.anIntArray617[local31 + 4];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray616[local31] = local29;
			this.anIntArray616[local31 + 1] = local28;
			this.anIntArray616[local31 + 2] = local26;
			this.anIntArray616[local31 + 3] = local24;
			this.anIntArray616[local31 + 4] = local22;
			this.anIntArray616[local31 + 5] = local20;
			this.anIntArray616[local31 + 6] = local18;
			this.anIntArray616[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local20 += this.anIntArray616[local31 + 5];
			local16 += this.anIntArray616[local31 + 7];
			local18 += this.anIntArray616[local31 + 6];
			local22 += this.anIntArray616[local31 + 4];
			local28 += this.anIntArray616[local31 + 1];
			local29 += this.anIntArray616[local31];
			local26 += this.anIntArray616[local31 + 2];
			local24 += this.anIntArray616[local31 + 3];
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
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray616[local31] = local29;
			this.anIntArray616[local31 + 1] = local28;
			this.anIntArray616[local31 + 2] = local26;
			this.anIntArray616[local31 + 3] = local24;
			this.anIntArray616[local31 + 4] = local22;
			this.anIntArray616[local31 + 5] = local20;
			this.anIntArray616[local31 + 6] = local18;
			this.anIntArray616[local31 + 7] = local16;
		}
		this.method9196();
		this.anInt11006 = 256;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	public int method9194() {
		if (this.anInt11006 == 0) {
			this.method9196();
			this.anInt11006 = 256;
		}
		return this.anIntArray617[--this.anInt11006];
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	private void method9196() {
		this.anInt11005 += ++this.anInt11013;
		for (@Pc(28) int local28 = 0; local28 < 256; local28++) {
			@Pc(35) int local35 = this.anIntArray616[local28];
			if ((local28 & 0x2) == 0) {
				if ((local28 & 0x1) == 0) {
					this.anInt11009 ^= this.anInt11009 << 13;
				} else {
					this.anInt11009 ^= this.anInt11009 >>> 6;
				}
			} else if ((local28 & 0x1) == 0) {
				this.anInt11009 ^= this.anInt11009 << 2;
			} else {
				this.anInt11009 ^= this.anInt11009 >>> 16;
			}
			this.anInt11009 += this.anIntArray616[local28 + 128 & 0xFF];
			@Pc(140) int local140;
			this.anIntArray616[local28] = local140 = this.anIntArray616[local35 >> 2 & 0xFF] + this.anInt11009 + this.anInt11005;
			this.anIntArray617[local28] = this.anInt11005 = this.anIntArray616[local140 >> 8 >> 2 & 0xFF] + local35;
		}
	}
}
