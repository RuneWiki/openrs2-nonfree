import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class76 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	private int anInt3107;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	private int anInt3110;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	private int anInt3113;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	private final int[] anIntArray448 = new int[256];

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "[I")
	private final int[] anIntArray449 = new int[256];

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([I)V")
	public Class76(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray448[local13] = arg0[local13];
		}
		this.method2164();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	private void method2164() {
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
			local20 ^= local18 >>> 2;
			local14 += local20;
			local16 += local21;
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
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local20 += this.anIntArray448[local23 + 1];
			local10 += this.anIntArray448[local23 + 6];
			local12 += this.anIntArray448[local23 + 5];
			local21 += this.anIntArray448[local23];
			local21 ^= local20 << 11;
			local8 += this.anIntArray448[local23 + 7];
			local18 += this.anIntArray448[local23 + 2];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local16 += this.anIntArray448[local23 + 3];
			local14 += this.anIntArray448[local23 + 4];
			local14 += local20;
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local20 += local10;
			local21 += local20;
			this.anIntArray449[local23] = local21;
			this.anIntArray449[local23 + 1] = local20;
			this.anIntArray449[local23 + 2] = local18;
			this.anIntArray449[local23 + 3] = local16;
			this.anIntArray449[local23 + 4] = local14;
			this.anIntArray449[local23 + 5] = local12;
			this.anIntArray449[local23 + 6] = local10;
			this.anIntArray449[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray449[local23];
			local10 += this.anIntArray449[local23 + 6];
			local8 += this.anIntArray449[local23 + 7];
			local20 += this.anIntArray449[local23 + 1];
			local16 += this.anIntArray449[local23 + 3];
			local21 ^= local20 << 11;
			local14 += this.anIntArray449[local23 + 4];
			local18 += this.anIntArray449[local23 + 2];
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local12 += this.anIntArray449[local23 + 5];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray449[local23] = local21;
			this.anIntArray449[local23 + 1] = local20;
			this.anIntArray449[local23 + 2] = local18;
			this.anIntArray449[local23 + 3] = local16;
			this.anIntArray449[local23 + 4] = local14;
			this.anIntArray449[local23 + 5] = local12;
			this.anIntArray449[local23 + 6] = local10;
			this.anIntArray449[local23 + 7] = local8;
		}
		this.method2169();
		this.anInt3111 = 256;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
	public int method2166() {
		if (this.anInt3111-- == 0) {
			this.method2169();
			this.anInt3111 = 255;
		}
		return this.anIntArray448[this.anInt3111];
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	private void method2169() {
		this.anInt3107 += ++this.anInt3110;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray449[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt3113 ^= this.anInt3113 << 13;
				} else {
					this.anInt3113 ^= this.anInt3113 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt3113 ^= this.anInt3113 << 2;
			} else {
				this.anInt3113 ^= this.anInt3113 >>> 16;
			}
			this.anInt3113 += this.anIntArray449[local24 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray449[local24] = local123 = this.anInt3107 + this.anIntArray449[local31 >> 2 & 0xFF] + this.anInt3113;
			this.anIntArray448[local24] = this.anInt3107 = local31 + this.anIntArray449[local123 >> 8 >> 2 & 0xFF];
		}
	}
}
