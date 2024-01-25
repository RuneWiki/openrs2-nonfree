import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class209_Sub1 extends Class209 {

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Lclient!gg;")
	public final Class19_Sub2_Sub1 aClass19_Sub2_Sub1_4;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!os;II[B)V")
	public Class209_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass19_Sub2_Sub1_4 = Static538.method7756(arg3, arg2, arg0, arg1);
		this.aClass19_Sub2_Sub1_4.method2691(false, false);
	}
}
