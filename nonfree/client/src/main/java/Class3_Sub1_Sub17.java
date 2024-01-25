import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Lclient!ar;")
	public final Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ar;)V")
	public Class3_Sub1_Sub17(@OriginalArg(0) Class2_Sub3_Sub1_Sub1 arg0) {
		this.aClass2_Sub3_Sub1_Sub1_1 = arg0;
	}
}
