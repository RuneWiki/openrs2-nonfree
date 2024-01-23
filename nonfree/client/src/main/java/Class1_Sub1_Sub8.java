import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "Lclient!rd;")
	public Class9_Sub7 aClass9_Sub7_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) Class9_Sub7 arg0) {
		this.aClass9_Sub7_1 = arg0;
	}
}
