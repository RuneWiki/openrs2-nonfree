import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "Lclient!sr;")
	public final Class29_Sub2_Sub4 aClass29_Sub2_Sub4_1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!sr;)V")
	public Class6_Sub1_Sub3(@OriginalArg(0) Class29_Sub2_Sub4 arg0) {
		this.aClass29_Sub2_Sub4_1 = arg0;
	}
}
