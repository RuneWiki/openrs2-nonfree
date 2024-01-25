import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class144 {

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
	private int anInt3824;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
	private int anInt3826;

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
	private int anInt3829;

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	private Class144() {
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "([I)V")
	public Class144(@OriginalArg(0) int[] arg0) {
		this.anIntArray207 = new int[256];
		this.anIntArray208 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray208[local13] = arg0[local13];
		}
		this.method3266();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
	public int method3265() {
		if (this.anInt3824 == 0) {
			this.method3269();
			this.anInt3824 = 256;
		}
		return this.anIntArray208[--this.anInt3824];
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
	private void method3266() {
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local12 += this.anIntArray208[local23 + 5];
			local18 += this.anIntArray208[local23 + 2];
			local14 += this.anIntArray208[local23 + 4];
			local10 += this.anIntArray208[local23 + 6];
			local16 += this.anIntArray208[local23 + 3];
			local20 += this.anIntArray208[local23 + 1];
			local8 += this.anIntArray208[local23 + 7];
			local21 += this.anIntArray208[local23];
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
			this.anIntArray207[local23] = local21;
			this.anIntArray207[local23 + 1] = local20;
			this.anIntArray207[local23 + 2] = local18;
			this.anIntArray207[local23 + 3] = local16;
			this.anIntArray207[local23 + 4] = local14;
			this.anIntArray207[local23 + 5] = local12;
			this.anIntArray207[local23 + 6] = local10;
			this.anIntArray207[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray207[local23 + 2];
			local16 += this.anIntArray207[local23 + 3];
			local20 += this.anIntArray207[local23 + 1];
			local10 += this.anIntArray207[local23 + 6];
			local21 += this.anIntArray207[local23];
			local14 += this.anIntArray207[local23 + 4];
			local8 += this.anIntArray207[local23 + 7];
			local12 += this.anIntArray207[local23 + 5];
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray207[local23] = local21;
			this.anIntArray207[local23 + 1] = local20;
			this.anIntArray207[local23 + 2] = local18;
			this.anIntArray207[local23 + 3] = local16;
			this.anIntArray207[local23 + 4] = local14;
			this.anIntArray207[local23 + 5] = local12;
			this.anIntArray207[local23 + 6] = local10;
			this.anIntArray207[local23 + 7] = local8;
		}
		this.method3269();
		this.anInt3824 = 256;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
	public int method3267() {
		if (this.anInt3824 == 0) {
			this.method3269();
			this.anInt3824 = 256;
		}
		return this.anIntArray208[this.anInt3824 - 1];
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	private void method3269() {
		this.anInt3827 += ++this.anInt3826;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray207[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt3829 ^= this.anInt3829 << 13;
				} else {
					this.anInt3829 ^= this.anInt3829 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt3829 ^= this.anInt3829 << 2;
			} else {
				this.anInt3829 ^= this.anInt3829 >>> 16;
			}
			this.anInt3829 += this.anIntArray207[local23 + 128 & 0xFF];
			@Pc(117) int local117;
			this.anIntArray207[local23] = local117 = this.anInt3829 + this.anIntArray207[local30 >> 2 & 0xFF] + this.anInt3827;
			this.anIntArray208[local23] = this.anInt3827 = local30 + this.anIntArray207[local117 >> 8 >> 2 & 0xFF];
		}
	}
}
