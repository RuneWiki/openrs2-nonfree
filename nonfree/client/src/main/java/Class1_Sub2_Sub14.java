import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "Lclient!ba;")
	public Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_1 = arg0;
	}
}
