import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class168 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	private int anInt4523;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
	private int[] anIntArray559;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	private int anInt4526;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	private int anInt4527;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	private Class168() {
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
	public Class168(@OriginalArg(0) int[] arg0) {
		this.anIntArray559 = new int[256];
		this.anIntArray560 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray559[local13] = arg0[local13];
		}
		this.method4002();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	private void method4002() {
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
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
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
			local16 += this.anIntArray559[local27 + 3];
			local20 += this.anIntArray559[local27 + 1];
			local10 += this.anIntArray559[local27 + 6];
			local18 += this.anIntArray559[local27 + 2];
			local21 += this.anIntArray559[local27];
			local8 += this.anIntArray559[local27 + 7];
			local12 += this.anIntArray559[local27 + 5];
			local14 += this.anIntArray559[local27 + 4];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray560[local27] = local21;
			this.anIntArray560[local27 + 1] = local20;
			this.anIntArray560[local27 + 2] = local18;
			this.anIntArray560[local27 + 3] = local16;
			this.anIntArray560[local27 + 4] = local14;
			this.anIntArray560[local27 + 5] = local12;
			this.anIntArray560[local27 + 6] = local10;
			this.anIntArray560[local27 + 7] = local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray560[local27 + 4];
			local18 += this.anIntArray560[local27 + 2];
			local21 += this.anIntArray560[local27];
			local12 += this.anIntArray560[local27 + 5];
			local8 += this.anIntArray560[local27 + 7];
			local10 += this.anIntArray560[local27 + 6];
			local20 += this.anIntArray560[local27 + 1];
			local16 += this.anIntArray560[local27 + 3];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray560[local27] = local21;
			this.anIntArray560[local27 + 1] = local20;
			this.anIntArray560[local27 + 2] = local18;
			this.anIntArray560[local27 + 3] = local16;
			this.anIntArray560[local27 + 4] = local14;
			this.anIntArray560[local27 + 5] = local12;
			this.anIntArray560[local27 + 6] = local10;
			this.anIntArray560[local27 + 7] = local8;
		}
		this.method4004();
		this.anInt4526 = 256;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
	public int method4003() {
		if (this.anInt4526 == 0) {
			this.method4004();
			this.anInt4526 = 256;
		}
		return this.anIntArray559[--this.anInt4526];
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	private void method4004() {
		this.anInt4520 += ++this.anInt4527;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray560[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt4523 ^= this.anInt4523 << 13;
				} else {
					this.anInt4523 ^= this.anInt4523 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt4523 ^= this.anInt4523 << 2;
			} else {
				this.anInt4523 ^= this.anInt4523 >>> 16;
			}
			this.anInt4523 += this.anIntArray560[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray560[local23] = local119 = this.anInt4520 + this.anInt4523 + this.anIntArray560[local30 >> 2 & 0xFF];
			this.anIntArray559[local23] = this.anInt4520 = local30 + this.anIntArray560[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)I")
	public int method4005() {
		if (this.anInt4526 == 0) {
			this.method4004();
			this.anInt4526 = 256;
		}
		return this.anIntArray559[this.anInt4526 - 1];
	}
}
