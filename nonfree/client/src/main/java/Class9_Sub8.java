import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class9_Sub8(@OriginalArg(0) Class19_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		super.aClass19_Sub2_41.method1905(arg1);
		super.aClass19_Sub2_41.method1900(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		super.aClass19_Sub2_41.method1966(false);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub2_41.method1966(true);
	}
}
