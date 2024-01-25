import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Lclient!gf;")
	public final Class2_Sub3_Sub1_Sub3 aClass2_Sub3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!gf;)V")
	public Class3_Sub1_Sub8(@OriginalArg(0) Class2_Sub3_Sub1_Sub3 arg0) {
		this.aClass2_Sub3_Sub1_Sub3_1 = arg0;
	}
}
