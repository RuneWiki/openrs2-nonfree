import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "Lclient!si;")
	public Class15_Sub7 aClass15_Sub7_1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class1_Sub2_Sub24(@OriginalArg(0) Class15_Sub7 arg0) {
		this.aClass15_Sub7_1 = arg0;
	}
}
