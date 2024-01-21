import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt983 = 47689;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(Z[I)V")
	public Class47(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray276 = new int[256];
			this.anIntArray275 = new int[256];
			for (@Pc(19) int local19 = 0; local19 < arg1.length; local19++) {
				this.anIntArray275[local19] = arg1[local19];
			}
			this.method687();
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("40485, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "()I")
	public int method685() {
		if (this.anInt984-- == 0) {
			this.method686();
			this.anInt984 = 255;
		}
		return this.anIntArray275[this.anInt984];
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "()V")
	private void method686() {
		this.anInt986 += ++this.anInt987;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray276[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt985 ^= this.anInt985 << 13;
					break;
				case 1:
					this.anInt985 ^= this.anInt985 >>> 6;
					break;
				case 2:
					this.anInt985 ^= this.anInt985 << 2;
					break;
				case 3:
					this.anInt985 ^= this.anInt985 >>> 16;
			}
			this.anInt985 += this.anIntArray276[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray276[local15] = local101 = this.anIntArray276[local22 >> 2 & 0xFF] + this.anInt985 + this.anInt986;
			this.anIntArray275[local15] = this.anInt986 = this.anIntArray276[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()V")
	private void method687() {
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
			local17 += this.anIntArray275[local19];
			local16 += this.anIntArray275[local19 + 1];
			local14 += this.anIntArray275[local19 + 2];
			local12 += this.anIntArray275[local19 + 3];
			local10 += this.anIntArray275[local19 + 4];
			local8 += this.anIntArray275[local19 + 5];
			local6 += this.anIntArray275[local19 + 6];
			local4 += this.anIntArray275[local19 + 7];
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
			this.anIntArray276[local19] = local17;
			this.anIntArray276[local19 + 1] = local16;
			this.anIntArray276[local19 + 2] = local14;
			this.anIntArray276[local19 + 3] = local12;
			this.anIntArray276[local19 + 4] = local10;
			this.anIntArray276[local19 + 5] = local8;
			this.anIntArray276[local19 + 6] = local6;
			this.anIntArray276[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray276[local19];
			local16 += this.anIntArray276[local19 + 1];
			local14 += this.anIntArray276[local19 + 2];
			local12 += this.anIntArray276[local19 + 3];
			local10 += this.anIntArray276[local19 + 4];
			local8 += this.anIntArray276[local19 + 5];
			local6 += this.anIntArray276[local19 + 6];
			local4 += this.anIntArray276[local19 + 7];
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
			this.anIntArray276[local19] = local17;
			this.anIntArray276[local19 + 1] = local16;
			this.anIntArray276[local19 + 2] = local14;
			this.anIntArray276[local19 + 3] = local12;
			this.anIntArray276[local19 + 4] = local10;
			this.anIntArray276[local19 + 5] = local8;
			this.anIntArray276[local19 + 6] = local6;
			this.anIntArray276[local19 + 7] = local4;
		}
		this.method686();
		this.anInt984 = 256;
	}
}
