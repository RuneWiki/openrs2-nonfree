import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Lclient!fj;")
	public final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!se;II[B)V")
	public Class74_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass66_Sub1_Sub1_3 = Static358.method1519(arg3, arg1, arg0, arg2);
		this.aClass66_Sub1_Sub1_3.method1516(false, false);
	}
}
