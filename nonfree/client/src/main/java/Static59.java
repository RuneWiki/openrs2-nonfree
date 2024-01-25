import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "cb", descriptor = "I")
	public static int anInt5157;

	@OriginalMember(owner = "client!cda", name = "db", descriptor = "[[Lclient!lk;")
	public static Class203[][] aClass203ArrayArray3;

	@OriginalMember(owner = "client!cda", name = "ib", descriptor = "I")
	public static int anInt5160;

	@OriginalMember(owner = "client!cda", name = "R", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_106 = new Class298(34, 15);

	@OriginalMember(owner = "client!cda", name = "Z", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_158 = new Class272(58, 5);

	@OriginalMember(owner = "client!cda", name = "eb", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IZIII)V")
	public static void method4455(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static87.method1968(arg2)) {
			Static233.method3929(aClass203ArrayArray3[arg2], -1, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)Z")
	public static boolean method4458(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
	public static void method4459(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static244.method4019(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!om;Lclient!om;I)V")
	public static void method4460(@OriginalArg(1) Class246 arg0, @OriginalArg(2) Class246 arg1) {
		Static352.aClass246_122 = arg1;
		Static139.aClass246_72 = arg0;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Z")
	public static boolean method4461() {
		if (Static437.aBoolean572) {
			try {
				Static605.method6792("showVideoAd", Static533.anApplet4);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
