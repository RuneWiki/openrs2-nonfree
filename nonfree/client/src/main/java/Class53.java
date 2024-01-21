import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class53 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	private int anInt1856;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	private int anInt1861;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	private int anInt1867;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
	private final int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	private final int[] anIntArray206 = new int[256];

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([I)V")
	public Class53(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray207[local13] = arg0[local13];
		}
		this.method1298();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	private void method1298() {
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
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray207[local23];
			local18 += this.anIntArray207[local23 + 2];
			local16 += this.anIntArray207[local23 + 3];
			local10 += this.anIntArray207[local23 + 6];
			local12 += this.anIntArray207[local23 + 5];
			local20 += this.anIntArray207[local23 + 1];
			local8 += this.anIntArray207[local23 + 7];
			local21 ^= local20 << 11;
			local14 += this.anIntArray207[local23 + 4];
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
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray206[local23] = local21;
			this.anIntArray206[local23 + 1] = local20;
			this.anIntArray206[local23 + 2] = local18;
			this.anIntArray206[local23 + 3] = local16;
			this.anIntArray206[local23 + 4] = local14;
			this.anIntArray206[local23 + 5] = local12;
			this.anIntArray206[local23 + 6] = local10;
			this.anIntArray206[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray206[local23 + 1];
			local21 += this.anIntArray206[local23];
			local14 += this.anIntArray206[local23 + 4];
			local12 += this.anIntArray206[local23 + 5];
			local18 += this.anIntArray206[local23 + 2];
			local10 += this.anIntArray206[local23 + 6];
			local16 += this.anIntArray206[local23 + 3];
			local21 ^= local20 << 11;
			local8 += this.anIntArray206[local23 + 7];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray206[local23] = local21;
			this.anIntArray206[local23 + 1] = local20;
			this.anIntArray206[local23 + 2] = local18;
			this.anIntArray206[local23 + 3] = local16;
			this.anIntArray206[local23 + 4] = local14;
			this.anIntArray206[local23 + 5] = local12;
			this.anIntArray206[local23 + 6] = local10;
			this.anIntArray206[local23 + 7] = local8;
		}
		this.method1305();
		this.anInt1861 = 256;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)I")
	public int method1304() {
		if (this.anInt1861-- == 0) {
			this.method1305();
			this.anInt1861 = 255;
		}
		return this.anIntArray207[this.anInt1861];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	private void method1305() {
		this.anInt1856 += ++this.anInt1867;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = this.anIntArray206[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1865 ^= this.anInt1865 << 13;
				} else {
					this.anInt1865 ^= this.anInt1865 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1865 ^= this.anInt1865 << 2;
			} else {
				this.anInt1865 ^= this.anInt1865 >>> 16;
			}
			this.anInt1865 += this.anIntArray206[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray206[local19] = local124 = this.anInt1865 + this.anIntArray206[local31 >> 2 & 0xFF] + this.anInt1856;
			this.anIntArray207[local19] = this.anInt1856 = this.anIntArray206[local124 >> 8 >> 2 & 0xFF] + local31;
		}
	}
}
