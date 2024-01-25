import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	static {
		new Class140("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(30) int[][] local30 = this.method5707(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static263.anInt5504; local56++) {
				local46[local56] = 4096 - local34[local56];
				local50[local56] = 4096 - local38[local56];
				local54[local56] = 4096 - local42[local56];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(26) int[] local26 = this.method5700(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static263.anInt5504; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}
}
