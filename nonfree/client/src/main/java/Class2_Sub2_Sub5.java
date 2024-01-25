import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "Lclient!ur;")
	public final Class4_Sub2_Sub6 aClass4_Sub2_Sub6_1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) Class4_Sub2_Sub6 arg0) {
		this.aClass4_Sub2_Sub6_1 = arg0;
	}
}
