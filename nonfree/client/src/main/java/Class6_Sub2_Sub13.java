import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!k", name = "v", descriptor = "Lclient!dr;")
	public final Class60_Sub1_Sub1_Sub2 aClass60_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class6_Sub2_Sub13(@OriginalArg(0) Class60_Sub1_Sub1_Sub2 arg0) {
		this.aClass60_Sub1_Sub1_Sub2_1 = arg0;
	}
}
