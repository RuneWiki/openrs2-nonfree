import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OPLZBITI")
public final class Class26 {

	@OriginalMember(owner = "client!OPLZBITI", name = "a", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!OPLZBITI", name = "d", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!OPLZBITI", name = "e", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!OPLZBITI", name = "f", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!OPLZBITI", name = "c", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!OPLZBITI", name = "b", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!OPLZBITI", name = "<init>", descriptor = "([II)V")
	public Class26(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anIntArray136 = new int[256];
			this.anIntArray135 = new int[256];
			for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
				this.anIntArray135[local18] = arg0[local18];
			}
			this.method292();
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("42844, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPLZBITI", name = "a", descriptor = "()I")
	public int method290() {
		if (this.anInt435-- == 0) {
			this.method291();
			this.anInt435 = 255;
		}
		return this.anIntArray135[this.anInt435];
	}

	@OriginalMember(owner = "client!OPLZBITI", name = "b", descriptor = "()V")
	private void method291() {
		this.anInt437 += ++this.anInt438;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray136[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt436 ^= this.anInt436 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt436 ^= this.anInt436 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt436 ^= this.anInt436 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt436 ^= this.anInt436 >>> 16;
			}
			this.anInt436 += this.anIntArray136[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray136[local15] = local115 = this.anIntArray136[local22 >> 2 & 0xFF] + this.anInt436 + this.anInt437;
			this.anIntArray135[local15] = this.anInt437 = this.anIntArray136[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!OPLZBITI", name = "c", descriptor = "()V")
	private void method292() {
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
			local17 += this.anIntArray135[local19];
			local16 += this.anIntArray135[local19 + 1];
			local14 += this.anIntArray135[local19 + 2];
			local12 += this.anIntArray135[local19 + 3];
			local10 += this.anIntArray135[local19 + 4];
			local8 += this.anIntArray135[local19 + 5];
			local6 += this.anIntArray135[local19 + 6];
			local4 += this.anIntArray135[local19 + 7];
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
			this.anIntArray136[local19] = local17;
			this.anIntArray136[local19 + 1] = local16;
			this.anIntArray136[local19 + 2] = local14;
			this.anIntArray136[local19 + 3] = local12;
			this.anIntArray136[local19 + 4] = local10;
			this.anIntArray136[local19 + 5] = local8;
			this.anIntArray136[local19 + 6] = local6;
			this.anIntArray136[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray136[local19];
			local16 += this.anIntArray136[local19 + 1];
			local14 += this.anIntArray136[local19 + 2];
			local12 += this.anIntArray136[local19 + 3];
			local10 += this.anIntArray136[local19 + 4];
			local8 += this.anIntArray136[local19 + 5];
			local6 += this.anIntArray136[local19 + 6];
			local4 += this.anIntArray136[local19 + 7];
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
			this.anIntArray136[local19] = local17;
			this.anIntArray136[local19 + 1] = local16;
			this.anIntArray136[local19 + 2] = local14;
			this.anIntArray136[local19 + 3] = local12;
			this.anIntArray136[local19 + 4] = local10;
			this.anIntArray136[local19 + 5] = local8;
			this.anIntArray136[local19 + 6] = local6;
			this.anIntArray136[local19 + 7] = local4;
		}
		this.method291();
		this.anInt435 = 256;
	}
}
