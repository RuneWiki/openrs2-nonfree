import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "Lclient!wp;")
	public final Class28_Sub1_Sub1_Sub1_Sub2 aClass28_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!wp;)V")
	public Class3_Sub3(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub2 arg0) {
		this.aClass28_Sub1_Sub1_Sub1_Sub2_1 = arg0;
	}
}
