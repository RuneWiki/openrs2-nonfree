import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class287 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	private int anInt7436;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	private int anInt7442;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	private int anInt7444;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	private int anInt7446;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	private Class287() {
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([I)V")
	public Class287(@OriginalArg(0) int[] arg0) {
		this.anIntArray581 = new int[256];
		this.anIntArray580 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray581[local13] = arg0[local13];
		}
		this.method6313();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
	public int method6309() {
		if (this.anInt7446 == 0) {
			this.method6310();
			this.anInt7446 = 256;
		}
		return this.anIntArray581[this.anInt7446 - 1];
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	private void method6310() {
		this.anInt7436 += ++this.anInt7442;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray580[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt7444 ^= this.anInt7444 << 13;
				} else {
					this.anInt7444 ^= this.anInt7444 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt7444 ^= this.anInt7444 << 2;
			} else {
				this.anInt7444 ^= this.anInt7444 >>> 16;
			}
			this.anInt7444 += this.anIntArray580[local23 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray580[local23] = local119 = this.anIntArray580[local30 >> 2 & 0xFF] + this.anInt7444 + this.anInt7436;
			this.anIntArray581[local23] = this.anInt7436 = this.anIntArray580[local119 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
	public int method6311() {
		if (this.anInt7446 == 0) {
			this.method6310();
			this.anInt7446 = 256;
		}
		return this.anIntArray581[--this.anInt7446];
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	private void method6313() {
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
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray581[local23 + 6];
			local16 += this.anIntArray581[local23 + 3];
			local8 += this.anIntArray581[local23 + 7];
			local12 += this.anIntArray581[local23 + 5];
			local21 += this.anIntArray581[local23];
			local18 += this.anIntArray581[local23 + 2];
			local20 += this.anIntArray581[local23 + 1];
			local14 += this.anIntArray581[local23 + 4];
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray580[local23] = local21;
			this.anIntArray580[local23 + 1] = local20;
			this.anIntArray580[local23 + 2] = local18;
			this.anIntArray580[local23 + 3] = local16;
			this.anIntArray580[local23 + 4] = local14;
			this.anIntArray580[local23 + 5] = local12;
			this.anIntArray580[local23 + 6] = local10;
			this.anIntArray580[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray580[local23 + 6];
			local8 += this.anIntArray580[local23 + 7];
			local14 += this.anIntArray580[local23 + 4];
			local12 += this.anIntArray580[local23 + 5];
			local18 += this.anIntArray580[local23 + 2];
			local16 += this.anIntArray580[local23 + 3];
			local21 += this.anIntArray580[local23];
			local20 += this.anIntArray580[local23 + 1];
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray580[local23] = local21;
			this.anIntArray580[local23 + 1] = local20;
			this.anIntArray580[local23 + 2] = local18;
			this.anIntArray580[local23 + 3] = local16;
			this.anIntArray580[local23 + 4] = local14;
			this.anIntArray580[local23 + 5] = local12;
			this.anIntArray580[local23 + 6] = local10;
			this.anIntArray580[local23 + 7] = local8;
		}
		this.method6310();
		this.anInt7446 = 256;
	}
}
