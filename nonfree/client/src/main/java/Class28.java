import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class28 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "[I")
	private final int[] anIntArray119 = new int[256];

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
	private final int[] anIntArray117 = new int[256];

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([I)V")
	public Class28(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray119[local13] = arg0[local13];
		}
		this.method616();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	public int method614() {
		if (this.anInt1044-- == 0) {
			this.method620();
			this.anInt1044 = 255;
		}
		return this.anIntArray119[this.anInt1044];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	private void method616() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(28) int local28;
		for (local28 = 0; local28 < 4; local28++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local14 += this.anIntArray119[local28 + 4];
			local10 += this.anIntArray119[local28 + 6];
			local12 += this.anIntArray119[local28 + 5];
			local21 += this.anIntArray119[local28];
			local16 += this.anIntArray119[local28 + 3];
			local20 += this.anIntArray119[local28 + 1];
			local21 ^= local20 << 11;
			local8 += this.anIntArray119[local28 + 7];
			local18 += this.anIntArray119[local28 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
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
			local20 += local10;
			local18 += local8;
			local21 += local20;
			this.anIntArray117[local28] = local21;
			this.anIntArray117[local28 + 1] = local20;
			this.anIntArray117[local28 + 2] = local18;
			this.anIntArray117[local28 + 3] = local16;
			this.anIntArray117[local28 + 4] = local14;
			this.anIntArray117[local28 + 5] = local12;
			this.anIntArray117[local28 + 6] = local10;
			this.anIntArray117[local28 + 7] = local8;
		}
		for (local28 = 0; local28 < 256; local28 += 8) {
			local20 += this.anIntArray117[local28 + 1];
			local16 += this.anIntArray117[local28 + 3];
			local14 += this.anIntArray117[local28 + 4];
			local18 += this.anIntArray117[local28 + 2];
			local10 += this.anIntArray117[local28 + 6];
			local21 += this.anIntArray117[local28];
			local12 += this.anIntArray117[local28 + 5];
			local8 += this.anIntArray117[local28 + 7];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += local21;
			local14 += local20;
			local18 += local16;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray117[local28] = local21;
			this.anIntArray117[local28 + 1] = local20;
			local18 += local8;
			this.anIntArray117[local28 + 2] = local18;
			this.anIntArray117[local28 + 3] = local16;
			this.anIntArray117[local28 + 4] = local14;
			this.anIntArray117[local28 + 5] = local12;
			this.anIntArray117[local28 + 6] = local10;
			this.anIntArray117[local28 + 7] = local8;
		}
		this.method620();
		this.anInt1044 = 256;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
	private void method620() {
		this.anInt1039 += ++this.anInt1040;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray117[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt1048 ^= this.anInt1048 << 13;
				} else {
					this.anInt1048 ^= this.anInt1048 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt1048 ^= this.anInt1048 << 2;
			} else {
				this.anInt1048 ^= this.anInt1048 >>> 16;
			}
			this.anInt1048 += this.anIntArray117[local27 + 128 & 0xFF];
			@Pc(128) int local128;
			this.anIntArray117[local27] = local128 = this.anIntArray117[local34 >> 2 & 0xFF] + this.anInt1048 + this.anInt1039;
			this.anIntArray119[local27] = this.anInt1039 = this.anIntArray117[local128 >> 8 >> 2 & 0xFF] + local34;
		}
	}
}
