import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class20_Sub2(@OriginalArg(0) Class44_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		super.aClass44_Sub3_42.method4605(arg0);
		super.aClass44_Sub3_42.method4658(arg1);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		super.aClass44_Sub3_42.method4617(true);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		super.aClass44_Sub3_42.method4617(false);
	}
}
