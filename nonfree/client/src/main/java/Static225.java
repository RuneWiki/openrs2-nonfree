import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray68;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static volatile int anInt4590 = 0;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString163 = "Please remove ";

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!me;")
	public static Class43 method3492() {
		@Pc(27) Class43 local27;
		if (Static116.aBoolean188) {
			local27 = new Class43_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], Static232.aByteArrayArray15[0], Static147.anIntArray236);
		} else {
			local27 = new Class43_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], Static232.aByteArrayArray15[0], Static147.anIntArray236);
		}
		Static147.method2386();
		return local27;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public static void method3495() {
		if (Static23.anInt618 == 10 && Static116.aBoolean188) {
			Static49.method774(28);
		}
		if (Static23.anInt618 == 30) {
			Static49.method774(25);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3496(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static58.method1727(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(26) int local26;
			for (local26 = local19; arg0 != arg1.charAt(local26); local26++) {
			}
			local15[local17++] = arg1.substring(local19, local26);
			local19 = local26 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method3497() {
		if (Static68.aBoolean120) {
			return;
		}
		if (Static109.aBoolean177) {
			Static82.aFloat20 = (int) Static82.aFloat20 - 65 & 0xFFFFFF80;
		} else {
			Static60.aFloat13 += (-24.0F - Static60.aFloat13) / 2.0F;
		}
		Static68.aBoolean120 = true;
		Static93.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/StringBuffer;IIC)Ljava/lang/StringBuffer;")
	public static StringBuffer method3498(@OriginalArg(0) StringBuffer arg0) {
		@Pc(15) int local15 = arg0.length();
		arg0.setLength(0);
		for (@Pc(20) int local20 = local15; local20 < 0; local20++) {
			arg0.setCharAt(local20, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method3500(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static26.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static266.aClass47_1);
		arg0.addFocusListener(Static266.aClass47_1);
	}
}
