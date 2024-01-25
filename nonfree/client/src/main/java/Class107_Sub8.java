import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class107_Sub8 extends Class107 {

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class107_Sub8(@OriginalArg(0) Class87_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		super.aClass87_Sub2_37.method6229(true);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub2_37.method6167(arg0);
		super.aClass87_Sub2_37.method6159(arg1);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		super.aClass87_Sub2_37.method6229(false);
	}
}
