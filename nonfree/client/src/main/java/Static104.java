import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	public static int anInt3191;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_86;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_4 = new CRC32();

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "Lclient!sc;")
	private static Class107 aClass107_856 = Static231.method3737("Loaded config");

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Lclient!sc;")
	public static Class107 aClass107_855 = aClass107_856;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_857 = Static231.method3737("Fertigkeit)2");

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Lclient!sc;")
	public static Class107 aClass107_858 = Static231.method3737("<)4col>");

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "J")
	public static long aLong120 = 0L;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "Lclient!sc;")
	public static Class107 aClass107_859 = Static231.method3737("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)Lclient!sc;")
	public static Class107 method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < -9) {
			return Static180.aClass107_1346;
		} else if (local12 < -6) {
			return Static83.aClass107_523;
		} else if (local12 < -3) {
			return Static25.aClass107_163;
		} else if (local12 < 0) {
			return Static16.aClass107_132;
		} else if (local12 > 9) {
			return Static7.aClass107_103;
		} else if (local12 > 6) {
			return Static163.aClass107_954;
		} else if (local12 > 3) {
			return Static66.aClass107_433;
		} else if (local12 > 0) {
			return Static83.aClass107_522;
		} else {
			return Static32.aClass107_207;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BILclient!ed;I)V")
	public static void method2404(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3048 == arg0 && arg0 != -1) {
			@Pc(81) Class96 local81 = Static2.method88(arg0);
			@Pc(84) int local84 = local81.anInt3659;
			if (local84 == 1) {
				arg1.anInt3023 = 0;
				arg1.anInt2996 = arg2;
				arg1.anInt3047 = 0;
				arg1.anInt3013 = 0;
				Static133.method2209(arg1.anInt3044, arg1.anInt3021, local81, Static204.aClass5_Sub5_Sub1_2 == arg1, arg1.anInt3023);
			}
			if (local84 == 2) {
				arg1.anInt3047 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt3048 == -1 || Static2.method88(arg0).anInt3649 >= Static2.method88(arg1.anInt3048).anInt3649) {
			arg1.anInt3041 = arg1.anInt3006;
			arg1.anInt3023 = 0;
			arg1.anInt2996 = arg2;
			arg1.anInt3048 = arg0;
			arg1.anInt3013 = 0;
			arg1.anInt3047 = 0;
			if (arg1.anInt3048 != -1) {
				Static133.method2209(arg1.anInt3044, arg1.anInt3021, Static2.method88(arg1.anInt3048), arg1 == Static204.aClass5_Sub5_Sub1_2, arg1.anInt3023);
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!sc;II)V")
	public static void method2406(@OriginalArg(0) int arg0, @OriginalArg(2) Class107 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class86 local6 = Static11.method314(arg3, arg2);
		if (local6 == null) {
			return;
		}
		if (local6.anObjectArray12 != null) {
			@Pc(20) Class1_Sub22 local20 = new Class1_Sub22();
			local20.aClass107_908 = arg1;
			local20.anInt3439 = arg0;
			local20.aClass86_10 = local6;
			local20.anObjectArray33 = local6.anObjectArray12;
			Static60.method1156(local20);
		}
		@Pc(38) boolean local38 = true;
		if (local6.anInt3285 > 0) {
			local38 = Static160.method2580(local6);
		}
		if (!local38 || !Static118.method2044(arg0 - 1, Static34.method676(local6))) {
			return;
		}
		if (arg0 == 1) {
			Static193.aClass1_Sub26_Sub1_2.method3000(109);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 2) {
			Static193.aClass1_Sub26_Sub1_2.method3000(52);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 3) {
			Static193.aClass1_Sub26_Sub1_2.method3000(162);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 4) {
			Static193.aClass1_Sub26_Sub1_2.method3000(155);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 5) {
			Static193.aClass1_Sub26_Sub1_2.method3000(22);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 6) {
			Static193.aClass1_Sub26_Sub1_2.method3000(86);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 7) {
			Static193.aClass1_Sub26_Sub1_2.method3000(237);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 8) {
			Static193.aClass1_Sub26_Sub1_2.method3000(224);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 9) {
			Static193.aClass1_Sub26_Sub1_2.method3000(147);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
		if (arg0 == 10) {
			Static193.aClass1_Sub26_Sub1_2.method3000(6);
			Static193.aClass1_Sub26_Sub1_2.method2973(arg3);
			Static193.aClass1_Sub26_Sub1_2.method2963(arg2);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	public static void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static8.anInt259 < 2 && Static167.anInt3590 == 0 && !Static56.aBoolean124) {
			return;
		}
		@Pc(40) Class107 local40;
		if (Static167.anInt3590 == 1 && Static8.anInt259 < 2) {
			local40 = Static149.method2437(new Class107[] { Static13.aClass107_124, Static20.aClass107_607, Static6.aClass107_820, Static158.aClass107_923 });
		} else if (Static56.aBoolean124 && Static8.anInt259 < 2) {
			local40 = Static149.method2437(new Class107[] { Static71.aClass107_470, Static20.aClass107_607, Static219.aClass107_1291, Static158.aClass107_923 });
		} else {
			local40 = Static75.method1338(Static8.anInt259 - 1);
		}
		if (Static8.anInt259 > 2) {
			local40 = Static149.method2437(new Class107[] { local40, Static155.aClass107_150, Static115.method2001(Static8.anInt259 - 2), Static153.aClass107_893 });
		}
		@Pc(124) int local124 = Static175.aClass1_Sub2_Sub15_3.method3340(local40, arg1 + 4, arg0 + 15, Static170.aRandom1, Static94.anInt2035);
		Static5.method224(Static175.aClass1_Sub2_Sub15_3.method3350(local40) + local124, arg1 - -4, arg0, 15);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!sc;ILclient!vf;)I")
	public static int method2417(@OriginalArg(0) Class107 arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		@Pc(2) int local2 = arg1.anInt4021;
		arg1.method2989(arg0.anInt4186);
		arg1.anInt4021 += Static93.aClass17_2.method391(arg1.aByteArray52, 0, arg0.anInt4186, arg0.aByteArray55, arg1.anInt4021);
		return arg1.anInt4021 - local2;
	}
}
