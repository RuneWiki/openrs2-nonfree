import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class77 {

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "[I")
	public static int[] anIntArray216 = new int[4096];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	private int anInt2500;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	private int anInt2502;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	private int anInt2504;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int anInt2508;

	static {
		for (@Pc(39) int local39 = 0; local39 < 4096; local39++) {
			anIntArray216[local39] = Static98.method1806(local39);
		}
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V")
	public Class77(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray215[local13] = arg0[local13];
		}
		this.method2145();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method2142() {
		if (this.anInt2502-- == 0) {
			this.method2146();
			this.anInt2502 = 255;
		}
		return this.anIntArray215[this.anInt2502];
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	private void method2145() {
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
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local27 += local18;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local26 += local16;
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray215[local29 + 3];
			local26 += this.anIntArray215[local29 + 1];
			local18 += this.anIntArray215[local29 + 5];
			local16 += this.anIntArray215[local29 + 6];
			local20 += this.anIntArray215[local29 + 4];
			local14 += this.anIntArray215[local29 + 7];
			local27 += this.anIntArray215[local29];
			local24 += this.anIntArray215[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local22 += local27;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local27 += local26;
			this.anIntArray213[local29] = local27;
			this.anIntArray213[local29 + 1] = local26;
			this.anIntArray213[local29 + 2] = local24;
			this.anIntArray213[local29 + 3] = local22;
			this.anIntArray213[local29 + 4] = local20;
			this.anIntArray213[local29 + 5] = local18;
			this.anIntArray213[local29 + 6] = local16;
			this.anIntArray213[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local22 += this.anIntArray213[local29 + 3];
			local26 += this.anIntArray213[local29 + 1];
			local18 += this.anIntArray213[local29 + 5];
			local20 += this.anIntArray213[local29 + 4];
			local24 += this.anIntArray213[local29 + 2];
			local14 += this.anIntArray213[local29 + 7];
			local27 += this.anIntArray213[local29];
			local16 += this.anIntArray213[local29 + 6];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local18 += local24;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray213[local29] = local27;
			this.anIntArray213[local29 + 1] = local26;
			this.anIntArray213[local29 + 2] = local24;
			this.anIntArray213[local29 + 3] = local22;
			this.anIntArray213[local29 + 4] = local20;
			this.anIntArray213[local29 + 5] = local18;
			this.anIntArray213[local29 + 6] = local16;
			this.anIntArray213[local29 + 7] = local14;
		}
		this.method2146();
		this.anInt2502 = 256;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	private void method2146() {
		this.anInt2508 += ++this.anInt2504;
		for (@Pc(31) int local31 = 0; local31 < 256; local31++) {
			@Pc(41) int local41 = this.anIntArray213[local31];
			if ((local31 & 0x2) == 0) {
				if ((local31 & 0x1) == 0) {
					this.anInt2500 ^= this.anInt2500 << 13;
				} else {
					this.anInt2500 ^= this.anInt2500 >>> 6;
				}
			} else if ((local31 & 0x1) == 0) {
				this.anInt2500 ^= this.anInt2500 << 2;
			} else {
				this.anInt2500 ^= this.anInt2500 >>> 16;
			}
			this.anInt2500 += this.anIntArray213[local31 + 128 & 0xFF];
			@Pc(128) int local128;
			this.anIntArray213[local31] = local128 = this.anIntArray213[local41 >> 2 & 0xFF] + this.anInt2500 + this.anInt2508;
			this.anIntArray215[local31] = this.anInt2508 = this.anIntArray213[local128 >> 8 >> 2 & 0xFF] + local41;
		}
	}
}
