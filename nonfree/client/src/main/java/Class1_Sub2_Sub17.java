import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!te", name = "H", descriptor = "Lclient!kc;")
	public Class9_Sub7 aClass9_Sub7_1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!kc;)V")
	public Class1_Sub2_Sub17(@OriginalArg(0) Class9_Sub7 arg0) {
		this.aClass9_Sub7_1 = arg0;
	}
}
