import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!id;")
	public static Class2_Sub18 aClass2_Sub18_2;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_15 = new Class17(9, 15);

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lclient!bp;")
	public static final Class24[] aClass24Array1 = new Class24[16];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)Z")
	public static boolean method3806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static244.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ld;III)V")
	public static void method3807(@OriginalArg(0) Class12_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5371 == arg2 && arg2 != -1) {
			@Pc(20) Class189 local20 = Static351.aClass175_3.method4107(arg2);
			@Pc(23) int local23 = local20.anInt5165;
			if (local23 == 1) {
				arg0.anInt5370 = 0;
				arg0.anInt5318 = 0;
				arg0.anInt5357 = arg1;
				arg0.anInt5324 = 0;
				arg0.anInt5368 = 1;
				Static369.method5563(arg0.aByte74, local20, false, arg0.anInt6328, arg0.anInt6317, arg0.anInt5318);
			}
			if (local23 == 2) {
				arg0.anInt5324 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt5371 == -1 || Static351.aClass175_3.method4107(arg2).anInt5157 >= Static351.aClass175_3.method4107(arg0.anInt5371).anInt5157) {
			arg0.anInt5357 = arg1;
			arg0.anInt5371 = arg2;
			arg0.anInt5368 = 1;
			arg0.anInt5318 = 0;
			arg0.anInt5370 = 0;
			arg0.anInt5324 = 0;
			arg0.anInt5378 = arg0.anInt5380;
			if (arg0.anInt5371 == -1) {
				return;
			}
			Static369.method5563(arg0.aByte74, Static351.aClass175_3.method4107(arg0.anInt5371), false, arg0.anInt6328, arg0.anInt6317, arg0.anInt5318);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ms;B)V")
	public static void method3808(@OriginalArg(0) Class155 arg0) {
		if (arg0.anInt4155 != Static179.anInt3213) {
			return;
		}
		if (Static267.aClass12_Sub1_Sub2_Sub2_1.aString51 == null) {
			arg0.anInt4193 = 0;
			arg0.anInt4140 = 0;
			return;
		}
		arg0.anInt4151 = 150;
		arg0.lb = (int) (Math.sin((double) Static295.anInt5281 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4193 = Static194.anInt3441;
		arg0.anInt4188 = 5;
		arg0.anInt4140 = Static379.method1117(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51);
		arg0.anInt4192 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5338;
		arg0.anInt4133 = 0;
		arg0.anInt4203 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5316;
		arg0.anInt4178 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5339;
	}
}
