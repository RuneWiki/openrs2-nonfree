import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "Lclient!pi;")
	public final Class2_Sub2_Sub5 aClass2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class3_Sub4_Sub18(@OriginalArg(0) Class2_Sub2_Sub5 arg0) {
		this.aClass2_Sub2_Sub5_1 = arg0;
	}
}
