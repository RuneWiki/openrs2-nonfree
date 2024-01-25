import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class34_Sub3(@OriginalArg(0) Class134_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
		super.aClass134_Sub1_21.method6724(arg1);
	}
}
