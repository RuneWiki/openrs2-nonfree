import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class73_Sub8 extends Class73 {

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bda;)V")
	public Class73_Sub8(@OriginalArg(0) Class4_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7304(true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super.aClass4_Sub2_19.method7316(arg1);
		super.aClass4_Sub2_19.method7279(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		super.aClass4_Sub2_19.method7304(false);
	}
}
