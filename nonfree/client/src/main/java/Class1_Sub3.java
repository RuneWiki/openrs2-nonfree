import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!cw;")
	public final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_5;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!qfa;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass66_Sub1_Sub1_5 = Static598.method8450(arg1, arg0, arg2, arg3);
		this.aClass66_Sub1_Sub1_5.method1669(false, false);
	}
}
