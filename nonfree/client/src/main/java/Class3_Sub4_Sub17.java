import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "Lclient!lu;")
	public final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!lu;)V")
	public Class3_Sub4_Sub17(@OriginalArg(0) Class2_Sub2_Sub3 arg0) {
		this.aClass2_Sub2_Sub3_1 = arg0;
	}
}
