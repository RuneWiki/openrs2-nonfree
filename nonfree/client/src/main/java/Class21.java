import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KDQJDBED")
public final class Class21 {

	@OriginalMember(owner = "client!KDQJDBED", name = "a", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!KDQJDBED", name = "d", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!KDQJDBED", name = "e", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!KDQJDBED", name = "f", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!KDQJDBED", name = "c", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!KDQJDBED", name = "b", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!KDQJDBED", name = "<init>", descriptor = "([IB)V")
	public Class21(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anIntArray55 = new int[256];
			this.anIntArray54 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
				this.anIntArray54[local11] = arg0[local11];
			}
			this.method237();
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("23945, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KDQJDBED", name = "a", descriptor = "()I")
	public int method235() {
		if (this.anInt268-- == 0) {
			this.method236();
			this.anInt268 = 255;
		}
		return this.anIntArray54[this.anInt268];
	}

	@OriginalMember(owner = "client!KDQJDBED", name = "b", descriptor = "()V")
	private void method236() {
		this.anInt270 += ++this.anInt271;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray55[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt269 ^= this.anInt269 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt269 ^= this.anInt269 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt269 ^= this.anInt269 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt269 ^= this.anInt269 >>> 16;
			}
			this.anInt269 += this.anIntArray55[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray55[local15] = local115 = this.anIntArray55[local22 >> 2 & 0xFF] + this.anInt269 + this.anInt270;
			this.anIntArray54[local15] = this.anInt270 = this.anIntArray55[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!KDQJDBED", name = "c", descriptor = "()V")
	private void method237() {
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
			local17 += this.anIntArray54[local19];
			local16 += this.anIntArray54[local19 + 1];
			local14 += this.anIntArray54[local19 + 2];
			local12 += this.anIntArray54[local19 + 3];
			local10 += this.anIntArray54[local19 + 4];
			local8 += this.anIntArray54[local19 + 5];
			local6 += this.anIntArray54[local19 + 6];
			local4 += this.anIntArray54[local19 + 7];
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
			this.anIntArray55[local19] = local17;
			this.anIntArray55[local19 + 1] = local16;
			this.anIntArray55[local19 + 2] = local14;
			this.anIntArray55[local19 + 3] = local12;
			this.anIntArray55[local19 + 4] = local10;
			this.anIntArray55[local19 + 5] = local8;
			this.anIntArray55[local19 + 6] = local6;
			this.anIntArray55[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray55[local19];
			local16 += this.anIntArray55[local19 + 1];
			local14 += this.anIntArray55[local19 + 2];
			local12 += this.anIntArray55[local19 + 3];
			local10 += this.anIntArray55[local19 + 4];
			local8 += this.anIntArray55[local19 + 5];
			local6 += this.anIntArray55[local19 + 6];
			local4 += this.anIntArray55[local19 + 7];
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
			this.anIntArray55[local19] = local17;
			this.anIntArray55[local19 + 1] = local16;
			this.anIntArray55[local19 + 2] = local14;
			this.anIntArray55[local19 + 3] = local12;
			this.anIntArray55[local19 + 4] = local10;
			this.anIntArray55[local19 + 5] = local8;
			this.anIntArray55[local19 + 6] = local6;
			this.anIntArray55[local19 + 7] = local4;
		}
		this.method236();
		this.anInt268 = 256;
	}
}
