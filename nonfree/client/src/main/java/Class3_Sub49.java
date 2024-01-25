import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!dv;")
	public final Class2_Sub3_Sub1_Sub2_Sub1 aClass2_Sub3_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!dv;)V")
	public Class3_Sub49(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub1 arg0) {
		this.aClass2_Sub3_Sub1_Sub2_Sub1_2 = arg0;
	}
}
