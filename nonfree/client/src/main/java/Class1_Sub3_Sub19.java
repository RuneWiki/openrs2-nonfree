import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "Lclient!bl;")
	public Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class1_Sub3_Sub19(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_1 = arg0;
	}
}
