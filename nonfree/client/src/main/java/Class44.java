import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class44 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([IB)V")
	public Class44(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anIntArray252 = new int[256];
			if (arg1 != 0) {
				this.anInt989 = -103;
			}
			this.anIntArray251 = new int[256];
			for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
				this.anIntArray251[local16] = arg0[local16];
			}
			this.method642();
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("31017, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "()I")
	public int method640() {
		if (this.anInt990-- == 0) {
			this.method641();
			this.anInt990 = 255;
		}
		return this.anIntArray251[this.anInt990];
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "()V")
	private void method641() {
		this.anInt992 += ++this.anInt993;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray252[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt991 ^= this.anInt991 << 13;
					break;
				case 1:
					this.anInt991 ^= this.anInt991 >>> 6;
					break;
				case 2:
					this.anInt991 ^= this.anInt991 << 2;
					break;
				case 3:
					this.anInt991 ^= this.anInt991 >>> 16;
			}
			this.anInt991 += this.anIntArray252[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray252[local15] = local101 = this.anIntArray252[local22 >> 2 & 0xFF] + this.anInt991 + this.anInt992;
			this.anIntArray251[local15] = this.anInt992 = this.anIntArray252[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()V")
	private void method642() {
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
			local17 += this.anIntArray251[local19];
			local16 += this.anIntArray251[local19 + 1];
			local14 += this.anIntArray251[local19 + 2];
			local12 += this.anIntArray251[local19 + 3];
			local10 += this.anIntArray251[local19 + 4];
			local8 += this.anIntArray251[local19 + 5];
			local6 += this.anIntArray251[local19 + 6];
			local4 += this.anIntArray251[local19 + 7];
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
			this.anIntArray252[local19] = local17;
			this.anIntArray252[local19 + 1] = local16;
			this.anIntArray252[local19 + 2] = local14;
			this.anIntArray252[local19 + 3] = local12;
			this.anIntArray252[local19 + 4] = local10;
			this.anIntArray252[local19 + 5] = local8;
			this.anIntArray252[local19 + 6] = local6;
			this.anIntArray252[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray252[local19];
			local16 += this.anIntArray252[local19 + 1];
			local14 += this.anIntArray252[local19 + 2];
			local12 += this.anIntArray252[local19 + 3];
			local10 += this.anIntArray252[local19 + 4];
			local8 += this.anIntArray252[local19 + 5];
			local6 += this.anIntArray252[local19 + 6];
			local4 += this.anIntArray252[local19 + 7];
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
			this.anIntArray252[local19] = local17;
			this.anIntArray252[local19 + 1] = local16;
			this.anIntArray252[local19 + 2] = local14;
			this.anIntArray252[local19 + 3] = local12;
			this.anIntArray252[local19 + 4] = local10;
			this.anIntArray252[local19 + 5] = local8;
			this.anIntArray252[local19 + 6] = local6;
			this.anIntArray252[local19 + 7] = local4;
		}
		this.method641();
		this.anInt990 = 256;
	}
}
