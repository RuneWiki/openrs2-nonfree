import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class45 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	private int anInt1916;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	private int anInt1917;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	private int anInt1918;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
	private final int[] anIntArray321 = new int[256];

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
	private final int[] anIntArray320 = new int[256];

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V")
	public Class45(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray320[local13] = arg0[local13];
		}
		this.method1342();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	private void method1342() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local12 += local18;
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
		for (local27 = 0; local27 < 256; local27 += 8) {
			local18 += this.anIntArray320[local27 + 2];
			local8 += this.anIntArray320[local27 + 7];
			local20 += this.anIntArray320[local27 + 1];
			local10 += this.anIntArray320[local27 + 6];
			local21 += this.anIntArray320[local27];
			local16 += this.anIntArray320[local27 + 3];
			local14 += this.anIntArray320[local27 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local12 += this.anIntArray320[local27 + 5];
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
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
			local21 += local20;
			this.anIntArray321[local27] = local21;
			this.anIntArray321[local27 + 1] = local20;
			local18 += local8;
			this.anIntArray321[local27 + 2] = local18;
			this.anIntArray321[local27 + 3] = local16;
			this.anIntArray321[local27 + 4] = local14;
			this.anIntArray321[local27 + 5] = local12;
			this.anIntArray321[local27 + 6] = local10;
			this.anIntArray321[local27 + 7] = local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local10 += this.anIntArray321[local27 + 6];
			local12 += this.anIntArray321[local27 + 5];
			local18 += this.anIntArray321[local27 + 2];
			local8 += this.anIntArray321[local27 + 7];
			local20 += this.anIntArray321[local27 + 1];
			local21 += this.anIntArray321[local27];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += this.anIntArray321[local27 + 3];
			local16 += local21;
			local14 += this.anIntArray321[local27 + 4];
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray321[local27] = local21;
			this.anIntArray321[local27 + 1] = local20;
			this.anIntArray321[local27 + 2] = local18;
			this.anIntArray321[local27 + 3] = local16;
			this.anIntArray321[local27 + 4] = local14;
			this.anIntArray321[local27 + 5] = local12;
			this.anIntArray321[local27 + 6] = local10;
			this.anIntArray321[local27 + 7] = local8;
		}
		this.method1348();
		this.anInt1917 = 256;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I")
	public int method1345() {
		if (this.anInt1917-- == 0) {
			this.method1348();
			this.anInt1917 = 255;
		}
		return this.anIntArray320[this.anInt1917];
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private void method1348() {
		this.anInt1916 += ++this.anInt1927;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray321[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1918 ^= this.anInt1918 << 13;
				} else {
					this.anInt1918 ^= this.anInt1918 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1918 ^= this.anInt1918 << 2;
			} else {
				this.anInt1918 ^= this.anInt1918 >>> 16;
			}
			this.anInt1918 += this.anIntArray321[local24 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray321[local24] = local120 = this.anInt1916 + this.anIntArray321[local31 >> 2 & 0xFF] + this.anInt1918;
			this.anIntArray320[local24] = this.anInt1916 = local31 + this.anIntArray321[local120 >> 8 >> 2 & 0xFF];
		}
	}
}
