import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class225 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	private int[] anIntArray528;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt6029;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt6030;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	private int anInt6031;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	private int anInt6032;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	private Class225() {
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
	public Class225(@OriginalArg(0) int[] arg0) {
		this.anIntArray528 = new int[256];
		this.anIntArray529 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray529[local13] = arg0[local13];
		}
		this.method5058();
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	private void method5053() {
		this.anInt6032 += ++this.anInt6029;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray528[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt6031 ^= this.anInt6031 << 13;
				} else {
					this.anInt6031 ^= this.anInt6031 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt6031 ^= this.anInt6031 << 2;
			} else {
				this.anInt6031 ^= this.anInt6031 >>> 16;
			}
			this.anInt6031 += this.anIntArray528[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray528[local19] = local124 = this.anInt6031 + this.anIntArray528[local32 >> 2 & 0xFF] + this.anInt6032;
			this.anIntArray529[local19] = this.anInt6032 = this.anIntArray528[local124 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
	public int method5054() {
		if (this.anInt6030 == 0) {
			this.method5053();
			this.anInt6030 = 256;
		}
		return this.anIntArray529[this.anInt6030 - 1];
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)I")
	public int method5057() {
		if (this.anInt6030 == 0) {
			this.method5053();
			this.anInt6030 = 256;
		}
		return this.anIntArray529[--this.anInt6030];
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
	private void method5058() {
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
			local12 += local18;
			local16 += local14;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray529[local23 + 7];
			local21 += this.anIntArray529[local23];
			local18 += this.anIntArray529[local23 + 2];
			local12 += this.anIntArray529[local23 + 5];
			local16 += this.anIntArray529[local23 + 3];
			local14 += this.anIntArray529[local23 + 4];
			local10 += this.anIntArray529[local23 + 6];
			local20 += this.anIntArray529[local23 + 1];
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray528[local23] = local21;
			this.anIntArray528[local23 + 1] = local20;
			this.anIntArray528[local23 + 2] = local18;
			this.anIntArray528[local23 + 3] = local16;
			this.anIntArray528[local23 + 4] = local14;
			this.anIntArray528[local23 + 5] = local12;
			this.anIntArray528[local23 + 6] = local10;
			this.anIntArray528[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray528[local23];
			local14 += this.anIntArray528[local23 + 4];
			local18 += this.anIntArray528[local23 + 2];
			local10 += this.anIntArray528[local23 + 6];
			local8 += this.anIntArray528[local23 + 7];
			local16 += this.anIntArray528[local23 + 3];
			local20 += this.anIntArray528[local23 + 1];
			local12 += this.anIntArray528[local23 + 5];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray528[local23] = local21;
			this.anIntArray528[local23 + 1] = local20;
			this.anIntArray528[local23 + 2] = local18;
			this.anIntArray528[local23 + 3] = local16;
			this.anIntArray528[local23 + 4] = local14;
			this.anIntArray528[local23 + 5] = local12;
			this.anIntArray528[local23 + 6] = local10;
			this.anIntArray528[local23 + 7] = local8;
		}
		this.method5053();
		this.anInt6030 = 256;
	}
}
