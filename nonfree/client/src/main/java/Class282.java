import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class282 {

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	private int anInt7963;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	private int anInt7965;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	private int anInt7966;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	private int anInt7967;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "[I")
	private int[] anIntArray482;

	static {
		for (@Pc(12) int local12 = 0; local12 < 26; local12++) {
			aCharArray6[local12] = (char) (local12 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray6[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(44) int local44 = 52; local44 < 62; local44++) {
			aCharArray6[local44] = (char) (local44 + 48 - 52);
		}
		aCharArray6[63] = '/';
		aCharArray6[62] = '+';
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	private Class282() {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "([I)V")
	public Class282(@OriginalArg(0) int[] arg0) {
		this.anIntArray481 = new int[256];
		this.anIntArray482 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray482[local13] = arg0[local13];
		}
		this.method6679();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	private void method6674() {
		this.anInt7967 += ++this.anInt7965;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray481[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt7966 ^= this.anInt7966 << 13;
				} else {
					this.anInt7966 ^= this.anInt7966 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt7966 ^= this.anInt7966 << 2;
			} else {
				this.anInt7966 ^= this.anInt7966 >>> 16;
			}
			this.anInt7966 += this.anIntArray481[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray481[local25] = local121 = this.anInt7967 + this.anInt7966 + this.anIntArray481[local32 >> 2 & 0xFF];
			this.anIntArray482[local25] = this.anInt7967 = local32 + this.anIntArray481[local121 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)I")
	public int method6678() {
		if (this.anInt7963 == 0) {
			this.method6674();
			this.anInt7963 = 256;
		}
		return this.anIntArray482[--this.anInt7963];
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	private void method6679() {
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
			local21 += local20;
			local18 += local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local10 += this.anIntArray482[local23 + 6];
			local18 += this.anIntArray482[local23 + 2];
			local12 += this.anIntArray482[local23 + 5];
			local8 += this.anIntArray482[local23 + 7];
			local14 += this.anIntArray482[local23 + 4];
			local20 += this.anIntArray482[local23 + 1];
			local16 += this.anIntArray482[local23 + 3];
			local21 += this.anIntArray482[local23];
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
			local21 += local12;
			local10 += local8;
			local10 ^= local8 << 8;
			local20 += local10;
			local8 += local21;
			local8 ^= local21 >>> 9;
			local21 += local20;
			local18 += local8;
			this.anIntArray481[local23] = local21;
			this.anIntArray481[local23 + 1] = local20;
			this.anIntArray481[local23 + 2] = local18;
			this.anIntArray481[local23 + 3] = local16;
			this.anIntArray481[local23 + 4] = local14;
			this.anIntArray481[local23 + 5] = local12;
			this.anIntArray481[local23 + 6] = local10;
			this.anIntArray481[local23 + 7] = local8;
		}
		for (local23 = 0; local23 < 256; local23 += 8) {
			local21 += this.anIntArray481[local23];
			local12 += this.anIntArray481[local23 + 5];
			local16 += this.anIntArray481[local23 + 3];
			local14 += this.anIntArray481[local23 + 4];
			local20 += this.anIntArray481[local23 + 1];
			local18 += this.anIntArray481[local23 + 2];
			local10 += this.anIntArray481[local23 + 6];
			local8 += this.anIntArray481[local23 + 7];
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
			local10 += local16;
			local14 += local12;
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
			local21 += local20;
			local18 += local8;
			this.anIntArray481[local23] = local21;
			this.anIntArray481[local23 + 1] = local20;
			this.anIntArray481[local23 + 2] = local18;
			this.anIntArray481[local23 + 3] = local16;
			this.anIntArray481[local23 + 4] = local14;
			this.anIntArray481[local23 + 5] = local12;
			this.anIntArray481[local23 + 6] = local10;
			this.anIntArray481[local23 + 7] = local8;
		}
		this.method6674();
		this.anInt7963 = 256;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)I")
	public int method6680() {
		if (this.anInt7963 == 0) {
			this.method6674();
			this.anInt7963 = 256;
		}
		return this.anIntArray482[this.anInt7963 - 1];
	}
}
