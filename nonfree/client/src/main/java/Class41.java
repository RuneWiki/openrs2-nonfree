import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UVSYUCDF")
public final class Class41 {

	@OriginalMember(owner = "client!UVSYUCDF", name = "a", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!UVSYUCDF", name = "d", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!UVSYUCDF", name = "e", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!UVSYUCDF", name = "f", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!UVSYUCDF", name = "c", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!UVSYUCDF", name = "b", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!UVSYUCDF", name = "<init>", descriptor = "(Z[I)V")
	public Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1) {
		try {
			this.anIntArray152 = new int[256];
			this.anIntArray151 = new int[256];
			for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
				this.anIntArray151[local13] = arg1[local13];
			}
			this.method452();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("8375, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UVSYUCDF", name = "a", descriptor = "()I")
	public int method450() {
		if (this.anInt633-- == 0) {
			this.method451();
			this.anInt633 = 255;
		}
		return this.anIntArray151[this.anInt633];
	}

	@OriginalMember(owner = "client!UVSYUCDF", name = "b", descriptor = "()V")
	private void method451() {
		this.anInt635 += ++this.anInt636;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray152[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt634 ^= this.anInt634 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt634 ^= this.anInt634 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt634 ^= this.anInt634 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt634 ^= this.anInt634 >>> 16;
			}
			this.anInt634 += this.anIntArray152[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray152[local15] = local115 = this.anIntArray152[local22 >> 2 & 0xFF] + this.anInt634 + this.anInt635;
			this.anIntArray151[local15] = this.anInt635 = this.anIntArray152[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!UVSYUCDF", name = "c", descriptor = "()V")
	private void method452() {
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
			local17 += this.anIntArray151[local19];
			local16 += this.anIntArray151[local19 + 1];
			local14 += this.anIntArray151[local19 + 2];
			local12 += this.anIntArray151[local19 + 3];
			local10 += this.anIntArray151[local19 + 4];
			local8 += this.anIntArray151[local19 + 5];
			local6 += this.anIntArray151[local19 + 6];
			local4 += this.anIntArray151[local19 + 7];
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
			this.anIntArray152[local19] = local17;
			this.anIntArray152[local19 + 1] = local16;
			this.anIntArray152[local19 + 2] = local14;
			this.anIntArray152[local19 + 3] = local12;
			this.anIntArray152[local19 + 4] = local10;
			this.anIntArray152[local19 + 5] = local8;
			this.anIntArray152[local19 + 6] = local6;
			this.anIntArray152[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray152[local19];
			local16 += this.anIntArray152[local19 + 1];
			local14 += this.anIntArray152[local19 + 2];
			local12 += this.anIntArray152[local19 + 3];
			local10 += this.anIntArray152[local19 + 4];
			local8 += this.anIntArray152[local19 + 5];
			local6 += this.anIntArray152[local19 + 6];
			local4 += this.anIntArray152[local19 + 7];
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
			this.anIntArray152[local19] = local17;
			this.anIntArray152[local19 + 1] = local16;
			this.anIntArray152[local19 + 2] = local14;
			this.anIntArray152[local19 + 3] = local12;
			this.anIntArray152[local19 + 4] = local10;
			this.anIntArray152[local19 + 5] = local8;
			this.anIntArray152[local19 + 6] = local6;
			this.anIntArray152[local19 + 7] = local4;
		}
		this.method451();
		this.anInt633 = 256;
	}
}
