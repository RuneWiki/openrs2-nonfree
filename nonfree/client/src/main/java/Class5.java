import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BPJMPIUS")
public final class Class5 {

	@OriginalMember(owner = "client!BPJMPIUS", name = "a", descriptor = "I")
	private int anInt77;

	@OriginalMember(owner = "client!BPJMPIUS", name = "d", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!BPJMPIUS", name = "e", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!BPJMPIUS", name = "f", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!BPJMPIUS", name = "c", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!BPJMPIUS", name = "b", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!BPJMPIUS", name = "<init>", descriptor = "(B[I)V")
	public Class5(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray11 = new int[256];
			this.anIntArray10 = new int[256];
			for (@Pc(23) int local23 = 0; local23 < arg1.length; local23++) {
				this.anIntArray10[local23] = arg1[local23];
			}
			this.method31();
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("46392, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPJMPIUS", name = "a", descriptor = "()I")
	public int method29() {
		if (this.anInt77-- == 0) {
			this.method30();
			this.anInt77 = 255;
		}
		return this.anIntArray10[this.anInt77];
	}

	@OriginalMember(owner = "client!BPJMPIUS", name = "b", descriptor = "()V")
	private void method30() {
		this.anInt79 += ++this.anInt80;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray11[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt78 ^= this.anInt78 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt78 ^= this.anInt78 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt78 ^= this.anInt78 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt78 ^= this.anInt78 >>> 16;
			}
			this.anInt78 += this.anIntArray11[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray11[local15] = local115 = this.anIntArray11[local22 >> 2 & 0xFF] + this.anInt78 + this.anInt79;
			this.anIntArray10[local15] = this.anInt79 = this.anIntArray11[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!BPJMPIUS", name = "c", descriptor = "()V")
	private void method31() {
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
			local17 += this.anIntArray10[local19];
			local16 += this.anIntArray10[local19 + 1];
			local14 += this.anIntArray10[local19 + 2];
			local12 += this.anIntArray10[local19 + 3];
			local10 += this.anIntArray10[local19 + 4];
			local8 += this.anIntArray10[local19 + 5];
			local6 += this.anIntArray10[local19 + 6];
			local4 += this.anIntArray10[local19 + 7];
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
			this.anIntArray11[local19] = local17;
			this.anIntArray11[local19 + 1] = local16;
			this.anIntArray11[local19 + 2] = local14;
			this.anIntArray11[local19 + 3] = local12;
			this.anIntArray11[local19 + 4] = local10;
			this.anIntArray11[local19 + 5] = local8;
			this.anIntArray11[local19 + 6] = local6;
			this.anIntArray11[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray11[local19];
			local16 += this.anIntArray11[local19 + 1];
			local14 += this.anIntArray11[local19 + 2];
			local12 += this.anIntArray11[local19 + 3];
			local10 += this.anIntArray11[local19 + 4];
			local8 += this.anIntArray11[local19 + 5];
			local6 += this.anIntArray11[local19 + 6];
			local4 += this.anIntArray11[local19 + 7];
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
			this.anIntArray11[local19] = local17;
			this.anIntArray11[local19 + 1] = local16;
			this.anIntArray11[local19 + 2] = local14;
			this.anIntArray11[local19 + 3] = local12;
			this.anIntArray11[local19 + 4] = local10;
			this.anIntArray11[local19 + 5] = local8;
			this.anIntArray11[local19 + 6] = local6;
			this.anIntArray11[local19 + 7] = local4;
		}
		this.method30();
		this.anInt77 = 256;
	}
}
