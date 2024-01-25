import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "([I)V")
	public Class12(@OriginalArg(0) int[] arg0) {
		this.anIntArray28 = new int[256];
		this.anIntArray29 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray28[local13] = arg0[local13];
		}
		this.method248();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	private void method245() {
		this.anInt270 += ++this.anInt265;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray29[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt267 ^= this.anInt267 << 13;
				} else {
					this.anInt267 ^= this.anInt267 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt267 ^= this.anInt267 << 2;
			} else {
				this.anInt267 ^= this.anInt267 >>> 16;
			}
			this.anInt267 += this.anIntArray29[local24 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray29[local24] = local121 = this.anIntArray29[local31 >> 2 & 0xFF] + this.anInt267 + this.anInt270;
			this.anIntArray28[local24] = this.anInt270 = this.anIntArray29[local121 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)I")
	public int method246() {
		if (this.anInt261 == 0) {
			this.method245();
			this.anInt261 = 256;
		}
		return this.anIntArray28[--this.anInt261];
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
	public int method247() {
		if (this.anInt261 == 0) {
			this.method245();
			this.anInt261 = 256;
		}
		return this.anIntArray28[this.anInt261 - 1];
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	private void method248() {
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
			local8 += local14;
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
			local12 += this.anIntArray28[local23 + 5];
			local20 += this.anIntArray28[local23 + 1];
			local8 += this.anIntArray28[local23 + 7];
			local21 += this.anIntArray28[local23];
			local10 += this.anIntArray28[local23 + 6];
			local16 += this.anIntArray28[local23 + 3];
			local18 += this.anIntArray28[local23 + 2];
			local14 += this.anIntArray28[local23 + 4];
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
			local20 += local10;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray29[local23] = local21;
			this.anIntArray29[local23 + 1] = local20;
			this.anIntArray29[local23 + 2] = local18;
			this.anIntArray29[local23 + 3] = local16;
			this.anIntArray29[local23 + 4] = local14;
			this.anIntArray29[local23 + 5] = local12;
			this.anIntArray29[local23 + 6] = local10;
			this.anIntArray29[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local14 += this.anIntArray29[local23 + 4];
			local8 += this.anIntArray29[local23 + 7];
			local18 += this.anIntArray29[local23 + 2];
			local12 += this.anIntArray29[local23 + 5];
			local10 += this.anIntArray29[local23 + 6];
			local21 += this.anIntArray29[local23];
			local20 += this.anIntArray29[local23 + 1];
			local16 += this.anIntArray29[local23 + 3];
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
			this.anIntArray29[local23] = local21;
			this.anIntArray29[local23 + 1] = local20;
			this.anIntArray29[local23 + 2] = local18;
			this.anIntArray29[local23 + 3] = local16;
			this.anIntArray29[local23 + 4] = local14;
			this.anIntArray29[local23 + 5] = local12;
			this.anIntArray29[local23 + 6] = local10;
			this.anIntArray29[local23 + 7] = local8;
		}
		this.method245();
		this.anInt261 = 256;
	}
}
