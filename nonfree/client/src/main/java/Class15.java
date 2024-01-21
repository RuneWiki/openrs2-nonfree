import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IPEHOOFG")
public final class Class15 {

	@OriginalMember(owner = "client!IPEHOOFG", name = "a", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!IPEHOOFG", name = "d", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!IPEHOOFG", name = "e", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!IPEHOOFG", name = "f", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!IPEHOOFG", name = "c", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!IPEHOOFG", name = "b", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!IPEHOOFG", name = "<init>", descriptor = "([IZ)V")
	public Class15(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray105 = new int[256];
			this.anIntArray104 = new int[256];
			@Pc(15) int local15;
			if (arg1) {
				for (local15 = 1; local15 > 0; local15++) {
				}
			}
			for (local15 = 0; local15 < arg0.length; local15++) {
				this.anIntArray104[local15] = arg0[local15];
			}
			this.method205();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("89729, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPEHOOFG", name = "a", descriptor = "()I")
	public int method203() {
		if (this.anInt379-- == 0) {
			this.method204();
			this.anInt379 = 255;
		}
		return this.anIntArray104[this.anInt379];
	}

	@OriginalMember(owner = "client!IPEHOOFG", name = "b", descriptor = "()V")
	private void method204() {
		this.anInt381 += ++this.anInt382;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray105[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt380 ^= this.anInt380 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt380 ^= this.anInt380 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt380 ^= this.anInt380 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt380 ^= this.anInt380 >>> 16;
			}
			this.anInt380 += this.anIntArray105[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray105[local15] = local115 = this.anIntArray105[local22 >> 2 & 0xFF] + this.anInt380 + this.anInt381;
			this.anIntArray104[local15] = this.anInt381 = this.anIntArray105[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!IPEHOOFG", name = "c", descriptor = "()V")
	private void method205() {
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
			local17 += this.anIntArray104[local19];
			local16 += this.anIntArray104[local19 + 1];
			local14 += this.anIntArray104[local19 + 2];
			local12 += this.anIntArray104[local19 + 3];
			local10 += this.anIntArray104[local19 + 4];
			local8 += this.anIntArray104[local19 + 5];
			local6 += this.anIntArray104[local19 + 6];
			local4 += this.anIntArray104[local19 + 7];
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
			this.anIntArray105[local19] = local17;
			this.anIntArray105[local19 + 1] = local16;
			this.anIntArray105[local19 + 2] = local14;
			this.anIntArray105[local19 + 3] = local12;
			this.anIntArray105[local19 + 4] = local10;
			this.anIntArray105[local19 + 5] = local8;
			this.anIntArray105[local19 + 6] = local6;
			this.anIntArray105[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray105[local19];
			local16 += this.anIntArray105[local19 + 1];
			local14 += this.anIntArray105[local19 + 2];
			local12 += this.anIntArray105[local19 + 3];
			local10 += this.anIntArray105[local19 + 4];
			local8 += this.anIntArray105[local19 + 5];
			local6 += this.anIntArray105[local19 + 6];
			local4 += this.anIntArray105[local19 + 7];
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
			this.anIntArray105[local19] = local17;
			this.anIntArray105[local19 + 1] = local16;
			this.anIntArray105[local19 + 2] = local14;
			this.anIntArray105[local19 + 3] = local12;
			this.anIntArray105[local19 + 4] = local10;
			this.anIntArray105[local19 + 5] = local8;
			this.anIntArray105[local19 + 6] = local6;
			this.anIntArray105[local19 + 7] = local4;
		}
		this.method204();
		this.anInt379 = 256;
	}
}
