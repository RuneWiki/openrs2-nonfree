import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class2_Sub7_Sub7 extends Class2_Sub7 {

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Lclient!vn;")
	public final Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!vn;)V")
	public Class2_Sub7_Sub7(@OriginalArg(0) Class1_Sub2_Sub6 arg0) {
		this.aClass1_Sub2_Sub6_1 = arg0;
	}
}
