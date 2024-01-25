import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!nl;")
	public static Class171 aClass171_25;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
	public static final int[] anIntArray273 = new int[50];

	@OriginalMember(owner = "client!du", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!du", name = "q", descriptor = "Z")
	public static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!jf;I)V")
	public static void method1055(@OriginalArg(1) Class119 arg0, @OriginalArg(2) int arg1) {
		if (Static141.aBoolean213) {
			Static141.aBoolean213 = false;
			arg1 = 0;
		}
		if (Static218.aClass119_5 != null && Static218.aClass119_5.method2862(arg0)) {
			return;
		}
		Static218.aClass119_5 = arg0;
		Static223.aLong135 = Static39.method699();
		Static224.anInt4007 = arg1;
		Static345.anInt6625 = arg1;
		if (Static345.anInt6625 == 0) {
			Static228.method3719();
			return;
		}
		Static93.anInt1912 = Static131.anInt2691;
		Static234.aFloat69 = Static160.aFloat49;
		Static132.anInt2710 = Static287.anInt4978;
		Static24.aFloat2 = Static290.aFloat71;
		Static74.anInt1436 = Static266.anInt4632;
		Static308.aFloat72 = Static345.aFloat81;
		Static370.aFloat77 = Static217.aFloat68;
		Static187.aFloat54 = Static116.aFloat40;
		Static315.aClass21_4 = Static215.aClass21_3;
		Static154.aFloat42 = Static300.aFloat7;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1057(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static376.anInt6317; local11++) {
			if (arg0.equalsIgnoreCase(Static290.aStringArray131[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static61.aStringArray38[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!nl;B)V")
	public static void method1059(@OriginalArg(0) Class171 arg0) {
		Static255.anInt4502 = arg0.method3769("p11_full");
		Static208.anInt3820 = arg0.method3769("p12_full");
		Static185.anInt3487 = arg0.method3769("b12_full");
		Static26.anInt586 = arg0.method3769("hitmarks");
		Static204.anInt3783 = arg0.method3769("hitbar_default");
		Static33.anInt694 = arg0.method3769("timerbar_default");
		Static181.anInt6175 = arg0.method3769("headicons_pk");
		Static348.anInt5919 = arg0.method3769("headicons_prayer");
		Static365.anInt6199 = arg0.method3769("hint_headicons");
		Static181.anInt6174 = arg0.method3769("hint_mapmarkers");
		Static207.anInt4909 = arg0.method3769("mapflag");
		Static2.anInt28 = arg0.method3769("cross");
		Static309.anInt5192 = arg0.method3769("mapdots");
		Static291.anInt5054 = arg0.method3769("scrollbar");
		Static368.anInt5297 = arg0.method3769("name_icons");
		Static284.anInt4923 = arg0.method3769("floorshadows");
		Static60.anInt1158 = arg0.method3769("compass");
		Static264.anInt4610 = arg0.method3769("otherlevel");
		Static181.anInt6177 = arg0.method3769("hint_mapedge");
	}
}
