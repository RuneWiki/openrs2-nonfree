import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VZIKSEDY")
public final class Class45 {

	@OriginalMember(owner = "client!VZIKSEDY", name = "a", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!VZIKSEDY", name = "d", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!VZIKSEDY", name = "e", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!VZIKSEDY", name = "f", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!VZIKSEDY", name = "c", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!VZIKSEDY", name = "b", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!VZIKSEDY", name = "<init>", descriptor = "([II)V")
	public Class45(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray164 = new int[256];
			this.anIntArray163 = new int[256];
			for (@Pc(17) int local17 = 0; local17 < arg0.length; local17++) {
				this.anIntArray163[local17] = arg0[local17];
			}
			this.method478();
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("1592, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZIKSEDY", name = "a", descriptor = "()I")
	public int method476() {
		if (this.anInt709-- == 0) {
			this.method477();
			this.anInt709 = 255;
		}
		return this.anIntArray163[this.anInt709];
	}

	@OriginalMember(owner = "client!VZIKSEDY", name = "b", descriptor = "()V")
	private void method477() {
		this.anInt711 += ++this.anInt712;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray164[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt710 ^= this.anInt710 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt710 ^= this.anInt710 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt710 ^= this.anInt710 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt710 ^= this.anInt710 >>> 16;
			}
			this.anInt710 += this.anIntArray164[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray164[local15] = local115 = this.anIntArray164[local22 >> 2 & 0xFF] + this.anInt710 + this.anInt711;
			this.anIntArray163[local15] = this.anInt711 = this.anIntArray164[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!VZIKSEDY", name = "c", descriptor = "()V")
	private void method478() {
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
			local17 += this.anIntArray163[local19];
			local16 += this.anIntArray163[local19 + 1];
			local14 += this.anIntArray163[local19 + 2];
			local12 += this.anIntArray163[local19 + 3];
			local10 += this.anIntArray163[local19 + 4];
			local8 += this.anIntArray163[local19 + 5];
			local6 += this.anIntArray163[local19 + 6];
			local4 += this.anIntArray163[local19 + 7];
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
			this.anIntArray164[local19] = local17;
			this.anIntArray164[local19 + 1] = local16;
			this.anIntArray164[local19 + 2] = local14;
			this.anIntArray164[local19 + 3] = local12;
			this.anIntArray164[local19 + 4] = local10;
			this.anIntArray164[local19 + 5] = local8;
			this.anIntArray164[local19 + 6] = local6;
			this.anIntArray164[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray164[local19];
			local16 += this.anIntArray164[local19 + 1];
			local14 += this.anIntArray164[local19 + 2];
			local12 += this.anIntArray164[local19 + 3];
			local10 += this.anIntArray164[local19 + 4];
			local8 += this.anIntArray164[local19 + 5];
			local6 += this.anIntArray164[local19 + 6];
			local4 += this.anIntArray164[local19 + 7];
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
			this.anIntArray164[local19] = local17;
			this.anIntArray164[local19 + 1] = local16;
			this.anIntArray164[local19 + 2] = local14;
			this.anIntArray164[local19 + 3] = local12;
			this.anIntArray164[local19 + 4] = local10;
			this.anIntArray164[local19 + 5] = local8;
			this.anIntArray164[local19 + 6] = local6;
			this.anIntArray164[local19 + 7] = local4;
		}
		this.method477();
		this.anInt709 = 256;
	}
}
