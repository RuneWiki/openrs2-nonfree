import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class38_Sub7 extends Class38 {

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class38_Sub7(@OriginalArg(0) Class34_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		super.aClass34_Sub2_41.method5520(true);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass34_Sub2_41.method5493(arg0);
		super.aClass34_Sub2_41.method5517(arg1);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		super.aClass34_Sub2_41.method5520(false);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}
}
