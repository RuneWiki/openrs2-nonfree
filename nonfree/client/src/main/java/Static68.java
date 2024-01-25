import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method1217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static308.aBoolean499) {
			return false;
		}
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static313.aClass163ArrayArray1[local18] == null || Static313.aClass163ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class163 local40 = Static313.aClass163ArrayArray1[local18][local22];
		@Pc(55) Class1_Sub12 local55;
		if (arg1 == -1 && local40.anInt4934 == 0) {
			for (local55 = (Class1_Sub12) Static58.aClass14_4.method302(); local55 != null; local55 = (Class1_Sub12) Static58.aClass14_4.method313()) {
				if (local55.anInt1409 == 32 || local55.anInt1409 == 1003 || local55.anInt1409 == 39 || local55.anInt1409 == 36 || local55.anInt1409 == 6) {
					for (@Pc(88) Class163 local88 = Static248.method22(local55.anInt1405); local88 != null; local88 = Static220.method4064(local88)) {
						if (local88.anInt4947 == local40.anInt4947) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class1_Sub12) Static58.aClass14_4.method302(); local55 != null; local55 = (Class1_Sub12) Static58.aClass14_4.method313()) {
				if (local55.anInt1410 == arg1 && local55.anInt1405 == local40.anInt4947 && (local55.anInt1409 == 32 || local55.anInt1409 == 1003 || local55.anInt1409 == 39 || local55.anInt1409 == 36 || local55.anInt1409 == 6)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lclient!en;")
	public static Class60 method1219(@OriginalArg(1) int arg0) {
		@Pc(5) Class37 local5 = Static114.aClass37_39;
		@Pc(14) Class60 local14;
		synchronized (Static114.aClass37_39) {
			local14 = (Class60) Static114.aClass37_39.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(42) byte[] local42 = Static27.aClass134_96.method3009(Static129.method2095(arg0), Static345.method5774(arg0));
		local14 = new Class60();
		local14.anInt1530 = arg0;
		if (local42 != null) {
			local14.method1266(new Class1_Sub21(local42));
		}
		local14.method1277();
		@Pc(63) Class37 local63 = Static114.aClass37_39;
		synchronized (Static114.aClass37_39) {
			Static114.aClass37_39.method922((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!lm;)V")
	public static void method1220(@OriginalArg(1) Class134 arg0) {
		Static17.aClass134_8 = arg0;
	}
}
