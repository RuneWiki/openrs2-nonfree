import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class44_Sub5 extends Class44 {

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class44_Sub5(@OriginalArg(0) Class62_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub3_43.method3932(true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		super.aClass62_Sub3_43.method4007(arg1);
		super.aClass62_Sub3_43.method3999(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		super.aClass62_Sub3_43.method3932(false);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
