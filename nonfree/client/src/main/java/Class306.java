import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class306 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
	private int[] anIntArray789;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "[I")
	private int[] anIntArray790;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	private int anInt9101;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
	private int anInt9104;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	private int anInt9107;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
	private int anInt9108;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	private Class306() {
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([I)V")
	public Class306(@OriginalArg(0) int[] arg0) {
		this.anIntArray790 = new int[256];
		this.anIntArray789 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray790[local13] = arg0[local13];
		}
		this.method7867();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	private void method7862() {
		this.anInt9101 += ++this.anInt9104;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(34) int local34 = this.anIntArray789[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt9108 ^= this.anInt9108 << 13;
				} else {
					this.anInt9108 ^= this.anInt9108 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt9108 ^= this.anInt9108 << 2;
			} else {
				this.anInt9108 ^= this.anInt9108 >>> 16;
			}
			this.anInt9108 += this.anIntArray789[local19 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray789[local19] = local123 = this.anInt9101 + this.anIntArray789[local34 >> 2 & 0xFF] + this.anInt9108;
			this.anIntArray790[local19] = this.anInt9101 = local34 + this.anIntArray789[local123 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	public int method7864() {
		if (this.anInt9107 == 0) {
			this.method7862();
			this.anInt9107 = 256;
		}
		return this.anIntArray790[this.anInt9107 - 1];
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	private void method7867() {
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
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local20 += this.anIntArray790[local27 + 3];
			local25 += this.anIntArray790[local27];
			local16 += this.anIntArray790[local27 + 5];
			local12 += this.anIntArray790[local27 + 7];
			local18 += this.anIntArray790[local27 + 4];
			local14 += this.anIntArray790[local27 + 6];
			local22 += this.anIntArray790[local27 + 2];
			local24 += this.anIntArray790[local27 + 1];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
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
			this.anIntArray789[local27] = local25;
			this.anIntArray789[local27 + 1] = local24;
			this.anIntArray789[local27 + 2] = local22;
			this.anIntArray789[local27 + 3] = local20;
			this.anIntArray789[local27 + 4] = local18;
			this.anIntArray789[local27 + 5] = local16;
			this.anIntArray789[local27 + 6] = local14;
			this.anIntArray789[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray789[local27 + 1];
			local12 += this.anIntArray789[local27 + 7];
			local25 += this.anIntArray789[local27];
			local18 += this.anIntArray789[local27 + 4];
			local16 += this.anIntArray789[local27 + 5];
			local20 += this.anIntArray789[local27 + 3];
			local22 += this.anIntArray789[local27 + 2];
			local14 += this.anIntArray789[local27 + 6];
			local25 ^= local24 << 11;
			local20 += local25;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
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
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray789[local27] = local25;
			this.anIntArray789[local27 + 1] = local24;
			this.anIntArray789[local27 + 2] = local22;
			this.anIntArray789[local27 + 3] = local20;
			this.anIntArray789[local27 + 4] = local18;
			this.anIntArray789[local27 + 5] = local16;
			this.anIntArray789[local27 + 6] = local14;
			this.anIntArray789[local27 + 7] = local12;
		}
		this.method7862();
		this.anInt9107 = 256;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
	public int method7868() {
		if (this.anInt9107 == 0) {
			this.method7862();
			this.anInt9107 = 256;
		}
		return this.anIntArray790[--this.anInt9107];
	}
}
