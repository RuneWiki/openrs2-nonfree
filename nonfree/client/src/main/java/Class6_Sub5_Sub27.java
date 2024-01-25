import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class6_Sub5_Sub27 extends Class6_Sub5 {

	static {
		new Class267("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(30) int[] local30 = this.method6543(0, arg0);
			@Pc(38) int[] local38 = this.method6543(1, arg0);
			@Pc(44) int[] local44 = this.method6543(2, arg0);
			for (@Pc(46) int local46 = 0; local46 < Static240.anInt4386; local46++) {
				@Pc(52) int local52 = local44[local46];
				if (local52 == 4096) {
					local13[local46] = local30[local46];
				} else if (local52 == 0) {
					local13[local46] = local38[local46];
				} else {
					local13[local46] = (4096 - local52) * local38[local46] + local30[local46] * local52 >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(21) int[] local21 = this.method6543(2, arg0);
			@Pc(27) int[][] local27 = this.method6544(arg0, 0);
			@Pc(33) int[][] local33 = this.method6544(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static240.anInt4386; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(130) int local130 = 4096 - local77;
					local37[local71] = local130 * local61[local71] + local49[local71] * local77 >> 12;
					local41[local71] = local53[local71] * local77 + local65[local71] * local130 >> 12;
					local45[local71] = local130 * local69[local71] + local77 * local57[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}
}
