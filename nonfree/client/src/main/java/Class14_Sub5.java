import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class14_Sub5(@OriginalArg(0) Class143_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return true;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6327(true);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		super.aClass143_Sub1_22.method6338(arg0);
		super.aClass143_Sub1_22.method6322(arg1);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		super.aClass143_Sub1_22.method6327(false);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
	}
}
