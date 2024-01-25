import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class5_Sub9_Sub4 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!dr;")
	public final Class25_Sub1_Sub3 aClass25_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class5_Sub9_Sub4(@OriginalArg(0) Class25_Sub1_Sub3 arg0) {
		this.aClass25_Sub1_Sub3_1 = arg0;
	}
}
