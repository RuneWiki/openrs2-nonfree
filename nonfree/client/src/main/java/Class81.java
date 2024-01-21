import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class81 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	private int anInt3008;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
	private final int[] anIntArray371 = new int[256];

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
	private final int[] anIntArray369 = new int[256];

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
	public Class81(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray369[local13] = arg0[local13];
		}
		this.method1996();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
	public int method1990() {
		if (this.anInt3007-- == 0) {
			this.method1994();
			this.anInt3007 = 255;
		}
		return this.anIntArray369[this.anInt3007];
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	private void method1994() {
		this.anInt3001 += ++this.anInt3008;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray371[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt3009 ^= this.anInt3009 << 13;
				} else {
					this.anInt3009 ^= this.anInt3009 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt3009 ^= this.anInt3009 << 2;
			} else {
				this.anInt3009 ^= this.anInt3009 >>> 16;
			}
			this.anInt3009 += this.anIntArray371[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray371[local23] = local123 = this.anIntArray371[local30 >> 2 & 0xFF] + this.anInt3009 + this.anInt3001;
			this.anIntArray369[local23] = this.anInt3001 = this.anIntArray371[local123 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	private void method1996() {
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
			local10 ^= local8 << 8;
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray369[local23 + 2];
			local16 += this.anIntArray369[local23 + 3];
			local14 += this.anIntArray369[local23 + 4];
			local20 += this.anIntArray369[local23 + 1];
			local21 += this.anIntArray369[local23];
			local8 += this.anIntArray369[local23 + 7];
			local12 += this.anIntArray369[local23 + 5];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local10 += this.anIntArray369[local23 + 6];
			local16 ^= local14 >>> 16;
			local12 += local18;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray371[local23] = local21;
			this.anIntArray371[local23 + 1] = local20;
			this.anIntArray371[local23 + 2] = local18;
			this.anIntArray371[local23 + 3] = local16;
			this.anIntArray371[local23 + 4] = local14;
			this.anIntArray371[local23 + 5] = local12;
			this.anIntArray371[local23 + 6] = local10;
			this.anIntArray371[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray371[local23 + 7];
			local21 += this.anIntArray371[local23];
			local18 += this.anIntArray371[local23 + 2];
			local10 += this.anIntArray371[local23 + 6];
			local16 += this.anIntArray371[local23 + 3];
			local14 += this.anIntArray371[local23 + 4];
			local12 += this.anIntArray371[local23 + 5];
			local20 += this.anIntArray371[local23 + 1];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray371[local23] = local21;
			this.anIntArray371[local23 + 1] = local20;
			this.anIntArray371[local23 + 2] = local18;
			this.anIntArray371[local23 + 3] = local16;
			this.anIntArray371[local23 + 4] = local14;
			this.anIntArray371[local23 + 5] = local12;
			this.anIntArray371[local23 + 6] = local10;
			this.anIntArray371[local23 + 7] = local8;
		}
		this.method1994();
		this.anInt3007 = 256;
	}
}
