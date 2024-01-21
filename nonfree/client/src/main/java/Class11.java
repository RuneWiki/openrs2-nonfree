import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GOLMSHHL")
public final class Class11 {

	@OriginalMember(owner = "client!GOLMSHHL", name = "a", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!GOLMSHHL", name = "d", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!GOLMSHHL", name = "e", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!GOLMSHHL", name = "f", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!GOLMSHHL", name = "c", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!GOLMSHHL", name = "b", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!GOLMSHHL", name = "<init>", descriptor = "([II)V")
	public Class11(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 53 / arg1;
			this.anIntArray44 = new int[256];
			this.anIntArray43 = new int[256];
			for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
				this.anIntArray43[local15] = arg0[local15];
			}
			this.method177();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("12511, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOLMSHHL", name = "a", descriptor = "()I")
	public int method175() {
		if (this.anInt202-- == 0) {
			this.method176();
			this.anInt202 = 255;
		}
		return this.anIntArray43[this.anInt202];
	}

	@OriginalMember(owner = "client!GOLMSHHL", name = "b", descriptor = "()V")
	private void method176() {
		this.anInt204 += ++this.anInt205;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray44[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt203 ^= this.anInt203 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt203 ^= this.anInt203 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt203 ^= this.anInt203 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt203 ^= this.anInt203 >>> 16;
			}
			this.anInt203 += this.anIntArray44[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray44[local15] = local115 = this.anIntArray44[local22 >> 2 & 0xFF] + this.anInt203 + this.anInt204;
			this.anIntArray43[local15] = this.anInt204 = this.anIntArray44[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!GOLMSHHL", name = "c", descriptor = "()V")
	private void method177() {
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
			local17 += this.anIntArray43[local19];
			local16 += this.anIntArray43[local19 + 1];
			local14 += this.anIntArray43[local19 + 2];
			local12 += this.anIntArray43[local19 + 3];
			local10 += this.anIntArray43[local19 + 4];
			local8 += this.anIntArray43[local19 + 5];
			local6 += this.anIntArray43[local19 + 6];
			local4 += this.anIntArray43[local19 + 7];
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
			this.anIntArray44[local19] = local17;
			this.anIntArray44[local19 + 1] = local16;
			this.anIntArray44[local19 + 2] = local14;
			this.anIntArray44[local19 + 3] = local12;
			this.anIntArray44[local19 + 4] = local10;
			this.anIntArray44[local19 + 5] = local8;
			this.anIntArray44[local19 + 6] = local6;
			this.anIntArray44[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray44[local19];
			local16 += this.anIntArray44[local19 + 1];
			local14 += this.anIntArray44[local19 + 2];
			local12 += this.anIntArray44[local19 + 3];
			local10 += this.anIntArray44[local19 + 4];
			local8 += this.anIntArray44[local19 + 5];
			local6 += this.anIntArray44[local19 + 6];
			local4 += this.anIntArray44[local19 + 7];
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
			this.anIntArray44[local19] = local17;
			this.anIntArray44[local19 + 1] = local16;
			this.anIntArray44[local19 + 2] = local14;
			this.anIntArray44[local19 + 3] = local12;
			this.anIntArray44[local19 + 4] = local10;
			this.anIntArray44[local19 + 5] = local8;
			this.anIntArray44[local19 + 6] = local6;
			this.anIntArray44[local19 + 7] = local4;
		}
		this.method176();
		this.anInt202 = 256;
	}
}
