import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class393 {

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
	private int anInt10784;

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
	private int anInt10785;

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
	private int anInt10787;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
	private int anInt10789;

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "[I")
	private int[] anIntArray618;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "()V")
	private Class393() {
	}

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "([I)V")
	public Class393(@OriginalArg(0) int[] arg0) {
		this.anIntArray617 = new int[256];
		this.anIntArray618 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray617[local13] = arg0[local13];
		}
		this.method9103();
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)I")
	public int method9100() {
		if (this.anInt10785 == 0) {
			this.method9101(-32);
			this.anInt10785 = 256;
		}
		return this.anIntArray617[this.anInt10785 - 1];
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
	private void method9101(@OriginalArg(0) int arg0) {
		this.anInt10784 += ++this.anInt10787;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(28) int local28 = this.anIntArray618[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt10789 ^= this.anInt10789 << 13;
				} else {
					this.anInt10789 ^= this.anInt10789 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt10789 ^= this.anInt10789 << 2;
			} else {
				this.anInt10789 ^= this.anInt10789 >>> 16;
			}
			this.anInt10789 += this.anIntArray618[local19 + 128 & 0xFF];
			@Pc(133) int local133;
			this.anIntArray618[local19] = local133 = this.anIntArray618[local28 >> 2 & 0xFF] + this.anInt10789 + this.anInt10784;
			this.anIntArray617[local19] = this.anInt10784 = this.anIntArray618[local133 >> 8 >> 2 & 0xFF] + local28;
		}
		if (arg0 > -3) {
			this.anInt10787 = 9;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)I")
	public int method9102() {
		if (this.anInt10785 == 0) {
			this.method9101(-128);
			this.anInt10785 = 256;
		}
		return this.anIntArray617[--this.anInt10785];
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	private void method9103() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray617[local23 + 4];
			local18 += this.anIntArray617[local23 + 2];
			local16 += this.anIntArray617[local23 + 3];
			local12 += this.anIntArray617[local23 + 5];
			local21 += this.anIntArray617[local23];
			local10 += this.anIntArray617[local23 + 6];
			local20 += this.anIntArray617[local23 + 1];
			local8 += this.anIntArray617[local23 + 7];
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
			local18 += local8;
			local21 += local20;
			this.anIntArray618[local23] = local21;
			this.anIntArray618[local23 + 1] = local20;
			this.anIntArray618[local23 + 2] = local18;
			this.anIntArray618[local23 + 3] = local16;
			this.anIntArray618[local23 + 4] = local14;
			this.anIntArray618[local23 + 5] = local12;
			this.anIntArray618[local23 + 6] = local10;
			this.anIntArray618[local23 + 7] = local8;
		}
		if (-1124852316 != -1124852316) {
			return;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray618[local23 + 2];
			local14 += this.anIntArray618[local23 + 4];
			local20 += this.anIntArray618[local23 + 1];
			local16 += this.anIntArray618[local23 + 3];
			local8 += this.anIntArray618[local23 + 7];
			local10 += this.anIntArray618[local23 + 6];
			local12 += this.anIntArray618[local23 + 5];
			local21 += this.anIntArray618[local23];
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
			this.anIntArray618[local23] = local21;
			this.anIntArray618[local23 + 1] = local20;
			this.anIntArray618[local23 + 2] = local18;
			this.anIntArray618[local23 + 3] = local16;
			this.anIntArray618[local23 + 4] = local14;
			this.anIntArray618[local23 + 5] = local12;
			this.anIntArray618[local23 + 6] = local10;
			this.anIntArray618[local23 + 7] = local8;
		}
		this.method9101(-42);
		this.anInt10785 = 256;
	}
}
