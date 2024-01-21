import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class30 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	private int anInt1215;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	private int anInt1216;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	private int anInt1218;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	private int anInt1222;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	private final int[] anIntArray166 = new int[256];

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
	private final int[] anIntArray167 = new int[256];

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([I)V")
	public Class30(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray166[local13] = arg0[local13];
		}
		this.method898();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
	public int method896() {
		if (this.anInt1216-- == 0) {
			this.method899();
			this.anInt1216 = 255;
		}
		return this.anIntArray166[this.anInt1216];
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	private void method898() {
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
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray166[local27 + 6];
			local22 += this.anIntArray166[local27 + 2];
			local12 += this.anIntArray166[local27 + 7];
			local16 += this.anIntArray166[local27 + 5];
			local18 += this.anIntArray166[local27 + 4];
			local24 += this.anIntArray166[local27 + 1];
			local25 += this.anIntArray166[local27];
			local25 ^= local24 << 11;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local20 += this.anIntArray166[local27 + 3];
			local20 += local25;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			this.anIntArray167[local27] = local25;
			local22 += local12;
			this.anIntArray167[local27 + 1] = local24;
			this.anIntArray167[local27 + 2] = local22;
			this.anIntArray167[local27 + 3] = local20;
			this.anIntArray167[local27 + 4] = local18;
			this.anIntArray167[local27 + 5] = local16;
			this.anIntArray167[local27 + 6] = local14;
			this.anIntArray167[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local25 += this.anIntArray167[local27];
			local18 += this.anIntArray167[local27 + 4];
			local16 += this.anIntArray167[local27 + 5];
			local14 += this.anIntArray167[local27 + 6];
			local24 += this.anIntArray167[local27 + 1];
			local12 += this.anIntArray167[local27 + 7];
			local22 += this.anIntArray167[local27 + 2];
			local25 ^= local24 << 11;
			local20 += this.anIntArray167[local27 + 3];
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
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
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray167[local27] = local25;
			this.anIntArray167[local27 + 1] = local24;
			this.anIntArray167[local27 + 2] = local22;
			this.anIntArray167[local27 + 3] = local20;
			this.anIntArray167[local27 + 4] = local18;
			this.anIntArray167[local27 + 5] = local16;
			this.anIntArray167[local27 + 6] = local14;
			this.anIntArray167[local27 + 7] = local12;
		}
		this.method899();
		this.anInt1216 = 256;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	private void method899() {
		this.anInt1218 += ++this.anInt1222;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(23) int local23 = this.anIntArray167[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt1215 ^= this.anInt1215 << 13;
				} else {
					this.anInt1215 ^= this.anInt1215 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt1215 ^= this.anInt1215 << 2;
			} else {
				this.anInt1215 ^= this.anInt1215 >>> 16;
			}
			this.anInt1215 += this.anIntArray167[local17 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray167[local17] = local115 = this.anInt1218 + this.anInt1215 + this.anIntArray167[local23 >> 2 & 0xFF];
			this.anIntArray166[local17] = this.anInt1218 = this.anIntArray167[local115 >> 8 >> 2 & 0xFF] + local23;
		}
	}
}
