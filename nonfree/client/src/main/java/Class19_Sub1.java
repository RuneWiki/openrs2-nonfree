import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class19_Sub1(@OriginalArg(0) Class15_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		super.aClass15_Sub2_18.method5414(arg0);
		super.aClass15_Sub2_18.method5372(arg1);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
