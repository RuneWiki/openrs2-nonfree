import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array11;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[F")
	public static final float[] aFloatArray45 = new float[4];

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!hd;")
	public static Class128 aClass128_23 = new Class128(8);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lclient!lt;")
	public static Class29 method4001() {
		try {
			return (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[IIZLclient!jaa;I)Lclient!hq;")
	public static Class51_Sub1_Sub1 method4002(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class14_Sub3 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean311 || Static404.method5927(arg3) && Static404.method5927(arg1)) {
			return new Class51_Sub1_Sub1(arg2, 3553, arg3, arg1, false, arg0);
		} else if (arg2.aBoolean299) {
			return new Class51_Sub1_Sub1(arg2, 34037, arg3, arg1, false, arg0);
		} else {
			return new Class51_Sub1_Sub1(arg2, arg3, arg1, Static253.method4296(arg3), Static253.method4296(arg1), arg0);
		}
	}
}
