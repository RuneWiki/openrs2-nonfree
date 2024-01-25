import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bga", name = "t", descriptor = "Lclient!aq;")
	public final Class16_Sub1_Sub1_Sub2 aClass16_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) Class16_Sub1_Sub1_Sub2 arg0) {
		this.aClass16_Sub1_Sub1_Sub2_1 = arg0;
	}
}
