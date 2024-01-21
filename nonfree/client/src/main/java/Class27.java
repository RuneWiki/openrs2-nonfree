import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class27 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	private int anInt1738;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	private int anInt1744;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
	private final int[] anIntArray256 = new int[256];

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
	private final int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([I)V")
	public Class27(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray256[local13] = arg0[local13];
		}
		this.method1111();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	private void method1111() {
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
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local18 += this.anIntArray256[local29 + 5];
			local24 += this.anIntArray256[local29 + 2];
			local20 += this.anIntArray256[local29 + 4];
			local26 += this.anIntArray256[local29 + 1];
			local27 += this.anIntArray256[local29];
			local27 ^= local26 << 11;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local14 += this.anIntArray256[local29 + 7];
			local20 += local26;
			local22 += this.anIntArray256[local29 + 3];
			local16 += this.anIntArray256[local29 + 6];
			local22 += local27;
			local24 += local22;
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
			local16 ^= local14 << 8;
			local26 += local16;
			local27 += local18;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			this.anIntArray258[local29] = local27;
			local24 += local14;
			this.anIntArray258[local29 + 1] = local26;
			this.anIntArray258[local29 + 2] = local24;
			this.anIntArray258[local29 + 3] = local22;
			this.anIntArray258[local29 + 4] = local20;
			this.anIntArray258[local29 + 5] = local18;
			this.anIntArray258[local29 + 6] = local16;
			this.anIntArray258[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray258[local29];
			local20 += this.anIntArray258[local29 + 4];
			local18 += this.anIntArray258[local29 + 5];
			local24 += this.anIntArray258[local29 + 2];
			local16 += this.anIntArray258[local29 + 6];
			local14 += this.anIntArray258[local29 + 7];
			local22 += this.anIntArray258[local29 + 3];
			local26 += this.anIntArray258[local29 + 1];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local16 += local22;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local26 += local16;
			local27 += local26;
			this.anIntArray258[local29] = local27;
			this.anIntArray258[local29 + 1] = local26;
			this.anIntArray258[local29 + 2] = local24;
			this.anIntArray258[local29 + 3] = local22;
			this.anIntArray258[local29 + 4] = local20;
			this.anIntArray258[local29 + 5] = local18;
			this.anIntArray258[local29 + 6] = local16;
			this.anIntArray258[local29 + 7] = local14;
		}
		this.method1114();
		this.anInt1738 = 256;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I")
	public int method1112() {
		if (this.anInt1738-- == 0) {
			this.method1114();
			this.anInt1738 = 255;
		}
		return this.anIntArray256[this.anInt1738];
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	private void method1114() {
		this.anInt1745 += ++this.anInt1743;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = this.anIntArray258[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1744 ^= this.anInt1744 << 13;
				} else {
					this.anInt1744 ^= this.anInt1744 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1744 ^= this.anInt1744 << 2;
			} else {
				this.anInt1744 ^= this.anInt1744 >>> 16;
			}
			this.anInt1744 += this.anIntArray258[local19 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray258[local19] = local123 = this.anInt1745 + this.anInt1744 + this.anIntArray258[local31 >> 2 & 0xFF];
			this.anIntArray256[local19] = this.anInt1745 = this.anIntArray258[local123 >> 8 >> 2 & 0xFF] + local31;
		}
	}
}
