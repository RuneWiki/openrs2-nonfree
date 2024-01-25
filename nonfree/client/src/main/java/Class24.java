import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class24 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([I)V")
	public Class24(@OriginalArg(0) int[] arg0) {
		this.anIntArray30 = new int[256];
		this.anIntArray31 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray31[local13] = arg0[local13];
		}
		this.method557();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	private void method552() {
		this.anInt445 += ++this.anInt443;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(28) int local28 = this.anIntArray30[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt442 ^= this.anInt442 << 13;
				} else {
					this.anInt442 ^= this.anInt442 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt442 ^= this.anInt442 << 2;
			} else {
				this.anInt442 ^= this.anInt442 >>> 16;
			}
			this.anInt442 += this.anIntArray30[local19 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray30[local19] = local117 = this.anInt445 + this.anIntArray30[local28 >> 2 & 0xFF] + this.anInt442;
			this.anIntArray31[local19] = this.anInt445 = this.anIntArray30[local117 >> 8 >> 2 & 0xFF] + local28;
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
	public int method555() {
		if (this.anInt437 == 0) {
			this.method552();
			this.anInt437 = 256;
		}
		return this.anIntArray31[this.anInt437 - 1];
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
	public int method556() {
		if (this.anInt437 == 0) {
			this.method552();
			this.anInt437 = 256;
		}
		return this.anIntArray31[--this.anInt437];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	private void method557() {
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray31[local23 + 7];
			local16 += this.anIntArray31[local23 + 3];
			local14 += this.anIntArray31[local23 + 4];
			local12 += this.anIntArray31[local23 + 5];
			local21 += this.anIntArray31[local23];
			local10 += this.anIntArray31[local23 + 6];
			local18 += this.anIntArray31[local23 + 2];
			local20 += this.anIntArray31[local23 + 1];
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray30[local23] = local21;
			this.anIntArray30[local23 + 1] = local20;
			this.anIntArray30[local23 + 2] = local18;
			this.anIntArray30[local23 + 3] = local16;
			this.anIntArray30[local23 + 4] = local14;
			this.anIntArray30[local23 + 5] = local12;
			this.anIntArray30[local23 + 6] = local10;
			this.anIntArray30[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray30[local23 + 2];
			local21 += this.anIntArray30[local23];
			local8 += this.anIntArray30[local23 + 7];
			local20 += this.anIntArray30[local23 + 1];
			local12 += this.anIntArray30[local23 + 5];
			local16 += this.anIntArray30[local23 + 3];
			local14 += this.anIntArray30[local23 + 4];
			local10 += this.anIntArray30[local23 + 6];
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray30[local23] = local21;
			this.anIntArray30[local23 + 1] = local20;
			this.anIntArray30[local23 + 2] = local18;
			this.anIntArray30[local23 + 3] = local16;
			this.anIntArray30[local23 + 4] = local14;
			this.anIntArray30[local23 + 5] = local12;
			this.anIntArray30[local23 + 6] = local10;
			this.anIntArray30[local23 + 7] = local8;
		}
		this.method552();
		this.anInt437 = 256;
	}
}
