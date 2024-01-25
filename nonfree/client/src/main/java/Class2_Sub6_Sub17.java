import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class2_Sub6_Sub17 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!qga;")
	public final Class4_Sub2_Sub1_Sub3 aClass4_Sub2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!qga;)V")
	public Class2_Sub6_Sub17(@OriginalArg(0) Class4_Sub2_Sub1_Sub3 arg0) {
		this.aClass4_Sub2_Sub1_Sub3_1 = arg0;
	}
}
