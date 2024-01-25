import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString107;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public static int anInt9041;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt9036 = -1;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_181 = new Class180(103, 6);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!or;)V")
	public static void method7889(@OriginalArg(1) Class260 arg0) {
		@Pc(12) Class260 local12 = Static119.method2271(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local12 == null) {
			local20 = Static222.anInt4196;
			local17 = Static312.anInt5191;
		} else {
			local17 = local12.anInt6963;
			local20 = local12.anInt6971;
		}
		Static287.method4536(arg0, false, local20, local17);
		Static303.method4658(arg0, local20, local17);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!gea;I)I")
	public static int method7891(@OriginalArg(0) Class3_Sub11_Sub8 arg0) {
		@Pc(12) String local12 = Static53.method1179(arg0);
		return Static59.aClass88_1.method2508(Static561.aClass33Array25, local12);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method7892(@OriginalArg(0) int arg0) {
		if (arg0 == Static406.anInt6454) {
			return;
		}
		if (arg0 == 13) {
			Static548.method7837();
		}
		if (arg0 != 13 && Static669.aClass269_2 != null) {
			Static669.aClass269_2.method6697();
			Static669.aClass269_2 = null;
		}
		if (arg0 == 3) {
			Static11.method184(Static371.anInt5965 != Static110.anInt2265);
		}
		if (arg0 == 7) {
			Static440.method6268(Static110.anInt2265 != Static397.anInt6239);
		}
		if (arg0 == 5 || arg0 == 12) {
			Static328.method4995();
		} else if (arg0 == 6 || arg0 == 9) {
			Static548.method7837();
		}
		if (Static284.method4528(Static406.anInt6454)) {
			Static277.aClass15_108.anInt425 = 2;
			Static468.aClass15_118.anInt425 = 2;
			Static577.aClass15_165.anInt425 = 2;
			Static20.aClass15_119.anInt425 = 2;
			Static474.aClass15_121.anInt425 = 2;
			Static364.aClass15_96.anInt425 = 2;
			Static254.aClass15_72.anInt425 = 2;
		}
		if (Static284.method4528(arg0)) {
			Static651.anInt10354 = 1;
			Static44.anInt1037 = 0;
			Static146.anInt2956 = 1;
			Static290.anInt4940 = 0;
			Static219.anInt4162 = 0;
			Static460.method6706(true);
			Static277.aClass15_108.anInt425 = 1;
			Static468.aClass15_118.anInt425 = 1;
			Static577.aClass15_165.anInt425 = 1;
			Static20.aClass15_119.anInt425 = 1;
			Static474.aClass15_121.anInt425 = 1;
			Static364.aClass15_96.anInt425 = 1;
			Static254.aClass15_72.anInt425 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static355.method5243();
		}
		@Pc(178) boolean local178 = arg0 == 2 || Static501.method7146(arg0) || Static661.method9136(arg0);
		@Pc(195) boolean local195 = Static406.anInt6454 == 2 || Static501.method7146(Static406.anInt6454) || Static661.method9136(Static406.anInt6454);
		if (local178 != local195) {
			if (local178) {
				Static214.anInt4080 = Static112.anInt5572;
				if (Static24.aClass3_Sub22_4.aClass6_Sub28_4.method8690() == 0) {
					Static594.method8355();
				} else {
					Static4.method121(Static112.anInt5572, Static24.aClass3_Sub22_4.aClass6_Sub28_4.method8690(), Static604.aClass15_150);
					Static476.method6888();
				}
				Static581.aClass341_4.method8305(false);
			} else {
				Static594.method8355();
				Static581.aClass341_4.method8305(true);
			}
		}
		if (Static284.method4528(arg0) || arg0 == 13) {
			Static674.aClass13_22.method8480();
		}
		Static406.anInt6454 = arg0;
	}
}
