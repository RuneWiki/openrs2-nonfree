import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_68 = Static12.method257("Loading game screen )2 ");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_69 = Static12.method257("b12_full");

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_70 = Static12.method257("Jul");

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_71 = Static12.method257("To create a new account you need to");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	private final int[] anIntArray69 = new int[256];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
	private final int[] anIntArray68 = new int[256];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I", line = 42)
	public int method231() {
		if (this.anInt265-- == 0) {
			this.method232();
			this.anInt265 = 255;
		}
		return this.anIntArray68[this.anInt265];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 72)
	private void method232() {
		this.anInt270 += ++this.anInt267;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = this.anIntArray69[local24];
			if ((local24 & 0x2) == 0) {
				if ((local24 & 0x1) == 0) {
					this.anInt272 ^= this.anInt272 << 13;
				} else {
					this.anInt272 ^= this.anInt272 >>> 6;
				}
			} else if ((local24 & 0x1) == 0) {
				this.anInt272 ^= this.anInt272 << 2;
			} else {
				this.anInt272 ^= this.anInt272 >>> 16;
			}
			this.anInt272 += this.anIntArray69[local24 + 128 & 0xFF];
			@Pc(120) int local120;
			this.anIntArray69[local24] = local120 = this.anInt272 + this.anIntArray69[local31 >> 2 & 0xFF] + this.anInt270;
			this.anIntArray68[local24] = this.anInt270 = this.anIntArray69[local120 >> 8 >> 2 & 0xFF] + local31;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 117)
	private void method233() {
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
			local22 += local27;
			local26 += local24;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local24 ^= local22 << 8;
			local20 += local26;
			local18 += local24;
			local22 += local20;
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
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local18 += this.anIntArray68[local29 + 5];
			local14 += this.anIntArray68[local29 + 7];
			local22 += this.anIntArray68[local29 + 3];
			local24 += this.anIntArray68[local29 + 2];
			local16 += this.anIntArray68[local29 + 6];
			local26 += this.anIntArray68[local29 + 1];
			local27 += this.anIntArray68[local29];
			local27 ^= local26 << 11;
			local22 += local27;
			local26 += local24;
			local20 += this.anIntArray68[local29 + 4];
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 << 10;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local14 += local20;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local26 += local16;
			local24 += local14;
			local27 += local26;
			this.anIntArray69[local29] = local27;
			this.anIntArray69[local29 + 1] = local26;
			this.anIntArray69[local29 + 2] = local24;
			this.anIntArray69[local29 + 3] = local22;
			this.anIntArray69[local29 + 4] = local20;
			this.anIntArray69[local29 + 5] = local18;
			this.anIntArray69[local29 + 6] = local16;
			this.anIntArray69[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray69[local29 + 1];
			local22 += this.anIntArray69[local29 + 3];
			local18 += this.anIntArray69[local29 + 5];
			local16 += this.anIntArray69[local29 + 6];
			local27 += this.anIntArray69[local29];
			local24 += this.anIntArray69[local29 + 2];
			local14 += this.anIntArray69[local29 + 7];
			local20 += this.anIntArray69[local29 + 4];
			local27 ^= local26 << 11;
			local26 += local24;
			local22 += local27;
			local26 ^= local24 >>> 2;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 << 8;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 >>> 16;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 << 10;
			local14 += local20;
			local18 += local16;
			local18 ^= local16 >>> 4;
			local27 += local18;
			local16 += local14;
			local16 ^= local14 << 8;
			local14 += local27;
			local14 ^= local27 >>> 9;
			local26 += local16;
			local24 += local14;
			local27 += local26;
			this.anIntArray69[local29] = local27;
			this.anIntArray69[local29 + 1] = local26;
			this.anIntArray69[local29 + 2] = local24;
			this.anIntArray69[local29 + 3] = local22;
			this.anIntArray69[local29 + 4] = local20;
			this.anIntArray69[local29 + 5] = local18;
			this.anIntArray69[local29 + 6] = local16;
			this.anIntArray69[local29 + 7] = local14;
		}
		this.method232();
		this.anInt265 = 256;
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([I)V", line = 316)
	public Class10(@OriginalArg(0) int[] arg0) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray68[local13] = arg0[local13];
		}
		this.method233();
	}
}
