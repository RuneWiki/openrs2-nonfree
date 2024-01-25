import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class1_Sub6_Sub6 extends Class1_Sub6 {

	@OriginalMember(owner = "client!iga", name = "F", descriptor = "Lclient!mb;")
	public final Class8_Sub3_Sub3_Sub3 aClass8_Sub3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class1_Sub6_Sub6(@OriginalArg(0) Class8_Sub3_Sub3_Sub3 arg0) {
		this.aClass8_Sub3_Sub3_Sub3_1 = arg0;
	}
}
