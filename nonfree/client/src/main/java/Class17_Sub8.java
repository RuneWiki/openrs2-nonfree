import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class17_Sub8 extends Class17 {

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class17_Sub8(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub2_41.method3203(arg0);
		super.aClass39_Sub2_41.method3162(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		super.aClass39_Sub2_41.method3227(false);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		super.aClass39_Sub2_41.method3227(true);
	}
}
