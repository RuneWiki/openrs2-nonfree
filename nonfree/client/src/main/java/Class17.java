import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class17 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	private int anInt738;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
	private final int[] anIntArray130 = new int[256];

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
	private final int[] anIntArray129 = new int[256];

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([I)V")
	public Class17(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray130[local13] = arg0[local13];
		}
		this.method510();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	private void method508() {
		this.anInt733 += ++this.anInt738;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray129[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt740 ^= this.anInt740 << 13;
				} else {
					this.anInt740 ^= this.anInt740 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt740 ^= this.anInt740 << 2;
			} else {
				this.anInt740 ^= this.anInt740 >>> 16;
			}
			this.anInt740 += this.anIntArray129[local19 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray129[local19] = local119 = this.anInt740 + this.anIntArray129[local26 >> 2 & 0xFF] + this.anInt733;
			this.anIntArray130[local19] = this.anInt733 = local26 + this.anIntArray129[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	private void method510() {
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local25 ^= local24 << 11;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local20 += local25;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local16 += local22;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local25 += local16;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local25 += this.anIntArray130[local27];
			local16 += this.anIntArray130[local27 + 5];
			local18 += this.anIntArray130[local27 + 4];
			local24 += this.anIntArray130[local27 + 1];
			local20 += this.anIntArray130[local27 + 3];
			local22 += this.anIntArray130[local27 + 2];
			local12 += this.anIntArray130[local27 + 7];
			local14 += this.anIntArray130[local27 + 6];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			this.anIntArray129[local27] = local25;
			local22 += local12;
			this.anIntArray129[local27 + 1] = local24;
			this.anIntArray129[local27 + 2] = local22;
			this.anIntArray129[local27 + 3] = local20;
			this.anIntArray129[local27 + 4] = local18;
			this.anIntArray129[local27 + 5] = local16;
			this.anIntArray129[local27 + 6] = local14;
			this.anIntArray129[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local20 += this.anIntArray129[local27 + 3];
			local24 += this.anIntArray129[local27 + 1];
			local12 += this.anIntArray129[local27 + 7];
			local25 += this.anIntArray129[local27];
			local22 += this.anIntArray129[local27 + 2];
			local25 ^= local24 << 11;
			local16 += this.anIntArray129[local27 + 5];
			local14 += this.anIntArray129[local27 + 6];
			local20 += local25;
			local18 += this.anIntArray129[local27 + 4];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray129[local27] = local25;
			this.anIntArray129[local27 + 1] = local24;
			this.anIntArray129[local27 + 2] = local22;
			this.anIntArray129[local27 + 3] = local20;
			this.anIntArray129[local27 + 4] = local18;
			this.anIntArray129[local27 + 5] = local16;
			this.anIntArray129[local27 + 6] = local14;
			this.anIntArray129[local27 + 7] = local12;
		}
		this.method508();
		this.anInt728 = 256;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)I")
	public int method511() {
		if (this.anInt728-- == 0) {
			this.method508();
			this.anInt728 = 255;
		}
		return this.anIntArray130[this.anInt728];
	}
}
