import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "[Lclient!lo;")
	private Class79[] aClass79Array1;

	static {
		new Class93("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			this.method670(super.aClass137_41.method3808());
		}
		return local9;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(25) int local25 = Static339.anInt6735;
			@Pc(27) int local27 = Static84.anInt1830;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass88_41.method2626();
			this.method670(local31);
			for (@Pc(42) int local42 = 0; local42 < Static84.anInt1830; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static339.anInt6735; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.aClass79Array1 = new Class79[arg1.method4421()];
			for (@Pc(36) int local36 = 0; local36 < this.aClass79Array1.length; local36++) {
				@Pc(42) int local42 = arg1.method4421();
				if (local42 == 0) {
					this.aClass79Array1[local36] = Static12.method422(arg1);
				} else if (local42 == 1) {
					this.aClass79Array1[local36] = Static255.method4617(arg1);
				} else if (local42 == 2) {
					this.aClass79Array1[local36] = Static307.method5419(arg1);
				} else if (local42 == 3) {
					this.aClass79Array1[local36] = Static253.method5946(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean597 = arg1.method4421() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([[II)V")
	private void method670(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static339.anInt6735;
		@Pc(12) int local12 = Static84.anInt1830;
		Static196.method3524(arg0);
		Static8.method216(Static25.anInt1346, Static285.anInt5782);
		if (this.aClass79Array1 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass79Array1.length; local26++) {
			@Pc(33) Class79 local33 = this.aClass79Array1[local26];
			@Pc(36) int local36 = local33.anInt5792;
			@Pc(39) int local39 = local33.anInt5793;
			if (local36 >= 0) {
				if (local39 >= 0) {
					local33.method5119(local7, local12);
				} else {
					local33.method5114(local7, local12);
				}
			} else if (local39 >= 0) {
				local33.method5116(local7, local12);
			}
		}
	}
}
