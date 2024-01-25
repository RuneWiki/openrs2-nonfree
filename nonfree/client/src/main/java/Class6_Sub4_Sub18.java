import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class6_Sub4_Sub18 extends Class6_Sub4 {

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "Lclient!me;")
	public final Class11_Sub1_Sub5 aClass11_Sub1_Sub5_1;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class6_Sub4_Sub18(@OriginalArg(0) Class11_Sub1_Sub5 arg0) {
		this.aClass11_Sub1_Sub5_1 = arg0;
	}
}
