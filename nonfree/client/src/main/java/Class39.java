import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class39 {

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	private int anInt1310;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	private int anInt1311;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	private int anInt1312;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	private int anInt1313;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
	private final int[] anIntArray254 = new int[256];

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
	private final int[] anIntArray253 = new int[256];

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
	public Class39(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray253[local13] = arg0[local13];
		}
		this.method1032();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)I")
	public int method1029() {
		if (this.anInt1311-- == 0) {
			this.method1031();
			this.anInt1311 = 255;
		}
		return this.anIntArray253[this.anInt1311];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	private void method1031() {
		this.anInt1310 += ++this.anInt1313;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = this.anIntArray254[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt1312 ^= this.anInt1312 << 13;
				} else {
					this.anInt1312 ^= this.anInt1312 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt1312 ^= this.anInt1312 << 2;
			} else {
				this.anInt1312 ^= this.anInt1312 >>> 16;
			}
			this.anInt1312 += this.anIntArray254[local19 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray254[local19] = local121 = this.anInt1312 + this.anIntArray254[local31 >> 2 & 0xFF] + this.anInt1310;
			this.anIntArray253[local19] = this.anInt1310 = this.anIntArray254[local121 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	private void method1032() {
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(25) int local25 = -1640531527;
		@Pc(27) int local27;
		for (local27 = 0; local27 < 4; local27++) {
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray253[local27 + 6];
			local20 += this.anIntArray253[local27 + 3];
			local18 += this.anIntArray253[local27 + 4];
			local16 += this.anIntArray253[local27 + 5];
			local12 += this.anIntArray253[local27 + 7];
			local25 += this.anIntArray253[local27];
			local24 += this.anIntArray253[local27 + 1];
			local22 += this.anIntArray253[local27 + 2];
			local25 ^= local24 << 11;
			local24 += local22;
			local20 += local25;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local12 += local18;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray254[local27] = local25;
			this.anIntArray254[local27 + 1] = local24;
			this.anIntArray254[local27 + 2] = local22;
			this.anIntArray254[local27 + 3] = local20;
			this.anIntArray254[local27 + 4] = local18;
			this.anIntArray254[local27 + 5] = local16;
			this.anIntArray254[local27 + 6] = local14;
			this.anIntArray254[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local12 += this.anIntArray254[local27 + 7];
			local16 += this.anIntArray254[local27 + 5];
			local14 += this.anIntArray254[local27 + 6];
			local18 += this.anIntArray254[local27 + 4];
			local25 += this.anIntArray254[local27];
			local20 += this.anIntArray254[local27 + 3];
			local24 += this.anIntArray254[local27 + 1];
			local22 += this.anIntArray254[local27 + 2];
			local25 ^= local24 << 11;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local20 += local25;
			local22 += local20;
			local22 ^= local20 << 8;
			local18 += local24;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local24 += local14;
			local25 += local24;
			this.anIntArray254[local27] = local25;
			this.anIntArray254[local27 + 1] = local24;
			this.anIntArray254[local27 + 2] = local22;
			this.anIntArray254[local27 + 3] = local20;
			this.anIntArray254[local27 + 4] = local18;
			this.anIntArray254[local27 + 5] = local16;
			this.anIntArray254[local27 + 6] = local14;
			this.anIntArray254[local27 + 7] = local12;
		}
		this.method1031();
		this.anInt1311 = 256;
	}
}
