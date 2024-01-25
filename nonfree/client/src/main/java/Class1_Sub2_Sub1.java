import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt55 = 4096;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	private int anInt60 = 0;

	static {
		new Class169("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt60 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt55 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(29) int[] local29 = this.method5510(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static158.anInt2658; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt60 <= local37 && this.anInt55 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
