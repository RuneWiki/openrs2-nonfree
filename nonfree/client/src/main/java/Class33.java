import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class33 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private int anInt563;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
	private int[] anIntArray188 = new int[256];

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
	private int[] anIntArray187 = new int[256];

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(B[I)V")
	public Class33(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			this.anIntArray187[local11] = arg1[local11];
		}
		this.method426();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()I")
	public int method424() {
		if (this.anInt562-- == 0) {
			this.method425();
			this.anInt562 = 255;
		}
		return this.anIntArray187[this.anInt562];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private void method425() {
		this.anInt564 += ++this.anInt565;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray188[local25];
			switch(local25 & 0x3) {
				case 0:
					this.anInt563 ^= this.anInt563 << 13;
					break;
				case 1:
					this.anInt563 ^= this.anInt563 >>> 6;
					break;
				case 2:
					this.anInt563 ^= this.anInt563 << 2;
					break;
				case 3:
					this.anInt563 ^= this.anInt563 >>> 16;
			}
			this.anInt563 += this.anIntArray188[local25 + 128 & 0xFF];
			@Pc(111) int local111;
			this.anIntArray188[local25] = local111 = this.anIntArray188[local32 >> 2 & 0xFF] + this.anInt563 + this.anInt564;
			this.anIntArray187[local25] = this.anInt564 = this.anIntArray188[local111 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
	private void method426() {
		@Pc(4) int local4 = -1640531527;
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(17) int local17 = -1640531527;
		@Pc(19) int local19;
		for (local19 = 0; local19 < 4; local19++) {
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray187[local19];
			local16 += this.anIntArray187[local19 + 1];
			local14 += this.anIntArray187[local19 + 2];
			local12 += this.anIntArray187[local19 + 3];
			local10 += this.anIntArray187[local19 + 4];
			local8 += this.anIntArray187[local19 + 5];
			local6 += this.anIntArray187[local19 + 6];
			local4 += this.anIntArray187[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray188[local19] = local17;
			this.anIntArray188[local19 + 1] = local16;
			this.anIntArray188[local19 + 2] = local14;
			this.anIntArray188[local19 + 3] = local12;
			this.anIntArray188[local19 + 4] = local10;
			this.anIntArray188[local19 + 5] = local8;
			this.anIntArray188[local19 + 6] = local6;
			this.anIntArray188[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray188[local19];
			local16 += this.anIntArray188[local19 + 1];
			local14 += this.anIntArray188[local19 + 2];
			local12 += this.anIntArray188[local19 + 3];
			local10 += this.anIntArray188[local19 + 4];
			local8 += this.anIntArray188[local19 + 5];
			local6 += this.anIntArray188[local19 + 6];
			local4 += this.anIntArray188[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray188[local19] = local17;
			this.anIntArray188[local19 + 1] = local16;
			this.anIntArray188[local19 + 2] = local14;
			this.anIntArray188[local19 + 3] = local12;
			this.anIntArray188[local19 + 4] = local10;
			this.anIntArray188[local19 + 5] = local8;
			this.anIntArray188[local19 + 6] = local6;
			this.anIntArray188[local19 + 7] = local4;
		}
		this.method425();
		this.anInt562 = 256;
	}
}
