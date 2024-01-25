import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class92_Sub2(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass121_Sub2_20.method7167(arg1);
		super.aClass121_Sub2_20.method7266(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		super.aClass121_Sub2_20.method7170(false);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7170(true);
	}
}
