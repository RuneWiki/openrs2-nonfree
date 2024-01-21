import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!dd;")
	public static Class16 aClass16_14;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array11;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_1090 = Static41.method597("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_1086 = aClass60_1090;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_1087 = Static41.method597("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_1088 = Static41.method597("mapdots");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "J")
	public static long aLong95 = 0L;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_1089 = Static41.method597("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_1091 = Static41.method597("Einloggen");

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public static int anInt2791 = 0;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public static volatile int anInt2792 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BII)I")
	public static int method1920(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static11.method219(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!c;Lclient!od;Lclient!od;B)Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 method1921(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		@Pc(8) int local8 = arg0.method1770(arg1);
		@Pc(14) int local14 = arg0.method1785(arg2, local8);
		return Static96.method1573(local14, local8, arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method1922() {
		aClass60_1086 = null;
		aClass16_14 = null;
		aClass60_1087 = null;
		aClass60_1090 = null;
		aClass60_1088 = null;
		aClass60_1089 = null;
		aClass60_1091 = null;
		aClass4_Sub3_Sub6_Sub3Array11 = null;
	}
}
