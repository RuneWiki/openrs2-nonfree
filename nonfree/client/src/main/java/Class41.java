import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XAGUDWSZ")
public final class Class41 {

	@OriginalMember(owner = "client!XAGUDWSZ", name = "b", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "e", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "f", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "g", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "a", descriptor = "I")
	private int anInt748 = 457;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "d", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "c", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!XAGUDWSZ", name = "<init>", descriptor = "(B[I)V")
	public Class41(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray194 = new int[256];
			this.anIntArray193 = new int[256];
			for (@Pc(20) int local20 = 0; local20 < arg1.length; local20++) {
				this.anIntArray193[local20] = arg1[local20];
			}
			this.method513();
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("18213, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAGUDWSZ", name = "a", descriptor = "()I")
	public int method511() {
		if (this.anInt749-- == 0) {
			this.method512();
			this.anInt749 = 255;
		}
		return this.anIntArray193[this.anInt749];
	}

	@OriginalMember(owner = "client!XAGUDWSZ", name = "b", descriptor = "()V")
	private void method512() {
		this.anInt751 += ++this.anInt752;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray194[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt750 ^= this.anInt750 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt750 ^= this.anInt750 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt750 ^= this.anInt750 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt750 ^= this.anInt750 >>> 16;
			}
			this.anInt750 += this.anIntArray194[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray194[local15] = local115 = this.anIntArray194[local22 >> 2 & 0xFF] + this.anInt750 + this.anInt751;
			this.anIntArray193[local15] = this.anInt751 = this.anIntArray194[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!XAGUDWSZ", name = "c", descriptor = "()V")
	private void method513() {
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
			local17 += this.anIntArray193[local19];
			local16 += this.anIntArray193[local19 + 1];
			local14 += this.anIntArray193[local19 + 2];
			local12 += this.anIntArray193[local19 + 3];
			local10 += this.anIntArray193[local19 + 4];
			local8 += this.anIntArray193[local19 + 5];
			local6 += this.anIntArray193[local19 + 6];
			local4 += this.anIntArray193[local19 + 7];
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
			this.anIntArray194[local19] = local17;
			this.anIntArray194[local19 + 1] = local16;
			this.anIntArray194[local19 + 2] = local14;
			this.anIntArray194[local19 + 3] = local12;
			this.anIntArray194[local19 + 4] = local10;
			this.anIntArray194[local19 + 5] = local8;
			this.anIntArray194[local19 + 6] = local6;
			this.anIntArray194[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray194[local19];
			local16 += this.anIntArray194[local19 + 1];
			local14 += this.anIntArray194[local19 + 2];
			local12 += this.anIntArray194[local19 + 3];
			local10 += this.anIntArray194[local19 + 4];
			local8 += this.anIntArray194[local19 + 5];
			local6 += this.anIntArray194[local19 + 6];
			local4 += this.anIntArray194[local19 + 7];
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
			this.anIntArray194[local19] = local17;
			this.anIntArray194[local19 + 1] = local16;
			this.anIntArray194[local19 + 2] = local14;
			this.anIntArray194[local19 + 3] = local12;
			this.anIntArray194[local19 + 4] = local10;
			this.anIntArray194[local19 + 5] = local8;
			this.anIntArray194[local19 + 6] = local6;
			this.anIntArray194[local19 + 7] = local4;
		}
		this.method512();
		this.anInt749 = 256;
	}
}
