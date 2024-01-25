import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "Lclient!vo;")
	public static Class348 aClass348_95;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	public static int anInt7599 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IBI)V")
	public static void method5970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class116 local16 = Static347.aClass116ArrayArray1[arg1][arg0];
		if (local16 != null) {
			Static557.anInt10159 = local16.anInt3322;
			Static20.anInt955 = local16.anInt3324;
			Static178.anInt3748 = local16.anInt3315;
		}
		Static408.method6197();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public static void method5974() {
		if (Static73.aClass94Array1 == null) {
			Static73.aClass94Array1 = Static121.method2183();
			Static523.aClass94_24 = Static73.aClass94Array1[0];
			Static435.aLong221 = Static112.method2047();
		}
		if (Static521.aClass258_1 == null) {
			Static422.method6329();
		}
		@Pc(28) Class94 local28 = Static523.aClass94_24;
		@Pc(31) int local31 = Static251.method3998();
		if (Static523.aClass94_24 == local28) {
			Static550.aString218 = Static523.aClass94_24.aClass152_2.method3624(Static142.anInt3088);
			if (Static523.aClass94_24.aBoolean210) {
				Static55.anInt1463 = Static523.aClass94_24.anInt2736 + local31 * (Static523.aClass94_24.anInt2741 - Static523.aClass94_24.anInt2736) / 100;
			}
			if (Static523.aClass94_24.aBoolean209) {
				Static550.aString218 = Static550.aString218 + Static55.anInt1463 + "%";
			}
		} else if (Static121.aClass94_22 == Static523.aClass94_24) {
			Static521.aClass258_1 = null;
			Static231.method3759(3);
		} else {
			Static550.aString218 = local28.aClass152_1.method3624(Static142.anInt3088);
			if (Static523.aClass94_24.aBoolean209) {
				Static550.aString218 = Static550.aString218 + local28.anInt2741 + "%";
			}
			Static55.anInt1463 = local28.anInt2741;
			if (Static523.aClass94_24.aBoolean210 || local28.aBoolean210) {
				Static435.aLong221 = Static112.method2047();
			}
		}
		if (Static521.aClass258_1 == null) {
			return;
		}
		Static521.aClass258_1.method5972(Static550.aString218, Static435.aLong221, Static55.anInt1463, Static523.aClass94_24);
		if (Static229.anInterface15Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static215.anInt4515 + 1; local131 < Static229.anInterface15Array1.length; local131++) {
			if (Static229.anInterface15Array1[local131].method8259() >= 100 && Static215.anInt4515 == local131 - 1 && Static9.anInt758 >= 1 && Static521.aClass258_1.method5982()) {
				try {
					Static229.anInterface15Array1[local131].method8258();
				} catch (@Pc(161) Exception local161) {
					Static229.anInterface15Array1 = null;
					return;
				}
				Static521.aClass258_1.method5971(Static229.anInterface15Array1[local131]);
				Static215.anInt4515++;
				if (Static229.anInterface15Array1.length - 1 <= Static215.anInt4515 && Static229.anInterface15Array1.length > 1) {
					Static215.anInt4515 = Static581.aClass73_1.method1887() ? 0 : -1;
				}
			}
		}
		return;
	}
}
