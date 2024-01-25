import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class126 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	private int anInt4050;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	private int anInt4052;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	private int anInt4054;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	private Class126() {
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([I)V")
	public Class126(@OriginalArg(0) int[] arg0) {
		this.anIntArray241 = new int[256];
		this.anIntArray240 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray241[local13] = arg0[local13];
		}
		this.method3546();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method3544() {
		if (this.anInt4050 == 0) {
			this.method3547();
			this.anInt4050 = 256;
		}
		return this.anIntArray241[this.anInt4050 - 1];
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
	public int method3545() {
		if (this.anInt4050 == 0) {
			this.method3547();
			this.anInt4050 = 256;
		}
		return this.anIntArray241[--this.anInt4050];
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	private void method3546() {
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(30) int local30;
		for (local30 = 0; local30 < 4; local30++) {
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local27 += this.anIntArray241[local30 + 1];
			local21 += this.anIntArray241[local30 + 4];
			local15 += this.anIntArray241[local30 + 7];
			local23 += this.anIntArray241[local30 + 3];
			local25 += this.anIntArray241[local30 + 2];
			local28 += this.anIntArray241[local30];
			local19 += this.anIntArray241[local30 + 5];
			local17 += this.anIntArray241[local30 + 6];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local21 += local27;
			local25 += local23;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local28 += local27;
			local25 += local15;
			this.anIntArray240[local30] = local28;
			this.anIntArray240[local30 + 1] = local27;
			this.anIntArray240[local30 + 2] = local25;
			this.anIntArray240[local30 + 3] = local23;
			this.anIntArray240[local30 + 4] = local21;
			this.anIntArray240[local30 + 5] = local19;
			this.anIntArray240[local30 + 6] = local17;
			this.anIntArray240[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local27 += this.anIntArray240[local30 + 1];
			local15 += this.anIntArray240[local30 + 7];
			local19 += this.anIntArray240[local30 + 5];
			local17 += this.anIntArray240[local30 + 6];
			local23 += this.anIntArray240[local30 + 3];
			local28 += this.anIntArray240[local30];
			local25 += this.anIntArray240[local30 + 2];
			local21 += this.anIntArray240[local30 + 4];
			local28 ^= local27 << 11;
			local27 += local25;
			local23 += local28;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local19 += local25;
			local23 += local21;
			local23 ^= local21 >>> 16;
			local17 += local23;
			local21 += local19;
			local21 ^= local19 << 10;
			local19 += local17;
			local15 += local21;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray240[local30] = local28;
			this.anIntArray240[local30 + 1] = local27;
			this.anIntArray240[local30 + 2] = local25;
			this.anIntArray240[local30 + 3] = local23;
			this.anIntArray240[local30 + 4] = local21;
			this.anIntArray240[local30 + 5] = local19;
			this.anIntArray240[local30 + 6] = local17;
			this.anIntArray240[local30 + 7] = local15;
		}
		this.method3547();
		this.anInt4050 = 256;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	private void method3547() {
		this.anInt4052 += ++this.anInt4051;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray240[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4054 ^= this.anInt4054 << 13;
				} else {
					this.anInt4054 ^= this.anInt4054 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4054 ^= this.anInt4054 << 2;
			} else {
				this.anInt4054 ^= this.anInt4054 >>> 16;
			}
			this.anInt4054 += this.anIntArray240[local25 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray240[local25] = local119 = this.anInt4054 + this.anIntArray240[local32 >> 2 & 0xFF] + this.anInt4052;
			this.anIntArray241[local25] = this.anInt4052 = this.anIntArray240[local119 >> 8 >> 2 & 0xFF] + local32;
		}
	}
}
