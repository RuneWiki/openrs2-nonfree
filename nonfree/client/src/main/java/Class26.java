import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NIUUCTKL")
public final class Class26 {

	@OriginalMember(owner = "client!NIUUCTKL", name = "b", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!NIUUCTKL", name = "e", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!NIUUCTKL", name = "f", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!NIUUCTKL", name = "g", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!NIUUCTKL", name = "a", descriptor = "I")
	private int anInt319 = -34883;

	@OriginalMember(owner = "client!NIUUCTKL", name = "d", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!NIUUCTKL", name = "c", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!NIUUCTKL", name = "<init>", descriptor = "(I[I)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray102 = new int[256];
			this.anIntArray101 = new int[256];
			for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
				this.anIntArray101[local14] = arg1[local14];
			}
			this.method324();
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("61578, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIUUCTKL", name = "a", descriptor = "()I")
	public int method322() {
		if (this.anInt320-- == 0) {
			this.method323();
			this.anInt320 = 255;
		}
		return this.anIntArray101[this.anInt320];
	}

	@OriginalMember(owner = "client!NIUUCTKL", name = "b", descriptor = "()V")
	private void method323() {
		this.anInt322 += ++this.anInt323;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray102[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt321 ^= this.anInt321 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt321 ^= this.anInt321 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt321 ^= this.anInt321 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt321 ^= this.anInt321 >>> 16;
			}
			this.anInt321 += this.anIntArray102[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray102[local15] = local115 = this.anIntArray102[local22 >> 2 & 0xFF] + this.anInt321 + this.anInt322;
			this.anIntArray101[local15] = this.anInt322 = this.anIntArray102[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!NIUUCTKL", name = "c", descriptor = "()V")
	private void method324() {
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
			local17 += this.anIntArray101[local19];
			local16 += this.anIntArray101[local19 + 1];
			local14 += this.anIntArray101[local19 + 2];
			local12 += this.anIntArray101[local19 + 3];
			local10 += this.anIntArray101[local19 + 4];
			local8 += this.anIntArray101[local19 + 5];
			local6 += this.anIntArray101[local19 + 6];
			local4 += this.anIntArray101[local19 + 7];
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
			this.anIntArray102[local19] = local17;
			this.anIntArray102[local19 + 1] = local16;
			this.anIntArray102[local19 + 2] = local14;
			this.anIntArray102[local19 + 3] = local12;
			this.anIntArray102[local19 + 4] = local10;
			this.anIntArray102[local19 + 5] = local8;
			this.anIntArray102[local19 + 6] = local6;
			this.anIntArray102[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray102[local19];
			local16 += this.anIntArray102[local19 + 1];
			local14 += this.anIntArray102[local19 + 2];
			local12 += this.anIntArray102[local19 + 3];
			local10 += this.anIntArray102[local19 + 4];
			local8 += this.anIntArray102[local19 + 5];
			local6 += this.anIntArray102[local19 + 6];
			local4 += this.anIntArray102[local19 + 7];
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
			this.anIntArray102[local19] = local17;
			this.anIntArray102[local19 + 1] = local16;
			this.anIntArray102[local19 + 2] = local14;
			this.anIntArray102[local19 + 3] = local12;
			this.anIntArray102[local19 + 4] = local10;
			this.anIntArray102[local19 + 5] = local8;
			this.anIntArray102[local19 + 6] = local6;
			this.anIntArray102[local19 + 7] = local4;
		}
		this.method323();
		this.anInt320 = 256;
	}
}
