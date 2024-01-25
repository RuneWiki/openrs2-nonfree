import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class44_Sub9 extends Class44 {

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class44_Sub9(@OriginalArg(0) Class66_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		super.aClass66_Sub3_38.method5382(arg1);
		super.aClass66_Sub3_38.method5355(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub3_38.method5389(true);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		super.aClass66_Sub3_38.method5389(false);
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}
}
