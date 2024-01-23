import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class1_Sub5_Sub12 extends Class1_Sub5 {

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!fn;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!fn;)V")
	public Class1_Sub5_Sub12(@OriginalArg(0) Class11_Sub2 arg0) {
		this.aClass11_Sub2_1 = arg0;
	}
}
