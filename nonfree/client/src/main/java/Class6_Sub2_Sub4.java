import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!lg;")
	public final Class44_Sub4_Sub2 aClass44_Sub4_Sub2_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!lg;)V")
	public Class6_Sub2_Sub4(@OriginalArg(0) Class44_Sub4_Sub2 arg0) {
		this.aClass44_Sub4_Sub2_1 = arg0;
	}
}
