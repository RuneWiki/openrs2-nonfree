import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!po", name = "z", descriptor = "Lclient!bd;")
	public Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class15_Sub1 arg0) {
		this.aClass15_Sub1_1 = arg0;
	}
}
