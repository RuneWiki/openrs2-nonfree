import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "Lclient!wq;")
	public final Class9_Sub2_Sub1_Sub2_Sub2 aClass9_Sub2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class3_Sub43(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub2 arg0) {
		this.aClass9_Sub2_Sub1_Sub2_Sub2_2 = arg0;
	}
}
