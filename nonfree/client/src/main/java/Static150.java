import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!pa;")
	public static Class86 aClass86_55;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public static int anInt3127;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Lclient!oj;")
	public static Class84 aClass84_25 = new Class84(200);

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1027 = Static186.method3527("Loading title screen )2 ");

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1028 = Static186.method3527("scroll:");

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	public static int anInt3128 = 0;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1029 = aClass50_1028;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1030 = aClass50_1027;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1031 = aClass50_1028;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!hh;IJILclient!hh;SI)V")
	public static void method2516(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5) {
		if (Static40.aBoolean44 || Static193.anInt3035 >= 500) {
			return;
		}
		Static91.aClass50Array78[Static193.anInt3035] = arg3;
		Static211.aClass50Array80[Static193.anInt3035] = arg0;
		Static27.aShortArray4[Static193.anInt3035] = arg4;
		Static225.aLongArray9[Static193.anInt3035] = arg2;
		Static9.anIntArray21[Static193.anInt3035] = arg1;
		Static66.anIntArray109[Static193.anInt3035] = arg5;
		Static193.anInt3035++;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BII)I")
	public static int method2517(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local3 = Class1_Sub3_Sub26.anIntArray276[(local3 ^ arg1[local14]) & 0xFF] ^ local3 >>> 8;
		}
		return ~local3;
	}
}
