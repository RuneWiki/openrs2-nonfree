import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!lm;")
	public final Class81_Sub2_Sub1 aClass81_Sub2_Sub1_5;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ic;II[B)V")
	public Class8_Sub2(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass81_Sub2_Sub1_5 = Static400.method3642(arg1, arg3, arg0, arg2);
		this.aClass81_Sub2_Sub1_5.method3640(false, false);
	}
}
