import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fp", name = "yb", descriptor = "I")
	public static int anInt3093;

	@OriginalMember(owner = "client!fp", name = "Bb", descriptor = "I")
	public static int anInt3095;

	@OriginalMember(owner = "client!fp", name = "ub", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!fp", name = "wb", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_45 = new Class173(6, 3);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public static void method2782() {
		Static86.aClass244_11.method5962();
		Static575.anInt10052 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)I")
	public static int method2791(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)V")
	public static void method2797() {
		if (Static256.aClass96Array1 == null) {
			Static256.aClass96Array1 = Static129.method2636();
			Static141.aClass96_23 = Static256.aClass96Array1[0];
			Static17.aLong7 = Static574.method8210();
		}
		if (Static113.aClass282_1 == null) {
			Static420.method6569();
		}
		@Pc(23) Class96 local23 = Static141.aClass96_23;
		@Pc(26) int local26 = Static74.method1213();
		if (Static141.aClass96_23 == local23) {
			Static231.aString46 = Static141.aClass96_23.aClass364_1.method8334(Static154.anInt3181);
			if (Static141.aClass96_23.aBoolean211) {
				Static355.anInt6917 = Static141.aClass96_23.anInt2835 + local26 * (Static141.aClass96_23.anInt2827 - Static141.aClass96_23.anInt2835) / 100;
			}
			if (Static141.aClass96_23.aBoolean212) {
				Static231.aString46 = Static231.aString46 + Static355.anInt6917 + "%";
			}
		} else if (Static141.aClass96_23 == Static129.aClass96_22) {
			Static113.aClass282_1 = null;
			Static285.method5604(3);
		} else {
			Static231.aString46 = local23.aClass364_2.method8334(Static154.anInt3181);
			Static355.anInt6917 = local23.anInt2827;
			if (Static141.aClass96_23.aBoolean212) {
				Static231.aString46 = Static231.aString46 + local23.anInt2827 + "%";
			}
			if (Static141.aClass96_23.aBoolean211 || local23.aBoolean211) {
				Static17.aLong7 = Static574.method8210();
			}
		}
		if (Static113.aClass282_1 == null) {
			return;
		}
		Static113.aClass282_1.method6819(Static17.aLong7, Static355.anInt6917, Static141.aClass96_23, Static231.aString46);
		if (Static400.anInterface14Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static310.anInt6188 + 1; local130 < Static400.anInterface14Array1.length; local130++) {
			if (Static400.anInterface14Array1[local130].method7594() >= 100 && local130 - 1 == Static310.anInt6188 && Static203.anInt3855 >= 1 && Static113.aClass282_1.method6826()) {
				try {
					Static400.anInterface14Array1[local130].method7593();
				} catch (@Pc(160) Exception local160) {
					Static400.anInterface14Array1 = null;
					return;
				}
				Static113.aClass282_1.method6818(Static400.anInterface14Array1[local130]);
				Static310.anInt6188++;
				if (Static400.anInterface14Array1.length - 1 <= Static310.anInt6188 && Static400.anInterface14Array1.length > 1) {
					Static310.anInt6188 = Static376.aClass302_1.method7171() ? 0 : -1;
				}
			}
		}
		return;
	}
}
