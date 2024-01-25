import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "Lclient!oc;")
	public final Class19_Sub1_Sub3_Sub4 aClass19_Sub1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!oc;)V")
	public Class3_Sub4_Sub9(@OriginalArg(0) Class19_Sub1_Sub3_Sub4 arg0) {
		this.aClass19_Sub1_Sub3_Sub4_1 = arg0;
	}
}
