import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	public static int anInt2817 = -1;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)Z")
	public static boolean method2634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method2636(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2639(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static35.anInt1297 >= 100) {
			Static289.method4881(Static499.aClass114_160.method3330(Static315.anInt5993));
			return;
		}
		@Pc(22) String local22 = Static361.method5639(arg1);
		if (local22 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static35.anInt1297; local27++) {
			@Pc(34) String local34 = Static361.method5639(Static159.aStringArray13[local27]);
			if (local34 != null && local34.equals(local22)) {
				Static289.method4881(arg1 + Static49.aClass114_22.method3330(Static315.anInt5993));
				return;
			}
			if (Static529.aStringArray47[local27] != null) {
				@Pc(64) String local64 = Static361.method5639(Static529.aStringArray47[local27]);
				if (local64 != null && local64.equals(local22)) {
					Static289.method4881(arg1 + Static49.aClass114_22.method3330(Static315.anInt5993));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static108.anInt2509; local98++) {
			@Pc(105) String local105 = Static361.method5639(Static366.aStringArray40[local98]);
			if (local105 != null && local105.equals(local22)) {
				Static289.method4881(Static333.aClass114_119.method3330(Static315.anInt5993) + arg1 + Static542.aClass114_172.method3330(Static315.anInt5993));
				return;
			}
			if (Static417.aStringArray28[local98] != null) {
				@Pc(140) String local140 = Static361.method5639(Static417.aStringArray28[local98]);
				if (local140 != null && local140.equals(local22)) {
					Static289.method4881(Static333.aClass114_119.method3330(Static315.anInt5993) + arg1 + Static542.aClass114_172.method3330(Static315.anInt5993));
					return;
				}
			}
		}
		if (Static361.method5639(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36).equals(local22)) {
			Static289.method4881(Static535.aClass114_169.method3330(Static315.anInt5993));
		} else {
			Static444.method6416(Static132.aClass186_43);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg1) + 1);
			Static192.aClass1_Sub13_Sub2_1.method3061(arg1);
			Static192.aClass1_Sub13_Sub2_1.method3060(arg0 ? 1 : 0);
		}
	}
}
