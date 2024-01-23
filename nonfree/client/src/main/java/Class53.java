import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class53 {

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	private int anInt1497;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	private int anInt1498;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
	private int[] anIntArray176 = new int[256];

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	private int anInt1499;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "[I")
	private int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	private int anInt1501;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([I)V")
	public Class53(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray179[local13] = arg0[local13];
		}
		this.method1289();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
	public int method1280() {
		if (this.anInt1497-- == 0) {
			this.method1285();
			this.anInt1497 = 255;
		}
		return this.anIntArray179[this.anInt1497];
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	private void method1285() {
		this.anInt1499 += ++this.anInt1501;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(35) int local35 = this.anIntArray176[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt1498 ^= this.anInt1498 << 13;
				} else {
					this.anInt1498 ^= this.anInt1498 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt1498 ^= this.anInt1498 << 2;
			} else {
				this.anInt1498 ^= this.anInt1498 >>> 16;
			}
			this.anInt1498 += this.anIntArray176[local25 + 128 & 0xFF];
			@Pc(130) int local130;
			this.anIntArray176[local25] = local130 = this.anInt1499 + this.anInt1498 + this.anIntArray176[local35 >> 2 & 0xFF];
			this.anIntArray179[local25] = this.anInt1499 = this.anIntArray176[local130 >> 8 >> 2 & 0xFF] + local35;
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	private void method1289() {
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(27) int local27 = -1640531527;
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local24 += local14;
			local26 += local16;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local24 += this.anIntArray179[local29 + 2];
			local14 += this.anIntArray179[local29 + 7];
			local16 += this.anIntArray179[local29 + 6];
			local22 += this.anIntArray179[local29 + 3];
			local27 += this.anIntArray179[local29];
			local20 += this.anIntArray179[local29 + 4];
			local26 += this.anIntArray179[local29 + 1];
			local18 += this.anIntArray179[local29 + 5];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			this.anIntArray176[local29] = local27;
			local24 += local14;
			this.anIntArray176[local29 + 1] = local26;
			this.anIntArray176[local29 + 2] = local24;
			this.anIntArray176[local29 + 3] = local22;
			this.anIntArray176[local29 + 4] = local20;
			this.anIntArray176[local29 + 5] = local18;
			this.anIntArray176[local29 + 6] = local16;
			this.anIntArray176[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local27 += this.anIntArray176[local29];
			local14 += this.anIntArray176[local29 + 7];
			local20 += this.anIntArray176[local29 + 4];
			local18 += this.anIntArray176[local29 + 5];
			local22 += this.anIntArray176[local29 + 3];
			local26 += this.anIntArray176[local29 + 1];
			local27 ^= local26 << 11;
			local22 += local27;
			local24 += this.anIntArray176[local29 + 2];
			local16 += this.anIntArray176[local29 + 6];
			local26 += local24;
			local26 ^= local24 >>> 2;
			local20 += local26;
			local24 += local22;
			local24 ^= local22 << 8;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local18 += local24;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local16 ^= local14 << 8;
			local26 += local16;
			local27 += local18;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray176[local29] = local27;
			this.anIntArray176[local29 + 1] = local26;
			this.anIntArray176[local29 + 2] = local24;
			this.anIntArray176[local29 + 3] = local22;
			this.anIntArray176[local29 + 4] = local20;
			this.anIntArray176[local29 + 5] = local18;
			this.anIntArray176[local29 + 6] = local16;
			this.anIntArray176[local29 + 7] = local14;
		}
		this.method1285();
		this.anInt1497 = 256;
	}
}
