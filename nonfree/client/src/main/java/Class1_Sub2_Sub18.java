import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "Lclient!v;")
	public final Class31_Sub2_Sub6 aClass31_Sub2_Sub6_1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!v;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class31_Sub2_Sub6 arg0) {
		this.aClass31_Sub2_Sub6_1 = arg0;
	}
}
