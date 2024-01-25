import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt1696 = 4096;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	private int anInt1697 = 4096;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	private int anInt1699 = 4096;

	static {
		new Class242("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt1696 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt1697 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt1699 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(26) int[][] local26 = this.method5848(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static350.anInt6330; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = this.anInt1696 * local58 >> 12;
					local46[local52] = this.anInt1697 * local62 >> 12;
					local50[local52] = this.anInt1699 * local66 >> 12;
				} else {
					local42[local52] = this.anInt1696;
					local46[local52] = this.anInt1697;
					local50[local52] = this.anInt1699;
				}
			}
		}
		return local11;
	}
}
