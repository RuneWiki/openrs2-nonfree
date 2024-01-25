import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class245 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
	private int anInt7192;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	private int anInt7194;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	private int anInt7197;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	private int anInt7199;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "[I")
	private int[] anIntArray685;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "[I")
	private int[] anIntArray686;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	private Class245() {
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "([I)V")
	public Class245(@OriginalArg(0) int[] arg0) {
		this.anIntArray685 = new int[256];
		this.anIntArray686 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray685[local13] = arg0[local13];
		}
		this.method5479();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	public int method5478() {
		if (this.anInt7199 == 0) {
			this.method5483();
			this.anInt7199 = 256;
		}
		return this.anIntArray685[this.anInt7199 - 1];
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	private void method5479() {
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
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local17 += local15;
			local28 += local19;
			local17 ^= local15 << 8;
			local27 += local17;
			local15 += local28;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local15 += this.anIntArray685[local30 + 7];
			local19 += this.anIntArray685[local30 + 5];
			local21 += this.anIntArray685[local30 + 4];
			local25 += this.anIntArray685[local30 + 2];
			local23 += this.anIntArray685[local30 + 3];
			local27 += this.anIntArray685[local30 + 1];
			local17 += this.anIntArray685[local30 + 6];
			local28 += this.anIntArray685[local30];
			local28 ^= local27 << 11;
			local23 += local28;
			local27 += local25;
			local27 ^= local25 >>> 2;
			local25 += local23;
			local21 += local27;
			local25 ^= local23 << 8;
			local23 += local21;
			local19 += local25;
			local23 ^= local21 >>> 16;
			local21 += local19;
			local17 += local23;
			local21 ^= local19 << 10;
			local15 += local21;
			local19 += local17;
			local19 ^= local17 >>> 4;
			local28 += local19;
			local17 += local15;
			local17 ^= local15 << 8;
			local15 += local28;
			local27 += local17;
			local15 ^= local28 >>> 9;
			local25 += local15;
			local28 += local27;
			this.anIntArray686[local30] = local28;
			this.anIntArray686[local30 + 1] = local27;
			this.anIntArray686[local30 + 2] = local25;
			this.anIntArray686[local30 + 3] = local23;
			this.anIntArray686[local30 + 4] = local21;
			this.anIntArray686[local30 + 5] = local19;
			this.anIntArray686[local30 + 6] = local17;
			this.anIntArray686[local30 + 7] = local15;
		}
		for (local30 = 0; local30 < 256; local30 += 8) {
			local15 += this.anIntArray686[local30 + 7];
			local23 += this.anIntArray686[local30 + 3];
			local17 += this.anIntArray686[local30 + 6];
			local28 += this.anIntArray686[local30];
			local25 += this.anIntArray686[local30 + 2];
			local19 += this.anIntArray686[local30 + 5];
			local21 += this.anIntArray686[local30 + 4];
			local27 += this.anIntArray686[local30 + 1];
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
			local21 += local19;
			local17 += local23;
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
			local28 += local27;
			local25 += local15;
			this.anIntArray686[local30] = local28;
			this.anIntArray686[local30 + 1] = local27;
			this.anIntArray686[local30 + 2] = local25;
			this.anIntArray686[local30 + 3] = local23;
			this.anIntArray686[local30 + 4] = local21;
			this.anIntArray686[local30 + 5] = local19;
			this.anIntArray686[local30 + 6] = local17;
			this.anIntArray686[local30 + 7] = local15;
		}
		this.method5483();
		this.anInt7199 = 256;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I")
	public int method5481() {
		if (this.anInt7199 == 0) {
			this.method5483();
			this.anInt7199 = 256;
		}
		return this.anIntArray685[--this.anInt7199];
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
	private void method5483() {
		this.anInt7197 += ++this.anInt7192;
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(28) int local28 = this.anIntArray686[local22];
			if ((local22 & 0x2) == 0) {
				if ((local22 & 0x1) == 0) {
					this.anInt7194 ^= this.anInt7194 << 13;
				} else {
					this.anInt7194 ^= this.anInt7194 >>> 6;
				}
			} else if ((local22 & 0x1) == 0) {
				this.anInt7194 ^= this.anInt7194 << 2;
			} else {
				this.anInt7194 ^= this.anInt7194 >>> 16;
			}
			this.anInt7194 += this.anIntArray686[local22 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray686[local22] = local115 = this.anInt7194 + this.anIntArray686[local28 >> 2 & 0xFF] + this.anInt7197;
			this.anIntArray685[local22] = this.anInt7197 = local28 + this.anIntArray686[local115 >> 8 >> 2 & 0xFF];
		}
	}
}
