import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class233 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	private int anInt7046;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	private int anInt7049;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
	private int anInt7051;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	private int anInt7053;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V")
	private Class233() {
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "([I)V")
	public Class233(@OriginalArg(0) int[] arg0) {
		this.anIntArray419 = new int[256];
		this.anIntArray420 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray419[local13] = arg0[local13];
		}
		this.method6074();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I")
	public int method6068() {
		if (this.anInt7046 == 0) {
			this.method6069();
			this.anInt7046 = 256;
		}
		return this.anIntArray419[--this.anInt7046];
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
	private void method6069() {
		this.anInt7049 += ++this.anInt7053;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray420[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt7051 ^= this.anInt7051 << 13;
				} else {
					this.anInt7051 ^= this.anInt7051 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt7051 ^= this.anInt7051 << 2;
			} else {
				this.anInt7051 ^= this.anInt7051 >>> 16;
			}
			this.anInt7051 += this.anIntArray420[local27 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray420[local27] = local123 = this.anIntArray420[local34 >> 2 & 0xFF] + this.anInt7051 + this.anInt7049;
			this.anIntArray419[local27] = this.anInt7049 = local34 + this.anIntArray420[local123 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)I")
	public int method6071() {
		if (this.anInt7046 == 0) {
			this.method6069();
			this.anInt7046 = 256;
		}
		return this.anIntArray419[this.anInt7046 - 1];
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	private void method6074() {
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(28) int local28;
		for (local28 = 0; local28 < 4; local28++) {
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 << 8;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 << 10;
			local17 += local15;
			local13 += local19;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local17 += this.anIntArray419[local28 + 5];
			local25 += this.anIntArray419[local28 + 1];
			local15 += this.anIntArray419[local28 + 6];
			local19 += this.anIntArray419[local28 + 4];
			local23 += this.anIntArray419[local28 + 2];
			local13 += this.anIntArray419[local28 + 7];
			local21 += this.anIntArray419[local28 + 3];
			local26 += this.anIntArray419[local28];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 << 8;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 16;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local15 += local13;
			local26 += local17;
			local15 ^= local13 << 8;
			local25 += local15;
			local13 += local26;
			local13 ^= local26 >>> 9;
			local26 += local25;
			local23 += local13;
			this.anIntArray420[local28] = local26;
			this.anIntArray420[local28 + 1] = local25;
			this.anIntArray420[local28 + 2] = local23;
			this.anIntArray420[local28 + 3] = local21;
			this.anIntArray420[local28 + 4] = local19;
			this.anIntArray420[local28 + 5] = local17;
			this.anIntArray420[local28 + 6] = local15;
			this.anIntArray420[local28 + 7] = local13;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local26 += this.anIntArray420[local28];
			local23 += this.anIntArray420[local28 + 2];
			local21 += this.anIntArray420[local28 + 3];
			local15 += this.anIntArray420[local28 + 6];
			local19 += this.anIntArray420[local28 + 4];
			local13 += this.anIntArray420[local28 + 7];
			local25 += this.anIntArray420[local28 + 1];
			local17 += this.anIntArray420[local28 + 5];
			local26 ^= local25 << 11;
			local21 += local26;
			local25 += local23;
			local25 ^= local23 >>> 2;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 << 8;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 >>> 16;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 << 10;
			local13 += local19;
			local17 += local15;
			local17 ^= local15 >>> 4;
			local26 += local17;
			local15 += local13;
			local15 ^= local13 << 8;
			local13 += local26;
			local25 += local15;
			local13 ^= local26 >>> 9;
			local23 += local13;
			local26 += local25;
			this.anIntArray420[local28] = local26;
			this.anIntArray420[local28 + 1] = local25;
			this.anIntArray420[local28 + 2] = local23;
			this.anIntArray420[local28 + 3] = local21;
			this.anIntArray420[local28 + 4] = local19;
			this.anIntArray420[local28 + 5] = local17;
			this.anIntArray420[local28 + 6] = local15;
			this.anIntArray420[local28 + 7] = local13;
		}
		this.method6069();
		this.anInt7046 = 256;
	}
}
