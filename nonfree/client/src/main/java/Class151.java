import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class151 {

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	private int anInt4521;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	private int anInt4526;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	private int anInt4528;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	private Class151() {
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
	public Class151(@OriginalArg(0) int[] arg0) {
		this.anIntArray578 = new int[256];
		this.anIntArray579 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray578[local13] = arg0[local13];
		}
		this.method4158();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	private void method4153() {
		this.anInt4528 += ++this.anInt4520;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray579[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt4521 ^= this.anInt4521 << 13;
				} else {
					this.anInt4521 ^= this.anInt4521 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt4521 ^= this.anInt4521 << 2;
			} else {
				this.anInt4521 ^= this.anInt4521 >>> 16;
			}
			this.anInt4521 += this.anIntArray579[local19 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray579[local19] = local126 = this.anIntArray579[local32 >> 2 & 0xFF] + this.anInt4521 + this.anInt4528;
			this.anIntArray578[local19] = this.anInt4528 = this.anIntArray579[local126 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	private void method4158() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray578[local23 + 7];
			local14 += this.anIntArray578[local23 + 4];
			local18 += this.anIntArray578[local23 + 2];
			local10 += this.anIntArray578[local23 + 6];
			local20 += this.anIntArray578[local23 + 1];
			local21 += this.anIntArray578[local23];
			local16 += this.anIntArray578[local23 + 3];
			local12 += this.anIntArray578[local23 + 5];
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray579[local23] = local21;
			this.anIntArray579[local23 + 1] = local20;
			this.anIntArray579[local23 + 2] = local18;
			this.anIntArray579[local23 + 3] = local16;
			this.anIntArray579[local23 + 4] = local14;
			this.anIntArray579[local23 + 5] = local12;
			this.anIntArray579[local23 + 6] = local10;
			this.anIntArray579[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray579[local23 + 7];
			local18 += this.anIntArray579[local23 + 2];
			local21 += this.anIntArray579[local23];
			local12 += this.anIntArray579[local23 + 5];
			local20 += this.anIntArray579[local23 + 1];
			local16 += this.anIntArray579[local23 + 3];
			local10 += this.anIntArray579[local23 + 6];
			local14 += this.anIntArray579[local23 + 4];
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray579[local23] = local21;
			this.anIntArray579[local23 + 1] = local20;
			this.anIntArray579[local23 + 2] = local18;
			this.anIntArray579[local23 + 3] = local16;
			this.anIntArray579[local23 + 4] = local14;
			this.anIntArray579[local23 + 5] = local12;
			this.anIntArray579[local23 + 6] = local10;
			this.anIntArray579[local23 + 7] = local8;
		}
		this.method4153();
		this.anInt4526 = 256;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)I")
	public int method4159() {
		if (this.anInt4526-- == 0) {
			this.method4153();
			this.anInt4526 = 255;
		}
		return this.anIntArray578[this.anInt4526];
	}
}
