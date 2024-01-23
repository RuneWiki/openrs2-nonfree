import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class30 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
	private int[] anIntArray104 = new int[256];

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	private int anInt1109;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
	private int[] anIntArray105 = new int[256];

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private int anInt1112;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	private int anInt1113;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	private int anInt1114;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([I)V")
	public Class30(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray105[local13] = arg0[local13];
		}
		this.method931();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	private void method930() {
		this.anInt1113 += ++this.anInt1114;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(32) int local32 = this.anIntArray104[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1112 ^= this.anInt1112 << 13;
				} else {
					this.anInt1112 ^= this.anInt1112 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1112 ^= this.anInt1112 << 2;
			} else {
				this.anInt1112 ^= this.anInt1112 >>> 16;
			}
			this.anInt1112 += this.anIntArray104[local24 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray104[local24] = local126 = this.anInt1113 + this.anIntArray104[local32 >> 2 & 0xFF] + this.anInt1112;
			this.anIntArray105[local24] = this.anInt1113 = local32 + this.anIntArray104[local126 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	private void method931() {
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
			local24 += local22;
			local24 ^= local22 >>> 2;
			local20 += local25;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local24 += local14;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local20 += this.anIntArray105[local27 + 3];
			local24 += this.anIntArray105[local27 + 1];
			local25 += this.anIntArray105[local27];
			local25 ^= local24 << 11;
			local12 += this.anIntArray105[local27 + 7];
			local20 += local25;
			local22 += this.anIntArray105[local27 + 2];
			local14 += this.anIntArray105[local27 + 6];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += this.anIntArray105[local27 + 4];
			local18 += local24;
			local16 += this.anIntArray105[local27 + 5];
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local16 += local22;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local12 += local18;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray104[local27] = local25;
			this.anIntArray104[local27 + 1] = local24;
			this.anIntArray104[local27 + 2] = local22;
			this.anIntArray104[local27 + 3] = local20;
			this.anIntArray104[local27 + 4] = local18;
			this.anIntArray104[local27 + 5] = local16;
			this.anIntArray104[local27 + 6] = local14;
			this.anIntArray104[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray104[local27 + 6];
			local18 += this.anIntArray104[local27 + 4];
			local12 += this.anIntArray104[local27 + 7];
			local24 += this.anIntArray104[local27 + 1];
			local20 += this.anIntArray104[local27 + 3];
			local25 += this.anIntArray104[local27];
			local25 ^= local24 << 11;
			local20 += local25;
			local16 += this.anIntArray104[local27 + 5];
			local22 += this.anIntArray104[local27 + 2];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local24 += local14;
			local25 += local24;
			this.anIntArray104[local27] = local25;
			this.anIntArray104[local27 + 1] = local24;
			this.anIntArray104[local27 + 2] = local22;
			this.anIntArray104[local27 + 3] = local20;
			this.anIntArray104[local27 + 4] = local18;
			this.anIntArray104[local27 + 5] = local16;
			this.anIntArray104[local27 + 6] = local14;
			this.anIntArray104[local27 + 7] = local12;
		}
		this.method930();
		this.anInt1109 = 256;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)I")
	public int method932() {
		if (this.anInt1109-- == 0) {
			this.method930();
			this.anInt1109 = 255;
		}
		return this.anIntArray105[this.anInt1109];
	}
}
