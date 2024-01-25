import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class5_Sub9(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		super.aClass39_Sub2_20.method6160(true);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		super.aClass39_Sub2_20.method6160(false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass39_Sub2_20.method6179(arg1);
		super.aClass39_Sub2_20.method6164(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
	}
}
