import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class88 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	private int anInt4510;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	private int anInt4513;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	private int anInt4514;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
	private final int[] anIntArray432 = new int[256];

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
	private final int[] anIntArray431 = new int[256];

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([I)V")
	public Class88(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray432[local13] = arg0[local13];
		}
		this.method3475();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
	public int method3471() {
		if (this.anInt4513-- == 0) {
			this.method3474();
			this.anInt4513 = 255;
		}
		return this.anIntArray432[this.anInt4513];
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	private void method3474() {
		this.anInt4510 += ++this.anInt4515;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray431[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4514 ^= this.anInt4514 << 13;
				} else {
					this.anInt4514 ^= this.anInt4514 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4514 ^= this.anInt4514 << 2;
			} else {
				this.anInt4514 ^= this.anInt4514 >>> 16;
			}
			this.anInt4514 += this.anIntArray431[local25 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray431[local25] = local127 = this.anInt4510 + this.anIntArray431[local32 >> 2 & 0xFF] + this.anInt4514;
			this.anIntArray432[local25] = this.anInt4510 = local32 + this.anIntArray431[local127 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	private void method3475() {
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
			local18 += this.anIntArray432[local27 + 4];
			local16 += this.anIntArray432[local27 + 5];
			local24 += this.anIntArray432[local27 + 1];
			local14 += this.anIntArray432[local27 + 6];
			local22 += this.anIntArray432[local27 + 2];
			local20 += this.anIntArray432[local27 + 3];
			local25 += this.anIntArray432[local27];
			local12 += this.anIntArray432[local27 + 7];
			local25 ^= local24 << 11;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local20 += local25;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local24 += local14;
			local25 += local24;
			local22 += local12;
			this.anIntArray431[local27] = local25;
			this.anIntArray431[local27 + 1] = local24;
			this.anIntArray431[local27 + 2] = local22;
			this.anIntArray431[local27 + 3] = local20;
			this.anIntArray431[local27 + 4] = local18;
			this.anIntArray431[local27 + 5] = local16;
			this.anIntArray431[local27 + 6] = local14;
			this.anIntArray431[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray431[local27 + 1];
			local20 += this.anIntArray431[local27 + 3];
			local25 += this.anIntArray431[local27];
			local16 += this.anIntArray431[local27 + 5];
			local14 += this.anIntArray431[local27 + 6];
			local18 += this.anIntArray431[local27 + 4];
			local12 += this.anIntArray431[local27 + 7];
			local22 += this.anIntArray431[local27 + 2];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
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
			this.anIntArray431[local27] = local25;
			this.anIntArray431[local27 + 1] = local24;
			this.anIntArray431[local27 + 2] = local22;
			this.anIntArray431[local27 + 3] = local20;
			this.anIntArray431[local27 + 4] = local18;
			this.anIntArray431[local27 + 5] = local16;
			this.anIntArray431[local27 + 6] = local14;
			this.anIntArray431[local27 + 7] = local12;
		}
		this.method3474();
		this.anInt4513 = 256;
	}
}
