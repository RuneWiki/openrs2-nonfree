import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!od;")
	public final Class6_Sub1_Sub1_Sub5 aClass6_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class2_Sub3_Sub17(@OriginalArg(0) Class6_Sub1_Sub1_Sub5 arg0) {
		this.aClass6_Sub1_Sub1_Sub5_1 = arg0;
	}
}
