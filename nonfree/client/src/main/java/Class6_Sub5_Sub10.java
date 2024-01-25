import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class6_Sub5_Sub10 extends Class6_Sub5 {

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "[Lclient!kl;")
	private Class7[] aClass7Array1;

	static {
		new Class267("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
		new Class267("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([[IB)V")
	private void method1962(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static240.anInt4386;
		@Pc(9) int local9 = Static235.anInt4304;
		Static333.method4855(arg0);
		Static176.method2929(Static408.anInt7338, Static52.anInt1464);
		if (this.aClass7Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass7Array1.length; local28++) {
			@Pc(35) Class7 local35 = this.aClass7Array1[local28];
			@Pc(38) int local38 = local35.anInt5771;
			@Pc(41) int local41 = local35.anInt5773;
			if (local38 >= 0) {
				if (local41 < 0) {
					local35.method4835(local7, local9);
				} else {
					local35.method4836(local9, local7);
				}
			} else if (local41 >= 0) {
				local35.method4834(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.aClass7Array1 = new Class7[arg1.method6433()];
			for (@Pc(31) int local31 = 0; local31 < this.aClass7Array1.length; local31++) {
				@Pc(37) int local37 = arg1.method6433();
				if (local37 == 0) {
					this.aClass7Array1[local31] = Static117.method2029(arg1);
				} else if (local37 == 1) {
					this.aClass7Array1[local31] = Static302.method4474(arg1);
				} else if (local37 == 2) {
					this.aClass7Array1[local31] = Static183.method3931(arg1);
				} else if (local37 == 3) {
					this.aClass7Array1[local31] = Static361.method5345(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(25) int local25 = Static240.anInt4386;
			@Pc(27) int local27 = Static235.anInt4304;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass162_41.method3810();
			this.method1962(local31);
			for (@Pc(42) int local42 = 0; local42 < Static235.anInt4304; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static240.anInt4386; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			this.method1962(super.aClass61_41.method1607());
		}
		return local11;
	}
}
