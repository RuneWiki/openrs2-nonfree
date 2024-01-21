import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	private final int[] anIntArray10 = new int[256];

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	private final int[] anIntArray9 = new int[256];

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
	public Class3(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray10[local13] = arg0[local13];
		}
		this.method70();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	private void method69() {
		this.anInt103 += ++this.anInt98;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray9[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt104 ^= this.anInt104 << 13;
				} else {
					this.anInt104 ^= this.anInt104 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt104 ^= this.anInt104 << 2;
			} else {
				this.anInt104 ^= this.anInt104 >>> 16;
			}
			this.anInt104 += this.anIntArray9[local24 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray9[local24] = local120 = this.anInt103 + this.anIntArray9[local31 >> 2 & 0xFF] + this.anInt104;
			this.anIntArray10[local24] = this.anInt103 = this.anIntArray9[local120 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	private void method70() {
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
			local12 += local10;
			local12 ^= local10 >>> 4;
			local8 += local14;
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
			local12 += this.anIntArray10[local23 + 5];
			local8 += this.anIntArray10[local23 + 7];
			local16 += this.anIntArray10[local23 + 3];
			local21 += this.anIntArray10[local23];
			local10 += this.anIntArray10[local23 + 6];
			local18 += this.anIntArray10[local23 + 2];
			local20 += this.anIntArray10[local23 + 1];
			local14 += this.anIntArray10[local23 + 4];
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
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local18 += local8;
			local21 += local20;
			this.anIntArray9[local23] = local21;
			this.anIntArray9[local23 + 1] = local20;
			this.anIntArray9[local23 + 2] = local18;
			this.anIntArray9[local23 + 3] = local16;
			this.anIntArray9[local23 + 4] = local14;
			this.anIntArray9[local23 + 5] = local12;
			this.anIntArray9[local23 + 6] = local10;
			this.anIntArray9[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray9[local23 + 2];
			local21 += this.anIntArray9[local23];
			local10 += this.anIntArray9[local23 + 6];
			local8 += this.anIntArray9[local23 + 7];
			local20 += this.anIntArray9[local23 + 1];
			local16 += this.anIntArray9[local23 + 3];
			local21 ^= local20 << 11;
			local16 += local21;
			local12 += this.anIntArray9[local23 + 5];
			local14 += this.anIntArray9[local23 + 4];
			local20 += local18;
			local20 ^= local18 >>> 2;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local12 += local18;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local10 += local16;
			local8 += local14;
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
			this.anIntArray9[local23] = local21;
			this.anIntArray9[local23 + 1] = local20;
			this.anIntArray9[local23 + 2] = local18;
			this.anIntArray9[local23 + 3] = local16;
			this.anIntArray9[local23 + 4] = local14;
			this.anIntArray9[local23 + 5] = local12;
			this.anIntArray9[local23 + 6] = local10;
			this.anIntArray9[local23 + 7] = local8;
		}
		this.method69();
		this.anInt101 = 256;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I")
	public int method72() {
		if (this.anInt101-- == 0) {
			this.method69();
			this.anInt101 = 255;
		}
		return this.anIntArray10[this.anInt101];
	}
}
