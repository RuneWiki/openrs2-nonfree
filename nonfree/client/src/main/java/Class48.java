import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class48 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	private int anInt1389;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	private int anInt1391;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	private int anInt1396;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "([I)V")
	public Class48(@OriginalArg(0) int[] arg0) {
		this.anIntArray67 = new int[256];
		this.anIntArray68 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray68[local13] = arg0[local13];
		}
		this.method1224();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	public int method1223() {
		if (this.anInt1391-- == 0) {
			this.method1227();
			this.anInt1391 = 255;
		}
		return this.anIntArray68[this.anInt1391];
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	private void method1224() {
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
			local26 += local24;
			local22 += local28;
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
			local16 += local29;
			local28 += local18;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local28 += this.anIntArray68[local31 + 1];
			local29 += this.anIntArray68[local31];
			local24 += this.anIntArray68[local31 + 3];
			local18 += this.anIntArray68[local31 + 6];
			local16 += this.anIntArray68[local31 + 7];
			local22 += this.anIntArray68[local31 + 4];
			local20 += this.anIntArray68[local31 + 5];
			local26 += this.anIntArray68[local31 + 2];
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
			this.anIntArray67[local31] = local29;
			this.anIntArray67[local31 + 1] = local28;
			this.anIntArray67[local31 + 2] = local26;
			this.anIntArray67[local31 + 3] = local24;
			this.anIntArray67[local31 + 4] = local22;
			this.anIntArray67[local31 + 5] = local20;
			this.anIntArray67[local31 + 6] = local18;
			this.anIntArray67[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local24 += this.anIntArray67[local31 + 3];
			local22 += this.anIntArray67[local31 + 4];
			local26 += this.anIntArray67[local31 + 2];
			local28 += this.anIntArray67[local31 + 1];
			local20 += this.anIntArray67[local31 + 5];
			local16 += this.anIntArray67[local31 + 7];
			local18 += this.anIntArray67[local31 + 6];
			local29 += this.anIntArray67[local31];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
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
			local29 += local28;
			local26 += local16;
			this.anIntArray67[local31] = local29;
			this.anIntArray67[local31 + 1] = local28;
			this.anIntArray67[local31 + 2] = local26;
			this.anIntArray67[local31 + 3] = local24;
			this.anIntArray67[local31 + 4] = local22;
			this.anIntArray67[local31 + 5] = local20;
			this.anIntArray67[local31 + 6] = local18;
			this.anIntArray67[local31 + 7] = local16;
		}
		this.method1227();
		this.anInt1391 = 256;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	private void method1227() {
		this.anInt1389 += ++this.anInt1390;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray67[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1396 ^= this.anInt1396 << 13;
				} else {
					this.anInt1396 ^= this.anInt1396 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1396 ^= this.anInt1396 << 2;
			} else {
				this.anInt1396 ^= this.anInt1396 >>> 16;
			}
			this.anInt1396 += this.anIntArray67[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray67[local23] = local119 = this.anInt1389 + this.anInt1396 + this.anIntArray67[local30 >> 2 & 0xFF];
			this.anIntArray68[local23] = this.anInt1389 = this.anIntArray67[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}
}
