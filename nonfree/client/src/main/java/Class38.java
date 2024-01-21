import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class38 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	private int anInt1516;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
	private final int[] anIntArray122 = new int[256];

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
	private final int[] anIntArray123 = new int[256];

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([I)V")
	public Class38(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray123[local13] = arg0[local13];
		}
		this.method1037();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public int method1033() {
		if (this.anInt1513-- == 0) {
			this.method1036();
			this.anInt1513 = 255;
		}
		return this.anIntArray123[this.anInt1513];
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	private void method1036() {
		this.anInt1512 += ++this.anInt1520;
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(30) int local30 = this.anIntArray122[local23];
			if ((local23 & 0x2) == 0) {
				if ((local23 & 0x1) == 0) {
					this.anInt1516 ^= this.anInt1516 << 13;
				} else {
					this.anInt1516 ^= this.anInt1516 >>> 6;
				}
			} else if ((local23 & 0x1) == 0) {
				this.anInt1516 ^= this.anInt1516 << 2;
			} else {
				this.anInt1516 ^= this.anInt1516 >>> 16;
			}
			this.anInt1516 += this.anIntArray122[local23 + 128 & 0xFF];
			@Pc(116) int local116;
			this.anIntArray122[local23] = local116 = this.anInt1512 + this.anIntArray122[local30 >> 2 & 0xFF] + this.anInt1516;
			this.anIntArray123[local23] = this.anInt1512 = local30 + this.anIntArray122[local116 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	private void method1037() {
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
			local14 += local20;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
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
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray123[local23 + 3];
			local18 += this.anIntArray123[local23 + 2];
			local10 += this.anIntArray123[local23 + 6];
			local14 += this.anIntArray123[local23 + 4];
			local20 += this.anIntArray123[local23 + 1];
			local12 += this.anIntArray123[local23 + 5];
			local8 += this.anIntArray123[local23 + 7];
			local21 += this.anIntArray123[local23];
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
			local12 += local10;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local8 += local14;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray122[local23] = local21;
			this.anIntArray122[local23 + 1] = local20;
			this.anIntArray122[local23 + 2] = local18;
			this.anIntArray122[local23 + 3] = local16;
			this.anIntArray122[local23 + 4] = local14;
			this.anIntArray122[local23 + 5] = local12;
			this.anIntArray122[local23 + 6] = local10;
			this.anIntArray122[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local8 += this.anIntArray122[local23 + 7];
			local21 += this.anIntArray122[local23];
			local18 += this.anIntArray122[local23 + 2];
			local10 += this.anIntArray122[local23 + 6];
			local14 += this.anIntArray122[local23 + 4];
			local16 += this.anIntArray122[local23 + 3];
			local20 += this.anIntArray122[local23 + 1];
			local21 ^= local20 << 11;
			local12 += this.anIntArray122[local23 + 5];
			local20 += local18;
			local16 += local21;
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray122[local23] = local21;
			this.anIntArray122[local23 + 1] = local20;
			this.anIntArray122[local23 + 2] = local18;
			this.anIntArray122[local23 + 3] = local16;
			this.anIntArray122[local23 + 4] = local14;
			this.anIntArray122[local23 + 5] = local12;
			this.anIntArray122[local23 + 6] = local10;
			this.anIntArray122[local23 + 7] = local8;
		}
		this.method1036();
		this.anInt1513 = 256;
	}
}
