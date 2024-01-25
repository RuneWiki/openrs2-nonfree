import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class11_Sub2_Sub9 extends Class11_Sub2 {

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
	private int anInt1634 = 12288;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt1638 = 4096;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
	private int anInt1640 = 2048;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
	private int anInt1648 = 0;

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
	private int anInt1649 = 8192;

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
	private int anInt1646 = 2048;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
	private int anInt1644 = 0;

	static {
		new Class117("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(28) int local28 = Static155.anIntArray196[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static339.anInt6549; local30++) {
				@Pc(38) int local38 = Static73.anIntArray91[local30] - 2048;
				@Pc(43) int local43 = this.anInt1640 + local38;
				@Pc(54) int local54 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(65) int local65 = local54 <= 2048 ? local54 : local54 - 4096;
				@Pc(70) int local70 = this.anInt1648 + local28;
				@Pc(79) int local79 = local70 >= -2048 ? local70 : local70 + 4096;
				@Pc(90) int local90 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(95) int local95 = this.anInt1644 + local38;
				@Pc(106) int local106 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(117) int local117 = local106 > 2048 ? local106 - 4096 : local106;
				@Pc(123) int local123 = local28 + this.anInt1646;
				@Pc(134) int local134 = local123 < -2048 ? local123 + 4096 : local123;
				@Pc(143) int local143 = local134 <= 2048 ? local134 : local134 - 4096;
				local18[local30] = this.method1347(local90, local65) || this.method1344(local117, local143) ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(III)Z")
	private boolean method1344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1634 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static333.anIntArray526[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt1634;
		@Pc(41) int local41 = (local29 << 12) / this.anInt1649;
		@Pc(48) int local48 = local41 * this.anInt1638 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static22.method318();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1640 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt1648 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt1644 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt1646 = arg0.method5187();
		} else if (arg1 == 4) {
			this.anInt1634 = arg0.method5187();
		} else if (arg1 == 5) {
			this.anInt1638 = arg0.method5187();
		} else if (arg1 == 6) {
			this.anInt1649 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(III)Z")
	private boolean method1347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt1634 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static333.anIntArray526[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt1634;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1649;
		@Pc(52) int local52 = this.anInt1638 * local45 >> 12;
		return arg1 + arg0 < local52 && -local52 < arg0 + arg1;
	}
}
