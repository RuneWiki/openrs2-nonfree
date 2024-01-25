import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class72_Sub2(@OriginalArg(0) Class45_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass45_Sub2_22.method4926(arg1);
		super.aClass45_Sub2_22.method4939(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		super.aClass45_Sub2_22.method5018(false);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		super.aClass45_Sub2_22.method5018(true);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return true;
	}
}
