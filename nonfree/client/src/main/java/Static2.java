import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	public static int anInt274;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_105 = Static9.method266("_");

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_106 = Static9.method266("Null");

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_107 = Static9.method266("http:)4)4");

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt270 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_108 = Static9.method266("cross");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int anInt273 = 0;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!id;")
	public static Class34 aClass34_109 = Static9.method266("swe");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z[BII[Lclient!pb;IIIIILclient!l;)V")
	public static void method96(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class58[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class44 arg9) {
		@Pc(10) Class1_Sub19 local10 = new Class1_Sub19(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method2078();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method2078();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(49) int local49 = local31 >> 6 & 0x3F;
				@Pc(53) int local53 = local31 >> 12;
				@Pc(57) int local57 = local31 & 0x3F;
				@Pc(61) int local61 = local10.method2072();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (local53 == arg4 && arg8 <= local49 && arg8 + 8 > local49 && local57 >= arg1 && arg1 + 8 > local57) {
					@Pc(112) Class1_Sub1_Sub16 local112 = Static28.method2008(local12);
					@Pc(129) int local129 = Static14.method346(local112.anInt2946, local57 & 0x7, local49 & 0x7, arg6, local112.anInt2962, local69) + arg7;
					@Pc(146) int local146 = arg2 + Static128.method1992(local57 & 0x7, local49 & 0x7, local112.anInt2946, local112.anInt2962, arg6, local69);
					if (local129 > 0 && local146 > 0 && local129 < 103 && local146 < 103) {
						@Pc(165) Class58 local165 = null;
						@Pc(167) int local167 = arg5;
						if ((Static105.aByteArrayArrayArray9[1][local129][local146] & 0x2) == 2) {
							local167 = arg5 - 1;
						}
						if (local167 >= 0) {
							local165 = arg3[local167];
						}
						Static118.method1876(local12, arg9, local146, local65, arg5, local69 + arg6 & 0x3, local129, local165);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!id;Lclient!id;Lclient!id;I)V")
	public static void method97(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static39.anIntArray115[local3] = Static39.anIntArray115[local3 - 1];
			Static30.aClass34Array5[local3] = Static30.aClass34Array5[local3 - 1];
			Static64.aClass34Array14[local3] = Static64.aClass34Array14[local3 - 1];
			Static51.aClass34Array11[local3] = Static51.aClass34Array11[local3 - 1];
		}
		Static30.aClass34Array5[0] = arg2;
		Static99.anInt2511 = Static70.anInt1848;
		Static39.anIntArray115[0] = arg3;
		Static64.aClass34Array14[0] = arg1;
		Static51.aClass34Array11[0] = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method98() {
		aClass34_108 = null;
		aClass34_106 = null;
		aClass34_107 = null;
		aClass34_109 = null;
		aClass34_105 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method99() {
		Static124.aClass63_25.method1665();
		Static10.aClass63_4.method1665();
		Static14.aClass63_6.method1665();
		Static118.aClass63_24.method1665();
	}
}
