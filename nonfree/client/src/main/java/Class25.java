import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NERZSWTZ")
public final class Class25 {

	@OriginalMember(owner = "client!NERZSWTZ", name = "b", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!NERZSWTZ", name = "e", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!NERZSWTZ", name = "f", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!NERZSWTZ", name = "g", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!NERZSWTZ", name = "a", descriptor = "I")
	private int anInt442 = -112;

	@OriginalMember(owner = "client!NERZSWTZ", name = "d", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!NERZSWTZ", name = "c", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!NERZSWTZ", name = "<init>", descriptor = "([IZ)V")
	public Class25(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray98 = new int[256];
			this.anIntArray97 = new int[256];
			for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
				this.anIntArray97[local19] = arg0[local19];
			}
			this.method257();
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("65385, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NERZSWTZ", name = "a", descriptor = "()I")
	public int method255() {
		if (this.anInt443-- == 0) {
			this.method256();
			this.anInt443 = 255;
		}
		return this.anIntArray97[this.anInt443];
	}

	@OriginalMember(owner = "client!NERZSWTZ", name = "b", descriptor = "()V")
	private void method256() {
		this.anInt445 += ++this.anInt446;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray98[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt444 ^= this.anInt444 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt444 ^= this.anInt444 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt444 ^= this.anInt444 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt444 ^= this.anInt444 >>> 16;
			}
			this.anInt444 += this.anIntArray98[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray98[local15] = local115 = this.anIntArray98[local22 >> 2 & 0xFF] + this.anInt444 + this.anInt445;
			this.anIntArray97[local15] = this.anInt445 = this.anIntArray98[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!NERZSWTZ", name = "c", descriptor = "()V")
	private void method257() {
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
			local17 += this.anIntArray97[local19];
			local16 += this.anIntArray97[local19 + 1];
			local14 += this.anIntArray97[local19 + 2];
			local12 += this.anIntArray97[local19 + 3];
			local10 += this.anIntArray97[local19 + 4];
			local8 += this.anIntArray97[local19 + 5];
			local6 += this.anIntArray97[local19 + 6];
			local4 += this.anIntArray97[local19 + 7];
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
			this.anIntArray98[local19] = local17;
			this.anIntArray98[local19 + 1] = local16;
			this.anIntArray98[local19 + 2] = local14;
			this.anIntArray98[local19 + 3] = local12;
			this.anIntArray98[local19 + 4] = local10;
			this.anIntArray98[local19 + 5] = local8;
			this.anIntArray98[local19 + 6] = local6;
			this.anIntArray98[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray98[local19];
			local16 += this.anIntArray98[local19 + 1];
			local14 += this.anIntArray98[local19 + 2];
			local12 += this.anIntArray98[local19 + 3];
			local10 += this.anIntArray98[local19 + 4];
			local8 += this.anIntArray98[local19 + 5];
			local6 += this.anIntArray98[local19 + 6];
			local4 += this.anIntArray98[local19 + 7];
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
			this.anIntArray98[local19] = local17;
			this.anIntArray98[local19 + 1] = local16;
			this.anIntArray98[local19 + 2] = local14;
			this.anIntArray98[local19 + 3] = local12;
			this.anIntArray98[local19 + 4] = local10;
			this.anIntArray98[local19 + 5] = local8;
			this.anIntArray98[local19 + 6] = local6;
			this.anIntArray98[local19 + 7] = local4;
		}
		this.method256();
		this.anInt443 = 256;
	}
}
