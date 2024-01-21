import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class33 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private int anInt1680;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt1682;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	private int anInt1685;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	private int anInt1687;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
	private final int[] anIntArray195 = new int[256];

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
	private final int[] anIntArray196 = new int[256];

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
	public Class33(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray196[local11] = arg0[local11];
		}
		this.method1046();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public int method1045() {
		if (this.anInt1682-- == 0) {
			this.method1048();
			this.anInt1682 = 255;
		}
		return this.anIntArray196[this.anInt1682];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	private void method1046() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(25) int local25;
		for (local25 = 0; local25 < 4; local25++) {
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
		}
		for (local25 = 0; local25 < 256; local25 += 8) {
			local18 += this.anIntArray196[local25 + 1];
			local8 += this.anIntArray196[local25 + 6];
			local14 += this.anIntArray196[local25 + 3];
			local6 += this.anIntArray196[local25 + 7];
			local12 += this.anIntArray196[local25 + 4];
			local10 += this.anIntArray196[local25 + 5];
			local19 += this.anIntArray196[local25];
			local19 ^= local18 << 11;
			local16 += this.anIntArray196[local25 + 2];
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local8 ^= local6 << 8;
			local19 += local10;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray195[local25] = local19;
			this.anIntArray195[local25 + 1] = local18;
			this.anIntArray195[local25 + 2] = local16;
			this.anIntArray195[local25 + 3] = local14;
			this.anIntArray195[local25 + 4] = local12;
			this.anIntArray195[local25 + 5] = local10;
			this.anIntArray195[local25 + 6] = local8;
			this.anIntArray195[local25 + 7] = local6;
		}
		for (local25 = 0; local25 < 256; local25 += 8) {
			local14 += this.anIntArray195[local25 + 3];
			local12 += this.anIntArray195[local25 + 4];
			local8 += this.anIntArray195[local25 + 6];
			local19 += this.anIntArray195[local25];
			local18 += this.anIntArray195[local25 + 1];
			local6 += this.anIntArray195[local25 + 7];
			local16 += this.anIntArray195[local25 + 2];
			local10 += this.anIntArray195[local25 + 5];
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local16 ^= local14 << 8;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local8 ^= local6 << 8;
			local19 += local10;
			local18 += local8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray195[local25] = local19;
			this.anIntArray195[local25 + 1] = local18;
			this.anIntArray195[local25 + 2] = local16;
			this.anIntArray195[local25 + 3] = local14;
			this.anIntArray195[local25 + 4] = local12;
			this.anIntArray195[local25 + 5] = local10;
			this.anIntArray195[local25 + 6] = local8;
			this.anIntArray195[local25 + 7] = local6;
		}
		this.method1048();
		this.anInt1682 = 256;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	private void method1048() {
		this.anInt1680 += ++this.anInt1687;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(31) int local31 = this.anIntArray195[local17];
			if ((local17 & 0x2) == 0) {
				if ((local17 & 0x1) == 0) {
					this.anInt1685 ^= this.anInt1685 << 13;
				} else {
					this.anInt1685 ^= this.anInt1685 >>> 6;
				}
			} else if ((local17 & 0x1) == 0) {
				this.anInt1685 ^= this.anInt1685 << 2;
			} else {
				this.anInt1685 ^= this.anInt1685 >>> 16;
			}
			this.anInt1685 += this.anIntArray195[local17 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray195[local17] = local120 = this.anInt1685 + this.anIntArray195[local31 >> 2 & 0xFF] + this.anInt1680;
			this.anIntArray196[local17] = this.anInt1680 = this.anIntArray195[local120 >> 8 >> 2 & 0xFF] + local31;
		}
	}
}
