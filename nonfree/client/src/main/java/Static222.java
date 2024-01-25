import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!or", name = "z", descriptor = "Lclient!lm;")
	public static Class134 aClass134_106;

	@OriginalMember(owner = "client!or", name = "B", descriptor = "I")
	public static int anInt4708;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "J")
	public static long aLong137 = -1L;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "[I")
	public static final int[] anIntArray437 = new int[4096];

	@OriginalMember(owner = "client!or", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!n;III)V")
	public static void method4091(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4026 == arg1 && arg1 != -1) {
			@Pc(77) Class177 local77 = Static354.method5863(arg1);
			@Pc(80) int local80 = local77.anInt5420;
			if (local80 == 1) {
				arg0.lb = 0;
				arg0.anInt4062 = arg2;
				arg0.anInt4010 = 0;
				arg0.anInt4027 = 0;
				arg0.anInt4039 = 1;
				Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, arg0.lb, local77);
			}
			if (local80 == 2) {
				arg0.anInt4010 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4026 == -1 || Static354.method5863(arg1).anInt5417 >= Static354.method5863(arg0.anInt4026).anInt5417) {
			arg0.lb = 0;
			arg0.anInt4026 = arg1;
			arg0.anInt4027 = 0;
			arg0.anInt4039 = 1;
			arg0.anInt4062 = arg2;
			arg0.anInt4010 = 0;
			arg0.anInt4085 = arg0.anInt4088;
			if (arg0.anInt4026 != -1) {
				Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.lb, Static354.method5863(arg0.anInt4026));
			}
		}
	}
}
