import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class5_Sub9_Sub7 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!tb;")
	public final Class25_Sub1_Sub5 aClass25_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class5_Sub9_Sub7(@OriginalArg(0) Class25_Sub1_Sub5 arg0) {
		this.aClass25_Sub1_Sub5_1 = arg0;
	}
}
