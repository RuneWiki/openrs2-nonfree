import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!er", name = "v", descriptor = "Lclient!wba;")
	public final Class12_Sub2_Sub1_Sub5 aClass12_Sub2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!wba;)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) Class12_Sub2_Sub1_Sub5 arg0) {
		this.aClass12_Sub2_Sub1_Sub5_1 = arg0;
	}
}
