import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "[S")
	public static short[] aShortArray70;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!km;")
	public static Class91 aClass91_150;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "B")
	public static byte aByte14;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public static int anInt3931 = 0;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!qc;")
	public static Class135 aClass135_18 = new Class135(50);

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!qc;")
	public static Class135 aClass135_19 = new Class135(64);

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static int anInt3934 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method3156(@OriginalArg(0) String[] arg0) {
		@Pc(12) String[] local12 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local12[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local12[local18] = local12[local18] + arg0[local18];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3157(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local6; local17++) {
			local3 = (local3 << 5) + Static217.method3412(arg0.charAt(local17)) - local3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method3158() {
		Static146.method2566();
		Static242.anInt4790 = -1;
		Static24.aClass1_Sub2_Sub11_18 = null;
		Static197.method3240();
		Static42.aClass49_3.method1379();
		Static281.aClass32_3 = new Class32();
		((Class85_Sub1) Static110.anInterface2_1).method2284();
		Static157.method2740();
		Static120.anInt2770 = 0;
		Static120.aClass144Array1 = new Class144[255];
		Static144.method2471();
		Static292.method4395();
		Static9.method247();
		Static131.method2228(false);
		Static151.method4443();
		Static214.method3397();
		for (@Pc(51) int local51 = 0; local51 < 2048; local51++) {
			@Pc(60) Class14_Sub2_Sub1 local60 = Static98.aClass14_Sub2_Sub1Array1[local51];
			if (local60 != null) {
				local60.anObject6 = null;
			}
		}
		if (Static277.aBoolean412) {
			Static292.method4406();
			Static58.method818(Static134.aBoolean218);
			Static235.method3621();
		}
		Static261.method4006(Static134.aClass91_110, Static24.aClass91_169);
		Static148.method2588(Static134.aClass91_110);
		Static230.aClass1_Sub2_Sub11_10 = null;
		Static198.aClass1_Sub2_Sub11_2 = null;
		Static146.aClass1_Sub2_Sub11_13 = null;
		Static216.aClass1_Sub2_Sub11_17 = null;
		Static130.aClass1_Sub2_Sub11_12 = null;
		if (Static194.anInt4017 == 5) {
			Static123.method2163(Static134.aClass91_110);
		}
		if (Static194.anInt4017 == 10) {
			Static281.method4072(false);
		}
		if (Static194.anInt4017 == 30) {
			Static163.method2823(25);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3160(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static48.aClass138_1);
		arg0.addMouseMotionListener(Static48.aClass138_1);
		arg0.addFocusListener(Static48.aClass138_1);
	}
}
