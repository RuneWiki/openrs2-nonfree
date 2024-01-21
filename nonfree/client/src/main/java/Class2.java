import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ADZBQDSQ")
public final class Class2 {

	@OriginalMember(owner = "client!ADZBQDSQ", name = "a", descriptor = "I")
	private int anInt25;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "d", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "e", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "f", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "c", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "b", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!ADZBQDSQ", name = "<init>", descriptor = "([IB)V")
	public Class2(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anIntArray3 = new int[256];
			this.anIntArray2 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				this.anIntArray2[local11] = arg0[local11];
			}
			this.method15();
			@Pc(31) boolean local31 = false;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("39284, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADZBQDSQ", name = "a", descriptor = "()I")
	public int method13() {
		if (this.anInt25-- == 0) {
			this.method14();
			this.anInt25 = 255;
		}
		return this.anIntArray2[this.anInt25];
	}

	@OriginalMember(owner = "client!ADZBQDSQ", name = "b", descriptor = "()V")
	private void method14() {
		this.anInt27 += ++this.anInt28;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray3[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt26 ^= this.anInt26 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt26 ^= this.anInt26 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt26 ^= this.anInt26 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt26 ^= this.anInt26 >>> 16;
			}
			this.anInt26 += this.anIntArray3[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray3[local15] = local115 = this.anIntArray3[local22 >> 2 & 0xFF] + this.anInt26 + this.anInt27;
			this.anIntArray2[local15] = this.anInt27 = this.anIntArray3[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!ADZBQDSQ", name = "c", descriptor = "()V")
	private void method15() {
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
			local17 += this.anIntArray2[local19];
			local16 += this.anIntArray2[local19 + 1];
			local14 += this.anIntArray2[local19 + 2];
			local12 += this.anIntArray2[local19 + 3];
			local10 += this.anIntArray2[local19 + 4];
			local8 += this.anIntArray2[local19 + 5];
			local6 += this.anIntArray2[local19 + 6];
			local4 += this.anIntArray2[local19 + 7];
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
			this.anIntArray3[local19] = local17;
			this.anIntArray3[local19 + 1] = local16;
			this.anIntArray3[local19 + 2] = local14;
			this.anIntArray3[local19 + 3] = local12;
			this.anIntArray3[local19 + 4] = local10;
			this.anIntArray3[local19 + 5] = local8;
			this.anIntArray3[local19 + 6] = local6;
			this.anIntArray3[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray3[local19];
			local16 += this.anIntArray3[local19 + 1];
			local14 += this.anIntArray3[local19 + 2];
			local12 += this.anIntArray3[local19 + 3];
			local10 += this.anIntArray3[local19 + 4];
			local8 += this.anIntArray3[local19 + 5];
			local6 += this.anIntArray3[local19 + 6];
			local4 += this.anIntArray3[local19 + 7];
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
			this.anIntArray3[local19] = local17;
			this.anIntArray3[local19 + 1] = local16;
			this.anIntArray3[local19 + 2] = local14;
			this.anIntArray3[local19 + 3] = local12;
			this.anIntArray3[local19 + 4] = local10;
			this.anIntArray3[local19 + 5] = local8;
			this.anIntArray3[local19 + 6] = local6;
			this.anIntArray3[local19 + 7] = local4;
		}
		this.method14();
		this.anInt25 = 256;
	}
}
