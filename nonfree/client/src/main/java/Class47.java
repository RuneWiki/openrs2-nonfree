import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class47 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private int anInt1784;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private int anInt1789;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	private int anInt1794;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
	private final int[] anIntArray228 = new int[256];

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	private final int[] anIntArray226 = new int[256];

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray228[local13] = arg0[local13];
		}
		this.method1085();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	private void method1085() {
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
			local21 += this.anIntArray228[local23];
			local18 += this.anIntArray228[local23 + 2];
			local20 += this.anIntArray228[local23 + 1];
			local8 += this.anIntArray228[local23 + 7];
			local16 += this.anIntArray228[local23 + 3];
			local10 += this.anIntArray228[local23 + 6];
			local12 += this.anIntArray228[local23 + 5];
			local21 ^= local20 << 11;
			local14 += this.anIntArray228[local23 + 4];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray226[local23] = local21;
			this.anIntArray226[local23 + 1] = local20;
			this.anIntArray226[local23 + 2] = local18;
			this.anIntArray226[local23 + 3] = local16;
			this.anIntArray226[local23 + 4] = local14;
			this.anIntArray226[local23 + 5] = local12;
			this.anIntArray226[local23 + 6] = local10;
			this.anIntArray226[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray226[local23 + 2];
			local16 += this.anIntArray226[local23 + 3];
			local10 += this.anIntArray226[local23 + 6];
			local21 += this.anIntArray226[local23];
			local20 += this.anIntArray226[local23 + 1];
			local8 += this.anIntArray226[local23 + 7];
			local12 += this.anIntArray226[local23 + 5];
			local14 += this.anIntArray226[local23 + 4];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
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
			local18 += local8;
			local21 += local20;
			this.anIntArray226[local23] = local21;
			this.anIntArray226[local23 + 1] = local20;
			this.anIntArray226[local23 + 2] = local18;
			this.anIntArray226[local23 + 3] = local16;
			this.anIntArray226[local23 + 4] = local14;
			this.anIntArray226[local23 + 5] = local12;
			this.anIntArray226[local23 + 6] = local10;
			this.anIntArray226[local23 + 7] = local8;
		}
		this.method1086();
		this.anInt1789 = 256;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	private void method1086() {
		this.anInt1782 += ++this.anInt1784;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(30) int local30 = this.anIntArray226[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1794 ^= this.anInt1794 << 13;
				} else {
					this.anInt1794 ^= this.anInt1794 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1794 ^= this.anInt1794 << 2;
			} else {
				this.anInt1794 ^= this.anInt1794 >>> 16;
			}
			this.anInt1794 += this.anIntArray226[local24 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray226[local24] = local117 = this.anInt1782 + this.anIntArray226[local30 >> 2 & 0xFF] + this.anInt1794;
			this.anIntArray228[local24] = this.anInt1782 = this.anIntArray226[local117 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public int method1087() {
		if (this.anInt1789-- == 0) {
			this.method1086();
			this.anInt1789 = 255;
		}
		return this.anIntArray228[this.anInt1789];
	}
}
