import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Lclient!r;")
	public final Class1_Sub7 aClass1_Sub7_1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!r;)V")
	public Class5_Sub2_Sub9(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass1_Sub7_1 = arg0;
	}
}
