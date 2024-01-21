import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class45 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([II)V")
	public Class45(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray265 = new int[256];
			this.anIntArray264 = new int[256];
			for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
				this.anIntArray264[local13] = arg0[local13];
			}
			this.method672();
			if (arg1 <= 0) {
				for (@Pc(33) int local33 = 1; local33 > 0; local33++) {
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24307, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "()I")
	public int method670() {
		if (this.anInt1005-- == 0) {
			this.method671();
			this.anInt1005 = 255;
		}
		return this.anIntArray264[this.anInt1005];
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "()V")
	private void method671() {
		this.anInt1007 += ++this.anInt1008;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray265[local15];
			switch(local15 & 0x3) {
				case 0:
					this.anInt1006 ^= this.anInt1006 << 13;
					break;
				case 1:
					this.anInt1006 ^= this.anInt1006 >>> 6;
					break;
				case 2:
					this.anInt1006 ^= this.anInt1006 << 2;
					break;
				case 3:
					this.anInt1006 ^= this.anInt1006 >>> 16;
			}
			this.anInt1006 += this.anIntArray265[local15 + 128 & 0xFF];
			@Pc(101) int local101;
			this.anIntArray265[local15] = local101 = this.anIntArray265[local22 >> 2 & 0xFF] + this.anInt1006 + this.anInt1007;
			this.anIntArray264[local15] = this.anInt1007 = this.anIntArray265[local101 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()V")
	private void method672() {
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
			local17 += this.anIntArray264[local19];
			local16 += this.anIntArray264[local19 + 1];
			local14 += this.anIntArray264[local19 + 2];
			local12 += this.anIntArray264[local19 + 3];
			local10 += this.anIntArray264[local19 + 4];
			local8 += this.anIntArray264[local19 + 5];
			local6 += this.anIntArray264[local19 + 6];
			local4 += this.anIntArray264[local19 + 7];
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
			this.anIntArray265[local19] = local17;
			this.anIntArray265[local19 + 1] = local16;
			this.anIntArray265[local19 + 2] = local14;
			this.anIntArray265[local19 + 3] = local12;
			this.anIntArray265[local19 + 4] = local10;
			this.anIntArray265[local19 + 5] = local8;
			this.anIntArray265[local19 + 6] = local6;
			this.anIntArray265[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray265[local19];
			local16 += this.anIntArray265[local19 + 1];
			local14 += this.anIntArray265[local19 + 2];
			local12 += this.anIntArray265[local19 + 3];
			local10 += this.anIntArray265[local19 + 4];
			local8 += this.anIntArray265[local19 + 5];
			local6 += this.anIntArray265[local19 + 6];
			local4 += this.anIntArray265[local19 + 7];
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
			this.anIntArray265[local19] = local17;
			this.anIntArray265[local19 + 1] = local16;
			this.anIntArray265[local19 + 2] = local14;
			this.anIntArray265[local19 + 3] = local12;
			this.anIntArray265[local19 + 4] = local10;
			this.anIntArray265[local19 + 5] = local8;
			this.anIntArray265[local19 + 6] = local6;
			this.anIntArray265[local19 + 7] = local4;
		}
		this.method671();
		this.anInt1005 = 256;
	}
}
