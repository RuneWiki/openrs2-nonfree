import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lclient!fa;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array11;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lclient!ke;")
	public static Class43 aClass43_34;

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
	public static int anInt3698 = 0;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
	public static int anInt3701 = 0;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
	public static void method2564() {
		aClass2_Sub2_Sub3_Sub2Array11 = null;
		aClass27_1 = null;
		aClass43_34 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!wb;)V")
	public static void method2565(@OriginalArg(1) Class2_Sub21 arg0) {
		Static56.method1061(200000, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static176.anInt4482; local9++) {
			if (Static94.anIntArray385[local9] + Static56.anIntArray233[local9] > arg2 && Static56.anIntArray233[local9] < arg0 + arg2 && arg1 < Static74.anIntArray330[local9] + Static98.anIntArray396[local9] && Static74.anIntArray330[local9] < arg3 + arg1) {
				Static154.aBooleanArray17[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Z)Lclient!o;")
	public static Class18 method2567() {
		try {
			return (Class18) Class.forName("Class18_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
