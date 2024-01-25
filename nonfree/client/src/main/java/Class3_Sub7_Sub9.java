import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Lclient!bka;")
	public final Class9_Sub1_Sub1_Sub3 aClass9_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!bka;)V")
	public Class3_Sub7_Sub9(@OriginalArg(0) Class9_Sub1_Sub1_Sub3 arg0) {
		this.aClass9_Sub1_Sub1_Sub3_1 = arg0;
	}
}
