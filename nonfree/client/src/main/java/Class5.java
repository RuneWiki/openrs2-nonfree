import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class5 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	private final int[] anIntArray14 = new int[256];

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
	private final int[] anIntArray15 = new int[256];

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([I)V")
	public Class5(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray15[local11] = arg0[local11];
		}
		this.method177();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I")
	public int method176() {
		if (this.anInt303-- == 0) {
			this.method179();
			this.anInt303 = 255;
		}
		return this.anIntArray15[this.anInt303];
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	private void method177() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21;
		for (local21 = 0; local21 < 4; local21++) {
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local16 ^= local14 << 8;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local18 += local8;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local6 += this.anIntArray15[local21 + 7];
			local14 += this.anIntArray15[local21 + 3];
			local8 += this.anIntArray15[local21 + 6];
			local19 += this.anIntArray15[local21];
			local12 += this.anIntArray15[local21 + 4];
			local10 += this.anIntArray15[local21 + 5];
			local18 += this.anIntArray15[local21 + 1];
			local19 ^= local18 << 11;
			local14 += local19;
			local16 += this.anIntArray15[local21 + 2];
			local18 += local16;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray14[local21] = local19;
			this.anIntArray14[local21 + 1] = local18;
			this.anIntArray14[local21 + 2] = local16;
			this.anIntArray14[local21 + 3] = local14;
			this.anIntArray14[local21 + 4] = local12;
			this.anIntArray14[local21 + 5] = local10;
			this.anIntArray14[local21 + 6] = local8;
			this.anIntArray14[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local10 += this.anIntArray14[local21 + 5];
			local16 += this.anIntArray14[local21 + 2];
			local18 += this.anIntArray14[local21 + 1];
			local14 += this.anIntArray14[local21 + 3];
			local6 += this.anIntArray14[local21 + 7];
			local12 += this.anIntArray14[local21 + 4];
			local8 += this.anIntArray14[local21 + 6];
			local19 += this.anIntArray14[local21];
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local6 += local12;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local18 += local8;
			local19 += local18;
			this.anIntArray14[local21] = local19;
			this.anIntArray14[local21 + 1] = local18;
			this.anIntArray14[local21 + 2] = local16;
			this.anIntArray14[local21 + 3] = local14;
			this.anIntArray14[local21 + 4] = local12;
			this.anIntArray14[local21 + 5] = local10;
			this.anIntArray14[local21 + 6] = local8;
			this.anIntArray14[local21 + 7] = local6;
		}
		this.method179();
		this.anInt303 = 256;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	private void method179() {
		this.anInt299 += ++this.anInt304;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) int local26 = this.anIntArray14[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt305 ^= this.anInt305 << 13;
				} else {
					this.anInt305 ^= this.anInt305 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt305 ^= this.anInt305 << 2;
			} else {
				this.anInt305 ^= this.anInt305 >>> 16;
			}
			this.anInt305 += this.anIntArray14[local17 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray14[local17] = local115 = this.anInt305 + this.anIntArray14[local26 >> 2 & 0xFF] + this.anInt299;
			this.anIntArray15[local17] = this.anInt299 = local26 + this.anIntArray14[local115 >> 8 >> 2 & 0xFF];
		}
	}
}
