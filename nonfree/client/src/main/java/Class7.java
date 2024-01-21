import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7 {

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	private final int[] anIntArray21 = new int[256];

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
	private final int[] anIntArray20 = new int[256];

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([I)V")
	public Class7(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray21[local13] = arg0[local13];
		}
		this.method248();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
	public int method246() {
		if (this.anInt287-- == 0) {
			this.method247();
			this.anInt287 = 255;
		}
		return this.anIntArray21[this.anInt287];
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	private void method247() {
		this.anInt283 += ++this.anInt280;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray20[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt277 ^= this.anInt277 << 13;
				} else {
					this.anInt277 ^= this.anInt277 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt277 ^= this.anInt277 << 2;
			} else {
				this.anInt277 ^= this.anInt277 >>> 16;
			}
			this.anInt277 += this.anIntArray20[local19 + 128 & 0xFF];
			@Pc(118) int local118;
			this.anIntArray20[local19] = local118 = this.anInt283 + this.anInt277 + this.anIntArray20[local26 >> 2 & 0xFF];
			this.anIntArray21[local19] = this.anInt283 = local26 + this.anIntArray20[local118 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	private void method248() {
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local12 += this.anIntArray21[local27 + 7];
			local22 += this.anIntArray21[local27 + 2];
			local14 += this.anIntArray21[local27 + 6];
			local20 += this.anIntArray21[local27 + 3];
			local16 += this.anIntArray21[local27 + 5];
			local25 += this.anIntArray21[local27];
			local18 += this.anIntArray21[local27 + 4];
			local24 += this.anIntArray21[local27 + 1];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray20[local27] = local25;
			this.anIntArray20[local27 + 1] = local24;
			this.anIntArray20[local27 + 2] = local22;
			this.anIntArray20[local27 + 3] = local20;
			this.anIntArray20[local27 + 4] = local18;
			this.anIntArray20[local27 + 5] = local16;
			this.anIntArray20[local27 + 6] = local14;
			this.anIntArray20[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray20[local27 + 6];
			local16 += this.anIntArray20[local27 + 5];
			local12 += this.anIntArray20[local27 + 7];
			local25 += this.anIntArray20[local27];
			local24 += this.anIntArray20[local27 + 1];
			local22 += this.anIntArray20[local27 + 2];
			local18 += this.anIntArray20[local27 + 4];
			local20 += this.anIntArray20[local27 + 3];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local22 ^= local20 << 8;
			local18 += local24;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			this.anIntArray20[local27] = local25;
			local22 += local12;
			this.anIntArray20[local27 + 1] = local24;
			this.anIntArray20[local27 + 2] = local22;
			this.anIntArray20[local27 + 3] = local20;
			this.anIntArray20[local27 + 4] = local18;
			this.anIntArray20[local27 + 5] = local16;
			this.anIntArray20[local27 + 6] = local14;
			this.anIntArray20[local27 + 7] = local12;
		}
		this.method247();
		this.anInt287 = 256;
	}
}
