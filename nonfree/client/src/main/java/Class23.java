import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class23 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
	private final int[] anIntArray126 = new int[256];

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
	private final int[] anIntArray125 = new int[256];

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([I)V")
	public Class23(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray125[local13] = arg0[local13];
		}
		this.method805();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	private void method797() {
		this.anInt1009 += ++this.anInt1014;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray126[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1020 ^= this.anInt1020 << 13;
				} else {
					this.anInt1020 ^= this.anInt1020 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1020 ^= this.anInt1020 << 2;
			} else {
				this.anInt1020 ^= this.anInt1020 >>> 16;
			}
			this.anInt1020 += this.anIntArray126[local24 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray126[local24] = local127 = this.anInt1009 + this.anIntArray126[local31 >> 2 & 0xFF] + this.anInt1020;
			this.anIntArray125[local24] = this.anInt1009 = this.anIntArray126[local127 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
	public int method798() {
		if (this.anInt1022-- == 0) {
			this.method797();
			this.anInt1022 = 255;
		}
		return this.anIntArray125[this.anInt1022];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	private void method805() {
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
			local16 += local21;
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
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray125[local23 + 7];
			local16 += this.anIntArray125[local23 + 3];
			local18 += this.anIntArray125[local23 + 2];
			local21 += this.anIntArray125[local23];
			local14 += this.anIntArray125[local23 + 4];
			local12 += this.anIntArray125[local23 + 5];
			local20 += this.anIntArray125[local23 + 1];
			local21 ^= local20 << 11;
			local16 += local21;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local10 += this.anIntArray125[local23 + 6];
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 10;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			this.anIntArray126[local23] = local21;
			local18 += local8;
			this.anIntArray126[local23 + 1] = local20;
			this.anIntArray126[local23 + 2] = local18;
			this.anIntArray126[local23 + 3] = local16;
			this.anIntArray126[local23 + 4] = local14;
			this.anIntArray126[local23 + 5] = local12;
			this.anIntArray126[local23 + 6] = local10;
			this.anIntArray126[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray126[local23 + 7];
			local20 += this.anIntArray126[local23 + 1];
			local18 += this.anIntArray126[local23 + 2];
			local14 += this.anIntArray126[local23 + 4];
			local16 += this.anIntArray126[local23 + 3];
			local21 += this.anIntArray126[local23];
			local10 += this.anIntArray126[local23 + 6];
			local12 += this.anIntArray126[local23 + 5];
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
			this.anIntArray126[local23] = local21;
			this.anIntArray126[local23 + 1] = local20;
			this.anIntArray126[local23 + 2] = local18;
			this.anIntArray126[local23 + 3] = local16;
			this.anIntArray126[local23 + 4] = local14;
			this.anIntArray126[local23 + 5] = local12;
			this.anIntArray126[local23 + 6] = local10;
			this.anIntArray126[local23 + 7] = local8;
		}
		this.method797();
		this.anInt1022 = 256;
	}
}
