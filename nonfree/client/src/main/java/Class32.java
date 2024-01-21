import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QIAMMSTQ")
public final class Class32 {

	@OriginalMember(owner = "client!QIAMMSTQ", name = "a", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "d", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "e", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "f", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "c", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "b", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!QIAMMSTQ", name = "<init>", descriptor = "([IZ)V")
	public Class32(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anIntArray162 = new int[256];
			this.anIntArray161 = new int[256];
			for (@Pc(22) int local22 = 0; local22 < arg0.length; local22++) {
				this.anIntArray161[local22] = arg0[local22];
			}
			this.method433();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("68603, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIAMMSTQ", name = "a", descriptor = "()I")
	public int method431() {
		if (this.anInt638-- == 0) {
			this.method432();
			this.anInt638 = 255;
		}
		return this.anIntArray161[this.anInt638];
	}

	@OriginalMember(owner = "client!QIAMMSTQ", name = "b", descriptor = "()V")
	private void method432() {
		this.anInt640 += ++this.anInt641;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray162[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt639 ^= this.anInt639 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt639 ^= this.anInt639 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt639 ^= this.anInt639 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt639 ^= this.anInt639 >>> 16;
			}
			this.anInt639 += this.anIntArray162[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray162[local15] = local115 = this.anIntArray162[local22 >> 2 & 0xFF] + this.anInt639 + this.anInt640;
			this.anIntArray161[local15] = this.anInt640 = this.anIntArray162[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!QIAMMSTQ", name = "c", descriptor = "()V")
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
			this.anIntArray162[local19] = local17;
			this.anIntArray162[local19 + 1] = local16;
			this.anIntArray162[local19 + 2] = local14;
			this.anIntArray162[local19 + 3] = local12;
			this.anIntArray162[local19 + 4] = local10;
			this.anIntArray162[local19 + 5] = local8;
			this.anIntArray162[local19 + 6] = local6;
			this.anIntArray162[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray162[local19];
			local16 += this.anIntArray162[local19 + 1];
			local14 += this.anIntArray162[local19 + 2];
			local12 += this.anIntArray162[local19 + 3];
			local10 += this.anIntArray162[local19 + 4];
			local8 += this.anIntArray162[local19 + 5];
			local6 += this.anIntArray162[local19 + 6];
			local4 += this.anIntArray162[local19 + 7];
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
			this.anIntArray162[local19] = local17;
			this.anIntArray162[local19 + 1] = local16;
			this.anIntArray162[local19 + 2] = local14;
			this.anIntArray162[local19 + 3] = local12;
			this.anIntArray162[local19 + 4] = local10;
			this.anIntArray162[local19 + 5] = local8;
			this.anIntArray162[local19 + 6] = local6;
			this.anIntArray162[local19 + 7] = local4;
		}
		this.method432();
		this.anInt638 = 256;
	}
}
