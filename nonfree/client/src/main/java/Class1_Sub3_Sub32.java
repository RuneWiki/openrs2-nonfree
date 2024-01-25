import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	private int anInt5996 = 4096;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	private int anInt6000 = 0;

	static {
		new Class34("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6000 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt5996 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = local37 >= this.anInt6000 && local37 <= this.anInt5996 ? 4096 : 0;
			}
		}
		return local19;
	}
}
