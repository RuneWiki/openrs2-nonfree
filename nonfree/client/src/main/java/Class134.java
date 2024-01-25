import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class134 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	private int anInt4649;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	private int anInt4650;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	private Class134() {
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([I)V")
	public Class134(@OriginalArg(0) int[] arg0) {
		this.anIntArray205 = new int[256];
		this.anIntArray206 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray206[local13] = arg0[local13];
		}
		this.method3840();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	private void method3840() {
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(21) int local21 = -1640531527;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 4; local23++) {
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray206[local23 + 1];
			local21 += this.anIntArray206[local23];
			local8 += this.anIntArray206[local23 + 7];
			local12 += this.anIntArray206[local23 + 5];
			local18 += this.anIntArray206[local23 + 2];
			local14 += this.anIntArray206[local23 + 4];
			local16 += this.anIntArray206[local23 + 3];
			local10 += this.anIntArray206[local23 + 6];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray205[local23] = local21;
			this.anIntArray205[local23 + 1] = local20;
			this.anIntArray205[local23 + 2] = local18;
			this.anIntArray205[local23 + 3] = local16;
			this.anIntArray205[local23 + 4] = local14;
			this.anIntArray205[local23 + 5] = local12;
			this.anIntArray205[local23 + 6] = local10;
			this.anIntArray205[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray205[local23 + 7];
			local16 += this.anIntArray205[local23 + 3];
			local14 += this.anIntArray205[local23 + 4];
			local20 += this.anIntArray205[local23 + 1];
			local10 += this.anIntArray205[local23 + 6];
			local21 += this.anIntArray205[local23];
			local12 += this.anIntArray205[local23 + 5];
			local18 += this.anIntArray205[local23 + 2];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray205[local23] = local21;
			this.anIntArray205[local23 + 1] = local20;
			this.anIntArray205[local23 + 2] = local18;
			this.anIntArray205[local23 + 3] = local16;
			this.anIntArray205[local23 + 4] = local14;
			this.anIntArray205[local23 + 5] = local12;
			this.anIntArray205[local23 + 6] = local10;
			this.anIntArray205[local23 + 7] = local8;
		}
		this.method3841();
		this.anInt4648 = 256;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	private void method3841() {
		this.anInt4647 += ++this.anInt4650;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray205[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt4649 ^= this.anInt4649 << 13;
				} else {
					this.anInt4649 ^= this.anInt4649 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt4649 ^= this.anInt4649 << 2;
			} else {
				this.anInt4649 ^= this.anInt4649 >>> 16;
			}
			this.anInt4649 += this.anIntArray205[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray205[local23] = local123 = this.anInt4649 + this.anIntArray205[local30 >> 2 & 0xFF] + this.anInt4647;
			this.anIntArray206[local23] = this.anInt4647 = this.anIntArray205[local123 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
	public int method3842() {
		if (this.anInt4648 == 0) {
			this.method3841();
			this.anInt4648 = 256;
		}
		return this.anIntArray206[--this.anInt4648];
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
	public int method3843() {
		if (this.anInt4648 == 0) {
			this.method3841();
			this.anInt4648 = 256;
		}
		return this.anIntArray206[this.anInt4648 - 1];
	}
}
