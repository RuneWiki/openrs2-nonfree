import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class2_Sub7_Sub15 extends Class2_Sub7 {

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!se;")
	public final Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class2_Sub7_Sub15(@OriginalArg(0) Class1_Sub2_Sub5 arg0) {
		this.aClass1_Sub2_Sub5_1 = arg0;
	}
}
