import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class235 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	private int anInt6441;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	private int anInt6442;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	private int anInt6443;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	private Class235() {
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "([I)V")
	public Class235(@OriginalArg(0) int[] arg0) {
		this.anIntArray544 = new int[256];
		this.anIntArray543 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray544[local13] = arg0[local13];
		}
		this.method5475();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
	public int method5474() {
		if (this.anInt6442 == 0) {
			this.method5477();
			this.anInt6442 = 256;
		}
		return this.anIntArray544[this.anInt6442 - 1];
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	private void method5475() {
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
			local25 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local12 += local25;
			local24 += local14;
			local12 ^= local25 >>> 9;
			local22 += local12;
			local25 += local24;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local12 += this.anIntArray544[local27 + 7];
			local20 += this.anIntArray544[local27 + 3];
			local24 += this.anIntArray544[local27 + 1];
			local22 += this.anIntArray544[local27 + 2];
			local18 += this.anIntArray544[local27 + 4];
			local16 += this.anIntArray544[local27 + 5];
			local14 += this.anIntArray544[local27 + 6];
			local25 += this.anIntArray544[local27];
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
			local25 += local24;
			local22 += local12;
			this.anIntArray543[local27] = local25;
			this.anIntArray543[local27 + 1] = local24;
			this.anIntArray543[local27 + 2] = local22;
			this.anIntArray543[local27 + 3] = local20;
			this.anIntArray543[local27 + 4] = local18;
			this.anIntArray543[local27 + 5] = local16;
			this.anIntArray543[local27 + 6] = local14;
			this.anIntArray543[local27 + 7] = local12;
		}
		for (local27 = 0; local27 < 256; local27 += 8) {
			local24 += this.anIntArray543[local27 + 1];
			local16 += this.anIntArray543[local27 + 5];
			local18 += this.anIntArray543[local27 + 4];
			local12 += this.anIntArray543[local27 + 7];
			local20 += this.anIntArray543[local27 + 3];
			local25 += this.anIntArray543[local27];
			local14 += this.anIntArray543[local27 + 6];
			local22 += this.anIntArray543[local27 + 2];
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
			this.anIntArray543[local27] = local25;
			this.anIntArray543[local27 + 1] = local24;
			this.anIntArray543[local27 + 2] = local22;
			this.anIntArray543[local27 + 3] = local20;
			this.anIntArray543[local27 + 4] = local18;
			this.anIntArray543[local27 + 5] = local16;
			this.anIntArray543[local27 + 6] = local14;
			this.anIntArray543[local27 + 7] = local12;
		}
		this.method5477();
		this.anInt6442 = 256;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
	private void method5477() {
		this.anInt6443 += ++this.anInt6441;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray543[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt6448 ^= this.anInt6448 << 13;
				} else {
					this.anInt6448 ^= this.anInt6448 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt6448 ^= this.anInt6448 << 2;
			} else {
				this.anInt6448 ^= this.anInt6448 >>> 16;
			}
			this.anInt6448 += this.anIntArray543[local26 + 128 & 0xFF];
			@Pc(119) int local119;
			this.anIntArray543[local26] = local119 = this.anInt6443 + this.anInt6448 + this.anIntArray543[local33 >> 2 & 0xFF];
			this.anIntArray544[local26] = this.anInt6443 = local33 + this.anIntArray543[local119 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	public int method5479() {
		if (this.anInt6442 == 0) {
			this.method5477();
			this.anInt6442 = 256;
		}
		return this.anIntArray544[--this.anInt6442];
	}
}
