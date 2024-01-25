import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cfa", name = "v", descriptor = "Lclient!kba;")
	public final Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!kba;)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) Class4_Sub1_Sub2_Sub3 arg0) {
		this.aClass4_Sub1_Sub2_Sub3_1 = arg0;
	}
}
