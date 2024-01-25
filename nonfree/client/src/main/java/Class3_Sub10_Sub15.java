import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class3_Sub10_Sub15 extends Class3_Sub10 {

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!fl;")
	public final Class6_Sub1_Sub3 aClass6_Sub1_Sub3_1;

	static {
		new Class67("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!fl;)V")
	public Class3_Sub10_Sub15(@OriginalArg(0) Class6_Sub1_Sub3 arg0) {
		this.aClass6_Sub1_Sub3_1 = arg0;
	}
}
