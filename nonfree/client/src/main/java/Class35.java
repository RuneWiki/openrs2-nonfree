import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!tb")
public final class Class35 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Z[I)V")
	public Class35(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray194 = new int[256];
			this.anIntArray193 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
				this.anIntArray193[local11] = arg1[local11];
			}
			this.method477();
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("84854, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
	public int method475() {
		if (this.anInt602-- == 0) {
			this.method476();
			this.anInt602 = 255;
		}
		return this.anIntArray193[this.anInt602];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	private void method476() {
		try {
			this.anInt604 += ++this.anInt605;
			for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
				@Pc(26) int local26 = this.anIntArray194[local19];
				switch(local19 & 0x3) {
					case 0:
						this.anInt603 ^= this.anInt603 << 13;
						break;
					case 1:
						this.anInt603 ^= this.anInt603 >>> 6;
						break;
					case 2:
						this.anInt603 ^= this.anInt603 << 2;
						break;
					case 3:
						this.anInt603 ^= this.anInt603 >>> 16;
				}
				this.anInt603 += this.anIntArray194[local19 + 128 & 0xFF];
				@Pc(105) int local105;
				this.anIntArray194[local19] = local105 = this.anIntArray194[local26 >> 2 & 0xFF] + this.anInt603 + this.anInt604;
				this.anIntArray193[local19] = this.anInt604 = this.anIntArray194[local105 >> 8 >> 2 & 0xFF] + local26;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("77408, " + -23795 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
	private void method477() {
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
			local17 += this.anIntArray193[local19];
			local16 += this.anIntArray193[local19 + 1];
			local14 += this.anIntArray193[local19 + 2];
			local12 += this.anIntArray193[local19 + 3];
			local10 += this.anIntArray193[local19 + 4];
			local8 += this.anIntArray193[local19 + 5];
			local6 += this.anIntArray193[local19 + 6];
			local4 += this.anIntArray193[local19 + 7];
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
			this.anIntArray194[local19] = local17;
			this.anIntArray194[local19 + 1] = local16;
			this.anIntArray194[local19 + 2] = local14;
			this.anIntArray194[local19 + 3] = local12;
			this.anIntArray194[local19 + 4] = local10;
			this.anIntArray194[local19 + 5] = local8;
			this.anIntArray194[local19 + 6] = local6;
			this.anIntArray194[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray194[local19];
			local16 += this.anIntArray194[local19 + 1];
			local14 += this.anIntArray194[local19 + 2];
			local12 += this.anIntArray194[local19 + 3];
			local10 += this.anIntArray194[local19 + 4];
			local8 += this.anIntArray194[local19 + 5];
			local6 += this.anIntArray194[local19 + 6];
			local4 += this.anIntArray194[local19 + 7];
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
			this.anIntArray194[local19] = local17;
			this.anIntArray194[local19 + 1] = local16;
			this.anIntArray194[local19 + 2] = local14;
			this.anIntArray194[local19 + 3] = local12;
			this.anIntArray194[local19 + 4] = local10;
			this.anIntArray194[local19 + 5] = local8;
			this.anIntArray194[local19 + 6] = local6;
			this.anIntArray194[local19 + 7] = local4;
		}
		this.method476();
		this.anInt602 = 256;
	}
}
