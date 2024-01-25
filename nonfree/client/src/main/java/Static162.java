import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "[Lclient!cv;")
	public static final Class64[] aClass64Array1 = new Class64[37];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)V")
	public static void method2430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class14_Sub1_Sub2 local13 = local7.aClass14_Sub1_Sub2_2;
		@Pc(16) Class14_Sub1_Sub2 local16 = local7.aClass14_Sub1_Sub2_1;
		if (local13 != null) {
			local13.aShort106 = (short) (local13.aShort106 * arg3 / (0x10 << anInt2830 - 7));
			local13.aShort105 = (short) (local13.aShort105 * arg3 / (0x10 << anInt2830 - 7));
		}
		if (local16 != null) {
			local16.aShort106 = (short) (local16.aShort106 * arg3 / (0x10 << anInt2830 - 7));
			local16.aShort105 = (short) (local16.aShort105 * arg3 / (0x10 << anInt2830 - 7));
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!dh;ILclient!ha;ILclient!pda;IILclient!on;)V")
	public static void method2432(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class262 arg7) {
		@Pc(14) int local14 = arg3 - arg0 / 2 - 5;
		@Pc(18) int local18 = arg5 + 2;
		if (arg1.anInt1510 != 0) {
			arg2.method7045(arg0 + 10, -local18 + arg5 - -(arg6 * arg7.method6266()) - -1, local18, local14, arg1.anInt1510);
		}
		if (arg1.anInt1522 != 0) {
			arg2.method7005(arg5 + arg6 * arg7.method6266() + 1 - local18, arg1.anInt1522, arg0 + 10, local18, local14);
		}
		@Pc(76) int local76 = arg1.anInt1536;
		if (arg4.aBoolean602 && arg1.anInt1514 != -1) {
			local76 = arg1.anInt1514;
		}
		for (@Pc(94) int local94 = 0; local94 < arg6; local94++) {
			@Pc(100) String local100 = Static157.aStringArray11[local94];
			if (arg6 - 1 > local94) {
				local100 = local100.substring(0, local100.length() - 4);
			}
			arg7.method6269(arg2, local100, arg3, arg5, local76);
			arg5 += arg7.method6266();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static514.anInt8603 <= arg2 && Static487.anInt8320 >= arg0 && Static304.anInt4824 <= arg5 && arg3 <= Static231.anInt3977) {
			Static91.method1411(arg2, arg6, arg1, arg3, arg0, arg4, arg5);
		} else {
			Static86.method1354(arg6, arg4, arg0, arg3, arg5, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method2436() {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(0, 15);
		local8.method4132();
	}
}
