import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class33 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private int anInt1630;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	private int anInt1634;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	private final int[] anIntArray161 = new int[256];

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
	private final int[] anIntArray162 = new int[256];

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
	public Class33(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray162[local13] = arg0[local13];
		}
		this.method1092();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public int method1091() {
		if (this.anInt1627-- == 0) {
			this.method1094();
			this.anInt1627 = 255;
		}
		return this.anIntArray162[this.anInt1627];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	private void method1092() {
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
			local16 += local14;
			local12 += local18;
			local16 ^= local14 >>> 16;
			local14 += local12;
			local14 ^= local12 << 10;
			local8 += local14;
			local10 += local16;
			local12 += local10;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local20 += local10;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray162[local23 + 4];
			local10 += this.anIntArray162[local23 + 6];
			local8 += this.anIntArray162[local23 + 7];
			local12 += this.anIntArray162[local23 + 5];
			local20 += this.anIntArray162[local23 + 1];
			local16 += this.anIntArray162[local23 + 3];
			local21 += this.anIntArray162[local23];
			local21 ^= local20 << 11;
			local18 += this.anIntArray162[local23 + 2];
			local16 += local21;
			local20 += local18;
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
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray161[local23] = local21;
			this.anIntArray161[local23 + 1] = local20;
			this.anIntArray161[local23 + 2] = local18;
			this.anIntArray161[local23 + 3] = local16;
			this.anIntArray161[local23 + 4] = local14;
			this.anIntArray161[local23 + 5] = local12;
			this.anIntArray161[local23 + 6] = local10;
			this.anIntArray161[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local18 += this.anIntArray161[local23 + 2];
			local14 += this.anIntArray161[local23 + 4];
			local12 += this.anIntArray161[local23 + 5];
			local16 += this.anIntArray161[local23 + 3];
			local21 += this.anIntArray161[local23];
			local20 += this.anIntArray161[local23 + 1];
			local21 ^= local20 << 11;
			local20 += local18;
			local20 ^= local18 >>> 2;
			local8 += this.anIntArray161[local23 + 7];
			local14 += local20;
			local10 += this.anIntArray161[local23 + 6];
			local16 += local21;
			local18 += local16;
			local18 ^= local16 << 8;
			local16 += local14;
			local16 ^= local14 >>> 16;
			local12 += local18;
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
			local21 += local20;
			local18 += local8;
			this.anIntArray161[local23] = local21;
			this.anIntArray161[local23 + 1] = local20;
			this.anIntArray161[local23 + 2] = local18;
			this.anIntArray161[local23 + 3] = local16;
			this.anIntArray161[local23 + 4] = local14;
			this.anIntArray161[local23 + 5] = local12;
			this.anIntArray161[local23 + 6] = local10;
			this.anIntArray161[local23 + 7] = local8;
		}
		this.method1094();
		this.anInt1627 = 256;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	private void method1094() {
		this.anInt1634 += ++this.anInt1630;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray161[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt1631 ^= this.anInt1631 << 13;
				} else {
					this.anInt1631 ^= this.anInt1631 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt1631 ^= this.anInt1631 << 2;
			} else {
				this.anInt1631 ^= this.anInt1631 >>> 16;
			}
			this.anInt1631 += this.anIntArray161[local24 + 128 & 0xFF];
			@Pc(127) int local127;
			this.anIntArray161[local24] = local127 = this.anIntArray161[local31 >> 2 & 0xFF] + this.anInt1631 + this.anInt1634;
			this.anIntArray162[local24] = this.anInt1634 = local31 + this.anIntArray161[local127 >> 8 >> 2 & 0xFF];
		}
	}
}
