import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class99_Sub8 extends Class99 {

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class99_Sub8(@OriginalArg(0) Class57_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		super.aClass57_Sub2_38.method2378(false);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub2_38.method2378(true);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		super.aClass57_Sub2_38.method2362(arg1);
		super.aClass57_Sub2_38.method2382(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
