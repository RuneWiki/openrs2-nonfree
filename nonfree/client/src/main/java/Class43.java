import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WMQKHABS")
public final class Class43 {

	@OriginalMember(owner = "client!WMQKHABS", name = "b", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!WMQKHABS", name = "e", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!WMQKHABS", name = "f", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!WMQKHABS", name = "g", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!WMQKHABS", name = "a", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!WMQKHABS", name = "d", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!WMQKHABS", name = "c", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!WMQKHABS", name = "<init>", descriptor = "([IB)V")
	public Class43(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(11) boolean local11 = false;
			this.anIntArray141 = new int[256];
			this.anIntArray140 = new int[256];
			for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
				this.anIntArray140[local31] = arg0[local31];
			}
			this.method503();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("81499, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMQKHABS", name = "a", descriptor = "()I")
	public int method501() {
		if (this.anInt749-- == 0) {
			this.method502();
			this.anInt749 = 255;
		}
		return this.anIntArray140[this.anInt749];
	}

	@OriginalMember(owner = "client!WMQKHABS", name = "b", descriptor = "()V")
	private void method502() {
		this.anInt751 += ++this.anInt752;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray141[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt750 ^= this.anInt750 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt750 ^= this.anInt750 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt750 ^= this.anInt750 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt750 ^= this.anInt750 >>> 16;
			}
			this.anInt750 += this.anIntArray141[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray141[local15] = local115 = this.anIntArray141[local22 >> 2 & 0xFF] + this.anInt750 + this.anInt751;
			this.anIntArray140[local15] = this.anInt751 = this.anIntArray141[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!WMQKHABS", name = "c", descriptor = "()V")
	private void method503() {
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
			local17 += this.anIntArray140[local19];
			local16 += this.anIntArray140[local19 + 1];
			local14 += this.anIntArray140[local19 + 2];
			local12 += this.anIntArray140[local19 + 3];
			local10 += this.anIntArray140[local19 + 4];
			local8 += this.anIntArray140[local19 + 5];
			local6 += this.anIntArray140[local19 + 6];
			local4 += this.anIntArray140[local19 + 7];
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
			this.anIntArray141[local19] = local17;
			this.anIntArray141[local19 + 1] = local16;
			this.anIntArray141[local19 + 2] = local14;
			this.anIntArray141[local19 + 3] = local12;
			this.anIntArray141[local19 + 4] = local10;
			this.anIntArray141[local19 + 5] = local8;
			this.anIntArray141[local19 + 6] = local6;
			this.anIntArray141[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray141[local19];
			local16 += this.anIntArray141[local19 + 1];
			local14 += this.anIntArray141[local19 + 2];
			local12 += this.anIntArray141[local19 + 3];
			local10 += this.anIntArray141[local19 + 4];
			local8 += this.anIntArray141[local19 + 5];
			local6 += this.anIntArray141[local19 + 6];
			local4 += this.anIntArray141[local19 + 7];
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
			this.anIntArray141[local19] = local17;
			this.anIntArray141[local19 + 1] = local16;
			this.anIntArray141[local19 + 2] = local14;
			this.anIntArray141[local19 + 3] = local12;
			this.anIntArray141[local19 + 4] = local10;
			this.anIntArray141[local19 + 5] = local8;
			this.anIntArray141[local19 + 6] = local6;
			this.anIntArray141[local19 + 7] = local4;
		}
		this.method502();
		this.anInt749 = 256;
	}
}
