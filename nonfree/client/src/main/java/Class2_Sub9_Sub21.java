import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class2_Sub9_Sub21 extends Class2_Sub9 {

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "Lclient!ms;")
	public final Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!ms;)V")
	public Class2_Sub9_Sub21(@OriginalArg(0) Class1_Sub2_Sub5 arg0) {
		this.aClass1_Sub2_Sub5_1 = arg0;
	}
}
