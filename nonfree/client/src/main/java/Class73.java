import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class73 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	private int anInt3504;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private int anInt3508;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	private int anInt3512;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "[I")
	private final int[] anIntArray346 = new int[256];

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "[I")
	private final int[] anIntArray341 = new int[256];

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([I)V")
	public Class73(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray346[local13] = arg0[local13];
		}
		this.method2533();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	private void method2533() {
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
			local22 += local20;
			local22 ^= local20 << 8;
			local16 += local22;
			local18 += local24;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local25 += local16;
			local12 += local18;
			local14 += local12;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray346[local27 + 1];
			local14 += this.anIntArray346[local27 + 6];
			local16 += this.anIntArray346[local27 + 5];
			local18 += this.anIntArray346[local27 + 4];
			local12 += this.anIntArray346[local27 + 7];
			local20 += this.anIntArray346[local27 + 3];
			local22 += this.anIntArray346[local27 + 2];
			local25 += this.anIntArray346[local27];
			local25 ^= local24 << 11;
			local24 += local22;
			local24 ^= local22 >>> 2;
			local18 += local24;
			local20 += local25;
			local22 += local20;
			local22 ^= local20 << 8;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 16;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 10;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local12 += local18;
			local14 += local12;
			local25 += local16;
			local14 ^= local12 << 8;
			local24 += local14;
			local12 += local25;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
			this.anIntArray341[local27] = local25;
			this.anIntArray341[local27 + 1] = local24;
			this.anIntArray341[local27 + 2] = local22;
			this.anIntArray341[local27 + 3] = local20;
			this.anIntArray341[local27 + 4] = local18;
			this.anIntArray341[local27 + 5] = local16;
			this.anIntArray341[local27 + 6] = local14;
			this.anIntArray341[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray341[local27 + 1];
			local25 += this.anIntArray341[local27];
			local12 += this.anIntArray341[local27 + 7];
			local18 += this.anIntArray341[local27 + 4];
			local20 += this.anIntArray341[local27 + 3];
			local22 += this.anIntArray341[local27 + 2];
			local25 ^= local24 << 11;
			local14 += this.anIntArray341[local27 + 6];
			local20 += local25;
			local16 += this.anIntArray341[local27 + 5];
			local24 += local22;
			local24 ^= local22 >>> 2;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 8;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 16;
			local18 += local16;
			local18 ^= local16 << 10;
			local12 += local18;
			local14 += local20;
			local16 += local14;
			local16 ^= local14 >>> 4;
			local14 += local12;
			local14 ^= local12 << 8;
			local25 += local16;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local25 += local24;
			local22 += local12;
			this.anIntArray341[local27] = local25;
			this.anIntArray341[local27 + 1] = local24;
			this.anIntArray341[local27 + 2] = local22;
			this.anIntArray341[local27 + 3] = local20;
			this.anIntArray341[local27 + 4] = local18;
			this.anIntArray341[local27 + 5] = local16;
			this.anIntArray341[local27 + 6] = local14;
			this.anIntArray341[local27 + 7] = local12;
		}
		this.method2536();
		this.anInt3514 = 256;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	private void method2536() {
		this.anInt3508 += ++this.anInt3504;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray341[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt3512 ^= this.anInt3512 << 13;
				} else {
					this.anInt3512 ^= this.anInt3512 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt3512 ^= this.anInt3512 << 2;
			} else {
				this.anInt3512 ^= this.anInt3512 >>> 16;
			}
			this.anInt3512 += this.anIntArray341[local23 + 128 & 0xFF];
			@Pc(123) int local123;
			this.anIntArray341[local23] = local123 = this.anInt3508 + this.anIntArray341[local30 >> 2 & 0xFF] + this.anInt3512;
			this.anIntArray346[local23] = this.anInt3508 = this.anIntArray341[local123 >> 8 >> 2 & 0xFF] + local30;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	public int method2537() {
		if (this.anInt3514-- == 0) {
			this.method2536();
			this.anInt3514 = 255;
		}
		return this.anIntArray346[this.anInt3514];
	}
}
