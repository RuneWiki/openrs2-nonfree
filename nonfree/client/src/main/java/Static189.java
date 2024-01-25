import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!m;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_46 = new Class179(11, 16);

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
	public static boolean aBoolean207 = true;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!hp;I)Lclient!wh;")
	public static Class85_Sub4 method2963(@OriginalArg(0) Class1_Sub5 arg0) {
		return new Class85_Sub4(arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5399(), arg0.method5366());
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZFFFI)F")
	public static float method2966(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(12) float[] local12 = Static197.aFloatArrayArray2[arg3];
		return local12[2] * arg0 + arg2 * local12[1] + arg1 * local12[0];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)I")
	public static int method2969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}
}
