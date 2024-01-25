import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class19_Sub2(@OriginalArg(0) Class20_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		super.aClass20_Sub3_42.method7391(false);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub3_42.method7358(arg0);
		super.aClass20_Sub3_42.method7348(arg1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub3_42.method7391(true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
	}
}
