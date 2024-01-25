import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class3_Sub4_Sub14 extends Class3_Sub4 {

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "Lclient!ev;")
	public final Class19_Sub1_Sub3_Sub1 aClass19_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!ev;)V")
	public Class3_Sub4_Sub14(@OriginalArg(0) Class19_Sub1_Sub3_Sub1 arg0) {
		this.aClass19_Sub1_Sub3_Sub1_1 = arg0;
	}
}
