import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "Lclient!is;")
	public static Class111 aClass111_5;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	public static int anInt6026;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_132 = new Class205(80, 6);

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
	public static int anInt6022 = 0;

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_95 = new Class32("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!gf;BI)V")
	public static void method5244(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt6405 && arg0 != -1) {
			@Pc(21) Class202 local21 = Static36.aClass236_1.method5396(arg0);
			@Pc(24) int local24 = local21.anInt4932;
			if (local24 == 1) {
				arg1.anInt6443 = 0;
				arg1.anInt6436 = 1;
				arg1.anInt6427 = 0;
				arg1.anInt6452 = 0;
				arg1.anInt6429 = arg2;
				Static169.method2965(arg1.anInt6443, arg1 == Static206.aClass1_Sub5_Sub1_Sub1_1, arg1.aByte69, arg1.anInt6390, local21, arg1.anInt6386);
			}
			if (local24 == 2) {
				arg1.anInt6452 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt6405 == -1 || Static36.aClass236_1.method5396(arg0).anInt4945 >= Static36.aClass236_1.method5396(arg1.anInt6405).anInt4945) {
			arg1.anInt6436 = 1;
			arg1.anInt6443 = 0;
			arg1.anInt6405 = arg0;
			arg1.anInt6455 = arg1.anInt6456;
			arg1.anInt6429 = arg2;
			arg1.anInt6452 = 0;
			arg1.anInt6427 = 0;
			if (arg1.anInt6405 == -1) {
				return;
			}
			Static169.method2965(arg1.anInt6443, arg1 == Static206.aClass1_Sub5_Sub1_Sub1_1, arg1.aByte69, arg1.anInt6390, Static36.aClass236_1.method5396(arg1.anInt6405), arg1.anInt6386);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!kk;)Lclient!ol;")
	public static Class2_Sub4 method5245(@OriginalArg(1) Class2_Sub16 arg0) {
		arg0.method5350();
		@Pc(18) int local18 = arg0.method5350();
		@Pc(22) Class2_Sub4 local22 = Static17.method316(local18);
		local22.anInt6518 = arg0.method5350();
		@Pc(31) int local31 = arg0.method5350();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method5350();
			local22.method5601(arg0, local39);
		}
		local22.method5596();
		return local22;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vc;)V")
	public static void method5246(@OriginalArg(0) Class63 arg0) {
		for (@Pc(1) int local1 = Static119.anInt2585; local1 < Static12.anInt311; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static12.anInt312; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static341.anInt5833; local7++) {
					@Pc(16) Class251 local16 = Static64.aClass251ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub1 local21 = local16.aClass1_Sub1_3;
						@Pc(24) Class1_Sub1 local24 = local16.aClass1_Sub1_2;
						if (local21 != null && local21.method5641()) {
							Static195.method3320(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5641()) {
								Static195.method3320(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5637(false, arg0, 0, 0, local21, 0);
								local24.method5643();
							}
							local21.method5643();
						}
						for (@Pc(70) Class46 local70 = local16.aClass46_3; local70 != null; local70 = local70.aClass46_1) {
							@Pc(74) Class1_Sub5 local74 = local70.aClass1_Sub5_1;
							if (local74 != null && local74.method5641()) {
								Static195.method3320(arg0, local74, local1, local4, local7, local74.aShort94 + 1 - local74.aShort96, local74.aShort95 - local74.aShort97 + 1);
								local74.method5643();
							}
						}
						@Pc(111) Class1_Sub3 local111 = local16.aClass1_Sub3_2;
						if (local111 != null && local111.method5641()) {
							Static221.method5121(arg0, local111, local1, local4, local7);
							local111.method5643();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
	public static void method5247(@OriginalArg(1) int arg0) {
		Static9.anIntArray76 = new int[arg0];
		Static297.anIntArray1008 = new int[arg0];
		Static167.anIntArray1056 = new int[arg0];
		Static86.anIntArray361 = new int[arg0];
		Static356.anIntArray1261 = new int[arg0];
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public static void method5248() {
		if (Static391.anInt6627 == 10 || Static391.anInt6627 == 28) {
			Static156.method2841(Static224.anInt4006 >> 10, Static51.anInt1057 >> 10);
		} else if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >= 0 && Static246.anInt4374 * 128 > Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >= 0 && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 < Static185.anInt3485 * 128) {
			Static156.method2841(Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] >> 3, Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] >> 3);
		} else {
			Static156.method2841(Static246.anInt4374 >> 4, Static185.anInt3485 >> 4);
		}
		Static228.method3719();
		Static56.method924();
		Static49.method848();
		Static62.method1040();
	}
}
