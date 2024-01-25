import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class1_Sub6_Sub8 extends Class1_Sub6 {

	@OriginalMember(owner = "client!maa", name = "w", descriptor = "Lclient!ii;")
	public final Class8_Sub3_Sub3_Sub2 aClass8_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!ii;)V")
	public Class1_Sub6_Sub8(@OriginalArg(0) Class8_Sub3_Sub3_Sub2 arg0) {
		this.aClass8_Sub3_Sub3_Sub2_1 = arg0;
	}
}
