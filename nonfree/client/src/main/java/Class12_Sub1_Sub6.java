import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class12_Sub1_Sub6 extends Class12_Sub1 {

	@OriginalMember(owner = "client!dw", name = "F", descriptor = "[Lclient!lba;")
	private Class182[] aClass182Array1;

	static {
		new Class88("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
		new Class88("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([[II)V")
	private void method2135(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static357.anInt6670;
		@Pc(9) int local9 = Static138.anInt3102;
		Static338.method2651(arg0);
		Static436.method6643(Static149.anInt3278, Static162.anInt3758);
		if (this.aClass182Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass182Array1.length; local23++) {
			@Pc(30) Class182 local30 = this.aClass182Array1[local23];
			@Pc(33) int local33 = local30.anInt7939;
			@Pc(36) int local36 = local30.anInt7941;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method6586(local9, local7);
				}
			} else if (local36 < 0) {
				local30.method6581(local9, local7);
			} else {
				local30.method6584(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			this.method2135(super.aClass174_41.method4394());
		}
		return local13;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(25) int local25 = Static357.anInt6670;
			@Pc(27) int local27 = Static138.anInt3102;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass53_41.method1463();
			this.method2135(local31);
			for (@Pc(42) int local42 = 0; local42 < Static138.anInt3102; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static357.anInt6670; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass182Array1 = new Class182[arg0.method5216()];
			for (@Pc(34) int local34 = 0; local34 < this.aClass182Array1.length; local34++) {
				@Pc(40) int local40 = arg0.method5216();
				if (local40 == 0) {
					this.aClass182Array1[local34] = Static72.method1647(arg0);
				} else if (local40 == 1) {
					this.aClass182Array1[local34] = Static167.method3367(arg0);
				} else if (local40 == 2) {
					this.aClass182Array1[local34] = Static297.method4811(arg0);
				} else if (local40 == 3) {
					this.aClass182Array1[local34] = Static291.method4731(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}
}
