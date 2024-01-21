import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class28 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
	private final int[] anIntArray90 = new int[256];

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
	private final int[] anIntArray89 = new int[256];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([I)V")
	public Class28(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray89[local13] = arg0[local13];
		}
		this.method622();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	private void method622() {
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
			local16 += local21;
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
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray89[local23];
			local10 += this.anIntArray89[local23 + 6];
			local14 += this.anIntArray89[local23 + 4];
			local12 += this.anIntArray89[local23 + 5];
			local20 += this.anIntArray89[local23 + 1];
			local16 += this.anIntArray89[local23 + 3];
			local21 ^= local20 << 11;
			local18 += this.anIntArray89[local23 + 2];
			local16 += local21;
			local8 += this.anIntArray89[local23 + 7];
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
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray90[local23] = local21;
			this.anIntArray90[local23 + 1] = local20;
			this.anIntArray90[local23 + 2] = local18;
			this.anIntArray90[local23 + 3] = local16;
			this.anIntArray90[local23 + 4] = local14;
			this.anIntArray90[local23 + 5] = local12;
			this.anIntArray90[local23 + 6] = local10;
			this.anIntArray90[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray90[local23];
			local8 += this.anIntArray90[local23 + 7];
			local20 += this.anIntArray90[local23 + 1];
			local16 += this.anIntArray90[local23 + 3];
			local10 += this.anIntArray90[local23 + 6];
			local14 += this.anIntArray90[local23 + 4];
			local21 ^= local20 << 11;
			local18 += this.anIntArray90[local23 + 2];
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local12 += this.anIntArray90[local23 + 5];
			local18 ^= local16 << 8;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray90[local23] = local21;
			this.anIntArray90[local23 + 1] = local20;
			this.anIntArray90[local23 + 2] = local18;
			this.anIntArray90[local23 + 3] = local16;
			this.anIntArray90[local23 + 4] = local14;
			this.anIntArray90[local23 + 5] = local12;
			this.anIntArray90[local23 + 6] = local10;
			this.anIntArray90[local23 + 7] = local8;
		}
		this.method625();
		this.anInt956 = 256;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	private void method625() {
		this.anInt953 += ++this.anInt949;
		for (@Pc(28) int local28 = 0; local28 < 256; local28++) {
			@Pc(35) int local35 = this.anIntArray90[local28];
			if ((local28 & 0x2) == 0) {
				if ((local28 & 0x1) == 0) {
					this.anInt947 ^= this.anInt947 << 13;
				} else {
					this.anInt947 ^= this.anInt947 >>> 6;
				}
			} else if ((local28 & 0x1) == 0) {
				this.anInt947 ^= this.anInt947 << 2;
			} else {
				this.anInt947 ^= this.anInt947 >>> 16;
			}
			this.anInt947 += this.anIntArray90[local28 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray90[local28] = local124 = this.anIntArray90[local35 >> 2 & 0xFF] + this.anInt947 + this.anInt953;
			this.anIntArray89[local28] = this.anInt953 = local35 + this.anIntArray90[local124 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
	public int method628() {
		if (this.anInt956-- == 0) {
			this.method625();
			this.anInt956 = 255;
		}
		return this.anIntArray89[this.anInt956];
	}
}
