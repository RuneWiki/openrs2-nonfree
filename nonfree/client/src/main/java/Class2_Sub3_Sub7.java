import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "Lclient!db;")
	public Class36_Sub1 aClass36_Sub1_1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!db;)V")
	public Class2_Sub3_Sub7(@OriginalArg(0) Class36_Sub1 arg0) {
		this.aClass36_Sub1_1 = arg0;
	}
}
