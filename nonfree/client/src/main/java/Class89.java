import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class89 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
	private final int[] anIntArray421 = new int[256];

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	private int anInt3917;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	private int anInt3918;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	private int anInt3919;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	private int anInt3924;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
	private final int[] anIntArray422 = new int[256];

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I)V")
	public Class89(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray421[local13] = arg0[local13];
		}
		this.method3009();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	private void method3008() {
		this.anInt3919 += ++this.anInt3924;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(32) int local32 = this.anIntArray422[local19];
			if ((local19 & 0x2) == 0) {
				if ((local19 & 0x1) == 0) {
					this.anInt3918 ^= this.anInt3918 << 13;
				} else {
					this.anInt3918 ^= this.anInt3918 >>> 6;
				}
			} else if ((local19 & 0x1) == 0) {
				this.anInt3918 ^= this.anInt3918 << 2;
			} else {
				this.anInt3918 ^= this.anInt3918 >>> 16;
			}
			this.anInt3918 += this.anIntArray422[local19 + 128 & 0xFF];
			@Pc(124) int local124;
			this.anIntArray422[local19] = local124 = this.anInt3919 + this.anInt3918 + this.anIntArray422[local32 >> 2 & 0xFF];
			this.anIntArray421[local19] = this.anInt3919 = this.anIntArray422[local124 >> 8 >> 2 & 0xFF] + local32;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	private void method3009() {
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray421[local23 + 2];
			local14 += this.anIntArray421[local23 + 4];
			local21 += this.anIntArray421[local23];
			local20 += this.anIntArray421[local23 + 1];
			local16 += this.anIntArray421[local23 + 3];
			local10 += this.anIntArray421[local23 + 6];
			local12 += this.anIntArray421[local23 + 5];
			local8 += this.anIntArray421[local23 + 7];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += local21;
			local20 ^= local18 >>> 2;
			local18 += local16;
			local18 ^= local16 << 8;
			local14 += local20;
			local12 += local18;
			local16 += local14;
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
			local21 += local20;
			this.anIntArray422[local23] = local21;
			local18 += local8;
			this.anIntArray422[local23 + 1] = local20;
			this.anIntArray422[local23 + 2] = local18;
			this.anIntArray422[local23 + 3] = local16;
			this.anIntArray422[local23 + 4] = local14;
			this.anIntArray422[local23 + 5] = local12;
			this.anIntArray422[local23 + 6] = local10;
			this.anIntArray422[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray422[local23 + 6];
			local20 += this.anIntArray422[local23 + 1];
			local18 += this.anIntArray422[local23 + 2];
			local12 += this.anIntArray422[local23 + 5];
			local14 += this.anIntArray422[local23 + 4];
			local21 += this.anIntArray422[local23];
			local21 ^= local20 << 11;
			local20 += local18;
			local16 += this.anIntArray422[local23 + 3];
			local16 += local21;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local8 += this.anIntArray422[local23 + 7];
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray422[local23] = local21;
			this.anIntArray422[local23 + 1] = local20;
			this.anIntArray422[local23 + 2] = local18;
			this.anIntArray422[local23 + 3] = local16;
			this.anIntArray422[local23 + 4] = local14;
			this.anIntArray422[local23 + 5] = local12;
			this.anIntArray422[local23 + 6] = local10;
			this.anIntArray422[local23 + 7] = local8;
		}
		this.method3008();
		this.anInt3917 = 256;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)I")
	public int method3011() {
		if (this.anInt3917-- == 0) {
			this.method3008();
			this.anInt3917 = 255;
		}
		return this.anIntArray421[this.anInt3917];
	}
}
