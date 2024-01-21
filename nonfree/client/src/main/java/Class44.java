import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YJYHBEIS")
public final class Class44 {

	@OriginalMember(owner = "client!YJYHBEIS", name = "a", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!YJYHBEIS", name = "d", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!YJYHBEIS", name = "e", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!YJYHBEIS", name = "f", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!YJYHBEIS", name = "c", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!YJYHBEIS", name = "b", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!YJYHBEIS", name = "<init>", descriptor = "(Z[I)V")
	public Class44(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray179 = new int[256];
			this.anIntArray178 = new int[256];
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				this.anIntArray178[local13] = arg1[local13];
			}
			this.method461();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("38290, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJYHBEIS", name = "a", descriptor = "()I")
	public int method459() {
		if (this.anInt648-- == 0) {
			this.method460();
			this.anInt648 = 255;
		}
		return this.anIntArray178[this.anInt648];
	}

	@OriginalMember(owner = "client!YJYHBEIS", name = "b", descriptor = "()V")
	private void method460() {
		this.anInt650 += ++this.anInt651;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray179[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt649 ^= this.anInt649 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt649 ^= this.anInt649 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt649 ^= this.anInt649 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt649 ^= this.anInt649 >>> 16;
			}
			this.anInt649 += this.anIntArray179[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray179[local15] = local115 = this.anIntArray179[local22 >> 2 & 0xFF] + this.anInt649 + this.anInt650;
			this.anIntArray178[local15] = this.anInt650 = this.anIntArray179[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!YJYHBEIS", name = "c", descriptor = "()V")
	private void method461() {
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
			local17 += this.anIntArray178[local19];
			local16 += this.anIntArray178[local19 + 1];
			local14 += this.anIntArray178[local19 + 2];
			local12 += this.anIntArray178[local19 + 3];
			local10 += this.anIntArray178[local19 + 4];
			local8 += this.anIntArray178[local19 + 5];
			local6 += this.anIntArray178[local19 + 6];
			local4 += this.anIntArray178[local19 + 7];
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
			this.anIntArray179[local19] = local17;
			this.anIntArray179[local19 + 1] = local16;
			this.anIntArray179[local19 + 2] = local14;
			this.anIntArray179[local19 + 3] = local12;
			this.anIntArray179[local19 + 4] = local10;
			this.anIntArray179[local19 + 5] = local8;
			this.anIntArray179[local19 + 6] = local6;
			this.anIntArray179[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray179[local19];
			local16 += this.anIntArray179[local19 + 1];
			local14 += this.anIntArray179[local19 + 2];
			local12 += this.anIntArray179[local19 + 3];
			local10 += this.anIntArray179[local19 + 4];
			local8 += this.anIntArray179[local19 + 5];
			local6 += this.anIntArray179[local19 + 6];
			local4 += this.anIntArray179[local19 + 7];
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
			this.anIntArray179[local19] = local17;
			this.anIntArray179[local19 + 1] = local16;
			this.anIntArray179[local19 + 2] = local14;
			this.anIntArray179[local19 + 3] = local12;
			this.anIntArray179[local19 + 4] = local10;
			this.anIntArray179[local19 + 5] = local8;
			this.anIntArray179[local19 + 6] = local6;
			this.anIntArray179[local19 + 7] = local4;
		}
		this.method460();
		this.anInt648 = 256;
	}
}
