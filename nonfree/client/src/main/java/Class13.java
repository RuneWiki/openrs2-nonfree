import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ENXSCLLS")
public final class Class13 {

	@OriginalMember(owner = "client!ENXSCLLS", name = "a", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!ENXSCLLS", name = "d", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!ENXSCLLS", name = "e", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!ENXSCLLS", name = "f", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!ENXSCLLS", name = "c", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!ENXSCLLS", name = "b", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!ENXSCLLS", name = "<init>", descriptor = "(I[I)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray30 = new int[256];
			this.anIntArray29 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
				this.anIntArray29[local11] = arg1[local11];
			}
			this.method83();
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("53288, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENXSCLLS", name = "a", descriptor = "()I")
	public int method81() {
		if (this.anInt197-- == 0) {
			this.method82();
			this.anInt197 = 255;
		}
		return this.anIntArray29[this.anInt197];
	}

	@OriginalMember(owner = "client!ENXSCLLS", name = "b", descriptor = "()V")
	private void method82() {
		this.anInt199 += ++this.anInt200;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray30[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt198 ^= this.anInt198 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt198 ^= this.anInt198 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt198 ^= this.anInt198 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt198 ^= this.anInt198 >>> 16;
			}
			this.anInt198 += this.anIntArray30[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray30[local15] = local115 = this.anIntArray30[local22 >> 2 & 0xFF] + this.anInt198 + this.anInt199;
			this.anIntArray29[local15] = this.anInt199 = this.anIntArray30[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!ENXSCLLS", name = "c", descriptor = "()V")
	private void method83() {
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
			local17 += this.anIntArray29[local19];
			local16 += this.anIntArray29[local19 + 1];
			local14 += this.anIntArray29[local19 + 2];
			local12 += this.anIntArray29[local19 + 3];
			local10 += this.anIntArray29[local19 + 4];
			local8 += this.anIntArray29[local19 + 5];
			local6 += this.anIntArray29[local19 + 6];
			local4 += this.anIntArray29[local19 + 7];
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
			this.anIntArray30[local19] = local17;
			this.anIntArray30[local19 + 1] = local16;
			this.anIntArray30[local19 + 2] = local14;
			this.anIntArray30[local19 + 3] = local12;
			this.anIntArray30[local19 + 4] = local10;
			this.anIntArray30[local19 + 5] = local8;
			this.anIntArray30[local19 + 6] = local6;
			this.anIntArray30[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray30[local19];
			local16 += this.anIntArray30[local19 + 1];
			local14 += this.anIntArray30[local19 + 2];
			local12 += this.anIntArray30[local19 + 3];
			local10 += this.anIntArray30[local19 + 4];
			local8 += this.anIntArray30[local19 + 5];
			local6 += this.anIntArray30[local19 + 6];
			local4 += this.anIntArray30[local19 + 7];
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
			this.anIntArray30[local19] = local17;
			this.anIntArray30[local19 + 1] = local16;
			this.anIntArray30[local19 + 2] = local14;
			this.anIntArray30[local19 + 3] = local12;
			this.anIntArray30[local19 + 4] = local10;
			this.anIntArray30[local19 + 5] = local8;
			this.anIntArray30[local19 + 6] = local6;
			this.anIntArray30[local19 + 7] = local4;
		}
		this.method82();
		this.anInt197 = 256;
	}
}
