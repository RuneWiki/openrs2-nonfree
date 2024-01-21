import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class35 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	private int anInt1350;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	private int anInt1352;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
	private final int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
	private final int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([I)V")
	public Class35(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray218[local13] = arg0[local13];
		}
		this.method983();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)I")
	public int method981() {
		if (this.anInt1350-- == 0) {
			this.method982();
			this.anInt1350 = 255;
		}
		return this.anIntArray218[this.anInt1350];
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	private void method982() {
		this.anInt1346 += ++this.anInt1347;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(29) int local29 = this.anIntArray217[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1352 ^= this.anInt1352 << 13;
				} else {
					this.anInt1352 ^= this.anInt1352 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1352 ^= this.anInt1352 << 2;
			} else {
				this.anInt1352 ^= this.anInt1352 >>> 16;
			}
			this.anInt1352 += this.anIntArray217[local23 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray217[local23] = local121 = this.anIntArray217[local29 >> 2 & 0xFF] + this.anInt1352 + this.anInt1346;
			this.anIntArray218[local23] = this.anInt1346 = this.anIntArray217[local121 >> 8 >> 2 & 0xFF] + local29;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	private void method983() {
		@Pc(6) int local6 = -1640531527;
		@Pc(8) int local8 = -1640531527;
		@Pc(10) int local10 = -1640531527;
		@Pc(12) int local12 = -1640531527;
		@Pc(14) int local14 = -1640531527;
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(19) int local19 = -1640531527;
		@Pc(21) int local21;
		for (local21 = 0; local21 < 4; local21++) {
			local19 ^= local18 << 11;
			local18 += local16;
			local14 += local19;
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local18 += local8;
			local19 += local18;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local18 += this.anIntArray218[local21 + 1];
			local12 += this.anIntArray218[local21 + 4];
			local14 += this.anIntArray218[local21 + 3];
			local10 += this.anIntArray218[local21 + 5];
			local16 += this.anIntArray218[local21 + 2];
			local19 += this.anIntArray218[local21];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local8 += this.anIntArray218[local21 + 6];
			local6 += this.anIntArray218[local21 + 7];
			local18 ^= local16 >>> 2;
			local16 += local14;
			local12 += local18;
			local16 ^= local14 << 8;
			local14 += local12;
			local10 += local16;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 << 10;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local6 += local12;
			local19 += local10;
			local8 += local6;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local19 += local18;
			local16 += local6;
			this.anIntArray217[local21] = local19;
			this.anIntArray217[local21 + 1] = local18;
			this.anIntArray217[local21 + 2] = local16;
			this.anIntArray217[local21 + 3] = local14;
			this.anIntArray217[local21 + 4] = local12;
			this.anIntArray217[local21 + 5] = local10;
			this.anIntArray217[local21 + 6] = local8;
			this.anIntArray217[local21 + 7] = local6;
		}
		for (local21 = 0; local21 < 256; local21 += 8) {
			local8 += this.anIntArray217[local21 + 6];
			local18 += this.anIntArray217[local21 + 1];
			local10 += this.anIntArray217[local21 + 5];
			local12 += this.anIntArray217[local21 + 4];
			local14 += this.anIntArray217[local21 + 3];
			local19 += this.anIntArray217[local21];
			local16 += this.anIntArray217[local21 + 2];
			local19 ^= local18 << 11;
			local14 += local19;
			local18 += local16;
			local18 ^= local16 >>> 2;
			local6 += this.anIntArray217[local21 + 7];
			local12 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 >>> 16;
			local12 += local10;
			local12 ^= local10 << 10;
			local6 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 >>> 4;
			local8 += local6;
			local19 += local10;
			local8 ^= local6 << 8;
			local6 += local19;
			local18 += local8;
			local6 ^= local19 >>> 9;
			local16 += local6;
			local19 += local18;
			this.anIntArray217[local21] = local19;
			this.anIntArray217[local21 + 1] = local18;
			this.anIntArray217[local21 + 2] = local16;
			this.anIntArray217[local21 + 3] = local14;
			this.anIntArray217[local21 + 4] = local12;
			this.anIntArray217[local21 + 5] = local10;
			this.anIntArray217[local21 + 6] = local8;
			this.anIntArray217[local21 + 7] = local6;
		}
		this.method982();
		this.anInt1350 = 256;
	}
}
