import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class15 {

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	private int[] anIntArray79 = new int[256];

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "[I")
	private int[] anIntArray80 = new int[256];

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([I)V")
	public Class15(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray79[local13] = arg0[local13];
		}
		this.method582();
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V")
	private void method582() {
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
			local18 += local16;
			local14 += local20;
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
			local10 ^= local8 << 8;
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local10 += this.anIntArray79[local27 + 6];
			local16 += this.anIntArray79[local27 + 3];
			local18 += this.anIntArray79[local27 + 2];
			local8 += this.anIntArray79[local27 + 7];
			local14 += this.anIntArray79[local27 + 4];
			local12 += this.anIntArray79[local27 + 5];
			local21 += this.anIntArray79[local27];
			local20 += this.anIntArray79[local27 + 1];
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray80[local27] = local21;
			this.anIntArray80[local27 + 1] = local20;
			this.anIntArray80[local27 + 2] = local18;
			this.anIntArray80[local27 + 3] = local16;
			this.anIntArray80[local27 + 4] = local14;
			this.anIntArray80[local27 + 5] = local12;
			this.anIntArray80[local27 + 6] = local10;
			this.anIntArray80[local27 + 7] = local8;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray80[local27 + 4];
			local18 += this.anIntArray80[local27 + 2];
			local20 += this.anIntArray80[local27 + 1];
			local21 += this.anIntArray80[local27];
			local16 += this.anIntArray80[local27 + 3];
			local8 += this.anIntArray80[local27 + 7];
			local12 += this.anIntArray80[local27 + 5];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local10 += this.anIntArray80[local27 + 6];
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
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
			local21 += local20;
			this.anIntArray80[local27] = local21;
			local18 += local8;
			this.anIntArray80[local27 + 1] = local20;
			this.anIntArray80[local27 + 2] = local18;
			this.anIntArray80[local27 + 3] = local16;
			this.anIntArray80[local27 + 4] = local14;
			this.anIntArray80[local27 + 5] = local12;
			this.anIntArray80[local27 + 6] = local10;
			this.anIntArray80[local27 + 7] = local8;
		}
		this.method584();
		this.anInt593 = 256;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)I")
	public int method583() {
		if (this.anInt593-- == 0) {
			this.method584();
			this.anInt593 = 255;
		}
		return this.anIntArray79[this.anInt593];
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V")
	private void method584() {
		this.anInt603 += ++this.anInt602;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(27) int local27 = this.anIntArray80[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt594 ^= this.anInt594 << 13;
				} else {
					this.anInt594 ^= this.anInt594 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt594 ^= this.anInt594 << 2;
			} else {
				this.anInt594 ^= this.anInt594 >>> 16;
			}
			this.anInt594 += this.anIntArray80[local19 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray80[local19] = local120 = this.anInt603 + this.anIntArray80[local27 >> 2 & 0xFF] + this.anInt594;
			this.anIntArray79[local19] = this.anInt603 = local27 + this.anIntArray80[local120 >> 8 >> 2 & 0xFF];
		}
	}
}
