import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class18 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	private final int[] anIntArray80 = new int[256];

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
	private final int[] anIntArray79 = new int[256];

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([I)V")
	public Class18(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray79[local13] = arg0[local13];
		}
		this.method401();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	private void method401() {
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
			local20 += local25;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local24 += local14;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray79[local27 + 1];
			local20 += this.anIntArray79[local27 + 3];
			local22 += this.anIntArray79[local27 + 2];
			local12 += this.anIntArray79[local27 + 7];
			local14 += this.anIntArray79[local27 + 6];
			local25 += this.anIntArray79[local27];
			local25 ^= local24 << 11;
			local16 += this.anIntArray79[local27 + 5];
			local24 += local22;
			local18 += this.anIntArray79[local27 + 4];
			local20 += local25;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local22 ^= local20 << 8;
			local18 += local24;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local24 += local14;
			local25 += local24;
			this.anIntArray80[local27] = local25;
			this.anIntArray80[local27 + 1] = local24;
			this.anIntArray80[local27 + 2] = local22;
			this.anIntArray80[local27 + 3] = local20;
			this.anIntArray80[local27 + 4] = local18;
			this.anIntArray80[local27 + 5] = local16;
			this.anIntArray80[local27 + 6] = local14;
			this.anIntArray80[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray80[local27 + 6];
			local20 += this.anIntArray80[local27 + 3];
			local18 += this.anIntArray80[local27 + 4];
			local22 += this.anIntArray80[local27 + 2];
			local24 += this.anIntArray80[local27 + 1];
			local25 += this.anIntArray80[local27];
			local25 ^= local24 << 11;
			local16 += this.anIntArray80[local27 + 5];
			local12 += this.anIntArray80[local27 + 7];
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local22 ^= local20 << 8;
			local18 += local24;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local18 ^= local16 << 10;
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local24 += local14;
			local22 += local12;
			local25 += local24;
			this.anIntArray80[local27] = local25;
			this.anIntArray80[local27 + 1] = local24;
			this.anIntArray80[local27 + 2] = local22;
			this.anIntArray80[local27 + 3] = local20;
			this.anIntArray80[local27 + 4] = local18;
			this.anIntArray80[local27 + 5] = local16;
			this.anIntArray80[local27 + 6] = local14;
			this.anIntArray80[local27 + 7] = local12;
		}
		this.method407();
		this.anInt626 = 256;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public int method405() {
		if (this.anInt626-- == 0) {
			this.method407();
			this.anInt626 = 255;
		}
		return this.anIntArray79[this.anInt626];
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	private void method407() {
		this.anInt639 += ++this.anInt640;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray80[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt638 ^= this.anInt638 << 13;
				} else {
					this.anInt638 ^= this.anInt638 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt638 ^= this.anInt638 << 2;
			} else {
				this.anInt638 ^= this.anInt638 >>> 16;
			}
			this.anInt638 += this.anIntArray80[local23 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray80[local23] = local122 = this.anIntArray80[local30 >> 2 & 0xFF] + this.anInt638 + this.anInt639;
			this.anIntArray79[local23] = this.anInt639 = this.anIntArray80[local122 >> 8 >> 2 & 0xFF] + local30;
		}
	}
}
