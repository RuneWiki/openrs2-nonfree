import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "Lclient!ko;")
	public final Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class5_Sub2_Sub7(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		this.aClass2_Sub1_Sub2_1 = arg0;
	}
}
