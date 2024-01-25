import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class2_Sub7(@OriginalArg(0) Class78_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		super.aClass78_Sub1_23.method6931(arg1);
		super.aClass78_Sub1_23.method6943(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return true;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6899(true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		super.aClass78_Sub1_23.method6899(false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
	}
}
