import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class27 {

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	private int anInt1255;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	private int anInt1258;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	private int anInt1260;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
	private final int[] anIntArray121 = new int[256];

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
	private final int[] anIntArray120 = new int[256];

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
	public Class27(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray120[local13] = arg0[local13];
		}
		this.method913();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	private void method908() {
		this.anInt1258 += ++this.anInt1257;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray121[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt1260 ^= this.anInt1260 << 13;
				} else {
					this.anInt1260 ^= this.anInt1260 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt1260 ^= this.anInt1260 << 2;
			} else {
				this.anInt1260 ^= this.anInt1260 >>> 16;
			}
			this.anInt1260 += this.anIntArray121[local27 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray121[local27] = local127 = this.anInt1258 + this.anIntArray121[local34 >> 2 & 0xFF] + this.anInt1260;
			this.anIntArray120[local27] = this.anInt1258 = local34 + this.anIntArray121[local127 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	private void method913() {
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
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local22 += local27;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local18 += local24;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local27 += local18;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray120[local29];
			local18 += this.anIntArray120[local29 + 5];
			local16 += this.anIntArray120[local29 + 6];
			local14 += this.anIntArray120[local29 + 7];
			local20 += this.anIntArray120[local29 + 4];
			local26 += this.anIntArray120[local29 + 1];
			local22 += this.anIntArray120[local29 + 3];
			local24 += this.anIntArray120[local29 + 2];
			local27 ^= local26 << 11;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local22 += local27;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local16 += local22;
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
			this.anIntArray121[local29] = local27;
			this.anIntArray121[local29 + 1] = local26;
			this.anIntArray121[local29 + 2] = local24;
			this.anIntArray121[local29 + 3] = local22;
			this.anIntArray121[local29 + 4] = local20;
			this.anIntArray121[local29 + 5] = local18;
			this.anIntArray121[local29 + 6] = local16;
			this.anIntArray121[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray121[local29];
			local20 += this.anIntArray121[local29 + 4];
			local26 += this.anIntArray121[local29 + 1];
			local18 += this.anIntArray121[local29 + 5];
			local16 += this.anIntArray121[local29 + 6];
			local27 ^= local26 << 11;
			local14 += this.anIntArray121[local29 + 7];
			local22 += this.anIntArray121[local29 + 3];
			local24 += this.anIntArray121[local29 + 2];
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local24 ^= local22 << 8;
			local20 += local26;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			this.anIntArray121[local29] = local27;
			this.anIntArray121[local29 + 1] = local26;
			local24 += local14;
			this.anIntArray121[local29 + 2] = local24;
			this.anIntArray121[local29 + 3] = local22;
			this.anIntArray121[local29 + 4] = local20;
			this.anIntArray121[local29 + 5] = local18;
			this.anIntArray121[local29 + 6] = local16;
			this.anIntArray121[local29 + 7] = local14;
		}
		this.method908();
		this.anInt1255 = 256;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I")
	public int method915() {
		if (this.anInt1255-- == 0) {
			this.method908();
			this.anInt1255 = 255;
		}
		return this.anIntArray120[this.anInt1255];
	}
}
