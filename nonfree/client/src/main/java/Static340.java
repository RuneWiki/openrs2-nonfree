import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!fa;")
	public static Class99 aClass99_6;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!cl;")
	public static Class57 aClass57_7;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray24;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!fe;")
	public static final Class103 aClass103_3 = new Class103("RC", 1);

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public static int anInt5755 = 0;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_6 = new Class15("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method5108() {
		Static320.anInt5442 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static14.aClass5_Sub22Array1[local14] = null;
			Static415.aByteArray72[local14] = 1;
			Static120.aClass264Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z")
	public static boolean method5109() {
		@Pc(8) Class5_Sub9 local8 = (Class5_Sub9) Static360.aClass330_30.method7908();
		if (local8 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1146; local14++) {
			if (local8.aClass91Array1[local14] != null && local8.aClass91Array1[local14].anInt2271 == 0) {
				return false;
			}
			if (local8.aClass91Array2[local14] != null && local8.aClass91Array2[local14].anInt2271 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public static void method5111() {
		Static156.aClass214Array1 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(JZILclient!la;IIII)V")
	public static void method5112(@OriginalArg(0) long arg0, @OriginalArg(3) Class207 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static72.anInt1497 = 1;
		Static207.anInt3986 = arg2;
		Static217.aClass207_53 = arg1;
		Static230.aLong106 = arg0;
		Static522.anInt8987 = arg3;
		Static134.aBoolean181 = false;
		Static591.aClass5_Sub1_Sub5_4 = null;
		Static212.anInt4042 = 0;
		Static55.anInt1103 = 0;
		Static172.anInt3051 = 10000;
	}
}
