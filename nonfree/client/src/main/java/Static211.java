import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "[Lclient!lk;")
	public static Class203[] aClass203Array1;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIB)Z")
	public static boolean method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static582.method7700(arg0, arg1) || Static310.method4847(arg1, arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public static void method3735(@OriginalArg(0) int arg0) {
		Static209.anInt8184 = 2;
		Static490.anInt7979 = arg0;
		if (Static148.aString42 == null) {
			Static337.method5148(35);
		} else {
			@Pc(26) Class3_Sub11 local26 = new Class3_Sub11(Static143.method6946(Static270.method4389(Static148.aString42)));
			@Pc(30) long local30 = local26.method3128();
			Static381.aLong186 = local26.method3128();
			Static536.method7048(true, Static180.method3145(local30), "");
		}
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)V")
	public static void method3736() {
		for (@Pc(10) Class3_Sub42 local10 = (Class3_Sub42) Static475.aClass130_47.method3543(); local10 != null; local10 = (Class3_Sub42) Static475.aClass130_47.method3551()) {
			if (local10.anInt7383 > 0) {
				local10.anInt7383--;
			}
			if (local10.anInt7383 != 0) {
				if (local10.anInt7379 > 0) {
					local10.anInt7379--;
				}
				if (local10.anInt7379 == 0 && local10.anInt7385 >= 1 && local10.anInt7381 >= 1 && local10.anInt7385 <= Static400.anInt6818 - 2 && Static271.anInt5050 - 2 >= local10.anInt7381 && (local10.anInt7375 < 0 || Static283.method2222(local10.anInt7387, local10.anInt7375))) {
					Static20.method435(local10.anInt7377, -1, local10.anInt7385, local10.anInt7386, local10.anInt7375, local10.anInt7381, local10.anInt7387, local10.anInt7384);
					local10.anInt7379 = -1;
					if (local10.anInt7382 == local10.anInt7375 && local10.anInt7382 == -1) {
						local10.method7812();
					} else if (local10.anInt7382 == local10.anInt7375 && local10.anInt7386 == local10.anInt7378 && local10.anInt7380 == local10.anInt7387) {
						local10.method7812();
					}
				}
			} else if (local10.anInt7382 < 0 || Static283.method2222(local10.anInt7380, local10.anInt7382)) {
				Static20.method435(local10.anInt7377, -1, local10.anInt7385, local10.anInt7378, local10.anInt7382, local10.anInt7381, local10.anInt7380, local10.anInt7384);
				local10.method7812();
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!qh;II)V")
	public static void method3740(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (Static174.aClass204_3 == null) {
			return;
		}
		try {
			Static174.aClass204_3.method4814(0L);
			Static174.aClass204_3.method4813(arg0.aByteArray36, arg1, 24);
		} catch (@Pc(26) Exception local26) {
		}
	}
}
