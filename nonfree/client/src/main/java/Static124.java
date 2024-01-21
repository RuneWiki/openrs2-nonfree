import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!th;")
	public static Class82 aClass82_9 = new Class82();

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt3220 = 0;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1072 = Static161.method2971("Passwort: ");

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1073 = Static161.method2971("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1074 = Static161.method2971("b12_full");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1075 = Static161.method2971("Mem:");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I")
	public static int method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg2;
			arg2 = local12;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method2288() {
		aClass82_9 = null;
		aClass13_1074 = null;
		aClass13_1075 = null;
		aClass13_1072 = null;
		aClass13_1073 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!dd;)I")
	public static int method2289(@OriginalArg(1) Class13 arg0) {
		if (Static94.anInt2756 == 1) {
			return 7;
		} else if (arg0.method892(Static168.aClass13_1364)) {
			return 1;
		} else if (arg0.method892(Static38.aClass13_427)) {
			return 1;
		} else if (arg0.method892(Static20.aClass13_284)) {
			return 2;
		} else if (arg0.method892(Static140.aClass13_1189)) {
			return 2;
		} else if (arg0.method892(Static135.aClass13_1151)) {
			return 3;
		} else if (arg0.method892(Static55.aClass13_597)) {
			return 4;
		} else if (arg0.method892(Static40.aClass13_447)) {
			return 4;
		} else if (arg0.method892(Static113.aClass13_1020)) {
			return 5;
		} else if (arg0.method892(Static69.aClass13_681)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[BBI)Z")
	public static boolean method2290(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg1);
		label56: while (true) {
			@Pc(23) int local23 = local19.method1631();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local19.method1645();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(63) int local63 = local31 & 0x3F;
					@Pc(69) int local69 = local31 >> 6 & 0x3F;
					@Pc(75) int local75 = local19.method1607() >> 2;
					@Pc(79) int local79 = local63 + arg2;
					@Pc(83) int local83 = arg0 + local69;
					if (local83 > 0 && local79 > 0 && local83 < 103 && local79 < 103) {
						@Pc(99) Class1_Sub2_Sub14 local99 = Static4.method79(local14);
						if (local75 != 22 || !Static30.aBoolean72 || local99.anInt3319 != 0 || local99.anInt3320 == 1 || local99.aBoolean249) {
							if (!local99.method2382()) {
								local7 = false;
								Static22.anInt2237++;
							}
							local33 = true;
						}
					}
				}
				local39 = local19.method1645();
				if (local39 == 0) {
					break;
				}
				local19.method1607();
			}
		}
	}
}
