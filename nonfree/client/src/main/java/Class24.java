import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class24 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	private int anInt1321;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	private int anInt1325;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	private int anInt1326;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	private int anInt1327;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	private final int[] anIntArray88 = new int[256];

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "[I")
	private final int[] anIntArray89 = new int[256];

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
	public Class24(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray88[local13] = arg0[local13];
		}
		this.method859();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	private void method855() {
		this.anInt1325 += ++this.anInt1321;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray89[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1327 ^= this.anInt1327 << 13;
				} else {
					this.anInt1327 ^= this.anInt1327 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1327 ^= this.anInt1327 << 2;
			} else {
				this.anInt1327 ^= this.anInt1327 >>> 16;
			}
			this.anInt1327 += this.anIntArray89[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray89[local19] = local118 = this.anInt1325 + this.anInt1327 + this.anIntArray89[local26 >> 2 & 0xFF];
			this.anIntArray88[local19] = this.anInt1325 = this.anIntArray89[local118 >> 8 >> 2 & 0xFF] + local26;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
	public int method857() {
		if (this.anInt1326-- == 0) {
			this.method855();
			this.anInt1326 = 255;
		}
		return this.anIntArray88[this.anInt1326];
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	private void method859() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local8 += this.anIntArray88[local29 + 7];
			local14 += this.anIntArray88[local29 + 4];
			local18 += this.anIntArray88[local29 + 2];
			local16 += this.anIntArray88[local29 + 3];
			local21 += this.anIntArray88[local29];
			local12 += this.anIntArray88[local29 + 5];
			local10 += this.anIntArray88[local29 + 6];
			local20 += this.anIntArray88[local29 + 1];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
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
			this.anIntArray89[local29] = local21;
			this.anIntArray89[local29 + 1] = local20;
			this.anIntArray89[local29 + 2] = local18;
			this.anIntArray89[local29 + 3] = local16;
			this.anIntArray89[local29 + 4] = local14;
			this.anIntArray89[local29 + 5] = local12;
			this.anIntArray89[local29 + 6] = local10;
			this.anIntArray89[local29 + 7] = local8;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray89[local29 + 3];
			local14 += this.anIntArray89[local29 + 4];
			local8 += this.anIntArray89[local29 + 7];
			local12 += this.anIntArray89[local29 + 5];
			local10 += this.anIntArray89[local29 + 6];
			local20 += this.anIntArray89[local29 + 1];
			local21 += this.anIntArray89[local29];
			local21 ^= local20 << 11;
			local16 += local21;
			local18 += this.anIntArray89[local29 + 2];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray89[local29] = local21;
			this.anIntArray89[local29 + 1] = local20;
			this.anIntArray89[local29 + 2] = local18;
			this.anIntArray89[local29 + 3] = local16;
			this.anIntArray89[local29 + 4] = local14;
			this.anIntArray89[local29 + 5] = local12;
			this.anIntArray89[local29 + 6] = local10;
			this.anIntArray89[local29 + 7] = local8;
		}
		this.method855();
		this.anInt1326 = 256;
	}
}
