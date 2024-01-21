import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SSCDCBAC")
public final class Class32 {

	@OriginalMember(owner = "client!SSCDCBAC", name = "b", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!SSCDCBAC", name = "e", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!SSCDCBAC", name = "f", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!SSCDCBAC", name = "g", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!SSCDCBAC", name = "a", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!SSCDCBAC", name = "d", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!SSCDCBAC", name = "c", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!SSCDCBAC", name = "<init>", descriptor = "([IZ)V")
	public Class32(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray167 = new int[256];
			this.anIntArray166 = new int[256];
			for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
				this.anIntArray166[local25] = arg0[local25];
			}
			this.method399();
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("97841, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSCDCBAC", name = "a", descriptor = "()I")
	public int method397() {
		if (this.anInt608-- == 0) {
			this.method398();
			this.anInt608 = 255;
		}
		return this.anIntArray166[this.anInt608];
	}

	@OriginalMember(owner = "client!SSCDCBAC", name = "b", descriptor = "()V")
	private void method398() {
		this.anInt610 += ++this.anInt611;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray167[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt609 ^= this.anInt609 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt609 ^= this.anInt609 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt609 ^= this.anInt609 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt609 ^= this.anInt609 >>> 16;
			}
			this.anInt609 += this.anIntArray167[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray167[local15] = local115 = this.anIntArray167[local22 >> 2 & 0xFF] + this.anInt609 + this.anInt610;
			this.anIntArray166[local15] = this.anInt610 = this.anIntArray167[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!SSCDCBAC", name = "c", descriptor = "()V")
	private void method399() {
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
			local17 += this.anIntArray166[local19];
			local16 += this.anIntArray166[local19 + 1];
			local14 += this.anIntArray166[local19 + 2];
			local12 += this.anIntArray166[local19 + 3];
			local10 += this.anIntArray166[local19 + 4];
			local8 += this.anIntArray166[local19 + 5];
			local6 += this.anIntArray166[local19 + 6];
			local4 += this.anIntArray166[local19 + 7];
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
			this.anIntArray167[local19] = local17;
			this.anIntArray167[local19 + 1] = local16;
			this.anIntArray167[local19 + 2] = local14;
			this.anIntArray167[local19 + 3] = local12;
			this.anIntArray167[local19 + 4] = local10;
			this.anIntArray167[local19 + 5] = local8;
			this.anIntArray167[local19 + 6] = local6;
			this.anIntArray167[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray167[local19];
			local16 += this.anIntArray167[local19 + 1];
			local14 += this.anIntArray167[local19 + 2];
			local12 += this.anIntArray167[local19 + 3];
			local10 += this.anIntArray167[local19 + 4];
			local8 += this.anIntArray167[local19 + 5];
			local6 += this.anIntArray167[local19 + 6];
			local4 += this.anIntArray167[local19 + 7];
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
			this.anIntArray167[local19] = local17;
			this.anIntArray167[local19 + 1] = local16;
			this.anIntArray167[local19 + 2] = local14;
			this.anIntArray167[local19 + 3] = local12;
			this.anIntArray167[local19 + 4] = local10;
			this.anIntArray167[local19 + 5] = local8;
			this.anIntArray167[local19 + 6] = local6;
			this.anIntArray167[local19 + 7] = local4;
		}
		this.method398();
		this.anInt608 = 256;
	}
}
