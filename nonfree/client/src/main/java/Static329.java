import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
	public static int anInt6377;

	@OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
	public static int anInt6378;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_59 = new Class109(8);

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_140 = new Class85(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method5695(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static224.method4077(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local45 <= local48);
			return Static63.method4633(arg1, local48);
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)Z")
	public static boolean method5696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static93.aBoolean128) {
			return false;
		}
		@Pc(11) int local11 = arg1 >> 16;
		@Pc(15) int local15 = arg1 & 0xFFFF;
		if (Static304.aClass201ArrayArray1[local11] == null || Static304.aClass201ArrayArray1[local11][local15] == null) {
			return false;
		}
		@Pc(38) Class201 local38 = Static304.aClass201ArrayArray1[local11][local15];
		@Pc(50) Class5_Sub20 local50;
		if (arg0 == -1 && local38.anInt6559 == 0) {
			for (local50 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local50 != null; local50 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
				if (local50.anInt2094 == 6 || local50.anInt2094 == 1009 || local50.anInt2094 == 5 || local50.anInt2094 == 2 || local50.anInt2094 == 23) {
					for (@Pc(84) Class201 local84 = Static262.method4616(local50.anInt2092); local84 != null; local84 = Static180.method3264(local84)) {
						if (local84.anInt6541 == local38.anInt6541) {
							return true;
						}
					}
				}
			}
		} else {
			for (local50 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local50 != null; local50 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
				if (local50.anInt2093 == arg0 && local50.anInt2092 == local38.anInt6541 && (local50.anInt2094 == 6 || local50.anInt2094 == 1009 || local50.anInt2094 == 5 || local50.anInt2094 == 2 || local50.anInt2094 == 23)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!on;)V")
	public static void method5697(@OriginalArg(1) Class154 arg0) {
		Static9.aClass154_1 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIBII)V")
	public static void method5698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 - arg4;
		@Pc(13) int local13 = arg3 - arg1;
		if (local13 == 0) {
			if (local8 != 0) {
				Static160.method2839(arg0, arg2, arg1, arg4);
			}
		} else if (local8 == 0) {
			Static69.method1307(arg1, arg3, arg4, arg0);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local8 < 0) {
				local8 = -local8;
			}
			@Pc(60) boolean local60 = local8 > local13;
			@Pc(64) int local64;
			@Pc(68) int local68;
			if (local60) {
				local64 = arg1;
				arg1 = arg4;
				local68 = arg3;
				arg3 = arg2;
				arg4 = local64;
				arg2 = local68;
			}
			if (arg3 < arg1) {
				local64 = arg1;
				local68 = arg4;
				arg1 = arg3;
				arg4 = arg2;
				arg3 = local64;
				arg2 = local68;
			}
			local68 = arg4;
			@Pc(107) int local107 = arg3 - arg1;
			@Pc(111) int local111 = arg2 - arg4;
			@Pc(116) int local116 = -(local107 >> 1);
			@Pc(127) int local127 = arg4 >= arg2 ? -1 : 1;
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(136) int local136;
			if (local60) {
				for (local136 = arg1; local136 <= arg3; local136++) {
					local116 += local111;
					Static129.anIntArrayArray46[local136][local68] = arg0;
					if (local116 > 0) {
						local68 += local127;
						local116 -= local107;
					}
				}
			} else {
				for (local136 = arg1; local136 <= arg3; local136++) {
					local116 += local111;
					Static129.anIntArrayArray46[local68][local136] = arg0;
					if (local116 > 0) {
						local116 -= local107;
						local68 += local127;
					}
				}
			}
		}
	}
}
