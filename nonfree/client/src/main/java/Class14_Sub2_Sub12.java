import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class14_Sub2_Sub12 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Lclient!gv;")
	public final Class4_Sub3_Sub3_Sub4 aClass4_Sub3_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!gv;)V")
	public Class14_Sub2_Sub12(@OriginalArg(0) Class4_Sub3_Sub3_Sub4 arg0) {
		this.aClass4_Sub3_Sub3_Sub4_1 = arg0;
	}
}
