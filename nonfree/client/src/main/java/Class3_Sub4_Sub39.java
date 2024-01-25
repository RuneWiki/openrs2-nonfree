import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class3_Sub4_Sub39 extends Class3_Sub4 {

	static {
		new Class175("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(23) int[][] local23 = this.method5962(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static106.anInt2356; local49++) {
				local39[local49] = 4096 - local27[local49];
				local43[local49] = 4096 - local31[local49];
				local47[local49] = 4096 - local35[local49];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(26) int[] local26 = this.method5960(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static106.anInt2356; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}
}
