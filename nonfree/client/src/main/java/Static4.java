import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public static int anInt87;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!pc;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public static int anInt91;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!hh;")
	private static Class50 aClass50_31 = Static186.method3527("http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_32 = aClass50_31;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!qc;")
	public static Class90 aClass90_1 = new Class90(16);

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_33 = Static186.method3527(": ");

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Lclient!oj;")
	public static Class84 aClass84_7 = new Class84(260);

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Lclient!hh;")
	public static Class50 aClass50_34 = Static186.method3527("sl_stars");

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!hh;I)V")
	public static void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class50 arg3) {
		@Pc(8) Class93 local8 = Static186.method3524(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray12 != null) {
			@Pc(18) Class1_Sub29 local18 = new Class1_Sub29();
			local18.aClass93_119 = local8;
			local18.aClass50_1377 = arg3;
			local18.anInt4350 = arg1;
			local18.anObjectArray33 = local8.anObjectArray12;
			Static144.method2381(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt3618 > 0) {
			local36 = Static41.method649(local8);
		}
		if (!local36 || !Static86.method1289(Static35.method552(local8), arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static32.aClass1_Sub17_Sub1_1.method2182(199);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 2) {
			Static32.aClass1_Sub17_Sub1_1.method2182(29);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 3) {
			Static32.aClass1_Sub17_Sub1_1.method2182(44);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 4) {
			Static32.aClass1_Sub17_Sub1_1.method2182(159);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 5) {
			Static32.aClass1_Sub17_Sub1_1.method2182(108);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 6) {
			Static32.aClass1_Sub17_Sub1_1.method2182(212);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 7) {
			Static32.aClass1_Sub17_Sub1_1.method2182(48);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 8) {
			Static32.aClass1_Sub17_Sub1_1.method2182(185);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 9) {
			Static32.aClass1_Sub17_Sub1_1.method2182(4);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
		if (arg1 == 10) {
			Static32.aClass1_Sub17_Sub1_1.method2182(62);
			Static32.aClass1_Sub17_Sub1_1.method2124(arg2);
			Static32.aClass1_Sub17_Sub1_1.method2151(arg0);
		}
	}
}
