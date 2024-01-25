import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
	public static int anInt3910;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
	public static int anInt3911 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILclient!ii;Lclient!ar;I)V")
	public static void method3325(@OriginalArg(2) Class105 arg0, @OriginalArg(3) Class14 arg1) {
		Static332.aClass14_35.method305();
		if (Static152.aBoolean241) {
			return;
		}
		for (@Pc(18) Class1_Sub29 local18 = (Class1_Sub29) arg1.method302(); local18 != null; local18 = (Class1_Sub29) arg1.method313()) {
			@Pc(25) Class74 local25 = Static298.method5215(local18.anInt4242);
			if (Static186.method3284(local25)) {
				@Pc(37) boolean local37 = Static100.method1594(local25, arg0, local18);
				if (local37) {
					Static240.method4377(local18, local25, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V")
	public static void method3326(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static347.aClass83ArrayArrayArray3 = Static298.aClass83ArrayArrayArray1;
			Static263.aClass12Array2 = Static81.aClass12Array1;
		} else {
			Static347.aClass83ArrayArrayArray3 = Static321.aClass83ArrayArrayArray2;
			Static263.aClass12Array2 = Static278.aClass12Array3;
		}
		Static132.anInt6773 = Static347.aClass83ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	public static void method3327(@OriginalArg(1) int arg0) {
		if (!Static8.aBoolean13) {
			arg0 = -1;
		}
		if (Static174.anInt5777 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(18) Class145 local18 = Static295.method5182(arg0);
			@Pc(22) Class201 local22 = local18.method3700();
			if (local22 == null) {
				arg0 = -1;
			} else {
				Static197.aClass215_5.method5672(local22.method5460(), local22.method5466(), local22.method5458(), new Point(local18.anInt4307, local18.anInt4313), Static235.aCanvas6);
				Static174.anInt5777 = arg0;
			}
		}
		if (arg0 == -1 && Static174.anInt5777 != -1) {
			Static197.aClass215_5.method5672(-1, null, -1, new Point(), Static235.aCanvas6);
			Static174.anInt5777 = -1;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!lm;Z)V")
	public static void method3328(@OriginalArg(0) Class134 arg0) {
		Static347.aClass134_150 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)I")
	public static int method3329() {
		if (Static308.aBoolean499 || Static61.anInt1413 <= 0) {
			@Pc(40) int local40 = Static208.anInt4358;
			@Pc(42) int local42 = Static28.anInt538;
			@Pc(44) int local44 = Static298.anInt6013;
			@Pc(46) int local46 = Static148.anInt3051;
			@Pc(48) int local48 = Static228.anInt4754;
			if (local40 > local44 && local44 + local48 > local40) {
				@Pc(63) int local63 = -1;
				@Pc(82) int local82;
				for (@Pc(65) int local65 = 0; local65 < Static61.anInt1413; local65++) {
					if (Static345.aBoolean548) {
						local82 = (Static61.anInt1413 - local65 - 1) * 16 + local46 + 33;
						if (local82 - 13 < local42 && local42 <= local82 + 3) {
							local63 = local65;
						}
					} else {
						local82 = local46 + (Static61.anInt1413 + -1 + -local65) * 16 + 31;
						if (local82 - 13 < local42 && local42 <= local82 + 3) {
							local63 = local65;
						}
					}
				}
				if (local63 != -1) {
					local82 = 0;
					@Pc(143) Class137 local143 = new Class137(Static58.aClass14_4);
					for (@Pc(148) Class1_Sub12 local148 = (Class1_Sub12) local143.method3157(); local148 != null; local148 = (Class1_Sub12) local143.method3162()) {
						if (local63 == local82++) {
							return local148.anInt1406;
						}
					}
				}
			}
			return -1;
		} else if (Static290.aBoolean485 && Static112.aBooleanArray11[81] && Static61.anInt1413 > 2) {
			return ((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248.aClass1_248).anInt1406;
		} else {
			return ((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248).anInt1406;
		}
	}
}
