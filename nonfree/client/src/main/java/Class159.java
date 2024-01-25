import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class159 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	private int anInt4069;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	private int anInt4072;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	private int anInt4073;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	private int anInt4075;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	private Class159() {
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "([I)V")
	public Class159(@OriginalArg(0) int[] arg0) {
		this.anIntArray198 = new int[256];
		this.anIntArray200 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray198[local13] = arg0[local13];
		}
		this.method3629();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)I")
	public int method3624() {
		if (this.anInt4072 == 0) {
			this.method3630();
			this.anInt4072 = 256;
		}
		return this.anIntArray198[--this.anInt4072];
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)I")
	public int method3626() {
		if (this.anInt4072 == 0) {
			this.method3630();
			this.anInt4072 = 256;
		}
		return this.anIntArray198[this.anInt4072 - 1];
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	private void method3629() {
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
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local16 += this.anIntArray198[local27 + 5];
			local18 += this.anIntArray198[local27 + 4];
			local20 += this.anIntArray198[local27 + 3];
			local22 += this.anIntArray198[local27 + 2];
			local12 += this.anIntArray198[local27 + 7];
			local25 += this.anIntArray198[local27];
			local24 += this.anIntArray198[local27 + 1];
			local14 += this.anIntArray198[local27 + 6];
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
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray200[local27] = local25;
			this.anIntArray200[local27 + 1] = local24;
			this.anIntArray200[local27 + 2] = local22;
			this.anIntArray200[local27 + 3] = local20;
			this.anIntArray200[local27 + 4] = local18;
			this.anIntArray200[local27 + 5] = local16;
			this.anIntArray200[local27 + 6] = local14;
			this.anIntArray200[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local20 += this.anIntArray200[local27 + 3];
			local16 += this.anIntArray200[local27 + 5];
			local24 += this.anIntArray200[local27 + 1];
			local22 += this.anIntArray200[local27 + 2];
			local12 += this.anIntArray200[local27 + 7];
			local14 += this.anIntArray200[local27 + 6];
			local25 += this.anIntArray200[local27];
			local18 += this.anIntArray200[local27 + 4];
			local25 ^= local24 << 11;
			local24 += local22;
			local20 += local25;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
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
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray200[local27] = local25;
			this.anIntArray200[local27 + 1] = local24;
			this.anIntArray200[local27 + 2] = local22;
			this.anIntArray200[local27 + 3] = local20;
			this.anIntArray200[local27 + 4] = local18;
			this.anIntArray200[local27 + 5] = local16;
			this.anIntArray200[local27 + 6] = local14;
			this.anIntArray200[local27 + 7] = local12;
		}
		this.method3630();
		this.anInt4072 = 256;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	private void method3630() {
		this.anInt4069 += ++this.anInt4073;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) int local26 = this.anIntArray200[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt4075 ^= this.anInt4075 << 13;
				} else {
					this.anInt4075 ^= this.anInt4075 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt4075 ^= this.anInt4075 << 2;
			} else {
				this.anInt4075 ^= this.anInt4075 >>> 16;
			}
			this.anInt4075 += this.anIntArray200[local19 + 128 & 0xFF];
			@Pc(113) int local113;
			this.anIntArray200[local19] = local113 = this.anIntArray200[local26 >> 2 & 0xFF] + this.anInt4075 + this.anInt4069;
			this.anIntArray198[local19] = this.anInt4069 = this.anIntArray200[local113 >> 8 >> 2 & 0xFF] + local26;
		}
	}
}
