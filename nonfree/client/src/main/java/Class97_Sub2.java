import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class97_Sub2 extends Class97 {

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!f;")
	public final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!tt;II[B)V")
	public Class97_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass31_Sub1_Sub1_1 = Static21.method353(arg0, arg2, arg3, arg1);
		this.aClass31_Sub1_Sub1_1.method1520(false, false);
	}
}
