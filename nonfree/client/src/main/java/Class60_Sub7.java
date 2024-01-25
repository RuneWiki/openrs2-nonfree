import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class60_Sub7(@OriginalArg(0) Class43_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		super.aClass43_Sub3_43.method7220(arg1);
		super.aClass43_Sub3_43.method7281(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		super.aClass43_Sub3_43.method7240(false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub3_43.method7240(true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
