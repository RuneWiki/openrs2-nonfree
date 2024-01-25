import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class34_Sub11 extends Class34 {

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class34_Sub11(@OriginalArg(0) Class162_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
		super.aClass162_Sub1_23.method3906(arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return false;
	}
}
