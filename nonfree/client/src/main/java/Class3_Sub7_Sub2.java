import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "Lclient!hd;")
	public final Class5_Sub4_Sub1 aClass5_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class5_Sub4_Sub1 arg0) {
		this.aClass5_Sub4_Sub1_1 = arg0;
	}
}
