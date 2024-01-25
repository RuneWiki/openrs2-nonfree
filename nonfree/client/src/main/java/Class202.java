import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class202 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	private int anInt5153;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	private int anInt5156;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private int anInt5162;

	static {
		new Class169("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	private Class202() {
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([I)V")
	public Class202(@OriginalArg(0) int[] arg0) {
		this.anIntArray614 = new int[256];
		this.anIntArray612 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			this.anIntArray614[local13] = arg0[local13];
		}
		this.method4534();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	private void method4531() {
		this.anInt5162 += ++this.anInt5156;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(32) int local32 = this.anIntArray612[local25];
			if ((local25 & 0x2) == 0) {
				if ((local25 & 0x1) == 0) {
					this.anInt5153 ^= this.anInt5153 << 13;
				} else {
					this.anInt5153 ^= this.anInt5153 >>> 6;
				}
			} else if ((local25 & 0x1) == 0) {
				this.anInt5153 ^= this.anInt5153 << 2;
			} else {
				this.anInt5153 ^= this.anInt5153 >>> 16;
			}
			this.anInt5153 += this.anIntArray612[local25 + 128 & 0xFF];
			@Pc(121) int local121;
			this.anIntArray612[local25] = local121 = this.anIntArray612[local32 >> 2 & 0xFF] + this.anInt5153 + this.anInt5162;
			this.anIntArray614[local25] = this.anInt5162 = local32 + this.anIntArray612[local121 >> 8 >> 2 & 0xFF];
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I")
	public int method4532() {
		if (this.anInt5157 == 0) {
			this.method4531();
			this.anInt5157 = 256;
		}
		return this.anIntArray614[this.anInt5157 - 1];
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
	public int method4533() {
		if (this.anInt5157 == 0) {
			this.method4531();
			this.anInt5157 = 256;
		}
		return this.anIntArray614[--this.anInt5157];
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	private void method4534() {
		@Pc(16) int local16 = -1640531527;
		@Pc(18) int local18 = -1640531527;
		@Pc(20) int local20 = -1640531527;
		@Pc(22) int local22 = -1640531527;
		@Pc(24) int local24 = -1640531527;
		@Pc(26) int local26 = -1640531527;
		@Pc(28) int local28 = -1640531527;
		@Pc(29) int local29 = -1640531527;
		@Pc(31) int local31;
		for (local31 = 0; local31 < 4; local31++) {
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local22 += local28;
			local26 += local24;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local26 += local16;
			local29 += local28;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local28 += this.anIntArray614[local31 + 1];
			local20 += this.anIntArray614[local31 + 5];
			local29 += this.anIntArray614[local31];
			local16 += this.anIntArray614[local31 + 7];
			local26 += this.anIntArray614[local31 + 2];
			local22 += this.anIntArray614[local31 + 4];
			local18 += this.anIntArray614[local31 + 6];
			local24 += this.anIntArray614[local31 + 3];
			local29 ^= local28 << 11;
			local28 += local26;
			local24 += local29;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local22 += local20;
			local18 += local24;
			local22 ^= local20 << 10;
			local16 += local22;
			local20 += local18;
			local20 ^= local18 >>> 4;
			local18 += local16;
			local29 += local20;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray612[local31] = local29;
			this.anIntArray612[local31 + 1] = local28;
			this.anIntArray612[local31 + 2] = local26;
			this.anIntArray612[local31 + 3] = local24;
			this.anIntArray612[local31 + 4] = local22;
			this.anIntArray612[local31 + 5] = local20;
			this.anIntArray612[local31 + 6] = local18;
			this.anIntArray612[local31 + 7] = local16;
		}
		for (local31 = 0; local31 < 256; local31 += 8) {
			local28 += this.anIntArray612[local31 + 1];
			local18 += this.anIntArray612[local31 + 6];
			local22 += this.anIntArray612[local31 + 4];
			local24 += this.anIntArray612[local31 + 3];
			local20 += this.anIntArray612[local31 + 5];
			local29 += this.anIntArray612[local31];
			local16 += this.anIntArray612[local31 + 7];
			local26 += this.anIntArray612[local31 + 2];
			local29 ^= local28 << 11;
			local24 += local29;
			local28 += local26;
			local28 ^= local26 >>> 2;
			local26 += local24;
			local22 += local28;
			local26 ^= local24 << 8;
			local24 += local22;
			local20 += local26;
			local24 ^= local22 >>> 16;
			local18 += local24;
			local22 += local20;
			local22 ^= local20 << 10;
			local20 += local18;
			local16 += local22;
			local20 ^= local18 >>> 4;
			local29 += local20;
			local18 += local16;
			local18 ^= local16 << 8;
			local28 += local18;
			local16 += local29;
			local16 ^= local29 >>> 9;
			local29 += local28;
			local26 += local16;
			this.anIntArray612[local31] = local29;
			this.anIntArray612[local31 + 1] = local28;
			this.anIntArray612[local31 + 2] = local26;
			this.anIntArray612[local31 + 3] = local24;
			this.anIntArray612[local31 + 4] = local22;
			this.anIntArray612[local31 + 5] = local20;
			this.anIntArray612[local31 + 6] = local18;
			this.anIntArray612[local31 + 7] = local16;
		}
		this.method4531();
		this.anInt5157 = 256;
	}
}
