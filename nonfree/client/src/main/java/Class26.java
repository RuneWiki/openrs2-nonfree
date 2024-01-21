import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class26 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	private int anInt1367;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	private final int[] anIntArray115 = new int[256];

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
	private final int[] anIntArray116 = new int[256];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I)V")
	public Class26(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray116[local13] = arg0[local13];
		}
		this.method1013();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	private void method1010() {
		this.anInt1367 += ++this.anInt1369;
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(34) int local34 = this.anIntArray115[local27];
			if ((local27 & 0x2) == 0) {
				if ((local27 & 0x1) == 0) {
					this.anInt1359 ^= this.anInt1359 << 13;
				} else {
					this.anInt1359 ^= this.anInt1359 >>> 6;
				}
			} else if ((local27 & 0x1) == 0) {
				this.anInt1359 ^= this.anInt1359 << 2;
			} else {
				this.anInt1359 ^= this.anInt1359 >>> 16;
			}
			this.anInt1359 += this.anIntArray115[local27 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray115[local27] = local127 = this.anInt1359 + this.anIntArray115[local34 >> 2 & 0xFF] + this.anInt1367;
			this.anIntArray116[local27] = this.anInt1367 = this.anIntArray115[local127 >> 8 >> 2 & 0xFF] + local34;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	private void method1013() {
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray116[local23 + 6];
			local20 += this.anIntArray116[local23 + 1];
			local21 += this.anIntArray116[local23];
			local16 += this.anIntArray116[local23 + 3];
			local18 += this.anIntArray116[local23 + 2];
			local12 += this.anIntArray116[local23 + 5];
			local8 += this.anIntArray116[local23 + 7];
			local14 += this.anIntArray116[local23 + 4];
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
			local21 += local12;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray115[local23] = local21;
			this.anIntArray115[local23 + 1] = local20;
			this.anIntArray115[local23 + 2] = local18;
			this.anIntArray115[local23 + 3] = local16;
			this.anIntArray115[local23 + 4] = local14;
			this.anIntArray115[local23 + 5] = local12;
			this.anIntArray115[local23 + 6] = local10;
			this.anIntArray115[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray115[local23 + 6];
			local14 += this.anIntArray115[local23 + 4];
			local16 += this.anIntArray115[local23 + 3];
			local12 += this.anIntArray115[local23 + 5];
			local20 += this.anIntArray115[local23 + 1];
			local8 += this.anIntArray115[local23 + 7];
			local21 += this.anIntArray115[local23];
			local18 += this.anIntArray115[local23 + 2];
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
			local10 += local16;
			local14 += local12;
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
			this.anIntArray115[local23] = local21;
			local18 += local8;
			this.anIntArray115[local23 + 1] = local20;
			this.anIntArray115[local23 + 2] = local18;
			this.anIntArray115[local23 + 3] = local16;
			this.anIntArray115[local23 + 4] = local14;
			this.anIntArray115[local23 + 5] = local12;
			this.anIntArray115[local23 + 6] = local10;
			this.anIntArray115[local23 + 7] = local8;
		}
		this.method1010();
		this.anInt1363 = 256;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
	public int method1014() {
		if (this.anInt1363-- == 0) {
			this.method1010();
			this.anInt1363 = 255;
		}
		return this.anIntArray116[this.anInt1363];
	}
}
