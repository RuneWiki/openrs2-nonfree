import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class23 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	private int anInt1262;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private int anInt1263;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt1267;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	private int anInt1272;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	private final int[] anIntArray127 = new int[256];

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	private final int[] anIntArray126 = new int[256];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I)V")
	public Class23(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray126[local13] = arg0[local13];
		}
		this.method869();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	private void method866() {
		this.anInt1272 += ++this.anInt1267;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray127[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt1263 ^= this.anInt1263 << 13;
				} else {
					this.anInt1263 ^= this.anInt1263 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt1263 ^= this.anInt1263 << 2;
			} else {
				this.anInt1263 ^= this.anInt1263 >>> 16;
			}
			this.anInt1263 += this.anIntArray127[local27 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray127[local27] = local120 = this.anIntArray127[local34 >> 2 & 0xFF] + this.anInt1263 + this.anInt1272;
			this.anIntArray126[local27] = this.anInt1272 = local34 + this.anIntArray127[local120 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	public int method868() {
		if (this.anInt1262-- == 0) {
			this.method866();
			this.anInt1262 = 255;
		}
		return this.anIntArray126[this.anInt1262];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	private void method869() {
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
			local18 ^= local16 << 8;
			local12 += local18;
			local14 += local20;
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
			local20 += local10;
			local21 += local12;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray126[local23 + 7];
			local16 += this.anIntArray126[local23 + 3];
			local21 += this.anIntArray126[local23];
			local20 += this.anIntArray126[local23 + 1];
			local14 += this.anIntArray126[local23 + 4];
			local10 += this.anIntArray126[local23 + 6];
			local12 += this.anIntArray126[local23 + 5];
			local18 += this.anIntArray126[local23 + 2];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray127[local23] = local21;
			this.anIntArray127[local23 + 1] = local20;
			this.anIntArray127[local23 + 2] = local18;
			this.anIntArray127[local23 + 3] = local16;
			this.anIntArray127[local23 + 4] = local14;
			this.anIntArray127[local23 + 5] = local12;
			this.anIntArray127[local23 + 6] = local10;
			this.anIntArray127[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray127[local23 + 7];
			local10 += this.anIntArray127[local23 + 6];
			local18 += this.anIntArray127[local23 + 2];
			local16 += this.anIntArray127[local23 + 3];
			local12 += this.anIntArray127[local23 + 5];
			local21 += this.anIntArray127[local23];
			local14 += this.anIntArray127[local23 + 4];
			local20 += this.anIntArray127[local23 + 1];
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
			local21 += local20;
			local18 += local8;
			this.anIntArray127[local23] = local21;
			this.anIntArray127[local23 + 1] = local20;
			this.anIntArray127[local23 + 2] = local18;
			this.anIntArray127[local23 + 3] = local16;
			this.anIntArray127[local23 + 4] = local14;
			this.anIntArray127[local23 + 5] = local12;
			this.anIntArray127[local23 + 6] = local10;
			this.anIntArray127[local23 + 7] = local8;
		}
		this.method866();
		this.anInt1262 = 256;
	}
}
