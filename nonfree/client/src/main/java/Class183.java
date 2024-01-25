import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class183 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	private int anInt6357;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	private int anInt6358;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	private int anInt6359;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	private int anInt6360;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	private Class183() {
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([I)V")
	public Class183(@OriginalArg(0) int[] arg0) {
		this.anIntArray371 = new int[256];
		this.anIntArray370 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray370[local13] = arg0[local13];
		}
		this.method5416();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	private void method5416() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray370[local23 + 2];
			local8 += this.anIntArray370[local23 + 7];
			local16 += this.anIntArray370[local23 + 3];
			local12 += this.anIntArray370[local23 + 5];
			local10 += this.anIntArray370[local23 + 6];
			local20 += this.anIntArray370[local23 + 1];
			local14 += this.anIntArray370[local23 + 4];
			local21 += this.anIntArray370[local23];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray371[local23] = local21;
			this.anIntArray371[local23 + 1] = local20;
			this.anIntArray371[local23 + 2] = local18;
			this.anIntArray371[local23 + 3] = local16;
			this.anIntArray371[local23 + 4] = local14;
			this.anIntArray371[local23 + 5] = local12;
			this.anIntArray371[local23 + 6] = local10;
			this.anIntArray371[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray371[local23 + 2];
			local16 += this.anIntArray371[local23 + 3];
			local8 += this.anIntArray371[local23 + 7];
			local12 += this.anIntArray371[local23 + 5];
			local20 += this.anIntArray371[local23 + 1];
			local10 += this.anIntArray371[local23 + 6];
			local21 += this.anIntArray371[local23];
			local14 += this.anIntArray371[local23 + 4];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray371[local23] = local21;
			this.anIntArray371[local23 + 1] = local20;
			this.anIntArray371[local23 + 2] = local18;
			this.anIntArray371[local23 + 3] = local16;
			this.anIntArray371[local23 + 4] = local14;
			this.anIntArray371[local23 + 5] = local12;
			this.anIntArray371[local23 + 6] = local10;
			this.anIntArray371[local23 + 7] = local8;
		}
		this.method5418();
		this.anInt6358 = 256;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	public int method5417() {
		if (this.anInt6358 == 0) {
			this.method5418();
			this.anInt6358 = 256;
		}
		return this.anIntArray370[this.anInt6358 - 1];
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
	private void method5418() {
		this.anInt6357 += ++this.anInt6360;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray371[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt6359 ^= this.anInt6359 << 13;
				} else {
					this.anInt6359 ^= this.anInt6359 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt6359 ^= this.anInt6359 << 2;
			} else {
				this.anInt6359 ^= this.anInt6359 >>> 16;
			}
			this.anInt6359 += this.anIntArray371[local19 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray371[local19] = local116 = this.anIntArray371[local26 >> 2 & 0xFF] + this.anInt6359 + this.anInt6357;
			this.anIntArray370[local19] = this.anInt6357 = local26 + this.anIntArray371[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I")
	public int method5420() {
		if (this.anInt6358 == 0) {
			this.method5418();
			this.anInt6358 = 256;
		}
		return this.anIntArray370[--this.anInt6358];
	}
}
