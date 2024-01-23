import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "Lclient!sk;")
	public Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!sk;)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aClass2_Sub7_1 = arg0;
	}
}
