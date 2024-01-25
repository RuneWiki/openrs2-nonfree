import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class48 {

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "([I)V")
	public Class48(@OriginalArg(0) int[] arg0) {
		this.anIntArray93 = new int[256];
		this.anIntArray92 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray92[local13] = arg0[local13];
		}
		this.method925();
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)I")
	public int method924() {
		if (this.anInt1037 == 0) {
			this.method927();
			this.anInt1037 = 256;
		}
		return this.anIntArray92[--this.anInt1037];
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
	private void method925() {
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
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local8 += local21;
			local20 += local10;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray92[local23 + 6];
			local21 += this.anIntArray92[local23];
			local16 += this.anIntArray92[local23 + 3];
			local14 += this.anIntArray92[local23 + 4];
			local18 += this.anIntArray92[local23 + 2];
			local8 += this.anIntArray92[local23 + 7];
			local12 += this.anIntArray92[local23 + 5];
			local20 += this.anIntArray92[local23 + 1];
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
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local10 += local8;
			local21 += local12;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray93[local23] = local21;
			this.anIntArray93[local23 + 1] = local20;
			this.anIntArray93[local23 + 2] = local18;
			this.anIntArray93[local23 + 3] = local16;
			this.anIntArray93[local23 + 4] = local14;
			this.anIntArray93[local23 + 5] = local12;
			this.anIntArray93[local23 + 6] = local10;
			this.anIntArray93[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local16 += this.anIntArray93[local23 + 3];
			local12 += this.anIntArray93[local23 + 5];
			local20 += this.anIntArray93[local23 + 1];
			local10 += this.anIntArray93[local23 + 6];
			local18 += this.anIntArray93[local23 + 2];
			local8 += this.anIntArray93[local23 + 7];
			local21 += this.anIntArray93[local23];
			local14 += this.anIntArray93[local23 + 4];
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
			local14 += local12;
			local10 += local16;
			local14 ^= local12 << 10;
			local12 += local10;
			local8 += local14;
			local12 ^= local10 >>> 4;
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local18 += local8;
			local21 += local20;
			this.anIntArray93[local23] = local21;
			this.anIntArray93[local23 + 1] = local20;
			this.anIntArray93[local23 + 2] = local18;
			this.anIntArray93[local23 + 3] = local16;
			this.anIntArray93[local23 + 4] = local14;
			this.anIntArray93[local23 + 5] = local12;
			this.anIntArray93[local23 + 6] = local10;
			this.anIntArray93[local23 + 7] = local8;
		}
		this.method927();
		this.anInt1037 = 256;
		if (false) {
			this.anIntArray93 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)I")
	public int method926() {
		if (this.anInt1037 == 0) {
			this.method927();
			this.anInt1037 = 256;
		}
		return this.anIntArray92[this.anInt1037 - 1];
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	private void method927() {
		this.anInt1033 += ++this.anInt1039;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray93[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt1036 ^= this.anInt1036 << 13;
				} else {
					this.anInt1036 ^= this.anInt1036 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt1036 ^= this.anInt1036 << 2;
			} else {
				this.anInt1036 ^= this.anInt1036 >>> 16;
			}
			this.anInt1036 += this.anIntArray93[local26 + 128 & 0xFF];
			@Pc(134) int local134;
			this.anIntArray93[local26] = local134 = this.anInt1033 + this.anIntArray93[local33 >> 2 & 0xFF] + this.anInt1036;
			this.anIntArray92[local26] = this.anInt1033 = local33 + this.anIntArray93[local134 >> 8 >> 2 & 0xFF];
		}
	}
}
