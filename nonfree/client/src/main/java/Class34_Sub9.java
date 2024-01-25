import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class34_Sub9 extends Class34 {

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class34_Sub9(@OriginalArg(0) Class134_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		super.aClass134_Sub1_21.method6824(false);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6824(true);
	}

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return true;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
		super.aClass134_Sub1_21.method6724(arg1);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
