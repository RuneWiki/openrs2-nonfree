import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "Lclient!lw;")
	public final Class13_Sub1_Sub1_Sub2 aClass13_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!lw;)V")
	public Class2_Sub2_Sub21(@OriginalArg(0) Class13_Sub1_Sub1_Sub2 arg0) {
		this.aClass13_Sub1_Sub1_Sub2_1 = arg0;
	}
}
