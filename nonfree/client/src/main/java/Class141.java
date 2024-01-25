import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class141 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	private int anInt4039;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	private int anInt4040;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	private int anInt4043;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	private int anInt4047;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	private Class141() {
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "([I)V")
	public Class141(@OriginalArg(0) int[] arg0) {
		this.anIntArray333 = new int[256];
		this.anIntArray332 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray333[local13] = arg0[local13];
		}
		this.method3076();
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I")
	public int method3073() {
		if (this.anInt4039 == 0) {
			this.method3077();
			this.anInt4039 = 256;
		}
		return this.anIntArray333[--this.anInt4039];
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)I")
	public int method3075() {
		if (this.anInt4039 == 0) {
			this.method3077();
			this.anInt4039 = 256;
		}
		return this.anIntArray333[this.anInt4039 - 1];
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	private void method3076() {
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local12 += local18;
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
			local12 += this.anIntArray333[local27 + 7];
			local24 += this.anIntArray333[local27 + 1];
			local14 += this.anIntArray333[local27 + 6];
			local18 += this.anIntArray333[local27 + 4];
			local22 += this.anIntArray333[local27 + 2];
			local25 += this.anIntArray333[local27];
			local20 += this.anIntArray333[local27 + 3];
			local16 += this.anIntArray333[local27 + 5];
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
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray332[local27] = local25;
			this.anIntArray332[local27 + 1] = local24;
			this.anIntArray332[local27 + 2] = local22;
			this.anIntArray332[local27 + 3] = local20;
			this.anIntArray332[local27 + 4] = local18;
			this.anIntArray332[local27 + 5] = local16;
			this.anIntArray332[local27 + 6] = local14;
			this.anIntArray332[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local14 += this.anIntArray332[local27 + 6];
			local25 += this.anIntArray332[local27];
			local12 += this.anIntArray332[local27 + 7];
			local20 += this.anIntArray332[local27 + 3];
			local18 += this.anIntArray332[local27 + 4];
			local22 += this.anIntArray332[local27 + 2];
			local16 += this.anIntArray332[local27 + 5];
			local24 += this.anIntArray332[local27 + 1];
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
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray332[local27] = local25;
			this.anIntArray332[local27 + 1] = local24;
			this.anIntArray332[local27 + 2] = local22;
			this.anIntArray332[local27 + 3] = local20;
			this.anIntArray332[local27 + 4] = local18;
			this.anIntArray332[local27 + 5] = local16;
			this.anIntArray332[local27 + 6] = local14;
			this.anIntArray332[local27 + 7] = local12;
		}
		this.method3077();
		this.anInt4039 = 256;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
	private void method3077() {
		this.anInt4043 += ++this.anInt4040;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray332[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt4047 ^= this.anInt4047 << 13;
				} else {
					this.anInt4047 ^= this.anInt4047 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt4047 ^= this.anInt4047 << 2;
			} else {
				this.anInt4047 ^= this.anInt4047 >>> 16;
			}
			this.anInt4047 += this.anIntArray332[local25 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray332[local25] = local125 = this.anInt4047 + this.anIntArray332[local32 >> 2 & 0xFF] + this.anInt4043;
			this.anIntArray333[local25] = this.anInt4043 = this.anIntArray332[local125 >> 8 >> 2 & 0xFF] + local32;
		}
	}
}
