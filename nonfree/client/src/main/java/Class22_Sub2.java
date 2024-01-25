import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class22_Sub2(@OriginalArg(0) Class14_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass14_Sub2_20.method7034(arg1);
		super.aClass14_Sub2_20.method7011(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		super.aClass14_Sub2_20.method6930(true);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		super.aClass14_Sub2_20.method6930(false);
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
	}
}
