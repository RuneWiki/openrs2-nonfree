import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!sg;")
	public static Class77 aClass77_641 = Static146.method2172("null");

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!cb;")
	public static Class10 aClass10_45 = new Class10();

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "[I")
	public static int[] anIntArray262 = new int[128];

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "Lclient!sg;")
	private static Class77 aClass77_644 = Static146.method2172("Players");

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!sg;")
	public static Class77 aClass77_642 = aClass77_644;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
	public static int anInt1681 = 0;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Lclient!sg;")
	public static Class77 aClass77_643 = Static146.method2172("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "Lclient!sg;")
	public static Class77 aClass77_645 = Static146.method2172(":duelreq:");

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	public static int anInt1682 = 0;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public static void method1159() {
		aShortArrayArray6 = null;
		aClass10_45 = null;
		aClass77_643 = null;
		aClass77_644 = null;
		anIntArray262 = null;
		aClass77_645 = null;
		aClass77_641 = null;
		aClass77_642 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qf;I)I")
	public static int method1160(@OriginalArg(0) Class66 arg0) {
		@Pc(18) Class2_Sub3 local18 = (Class2_Sub3) Static179.aClass74_13.method2433(((long) arg0.anInt3229 << 32) + ((long) arg0.anInt3212));
		return local18 == null ? arg0.anInt3217 : local18.anInt178;
	}
}
