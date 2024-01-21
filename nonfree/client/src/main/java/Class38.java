import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!tb")
public final class Class38 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([II)V")
	public Class38(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray220 = new int[256];
			if (arg1 < this.anInt772 || arg1 > this.anInt772) {
				this.anInt772 = -37;
			}
			this.anIntArray219 = new int[256];
			for (@Pc(22) int local22 = 0; local22 < arg0.length; local22++) {
				this.anIntArray219[local22] = arg0[local22];
			}
			this.method526();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("65266, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
	public int method524() {
		if (this.anInt773-- == 0) {
			this.method525();
			this.anInt773 = 255;
		}
		return this.anIntArray219[this.anInt773];
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
	private void method525() {
		this.anInt775 += ++this.anInt776;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray220[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt774 ^= this.anInt774 << 13;
					break;
				case 1:
					this.anInt774 ^= this.anInt774 >>> 6;
					break;
				case 2:
					this.anInt774 ^= this.anInt774 << 2;
					break;
				case 3:
					this.anInt774 ^= this.anInt774 >>> 16;
			}
			this.anInt774 += this.anIntArray220[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray220[local15] = local101 = this.anIntArray220[local22 >> 2 & 0xFF] + this.anInt774 + this.anInt775;
			this.anIntArray219[local15] = this.anInt775 = this.anIntArray220[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	private void method526() {
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
			local17 += this.anIntArray219[local19];
			local16 += this.anIntArray219[local19 + 1];
			local14 += this.anIntArray219[local19 + 2];
			local12 += this.anIntArray219[local19 + 3];
			local10 += this.anIntArray219[local19 + 4];
			local8 += this.anIntArray219[local19 + 5];
			local6 += this.anIntArray219[local19 + 6];
			local4 += this.anIntArray219[local19 + 7];
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
			this.anIntArray220[local19] = local17;
			this.anIntArray220[local19 + 1] = local16;
			this.anIntArray220[local19 + 2] = local14;
			this.anIntArray220[local19 + 3] = local12;
			this.anIntArray220[local19 + 4] = local10;
			this.anIntArray220[local19 + 5] = local8;
			this.anIntArray220[local19 + 6] = local6;
			this.anIntArray220[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray220[local19];
			local16 += this.anIntArray220[local19 + 1];
			local14 += this.anIntArray220[local19 + 2];
			local12 += this.anIntArray220[local19 + 3];
			local10 += this.anIntArray220[local19 + 4];
			local8 += this.anIntArray220[local19 + 5];
			local6 += this.anIntArray220[local19 + 6];
			local4 += this.anIntArray220[local19 + 7];
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
			this.anIntArray220[local19] = local17;
			this.anIntArray220[local19 + 1] = local16;
			this.anIntArray220[local19 + 2] = local14;
			this.anIntArray220[local19 + 3] = local12;
			this.anIntArray220[local19 + 4] = local10;
			this.anIntArray220[local19 + 5] = local8;
			this.anIntArray220[local19 + 6] = local6;
			this.anIntArray220[local19 + 7] = local4;
		}
		this.method525();
		this.anInt773 = 256;
	}
}
