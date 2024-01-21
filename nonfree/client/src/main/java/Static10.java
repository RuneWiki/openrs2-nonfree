import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "Lclient!jf;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public static int anInt204 = 0;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "Lclient!v;")
	private static Class76 aClass76_93 = Static134.method2017(" seconds)3");

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Lclient!v;")
	public static Class76 aClass76_92 = aClass76_93;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	public static int anInt206 = 0;

	@OriginalMember(owner = "client!be", name = "R", descriptor = "Lclient!ua;")
	public static Class72 aClass72_8 = new Class72(50);

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Lclient!v;")
	private static Class76 aClass76_96 = Static134.method2017(" ");

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "Lclient!v;")
	public static Class76 aClass76_94 = aClass76_96;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "Lclient!v;")
	public static Class76 aClass76_95 = Static134.method2017(")1j");

	@OriginalMember(owner = "client!be", name = "db", descriptor = "I")
	public static volatile int anInt212 = -1;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "Lclient!v;")
	public static Class76 aClass76_97 = Static134.method2017("<)4col>");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!v;ILclient!v;ZILclient!la;)V")
	public static void method132(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(5) Class17 arg2) {
		@Pc(14) int local14 = arg2.method299(arg1);
		@Pc(20) int local20 = arg2.method298(arg0, local14);
		Static99.method1943(local14, 255, local20, arg2);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub21 local10 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray326.length > arg0) {
			return local10.anIntArray326[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method135() {
		aClass76_93 = null;
		aClass76_94 = null;
		aClass37_1 = null;
		aClass72_8 = null;
		aClass76_97 = null;
		aCRC32_1 = null;
		aClass76_96 = null;
		aClass76_92 = null;
		aClass76_95 = null;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z")
	public static boolean method136() {
		try {
			if (Static48.anInt1229 == 2) {
				if (Static69.aClass4_Sub9_1 == null) {
					Static69.aClass4_Sub9_1 = Static136.method433(Static28.aClass17_6, Static65.anInt422, Static100.anInt2289);
					if (Static69.aClass4_Sub9_1 == null) {
						return false;
					}
				}
				if (Static102.aClass46_1 == null) {
					Static102.aClass46_1 = new Class46(Static3.aClass17_29, Static123.aClass17_40);
				}
				if (Static30.aClass4_Sub12_Sub2_4.method1073(Static102.aClass46_1, Static118.aClass17_38, Static69.aClass4_Sub9_1)) {
					Static30.aClass4_Sub12_Sub2_4.method1072();
					Static30.aClass4_Sub12_Sub2_4.method1064(Static110.anInt2401);
					Static30.aClass4_Sub12_Sub2_4.method1065(Static69.aClass4_Sub9_1, Static20.aBoolean28);
					Static28.aClass17_6 = null;
					Static48.anInt1229 = 0;
					Static102.aClass46_1 = null;
					Static69.aClass4_Sub9_1 = null;
					return true;
				}
			}
		} catch (@Pc(69) Exception local69) {
			local69.printStackTrace();
			Static30.aClass4_Sub12_Sub2_4.method1089();
			Static48.anInt1229 = 0;
			Static28.aClass17_6 = null;
			Static102.aClass46_1 = null;
			Static69.aClass4_Sub9_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
	public static void method137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
		@Pc(15) int local15 = 2048 - arg5 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg4;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (local5 != 0) {
			local30 = Class4_Sub4_Sub5_Sub1.anIntArray118[local5];
			local34 = Class4_Sub4_Sub5_Sub1.anIntArray119[local5];
			local45 = local34 * 0 - local30 * arg4 >> 16;
			local21 = local30 * 0 + arg4 * local34 >> 16;
			local19 = local45;
		}
		if (local15 != 0) {
			local30 = Class4_Sub4_Sub5_Sub1.anIntArray118[local15];
			local34 = Class4_Sub4_Sub5_Sub1.anIntArray119[local15];
			local45 = local34 * 0 + local30 * local21 >> 16;
			local21 = local34 * local21 - local30 * 0 >> 16;
			local17 = local45;
		}
		Static106.anInt2354 = arg1 - local17;
		Static74.anInt1911 = arg0;
		Static120.anInt2582 = arg2 - local21;
		Static96.anInt2222 = arg3 - local19;
		Static103.anInt2317 = arg5;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
	public static void method141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static69.aClass4_Sub10_Sub1_2.method611(91);
		Static69.aClass4_Sub10_Sub1_2.method575(arg1);
		Static69.aClass4_Sub10_Sub1_2.method597(arg0);
	}
}
