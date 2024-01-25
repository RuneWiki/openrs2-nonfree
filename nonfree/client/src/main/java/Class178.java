import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class178 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	private int anInt4350;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	private int anInt4354;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
	private int[] anIntArray845;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	private int anInt4355;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
	private int[] anIntArray846;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int anInt4361;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	private Class178() {
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V")
	public Class178(@OriginalArg(0) int[] arg0) {
		this.anIntArray845 = new int[256];
		this.anIntArray846 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray845[local13] = arg0[local13];
		}
		this.method3915();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	private void method3914() {
		this.anInt4355 += ++this.anInt4361;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray846[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt4354 ^= this.anInt4354 << 13;
				} else {
					this.anInt4354 ^= this.anInt4354 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt4354 ^= this.anInt4354 << 2;
			} else {
				this.anInt4354 ^= this.anInt4354 >>> 16;
			}
			this.anInt4354 += this.anIntArray846[local24 + 128 & 0xFF];
			@Pc(126) int local126;
			this.anIntArray846[local24] = local126 = this.anInt4355 + this.anIntArray846[local31 >> 2 & 0xFF] + this.anInt4354;
			this.anIntArray845[local24] = this.anInt4355 = this.anIntArray846[local126 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
	private void method3915() {
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
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
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
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray845[local29 + 6];
			local27 += this.anIntArray845[local29];
			local22 += this.anIntArray845[local29 + 3];
			local18 += this.anIntArray845[local29 + 5];
			local26 += this.anIntArray845[local29 + 1];
			local20 += this.anIntArray845[local29 + 4];
			local14 += this.anIntArray845[local29 + 7];
			local24 += this.anIntArray845[local29 + 2];
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
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local14 += local20;
			local18 ^= local16 >>> 4;
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local26 += local16;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray846[local29] = local27;
			this.anIntArray846[local29 + 1] = local26;
			this.anIntArray846[local29 + 2] = local24;
			this.anIntArray846[local29 + 3] = local22;
			this.anIntArray846[local29 + 4] = local20;
			this.anIntArray846[local29 + 5] = local18;
			this.anIntArray846[local29 + 6] = local16;
			this.anIntArray846[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local16 += this.anIntArray846[local29 + 6];
			local18 += this.anIntArray846[local29 + 5];
			local24 += this.anIntArray846[local29 + 2];
			local20 += this.anIntArray846[local29 + 4];
			local27 += this.anIntArray846[local29];
			local14 += this.anIntArray846[local29 + 7];
			local26 += this.anIntArray846[local29 + 1];
			local22 += this.anIntArray846[local29 + 3];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
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
			local16 += local14;
			local27 += local18;
			local16 ^= local14 << 8;
			local14 += local27;
			local26 += local16;
			local14 ^= local27 >>> 9;
			local27 += local26;
			local24 += local14;
			this.anIntArray846[local29] = local27;
			this.anIntArray846[local29 + 1] = local26;
			this.anIntArray846[local29 + 2] = local24;
			this.anIntArray846[local29 + 3] = local22;
			this.anIntArray846[local29 + 4] = local20;
			this.anIntArray846[local29 + 5] = local18;
			this.anIntArray846[local29 + 6] = local16;
			this.anIntArray846[local29 + 7] = local14;
		}
		this.method3914();
		this.anInt4350 = 256;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
	public int method3918() {
		if (this.anInt4350 == 0) {
			this.method3914();
			this.anInt4350 = 256;
		}
		return this.anIntArray845[--this.anInt4350];
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
	public int method3919() {
		if (this.anInt4350 == 0) {
			this.method3914();
			this.anInt4350 = 256;
		}
		return this.anIntArray845[this.anInt4350 - 1];
	}
}
