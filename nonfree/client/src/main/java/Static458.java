import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
	public static boolean aBoolean556;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
	public static int[] anIntArray733;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!tc;")
	public static Class279 aClass279_6;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt7794 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method6479() {
		Static106.aClass1_Sub16_Sub3_1.method5253();
		Static351.aClass171_102 = null;
		Static302.anInt5579 = 1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6480(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static234.anInt4709; local11++) {
			if (arg0.equalsIgnoreCase(Static528.aStringArray43[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method6482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method6487(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)[Lclient!vw;")
	public static Class308[] method6488() {
		if (Static189.aClass308Array1 == null) {
			@Pc(11) Class308[] local11 = Static364.method5424(Static466.aClass102_4);
			@Pc(15) Class308[] local15 = new Class308[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(66) int local66;
			@Pc(72) Class308 local72;
			label63: for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(25) Class308 local25 = local11[local19];
				if ((local25.anInt8792 <= 0 || local25.anInt8792 >= 24) && local25.anInt8790 >= 800 && local25.anInt8789 >= 600 && (Static17.anInt454 >= 96 || Static374.anInt6861 != 0 || local25.anInt8790 <= 1024 && local25.anInt8789 <= 768)) {
					for (local66 = 0; local66 < local17; local66++) {
						local72 = local15[local66];
						if (local25.anInt8790 == local72.anInt8790 && local25.anInt8789 == local72.anInt8789) {
							if (local25.anInt8792 > local72.anInt8792) {
								local15[local66] = local25;
							}
							continue label63;
						}
					}
					local15[local17] = local25;
					local17++;
				}
			}
			Static189.aClass308Array1 = new Class308[local17];
			Static551.method3490(local15, 0, Static189.aClass308Array1, 0, local17);
			@Pc(132) int[] local132 = new int[Static189.aClass308Array1.length];
			for (local66 = 0; local66 < Static189.aClass308Array1.length; local66++) {
				local72 = Static189.aClass308Array1[local66];
				local132[local66] = local72.anInt8789 * local72.anInt8790;
			}
			Static265.method4401(Static189.aClass308Array1, local132);
		}
		return Static189.aClass308Array1;
	}
}
