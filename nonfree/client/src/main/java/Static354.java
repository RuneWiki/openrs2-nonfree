import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "Lclient!dk;")
	public static Class54 aClass54_97;

	@OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_55 = new Class132(200);

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_84 = new Class134("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_179 = new Class102(58, 3);

	@OriginalMember(owner = "client!rt", name = "P", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_123 = new Class211(2, -1);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIIIILclient!dc;)V")
	public static void method4723(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class3_Sub4_Sub1 arg3) {
		Static456.method5710(0, arg0, arg3.aByte91, arg2, arg3.anInt6835, arg3.anInt6833, arg1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIII)V")
	public static void method4724(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static428.aLong208 = 0L;
		@Pc(8) int local8 = Static284.method3772();
		if (arg0 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static82.aClass163_1.method5528()) {
			arg1 = true;
		}
		Static202.method2706(local8, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V")
	public static void method4725() {
		for (@Pc(10) Class21_Sub2 local10 = (Class21_Sub2) Static343.aClass93_6.method2080(); local10 != null; local10 = (Class21_Sub2) Static343.aClass93_6.method2081()) {
			local10.method642();
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V")
	public static void method4726() {
		Static333.anInt5631 = -1;
		Static233.anInt6980 = -1;
		Static288.anInt4731 = 0;
		Static445.anInt7140 = -1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public static boolean method4728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static126.aBoolean52) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static151.aClass16ArrayArray1[local13] == null || Static151.aClass16ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class16 local35 = Static151.aClass16ArrayArray1[local13][local17];
		@Pc(63) Class2_Sub46 local63;
		if (arg1 == -1 && local35.anInt298 == 0) {
			for (local63 = (Class2_Sub46) Static261.aClass156_13.method3155(); local63 != null; local63 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
				if (local63.anInt7283 == 25 || local63.anInt7283 == 1002 || local63.anInt7283 == 11 || local63.anInt7283 == 23 || local63.anInt7283 == 8) {
					for (@Pc(96) Class16 local96 = Static338.method4534(local63.anInt7287); local96 != null; local96 = Static399.method5069(local96)) {
						if (local35.anInt293 == local96.anInt293) {
							return true;
						}
					}
				}
			}
		} else {
			for (local63 = (Class2_Sub46) Static261.aClass156_13.method3155(); local63 != null; local63 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
				if (arg1 == local63.anInt7286 && local63.anInt7287 == local35.anInt293 && (local63.anInt7283 == 25 || local63.anInt7283 == 1002 || local63.anInt7283 == 11 || local63.anInt7283 == 23 || local63.anInt7283 == 8)) {
					return true;
				}
			}
		}
		return false;
	}
}
