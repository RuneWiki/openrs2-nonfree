import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class Class181_Sub2 extends Class181 {

	@OriginalMember(owner = "client!um", name = "T", descriptor = "Lclient!haa;")
	private final Class4_Sub3 aClass4_Sub3_23;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!haa;Z)V")
	public Class181_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass4_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nw;ZI)V")
	@Override
	protected final void method8963(@OriginalArg(0) Class259 arg0, @OriginalArg(2) int arg1) {
		Static435.method6488(this.aClass4_Sub3_23, arg1, arg0);
	}
}
