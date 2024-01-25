import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
	public static int anInt6056;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_155 = new Class12(64, 10);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!lq;")
	public static RuntimeException_Sub1 method4776(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString49 = local9.aString49 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	public static void method4783(@OriginalArg(1) int arg0) {
		if (Static312.anInt5414 == arg0) {
			return;
		}
		if (Static312.anInt5414 == 0) {
			Static341.method4570();
		}
		if (arg0 == 12) {
			Static331.method4436(Static333.anInt5694, Static109.aString58, Static47.aString8);
		}
		if (arg0 != 12 && Static46.aClass131_1 != null) {
			Static46.aClass131_1.method2933();
			Static46.aClass131_1 = null;
		}
		if (arg0 == 2) {
			Static214.method3140(Static228.anInt4845 != Static207.anInt6026);
		}
		if (arg0 == 6) {
			Static159.method2298(Static443.anInt5161 != Static207.anInt6026);
		}
		if (arg0 == 4) {
			Static442.method5828(Static109.aString58, Static47.aString8);
		} else if (arg0 == 5) {
			Static331.method4436(Static333.anInt5694, Static109.aString58, Static47.aString8);
		} else if (arg0 == 8) {
			Static331.method4436(Static333.anInt5694, Static109.aString58, Static47.aString8);
		} else if (arg0 == 11) {
			Static442.method5828(Static109.aString58, Static47.aString8);
		}
		if (Static91.method1452(Static312.anInt5414)) {
			Static305.aClass82_72.anInt2180 = 2;
			Static388.aClass82_89.anInt2180 = 2;
			Static223.aClass82_80.anInt2180 = 2;
			Static362.aClass82_21.anInt2180 = 2;
			Static104.aClass82_24.anInt2180 = 2;
			Static142.aClass82_39.anInt2180 = 2;
			Static441.aClass82_101.anInt2180 = 2;
		}
		if (Static91.method1452(arg0)) {
			Static368.anInt6205 = 0;
			Static234.anInt4178 = 1;
			Static34.anInt594 = 1;
			Static391.anInt6531 = 0;
			Static42.anInt717 = 0;
			Static301.method4121(true);
			Static305.aClass82_72.anInt2180 = 1;
			Static388.aClass82_89.anInt2180 = 1;
			Static223.aClass82_80.anInt2180 = 1;
			Static362.aClass82_21.anInt2180 = 1;
			Static104.aClass82_24.anInt2180 = 1;
			Static142.aClass82_39.anInt2180 = 1;
			Static441.aClass82_101.anInt2180 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static458.method4949();
		}
		if (arg0 == 1) {
			Static395.method5157(Static185.aClass34_7, Static448.aClass82_104);
		} else {
			Static4.method53();
		}
		@Pc(210) boolean local210 = arg0 == 1 || Static306.method4183(arg0) || Static40.method585(arg0);
		@Pc(229) boolean local229 = Static312.anInt5414 == 1 || Static306.method4183(Static312.anInt5414) || Static40.method585(Static312.anInt5414);
		if (local210 != local229) {
			if (local210) {
				Static143.anInt2345 = Static351.anInt6023;
				if (Static453.aClass136_Sub1_1.anInt4444 == 0) {
					Static241.method3474();
				} else {
					Static408.method5274(Static447.aClass82_54, Static453.aClass136_Sub1_1.anInt4444, Static351.anInt6023);
				}
				Static32.aClass224_1.method4932(false);
			} else {
				Static241.method3474();
				Static32.aClass224_1.method4932(true);
			}
		}
		if (Static91.method1452(arg0) || arg0 == 12) {
			Static185.aClass34_7.method5789();
		}
		Static312.anInt5414 = arg0;
	}
}
