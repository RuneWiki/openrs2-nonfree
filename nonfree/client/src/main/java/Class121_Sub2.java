import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class121_Sub2(@OriginalArg(0) Class67_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return true;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub1_23.method5560(true);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass67_Sub1_23.method5612(arg0);
		super.aClass67_Sub1_23.method5655(arg1);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		super.aClass67_Sub1_23.method5560(false);
	}
}
