import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XXDUCPOC")
public final class Class46 {

	@OriginalMember(owner = "client!XXDUCPOC", name = "a", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!XXDUCPOC", name = "d", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!XXDUCPOC", name = "e", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!XXDUCPOC", name = "f", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!XXDUCPOC", name = "c", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!XXDUCPOC", name = "b", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!XXDUCPOC", name = "<init>", descriptor = "([IB)V")
	public Class46(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anIntArray161 = new int[256];
			this.anIntArray160 = new int[256];
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				this.anIntArray160[local13] = arg0[local13];
			}
			this.method501();
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("75233, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXDUCPOC", name = "a", descriptor = "()I")
	public int method499() {
		if (this.anInt727-- == 0) {
			this.method500();
			this.anInt727 = 255;
		}
		return this.anIntArray160[this.anInt727];
	}

	@OriginalMember(owner = "client!XXDUCPOC", name = "b", descriptor = "()V")
	private void method500() {
		this.anInt729 += ++this.anInt730;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray161[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt728 ^= this.anInt728 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt728 ^= this.anInt728 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt728 ^= this.anInt728 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt728 ^= this.anInt728 >>> 16;
			}
			this.anInt728 += this.anIntArray161[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray161[local15] = local115 = this.anIntArray161[local22 >> 2 & 0xFF] + this.anInt728 + this.anInt729;
			this.anIntArray160[local15] = this.anInt729 = this.anIntArray161[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!XXDUCPOC", name = "c", descriptor = "()V")
	private void method501() {
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
			local17 += this.anIntArray160[local19];
			local16 += this.anIntArray160[local19 + 1];
			local14 += this.anIntArray160[local19 + 2];
			local12 += this.anIntArray160[local19 + 3];
			local10 += this.anIntArray160[local19 + 4];
			local8 += this.anIntArray160[local19 + 5];
			local6 += this.anIntArray160[local19 + 6];
			local4 += this.anIntArray160[local19 + 7];
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
			this.anIntArray161[local19] = local17;
			this.anIntArray161[local19 + 1] = local16;
			this.anIntArray161[local19 + 2] = local14;
			this.anIntArray161[local19 + 3] = local12;
			this.anIntArray161[local19 + 4] = local10;
			this.anIntArray161[local19 + 5] = local8;
			this.anIntArray161[local19 + 6] = local6;
			this.anIntArray161[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray161[local19];
			local16 += this.anIntArray161[local19 + 1];
			local14 += this.anIntArray161[local19 + 2];
			local12 += this.anIntArray161[local19 + 3];
			local10 += this.anIntArray161[local19 + 4];
			local8 += this.anIntArray161[local19 + 5];
			local6 += this.anIntArray161[local19 + 6];
			local4 += this.anIntArray161[local19 + 7];
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
			this.anIntArray161[local19] = local17;
			this.anIntArray161[local19 + 1] = local16;
			this.anIntArray161[local19 + 2] = local14;
			this.anIntArray161[local19 + 3] = local12;
			this.anIntArray161[local19 + 4] = local10;
			this.anIntArray161[local19 + 5] = local8;
			this.anIntArray161[local19 + 6] = local6;
			this.anIntArray161[local19 + 7] = local4;
		}
		this.method500();
		this.anInt727 = 256;
	}
}
