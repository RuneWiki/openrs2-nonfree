import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!gja;")
	public final Class19_Sub1_Sub3_Sub2_Sub1 aClass19_Sub1_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!gja;)V")
	public Class3_Sub13(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub1 arg0) {
		this.aClass19_Sub1_Sub3_Sub2_Sub1_2 = arg0;
	}
}
