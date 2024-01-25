import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class38_Sub8 extends Class38 {

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class38_Sub8(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass13_Sub2_39.method2024(arg0);
		super.aClass13_Sub2_39.method1960(arg1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		super.aClass13_Sub2_39.method2003(false);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub2_39.method2003(true);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}
}
