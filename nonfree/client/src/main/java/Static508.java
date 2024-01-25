import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!qf;")
	public static Class283 aClass283_36;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt9992 = -1;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_352 = new Class179(49, 10);

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString136 = null;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method8438(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0];
		@Pc(13) int local13 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0];
		if (local8 < 0 || local8 >= Static491.anInt9856 || local13 < 0 || Static393.anInt6574 <= local13) {
			return false;
		} else if (arg7 >= 0 && Static491.anInt9856 > arg7 && arg4 >= 0 && arg4 < Static393.anInt6574) {
			@Pc(71) int local71 = Static526.method7374(local8, arg4, arg1, Static521.anIntArray573, local13, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326(), arg6, arg2, arg7, arg3, Static83.aClass324Array1[Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140], arg0, arg5, Static459.anIntArray519);
			if (local71 < 1) {
				return false;
			}
			Static566.anInt9418 = Static459.anIntArray519[local71 - 1];
			anInt9992 = Static521.anIntArray573[local71 - 1];
			Static291.aBoolean316 = false;
			Static493.method7104();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = Static175.aShort43 + local7 * (Static76.aShort24 - Static175.aShort43) / 100;
		@Pc(38) int local38 = local32 * arg6 >> 8;
		Static472.anInt8136 = local32 * Static472.anInt8141 >> 8;
		@Pc(51) int local51 = 16384 - arg2 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg1 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local38;
		if (local51 != 0) {
			local61 = -local38 * Class6_Sub1_Sub3.anIntArray56[local51] >> 14;
			local63 = Class6_Sub1_Sub3.anIntArray58[local51] * local38 >> 14;
		}
		if (local57 != 0) {
			local59 = Class6_Sub1_Sub3.anIntArray56[local57] * local63 >> 14;
			local63 = local63 * Class6_Sub1_Sub3.anIntArray58[local57] >> 14;
		}
		Static23.anInt564 = arg0 - local59;
		Static542.anInt9140 = arg3 - local63;
		Static672.anInt10375 = arg1;
		Static536.anInt8770 = 0;
		Static598.anInt9788 = arg2;
		Static170.anInt2855 = arg5 - local61;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method8440(@OriginalArg(1) Class132 arg0) {
		for (@Pc(18) Class2_Sub8 local18 = (Class2_Sub8) Static100.aClass43_4.method1087(); local18 != null; local18 = (Class2_Sub8) Static100.aClass43_4.method1088()) {
			if (local18.aBoolean312) {
				local18.method4179(arg0);
			}
		}
	}
}
