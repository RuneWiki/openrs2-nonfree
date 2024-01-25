import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
	public static int anInt5883;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([II[Ljava/lang/Object;II)V")
	public static void method5161(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg2 + arg3) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local17;
		@Pc(31) Object local31 = arg1[local11];
		arg1[local11] = arg1[arg3];
		arg1[arg3] = local31;
		for (@Pc(43) int local43 = arg2; local43 < arg3; local43++) {
			if (arg0[local43] < (local43 & 0x1) + local17) {
				@Pc(58) int local58 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13] = local58;
				@Pc(72) Object local72 = arg1[local43];
				arg1[local43] = arg1[local13];
				arg1[local13++] = local72;
			}
		}
		arg0[arg3] = arg0[local13];
		arg0[local13] = local17;
		arg1[arg3] = arg1[local13];
		arg1[local13] = local31;
		method5161(arg0, arg1, arg2, local13 - 1);
		method5161(arg0, arg1, local13 + 1, arg3);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
	public static boolean method5163() {
		try {
			return Static299.method4601();
		} catch (@Pc(14) IOException local14) {
			Static55.method4438();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static48.anInt1097 + "," + Static196.anInt3834 + "," + Static236.anInt4527 + " - " + Static71.anInt1574 + "," + (Static138.anInt2879 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0]) + "," + (Static342.anInt6864 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static71.anInt1574 && local62 < 50; local62++) {
				local60 = local60 + Static269.aClass2_Sub10_Sub1_3.aByteArray57[local62] + ",";
			}
			Static69.method1566(local60, local19);
			Static38.method868();
			return true;
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public static void method5164() {
		Static95.aClipboard2 = null;
		Static96.aBoolean181 = false;
		Static25.anIntArray103 = null;
		Static175.aBooleanArray17 = null;
		Static335.anIntArray501 = null;
		Static276.anIntArray413 = null;
		Static253.method5944();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public static void method5166(@OriginalArg(0) int arg0) {
		Static65.method1486();
		Static106.method2340();
		Static313.method5504(true, arg0);
		Static319.method5612(Static147.aClass4_2, Static59.aClass191_35, Static318.aClass191_204);
		Static249.method4524(Static147.aClass4_2, Static59.aClass191_35);
		Static351.method4761(Static326.aClass31Array17);
		Static93.method2110();
		Static253.method5944();
		if (Static263.anInt5396 == 10) {
			Static117.method2497(false);
		} else if (Static263.anInt5396 == 30) {
			Static125.method2616(25);
			return;
		} else if (Static263.anInt5396 == 5) {
			Static146.method2863(Static59.aClass191_35, Static147.aClass4_2);
			return;
		}
	}
}
