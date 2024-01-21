import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JOCFVBOI")
public final class Class19 {

	@OriginalMember(owner = "client!JOCFVBOI", name = "c", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!JOCFVBOI", name = "f", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!JOCFVBOI", name = "g", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!JOCFVBOI", name = "h", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!JOCFVBOI", name = "a", descriptor = "I")
	private int anInt401 = -436;

	@OriginalMember(owner = "client!JOCFVBOI", name = "b", descriptor = "I")
	private int anInt402 = -431;

	@OriginalMember(owner = "client!JOCFVBOI", name = "e", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!JOCFVBOI", name = "d", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!JOCFVBOI", name = "<init>", descriptor = "(I[I)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray72 = new int[256];
			this.anIntArray71 = new int[256];
			for (@Pc(17) int local17 = 0; local17 < arg1.length; local17++) {
				this.anIntArray71[local17] = arg1[local17];
			}
			this.method229();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("7019, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOCFVBOI", name = "a", descriptor = "()I")
	public int method227() {
		if (this.anInt403-- == 0) {
			this.method228();
			this.anInt403 = 255;
		}
		return this.anIntArray71[this.anInt403];
	}

	@OriginalMember(owner = "client!JOCFVBOI", name = "b", descriptor = "()V")
	private void method228() {
		this.anInt405 += ++this.anInt406;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray72[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt404 ^= this.anInt404 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt404 ^= this.anInt404 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt404 ^= this.anInt404 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt404 ^= this.anInt404 >>> 16;
			}
			this.anInt404 += this.anIntArray72[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray72[local15] = local115 = this.anIntArray72[local22 >> 2 & 0xFF] + this.anInt404 + this.anInt405;
			this.anIntArray71[local15] = this.anInt405 = this.anIntArray72[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!JOCFVBOI", name = "c", descriptor = "()V")
	private void method229() {
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
			local17 += this.anIntArray71[local19];
			local16 += this.anIntArray71[local19 + 1];
			local14 += this.anIntArray71[local19 + 2];
			local12 += this.anIntArray71[local19 + 3];
			local10 += this.anIntArray71[local19 + 4];
			local8 += this.anIntArray71[local19 + 5];
			local6 += this.anIntArray71[local19 + 6];
			local4 += this.anIntArray71[local19 + 7];
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
			this.anIntArray72[local19] = local17;
			this.anIntArray72[local19 + 1] = local16;
			this.anIntArray72[local19 + 2] = local14;
			this.anIntArray72[local19 + 3] = local12;
			this.anIntArray72[local19 + 4] = local10;
			this.anIntArray72[local19 + 5] = local8;
			this.anIntArray72[local19 + 6] = local6;
			this.anIntArray72[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray72[local19];
			local16 += this.anIntArray72[local19 + 1];
			local14 += this.anIntArray72[local19 + 2];
			local12 += this.anIntArray72[local19 + 3];
			local10 += this.anIntArray72[local19 + 4];
			local8 += this.anIntArray72[local19 + 5];
			local6 += this.anIntArray72[local19 + 6];
			local4 += this.anIntArray72[local19 + 7];
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
			this.anIntArray72[local19] = local17;
			this.anIntArray72[local19 + 1] = local16;
			this.anIntArray72[local19 + 2] = local14;
			this.anIntArray72[local19 + 3] = local12;
			this.anIntArray72[local19 + 4] = local10;
			this.anIntArray72[local19 + 5] = local8;
			this.anIntArray72[local19 + 6] = local6;
			this.anIntArray72[local19 + 7] = local4;
		}
		this.method228();
		this.anInt403 = 256;
	}
}
