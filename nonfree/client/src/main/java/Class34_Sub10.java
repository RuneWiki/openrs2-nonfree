import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class34_Sub10 extends Class34 {

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class34_Sub10(@OriginalArg(0) Class162_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
		super.aClass162_Sub1_23.method3906(arg1);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		super.aClass162_Sub1_23.method3941(false);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3941(true);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return true;
	}
}
