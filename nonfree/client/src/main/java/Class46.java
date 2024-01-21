import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XXMIBCTG")
public final class Class46 {

	@OriginalMember(owner = "client!XXMIBCTG", name = "b", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!XXMIBCTG", name = "e", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!XXMIBCTG", name = "f", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!XXMIBCTG", name = "g", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!XXMIBCTG", name = "a", descriptor = "B")
	private byte aByte56 = 9;

	@OriginalMember(owner = "client!XXMIBCTG", name = "d", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!XXMIBCTG", name = "c", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!XXMIBCTG", name = "<init>", descriptor = "(B[I)V")
	public Class46(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray192 = new int[256];
			this.anIntArray191 = new int[256];
			for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
				this.anIntArray191[local14] = arg1[local14];
			}
			this.method560();
			if (arg0 != this.aByte56) {
				throw new NullPointerException();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("68501, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXMIBCTG", name = "a", descriptor = "()I")
	public int method558() {
		if (this.anInt794-- == 0) {
			this.method559();
			this.anInt794 = 255;
		}
		return this.anIntArray191[this.anInt794];
	}

	@OriginalMember(owner = "client!XXMIBCTG", name = "b", descriptor = "()V")
	private void method559() {
		this.anInt796 += ++this.anInt797;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray192[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt795 ^= this.anInt795 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt795 ^= this.anInt795 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt795 ^= this.anInt795 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt795 ^= this.anInt795 >>> 16;
			}
			this.anInt795 += this.anIntArray192[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray192[local15] = local115 = this.anIntArray192[local22 >> 2 & 0xFF] + this.anInt795 + this.anInt796;
			this.anIntArray191[local15] = this.anInt796 = this.anIntArray192[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!XXMIBCTG", name = "c", descriptor = "()V")
	private void method560() {
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
			local17 += this.anIntArray191[local19];
			local16 += this.anIntArray191[local19 + 1];
			local14 += this.anIntArray191[local19 + 2];
			local12 += this.anIntArray191[local19 + 3];
			local10 += this.anIntArray191[local19 + 4];
			local8 += this.anIntArray191[local19 + 5];
			local6 += this.anIntArray191[local19 + 6];
			local4 += this.anIntArray191[local19 + 7];
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
			this.anIntArray192[local19] = local17;
			this.anIntArray192[local19 + 1] = local16;
			this.anIntArray192[local19 + 2] = local14;
			this.anIntArray192[local19 + 3] = local12;
			this.anIntArray192[local19 + 4] = local10;
			this.anIntArray192[local19 + 5] = local8;
			this.anIntArray192[local19 + 6] = local6;
			this.anIntArray192[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray192[local19];
			local16 += this.anIntArray192[local19 + 1];
			local14 += this.anIntArray192[local19 + 2];
			local12 += this.anIntArray192[local19 + 3];
			local10 += this.anIntArray192[local19 + 4];
			local8 += this.anIntArray192[local19 + 5];
			local6 += this.anIntArray192[local19 + 6];
			local4 += this.anIntArray192[local19 + 7];
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
			this.anIntArray192[local19] = local17;
			this.anIntArray192[local19 + 1] = local16;
			this.anIntArray192[local19 + 2] = local14;
			this.anIntArray192[local19 + 3] = local12;
			this.anIntArray192[local19 + 4] = local10;
			this.anIntArray192[local19 + 5] = local8;
			this.anIntArray192[local19 + 6] = local6;
			this.anIntArray192[local19 + 7] = local4;
		}
		this.method559();
		this.anInt794 = 256;
	}
}
