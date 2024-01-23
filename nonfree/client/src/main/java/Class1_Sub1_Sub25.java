import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!qb;")
	public Class9_Sub6 aClass9_Sub6_1;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!qb;)V")
	public Class1_Sub1_Sub25(@OriginalArg(0) Class9_Sub6 arg0) {
		this.aClass9_Sub6_1 = arg0;
	}
}
