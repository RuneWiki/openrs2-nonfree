import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "[[[Lclient!eg;")
	public static Class2_Sub7[][][] aClass2_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[S")
	public static short[] aShortArray12;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_81 = Static184.method2923("null");

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt407 = -1;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	public static int anInt408 = -1;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!i;")
	private static Class41 aClass41_85 = Static184.method2923("Checking for updates )2 ");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_82 = aClass41_85;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_83 = Static184.method2923("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_84 = Static184.method2923("(U(Y");

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_86 = Static184.method2923("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!tg;)V")
	public static void method293(@OriginalArg(1) Class92 arg0) {
		Static98.aClass92_1 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method294(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub23 local12 = (Class2_Sub23) Static28.aClass70_1.method2203(); local12 != null; local12 = (Class2_Sub23) Static28.aClass70_1.method2204()) {
			if ((long) arg0 == (local12.aLong150 >> 48 & 0xFFFFL)) {
				local12.method3314();
			}
		}
	}
}
