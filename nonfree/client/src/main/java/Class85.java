import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class85 {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	private int anInt2516;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	private int anInt2517;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	private Class85() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([I)V")
	public Class85(@OriginalArg(0) int[] arg0) {
		this.anIntArray204 = new int[256];
		this.anIntArray203 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray204[local13] = arg0[local13];
		}
		this.method2042();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	private void method2037() {
		this.anInt2519 += ++this.anInt2520;
		for (@Pc(29) int local29 = 0; local29 < 256; local29++) {
			@Pc(36) int local36 = this.anIntArray203[local29];
			if ((local29 & 0x2) == 0) {
				if ((local29 & 0x1) == 0) {
					this.anInt2517 ^= this.anInt2517 << 13;
				} else {
					this.anInt2517 ^= this.anInt2517 >>> 6;
				}
			} else if ((local29 & 0x1) == 0) {
				this.anInt2517 ^= this.anInt2517 << 2;
			} else {
				this.anInt2517 ^= this.anInt2517 >>> 16;
			}
			this.anInt2517 += this.anIntArray203[local29 + 128 & 0xFF];
			@Pc(125) int local125;
			this.anIntArray203[local29] = local125 = this.anInt2519 + this.anIntArray203[local36 >> 2 & 0xFF] + this.anInt2517;
			this.anIntArray204[local29] = this.anInt2519 = this.anIntArray203[local125 >> 8 >> 2 & 0xFF] + local36;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I")
	public int method2040() {
		if (this.anInt2516 == 0) {
			this.method2037();
			this.anInt2516 = 256;
		}
		return this.anIntArray204[--this.anInt2516];
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method2041() {
		if (this.anInt2516 == 0) {
			this.method2037();
			this.anInt2516 = 256;
		}
		return this.anIntArray204[this.anInt2516 - 1];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	private void method2042() {
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
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
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
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray204[local23 + 5];
			local16 += this.anIntArray204[local23 + 3];
			local8 += this.anIntArray204[local23 + 7];
			local18 += this.anIntArray204[local23 + 2];
			local14 += this.anIntArray204[local23 + 4];
			local10 += this.anIntArray204[local23 + 6];
			local21 += this.anIntArray204[local23];
			local20 += this.anIntArray204[local23 + 1];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray203[local23] = local21;
			this.anIntArray203[local23 + 1] = local20;
			this.anIntArray203[local23 + 2] = local18;
			this.anIntArray203[local23 + 3] = local16;
			this.anIntArray203[local23 + 4] = local14;
			this.anIntArray203[local23 + 5] = local12;
			this.anIntArray203[local23 + 6] = local10;
			this.anIntArray203[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray203[local23];
			local18 += this.anIntArray203[local23 + 2];
			local16 += this.anIntArray203[local23 + 3];
			local14 += this.anIntArray203[local23 + 4];
			local8 += this.anIntArray203[local23 + 7];
			local12 += this.anIntArray203[local23 + 5];
			local20 += this.anIntArray203[local23 + 1];
			local10 += this.anIntArray203[local23 + 6];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray203[local23] = local21;
			this.anIntArray203[local23 + 1] = local20;
			this.anIntArray203[local23 + 2] = local18;
			this.anIntArray203[local23 + 3] = local16;
			this.anIntArray203[local23 + 4] = local14;
			this.anIntArray203[local23 + 5] = local12;
			this.anIntArray203[local23 + 6] = local10;
			this.anIntArray203[local23 + 7] = local8;
		}
		this.method2037();
		this.anInt2516 = 256;
	}
}
