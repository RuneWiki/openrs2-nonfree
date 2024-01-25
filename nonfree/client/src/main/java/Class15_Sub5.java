import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class15_Sub5 extends Class15 {

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class15_Sub5(@OriginalArg(0) Class31_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub2_40.method2549(true);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub2_40.method2535(arg0);
		super.aClass31_Sub2_40.method2495(arg1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		super.aClass31_Sub2_40.method2549(false);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
