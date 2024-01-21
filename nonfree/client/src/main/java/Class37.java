import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QKKVGPGN")
public final class Class37 {

	@OriginalMember(owner = "client!QKKVGPGN", name = "a", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!QKKVGPGN", name = "d", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!QKKVGPGN", name = "e", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!QKKVGPGN", name = "f", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!QKKVGPGN", name = "c", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!QKKVGPGN", name = "b", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!QKKVGPGN", name = "<init>", descriptor = "([IZ)V")
	public Class37(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray154 = new int[256];
			this.anIntArray153 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				this.anIntArray153[local11] = arg0[local11];
			}
			this.method433();
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("54551, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QKKVGPGN", name = "a", descriptor = "()I")
	public int method431() {
		if (this.anInt641-- == 0) {
			this.method432();
			this.anInt641 = 255;
		}
		return this.anIntArray153[this.anInt641];
	}

	@OriginalMember(owner = "client!QKKVGPGN", name = "b", descriptor = "()V")
	private void method432() {
		this.anInt643 += ++this.anInt644;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray154[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt642 ^= this.anInt642 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt642 ^= this.anInt642 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt642 ^= this.anInt642 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt642 ^= this.anInt642 >>> 16;
			}
			this.anInt642 += this.anIntArray154[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray154[local15] = local115 = this.anIntArray154[local22 >> 2 & 0xFF] + this.anInt642 + this.anInt643;
			this.anIntArray153[local15] = this.anInt643 = this.anIntArray154[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!QKKVGPGN", name = "c", descriptor = "()V")
	private void method433() {
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
			local17 += this.anIntArray153[local19];
			local16 += this.anIntArray153[local19 + 1];
			local14 += this.anIntArray153[local19 + 2];
			local12 += this.anIntArray153[local19 + 3];
			local10 += this.anIntArray153[local19 + 4];
			local8 += this.anIntArray153[local19 + 5];
			local6 += this.anIntArray153[local19 + 6];
			local4 += this.anIntArray153[local19 + 7];
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
			this.anIntArray154[local19] = local17;
			this.anIntArray154[local19 + 1] = local16;
			this.anIntArray154[local19 + 2] = local14;
			this.anIntArray154[local19 + 3] = local12;
			this.anIntArray154[local19 + 4] = local10;
			this.anIntArray154[local19 + 5] = local8;
			this.anIntArray154[local19 + 6] = local6;
			this.anIntArray154[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray154[local19];
			local16 += this.anIntArray154[local19 + 1];
			local14 += this.anIntArray154[local19 + 2];
			local12 += this.anIntArray154[local19 + 3];
			local10 += this.anIntArray154[local19 + 4];
			local8 += this.anIntArray154[local19 + 5];
			local6 += this.anIntArray154[local19 + 6];
			local4 += this.anIntArray154[local19 + 7];
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
			this.anIntArray154[local19] = local17;
			this.anIntArray154[local19 + 1] = local16;
			this.anIntArray154[local19 + 2] = local14;
			this.anIntArray154[local19 + 3] = local12;
			this.anIntArray154[local19 + 4] = local10;
			this.anIntArray154[local19 + 5] = local8;
			this.anIntArray154[local19 + 6] = local6;
			this.anIntArray154[local19 + 7] = local4;
		}
		this.method432();
		this.anInt641 = 256;
	}
}
