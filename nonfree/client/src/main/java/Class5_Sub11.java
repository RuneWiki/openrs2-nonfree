import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class5_Sub11(@OriginalArg(0) Class144_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		super.aClass144_Sub1_20.method5712(false);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub1_20.method5712(true);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		super.aClass144_Sub1_20.method5643(arg1);
		super.aClass144_Sub1_20.method5723(arg0);
	}
}
