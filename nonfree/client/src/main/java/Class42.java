import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WUYFIEBK")
public final class Class42 {

	@OriginalMember(owner = "client!WUYFIEBK", name = "a", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!WUYFIEBK", name = "d", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!WUYFIEBK", name = "e", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!WUYFIEBK", name = "f", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!WUYFIEBK", name = "c", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!WUYFIEBK", name = "b", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!WUYFIEBK", name = "<init>", descriptor = "(I[I)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray195 = new int[256];
			this.anIntArray194 = new int[256];
			for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
				this.anIntArray194[local11] = arg1[local11];
			}
			this.method516();
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("21915, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WUYFIEBK", name = "a", descriptor = "()I")
	public int method514() {
		if (this.anInt732-- == 0) {
			this.method515();
			this.anInt732 = 255;
		}
		return this.anIntArray194[this.anInt732];
	}

	@OriginalMember(owner = "client!WUYFIEBK", name = "b", descriptor = "()V")
	private void method515() {
		this.anInt734 += ++this.anInt735;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray195[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt733 ^= this.anInt733 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt733 ^= this.anInt733 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt733 ^= this.anInt733 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt733 ^= this.anInt733 >>> 16;
			}
			this.anInt733 += this.anIntArray195[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray195[local15] = local115 = this.anIntArray195[local22 >> 2 & 0xFF] + this.anInt733 + this.anInt734;
			this.anIntArray194[local15] = this.anInt734 = this.anIntArray195[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!WUYFIEBK", name = "c", descriptor = "()V")
	private void method516() {
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
			this.anIntArray195[local19] = local17;
			this.anIntArray195[local19 + 1] = local16;
			this.anIntArray195[local19 + 2] = local14;
			this.anIntArray195[local19 + 3] = local12;
			this.anIntArray195[local19 + 4] = local10;
			this.anIntArray195[local19 + 5] = local8;
			this.anIntArray195[local19 + 6] = local6;
			this.anIntArray195[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray195[local19];
			local16 += this.anIntArray195[local19 + 1];
			local14 += this.anIntArray195[local19 + 2];
			local12 += this.anIntArray195[local19 + 3];
			local10 += this.anIntArray195[local19 + 4];
			local8 += this.anIntArray195[local19 + 5];
			local6 += this.anIntArray195[local19 + 6];
			local4 += this.anIntArray195[local19 + 7];
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
			this.anIntArray195[local19] = local17;
			this.anIntArray195[local19 + 1] = local16;
			this.anIntArray195[local19 + 2] = local14;
			this.anIntArray195[local19 + 3] = local12;
			this.anIntArray195[local19 + 4] = local10;
			this.anIntArray195[local19 + 5] = local8;
			this.anIntArray195[local19 + 6] = local6;
			this.anIntArray195[local19 + 7] = local4;
		}
		this.method515();
		this.anInt732 = 256;
	}
}
