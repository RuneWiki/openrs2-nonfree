import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!cca;")
	public final Class12_Sub2_Sub1_Sub1 aClass12_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!cca;)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class12_Sub2_Sub1_Sub1 arg0) {
		this.aClass12_Sub2_Sub1_Sub1_1 = arg0;
	}
}
