import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class241 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "[I")
	private int[] anIntArray630;

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
	private int anInt7147;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
	private int anInt7148;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
	private int anInt7150;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
	private int anInt7154;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
	private Class241() {
	}

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "([I)V")
	public Class241(@OriginalArg(0) int[] arg0) {
		this.anIntArray630 = new int[256];
		this.anIntArray631 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray630[local13] = arg0[local13];
		}
		this.method5971();
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	private void method5966() {
		this.anInt7154 += ++this.anInt7148;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray631[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt7147 ^= this.anInt7147 << 13;
				} else {
					this.anInt7147 ^= this.anInt7147 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt7147 ^= this.anInt7147 << 2;
			} else {
				this.anInt7147 ^= this.anInt7147 >>> 16;
			}
			this.anInt7147 += this.anIntArray631[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray631[local19] = local116 = this.anIntArray631[local26 >> 2 & 0xFF] + this.anInt7147 + this.anInt7154;
			this.anIntArray630[local19] = this.anInt7154 = this.anIntArray631[local116 >> 8 >> 2 & 0xFF] + local26;
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
	public int method5968() {
		if (this.anInt7150 == 0) {
			this.method5966();
			this.anInt7150 = 256;
		}
		return this.anIntArray630[--this.anInt7150];
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
	private void method5971() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray630[local29 + 3];
			local16 += this.anIntArray630[local29 + 6];
			local26 += this.anIntArray630[local29 + 1];
			local14 += this.anIntArray630[local29 + 7];
			local18 += this.anIntArray630[local29 + 5];
			local24 += this.anIntArray630[local29 + 2];
			local20 += this.anIntArray630[local29 + 4];
			local27 += this.anIntArray630[local29];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray631[local29] = local27;
			this.anIntArray631[local29 + 1] = local26;
			this.anIntArray631[local29 + 2] = local24;
			this.anIntArray631[local29 + 3] = local22;
			this.anIntArray631[local29 + 4] = local20;
			this.anIntArray631[local29 + 5] = local18;
			this.anIntArray631[local29 + 6] = local16;
			this.anIntArray631[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local20 += this.anIntArray631[local29 + 4];
			local26 += this.anIntArray631[local29 + 1];
			local18 += this.anIntArray631[local29 + 5];
			local27 += this.anIntArray631[local29];
			local16 += this.anIntArray631[local29 + 6];
			local24 += this.anIntArray631[local29 + 2];
			local14 += this.anIntArray631[local29 + 7];
			local22 += this.anIntArray631[local29 + 3];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray631[local29] = local27;
			this.anIntArray631[local29 + 1] = local26;
			this.anIntArray631[local29 + 2] = local24;
			this.anIntArray631[local29 + 3] = local22;
			this.anIntArray631[local29 + 4] = local20;
			this.anIntArray631[local29 + 5] = local18;
			this.anIntArray631[local29 + 6] = local16;
			this.anIntArray631[local29 + 7] = local14;
		}
		this.method5966();
		this.anInt7150 = 256;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)I")
	public int method5972() {
		if (this.anInt7150 == 0) {
			this.method5966();
			this.anInt7150 = 256;
		}
		return this.anIntArray630[this.anInt7150 - 1];
	}
}
