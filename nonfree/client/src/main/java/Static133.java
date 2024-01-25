import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public static int anInt2726;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_49 = new Class11(18, 3);

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public static int anInt2725 = -1;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V")
	public static void method2603(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static191.anInt3592 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method2604(@OriginalArg(0) int arg0) {
		if (Static391.anInt6626 == 0) {
			Static249.aClass2_Sub2_Sub4_42.method5301(arg0);
		} else {
			Static257.anInt4521 = arg0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	public static void method2605() {
		if (!Static384.aBoolean466) {
			return;
		}
		while (true) {
			while (Static380.aClass138_Sub1Array2.length > Static146.anInt2918) {
				@Pc(27) Class138_Sub1 local27 = Static380.aClass138_Sub1Array2[Static146.anInt2918];
				if (local27 != null && local27.anInt3884 == -1) {
					if (Static170.aClass2_Sub21_2 == null) {
						Static170.aClass2_Sub21_2 = Static114.aClass156_1.method3507(local27.aString45);
					}
					@Pc(50) int local50 = Static170.aClass2_Sub21_2.anInt2612;
					if (local50 == -1) {
						return;
					}
					Static170.aClass2_Sub21_2 = null;
					Static146.anInt2918++;
					local27.anInt3884 = local50;
				} else {
					Static146.anInt2918++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
	public static void method2606() {
		if (Static391.anInt6627 == 10) {
			Static104.method2180(28);
		}
		if (Static391.anInt6627 == 30) {
			Static104.method2180(25);
		}
	}
}
