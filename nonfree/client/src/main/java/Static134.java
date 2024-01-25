import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!i;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
	public static int anInt2900 = 0;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;III)V")
	public static void method2729(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static17.anIntArray169[local7] = Static17.anIntArray169[local7 - 1];
			Static185.anIntArray149[local7] = Static185.anIntArray149[local7 - 1];
			Static38.aStringArray6[local7] = Static38.aStringArray6[local7 - 1];
			Static345.aStringArray42[local7] = Static345.aStringArray42[local7 - 1];
			Static275.aStringArray30[local7] = Static275.aStringArray30[local7 - 1];
			Static163.aStringArray16[local7] = Static163.aStringArray16[local7 - 1];
			Static92.anIntArray162[local7] = Static92.anIntArray162[local7 - 1];
		}
		Static17.anIntArray169[0] = arg4;
		Static38.aStringArray6[0] = arg0;
		Static185.anIntArray149[0] = arg5;
		Static345.aStringArray42[0] = arg3;
		Static275.aStringArray30[0] = arg2;
		Static163.aStringArray16[0] = arg1;
		Static159.anInt3266 = Static356.anInt6822;
		Static92.anIntArray162[0] = arg6;
		Static93.anInt5010++;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method2731(@OriginalArg(0) int arg0) {
		@Pc(1) Class21 local1 = Static21.aClass21_20;
		synchronized (Static21.aClass21_20) {
			Static21.aClass21_20.method857();
			Static21.aClass21_20 = new Class21(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZILclient!ct;I)V")
	public static void method2732(@OriginalArg(3) int arg0, @OriginalArg(4) Class30 arg1, @OriginalArg(5) int arg2) {
		Static310.anInt5974 = 1;
		Static61.anInt1495 = 10000;
		Static149.anInt3140 = arg2;
		Class11_Sub2_Sub3.lb = arg1;
		Static286.anInt5851 = 0;
		Static192.anInt3868 = arg0;
		Static162.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	public static void method2733() {
		@Pc(10) Class21 local10 = Static10.aClass21_10;
		synchronized (Static10.aClass21_10) {
			Static10.aClass21_10.method851();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2734(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static267.method4817(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static195.anInt3948; local25++) {
			@Pc(31) String local31 = Static247.aStringArray29[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static267.method4817(local31);
			if (local31 != null && local31.equals(local20)) {
				Static195.anInt3948--;
				for (@Pc(57) int local57 = local25; local57 < Static195.anInt3948; local57++) {
					Static247.aStringArray29[local57] = Static247.aStringArray29[local57 + 1];
					Static160.aStringArray14[local57] = Static160.aStringArray14[local57 + 1];
					Static28.anIntArray47[local57] = Static28.anIntArray47[local57 + 1];
					Static275.aStringArray31[local57] = Static275.aStringArray31[local57 + 1];
					Static330.anIntArray482[local57] = Static330.anIntArray482[local57 + 1];
					Static206.aBooleanArray28[local57] = Static206.aBooleanArray28[local57 + 1];
				}
				Static27.anInt621 = Static356.anInt6822;
				Static280.method5009(Static243.aClass18_169);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0));
				Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
				break;
			}
		}
	}
}
