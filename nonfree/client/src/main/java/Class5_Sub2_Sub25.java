import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class5_Sub2_Sub25 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Lclient!ia;")
	public final Class1 aClass1_11;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class5_Sub2_Sub25(@OriginalArg(0) Class1 arg0) {
		this.aClass1_11 = arg0;
	}
}
