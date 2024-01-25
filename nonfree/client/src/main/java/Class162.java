import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class162 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	private int anInt5144;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	private int anInt5146;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	private int[] anIntArray421;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	private int anInt5148;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	private int anInt5149;

	static {
		new Class159("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	private Class162() {
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([I)V")
	public Class162(@OriginalArg(0) int[] arg0) {
		this.anIntArray421 = new int[256];
		this.anIntArray420 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray421[local13] = arg0[local13];
		}
		this.method4451();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	public int method4450() {
		if (this.anInt5148-- == 0) {
			this.method4455();
			this.anInt5148 = 255;
		}
		return this.anIntArray421[this.anInt5148];
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	private void method4451() {
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
			local20 += local26;
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
			local24 += local14;
			local27 += local26;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local14 += this.anIntArray421[local29 + 7];
			local22 += this.anIntArray421[local29 + 3];
			local16 += this.anIntArray421[local29 + 6];
			local20 += this.anIntArray421[local29 + 4];
			local26 += this.anIntArray421[local29 + 1];
			local24 += this.anIntArray421[local29 + 2];
			local27 += this.anIntArray421[local29];
			local18 += this.anIntArray421[local29 + 5];
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
			local16 += local22;
			local20 += local18;
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
			this.anIntArray420[local29] = local27;
			this.anIntArray420[local29 + 1] = local26;
			this.anIntArray420[local29 + 2] = local24;
			this.anIntArray420[local29 + 3] = local22;
			this.anIntArray420[local29 + 4] = local20;
			this.anIntArray420[local29 + 5] = local18;
			this.anIntArray420[local29 + 6] = local16;
			this.anIntArray420[local29 + 7] = local14;
		}
		for (local29 = 0; local29 < 256; local29 += 8) {
			local26 += this.anIntArray420[local29 + 1];
			local22 += this.anIntArray420[local29 + 3];
			local16 += this.anIntArray420[local29 + 6];
			local14 += this.anIntArray420[local29 + 7];
			local24 += this.anIntArray420[local29 + 2];
			local20 += this.anIntArray420[local29 + 4];
			local27 += this.anIntArray420[local29];
			local18 += this.anIntArray420[local29 + 5];
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
			local16 += local22;
			local20 += local18;
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
			this.anIntArray420[local29] = local27;
			this.anIntArray420[local29 + 1] = local26;
			this.anIntArray420[local29 + 2] = local24;
			this.anIntArray420[local29 + 3] = local22;
			this.anIntArray420[local29 + 4] = local20;
			this.anIntArray420[local29 + 5] = local18;
			this.anIntArray420[local29 + 6] = local16;
			this.anIntArray420[local29 + 7] = local14;
		}
		this.method4455();
		this.anInt5148 = 256;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	private void method4455() {
		this.anInt5144 += ++this.anInt5149;
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(33) int local33 = this.anIntArray420[local26];
			if ((local26 & 0x2) == 0) {
				if ((local26 & 0x1) == 0) {
					this.anInt5146 ^= this.anInt5146 << 13;
				} else {
					this.anInt5146 ^= this.anInt5146 >>> 6;
				}
			} else if ((local26 & 0x1) == 0) {
				this.anInt5146 ^= this.anInt5146 << 2;
			} else {
				this.anInt5146 ^= this.anInt5146 >>> 16;
			}
			this.anInt5146 += this.anIntArray420[local26 + 128 & 0xFF];
			@Pc(122) int local122;
			this.anIntArray420[local26] = local122 = this.anInt5144 + this.anInt5146 + this.anIntArray420[local33 >> 2 & 0xFF];
			this.anIntArray421[local26] = this.anInt5144 = this.anIntArray420[local122 >> 8 >> 2 & 0xFF] + local33;
		}
	}
}
