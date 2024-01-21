import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JLGPBSNA")
public final class Class18 {

	@OriginalMember(owner = "client!JLGPBSNA", name = "b", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!JLGPBSNA", name = "e", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!JLGPBSNA", name = "f", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!JLGPBSNA", name = "g", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!JLGPBSNA", name = "a", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!JLGPBSNA", name = "d", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!JLGPBSNA", name = "c", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!JLGPBSNA", name = "<init>", descriptor = "([II)V")
	public Class18(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray61 = new int[256];
			this.anIntArray60 = new int[256];
			for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
				this.anIntArray60[local14] = arg0[local14];
			}
			this.method157();
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("84149, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLGPBSNA", name = "a", descriptor = "()I")
	public int method155() {
		if (this.anInt333-- == 0) {
			this.method156();
			this.anInt333 = 255;
		}
		return this.anIntArray60[this.anInt333];
	}

	@OriginalMember(owner = "client!JLGPBSNA", name = "b", descriptor = "()V")
	private void method156() {
		this.anInt335 += ++this.anInt336;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray61[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt334 ^= this.anInt334 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt334 ^= this.anInt334 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt334 ^= this.anInt334 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt334 ^= this.anInt334 >>> 16;
			}
			this.anInt334 += this.anIntArray61[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray61[local15] = local115 = this.anIntArray61[local22 >> 2 & 0xFF] + this.anInt334 + this.anInt335;
			this.anIntArray60[local15] = this.anInt335 = this.anIntArray61[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!JLGPBSNA", name = "c", descriptor = "()V")
	private void method157() {
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
			local17 += this.anIntArray60[local19];
			local16 += this.anIntArray60[local19 + 1];
			local14 += this.anIntArray60[local19 + 2];
			local12 += this.anIntArray60[local19 + 3];
			local10 += this.anIntArray60[local19 + 4];
			local8 += this.anIntArray60[local19 + 5];
			local6 += this.anIntArray60[local19 + 6];
			local4 += this.anIntArray60[local19 + 7];
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
			this.anIntArray61[local19] = local17;
			this.anIntArray61[local19 + 1] = local16;
			this.anIntArray61[local19 + 2] = local14;
			this.anIntArray61[local19 + 3] = local12;
			this.anIntArray61[local19 + 4] = local10;
			this.anIntArray61[local19 + 5] = local8;
			this.anIntArray61[local19 + 6] = local6;
			this.anIntArray61[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray61[local19];
			local16 += this.anIntArray61[local19 + 1];
			local14 += this.anIntArray61[local19 + 2];
			local12 += this.anIntArray61[local19 + 3];
			local10 += this.anIntArray61[local19 + 4];
			local8 += this.anIntArray61[local19 + 5];
			local6 += this.anIntArray61[local19 + 6];
			local4 += this.anIntArray61[local19 + 7];
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
			this.anIntArray61[local19] = local17;
			this.anIntArray61[local19 + 1] = local16;
			this.anIntArray61[local19 + 2] = local14;
			this.anIntArray61[local19 + 3] = local12;
			this.anIntArray61[local19 + 4] = local10;
			this.anIntArray61[local19 + 5] = local8;
			this.anIntArray61[local19 + 6] = local6;
			this.anIntArray61[local19 + 7] = local4;
		}
		this.method156();
		this.anInt333 = 256;
	}
}
