import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hp", name = "R", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_41 = new Class37(8);

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
	public static int anInt2335 = 0;

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLclient!ii;Lclient!lm;)V")
	public static void method1952(@OriginalArg(1) Class105 arg0, @OriginalArg(2) Class134 arg1) {
		if (Static48.aBoolean79) {
			return;
		}
		arg0.method4295(0);
		Static350.aClass8_18 = arg0.method4238(Static369.method5467(arg1, Static342.anInt2477));
		Static350.aClass8_18.method4393((Static26.anInt476 - Static350.aClass8_18.method4381()) / 2, (Static321.anInt6388 - Static350.aClass8_18.method4395()) / 2);
		Static73.aClass8_12 = arg0.method4238(Static369.method5467(arg1, Static165.anInt3414));
		Static73.aClass8_12.method4393((Static26.anInt476 - Static73.aClass8_12.method4381()) / 2, 18);
		Static48.aBoolean79 = true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!wd;B)V")
	public static void method1953(@OriginalArg(0) Class215 arg0) {
		Static182.anInt3805 = 3;
		Static22.method393(true);
		Static168.aBoolean267 = true;
		Static256.anInt5260 = 2;
		Static347.aBoolean550 = true;
		Static182.anInt3809 = 1;
		Static42.aBoolean75 = true;
		Static231.anInt4828 = 0;
		Static147.anInt3045 = 0;
		Static266.aBoolean458 = true;
		Static50.aBoolean83 = true;
		Static329.aBoolean533 = true;
		Static138.aBoolean522 = true;
		Static119.anInt2298 = 127;
		Static13.anInt213 = 0;
		Static211.aBoolean353 = true;
		Static4.anInt39 = 255;
		Static18.anInt358 = 0;
		Static221.aBoolean375 = true;
		Static341.aBoolean543 = true;
		Static142.anInt2788 = 127;
		if (Static267.anInt5492 >= 96) {
			Static223.method1252(2);
		} else {
			Static223.method1252(0);
		}
		Static10.anInt181 = 0;
		Static5.aBoolean10 = false;
		Static317.aBoolean521 = false;
		Static25.anInt449 = 2;
		Static5.aBoolean9 = true;
		Static8.aBoolean13 = true;
		Static311.aBoolean510 = false;
		Static248.anInt26 = 2;
		Static313.anInt6232 = 0;
		@Pc(81) Class108 local81 = null;
		try {
			@Pc(93) Class193 local93 = arg0.method5678();
			while (local93.anInt5986 == 0) {
				Static163.method2863(1L);
			}
			if (local93.anInt5986 == 1) {
				local81 = (Class108) local93.anObject7;
				@Pc(117) byte[] local117 = new byte[(int) local81.method2210()];
				@Pc(132) int local132;
				for (@Pc(119) int local119 = 0; local119 < local117.length; local119 += local132) {
					local132 = local81.method2211(local117, local117.length - local119, local119);
					if (local132 == -1) {
						throw new IOException("EOF");
					}
				}
				Static44.method906(new Class1_Sub21(local117));
			}
		} catch (@Pc(161) Exception local161) {
		}
		try {
			if (local81 != null) {
				local81.method2207();
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIB)I")
	public static int method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static291.aByteArrayArrayArray11[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static291.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
	public static void method1955() {
		try {
			if (Static49.anInt5279 == 1) {
				@Pc(16) int local16 = Static58.aClass1_Sub31_Sub3_1.method4728();
				if (local16 > 0 && Static58.aClass1_Sub31_Sub3_1.method4711()) {
					local16 -= Static348.anInt6160;
					if (local16 < 0) {
						local16 = 0;
					}
					Static58.aClass1_Sub31_Sub3_1.method4719(local16);
				} else {
					Static58.aClass1_Sub31_Sub3_1.method4731();
					Static58.aClass1_Sub31_Sub3_1.method4735();
					Static161.aClass1_Sub30_1 = null;
					if (Static9.aClass134_3 == null) {
						Static49.anInt5279 = 0;
					} else {
						Static49.anInt5279 = 2;
					}
					Static201.aClass36_3 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static58.aClass1_Sub31_Sub3_1.method4731();
			Static161.aClass1_Sub30_1 = null;
			Static201.aClass36_3 = null;
			Static9.aClass134_3 = null;
			Static49.anInt5279 = 0;
		}
	}
}
