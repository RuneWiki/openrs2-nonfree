import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ICHYZYSQ")
public final class Class18 {

	@OriginalMember(owner = "client!ICHYZYSQ", name = "a", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "d", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "e", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "f", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "c", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "b", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!ICHYZYSQ", name = "<init>", descriptor = "([IB)V")
	public Class18(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anIntArray43 = new int[256];
			this.anIntArray42 = new int[256];
			for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
				this.anIntArray42[local18] = arg0[local18];
			}
			this.method137();
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("89430, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ICHYZYSQ", name = "a", descriptor = "()I")
	public int method135() {
		if (this.anInt222-- == 0) {
			this.method136();
			this.anInt222 = 255;
		}
		return this.anIntArray42[this.anInt222];
	}

	@OriginalMember(owner = "client!ICHYZYSQ", name = "b", descriptor = "()V")
	private void method136() {
		this.anInt224 += ++this.anInt225;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) int local22 = this.anIntArray43[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt223 ^= this.anInt223 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt223 ^= this.anInt223 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt223 ^= this.anInt223 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt223 ^= this.anInt223 >>> 16;
			}
			this.anInt223 += this.anIntArray43[local15 + 128 & 0xFF];
			@Pc(115) int local115;
			this.anIntArray43[local15] = local115 = this.anIntArray43[local22 >> 2 & 0xFF] + this.anInt223 + this.anInt224;
			this.anIntArray42[local15] = this.anInt224 = this.anIntArray43[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	@OriginalMember(owner = "client!ICHYZYSQ", name = "c", descriptor = "()V")
	private void method137() {
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
			local17 += this.anIntArray42[local19];
			local16 += this.anIntArray42[local19 + 1];
			local14 += this.anIntArray42[local19 + 2];
			local12 += this.anIntArray42[local19 + 3];
			local10 += this.anIntArray42[local19 + 4];
			local8 += this.anIntArray42[local19 + 5];
			local6 += this.anIntArray42[local19 + 6];
			local4 += this.anIntArray42[local19 + 7];
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
			this.anIntArray43[local19] = local17;
			this.anIntArray43[local19 + 1] = local16;
			this.anIntArray43[local19 + 2] = local14;
			this.anIntArray43[local19 + 3] = local12;
			this.anIntArray43[local19 + 4] = local10;
			this.anIntArray43[local19 + 5] = local8;
			this.anIntArray43[local19 + 6] = local6;
			this.anIntArray43[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray43[local19];
			local16 += this.anIntArray43[local19 + 1];
			local14 += this.anIntArray43[local19 + 2];
			local12 += this.anIntArray43[local19 + 3];
			local10 += this.anIntArray43[local19 + 4];
			local8 += this.anIntArray43[local19 + 5];
			local6 += this.anIntArray43[local19 + 6];
			local4 += this.anIntArray43[local19 + 7];
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
			this.anIntArray43[local19] = local17;
			this.anIntArray43[local19 + 1] = local16;
			this.anIntArray43[local19 + 2] = local14;
			this.anIntArray43[local19 + 3] = local12;
			this.anIntArray43[local19 + 4] = local10;
			this.anIntArray43[local19 + 5] = local8;
			this.anIntArray43[local19 + 6] = local6;
			this.anIntArray43[local19 + 7] = local4;
		}
		this.method136();
		this.anInt222 = 256;
	}
}
