import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
	public static int[] anIntArray204 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public static int anInt2735 = 0;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public static int anInt2737 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2324(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static200.anInt4157 > 0) {
			local21 = Static35.aByteArrayArray19[--Static200.anInt4157];
			Static35.aByteArrayArray19[Static200.anInt4157] = null;
			return local21;
		} else if (arg0 == 5000 && Static166.anInt3495 > 0) {
			local21 = Static268.aByteArrayArray109[--Static166.anInt3495];
			Static268.aByteArrayArray109[Static166.anInt3495] = null;
			return local21;
		} else if (arg0 == 30000 && Static111.anInt2399 > 0) {
			local21 = Static83.aByteArrayArray42[--Static111.anInt2399];
			Static83.aByteArrayArray42[Static111.anInt2399] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method2325(@OriginalArg(0) Class84 arg0) {
		Static89.aClass84_38 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	public static boolean method2327() {
		try {
			return Static246.method4100();
		} catch (@Pc(17) IOException local17) {
			Static75.method1375();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(63) String local63 = "T2 - " + Static21.anInt508 + "," + Static126.anInt2647 + "," + Static47.anInt1117 + " - " + Static4.anInt151 + "," + (Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] + Static125.anInt5772) + "," + (Static203.anInt4236 + Static111.aClass36_Sub3_Sub2_1.anIntArray468[0]) + " - ";
			for (@Pc(65) int local65 = 0; local65 < Static4.anInt151 && local65 < 50; local65++) {
				local63 = local63 + Static250.aClass2_Sub26_Sub1_2.aByteArray72[local65] + ",";
			}
			Static108.method2009(local22, local63);
			Static226.method1673();
			return true;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!t;I)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) Class36_Sub3 arg1) {
		if (arg1.anInt5121 > Static148.anInt3168) {
			Static131.method2289(arg1);
		} else if (arg1.anInt5123 >= Static148.anInt3168) {
			Static170.method2928(arg1);
		} else {
			Static136.method2416(arg1);
		}
		if (arg1.anInt5093 < 128 || arg1.anInt5109 < 128 || arg1.anInt5093 >= 13184 || arg1.anInt5109 >= 13184) {
			arg1.anInt5121 = 0;
			arg1.anInt5123 = 0;
			arg1.anInt5087 = -1;
			arg1.anInt5125 = -1;
			arg1.anInt5093 = arg1.anIntArray465[0] * 128 + arg1.method4097() * 64;
			arg1.anInt5109 = arg1.anIntArray468[0] * 128 + arg1.method4097() * 64;
			arg1.method4103();
		}
		if (arg1 == Static111.aClass36_Sub3_Sub2_1 && (arg1.anInt5093 < 1536 || arg1.anInt5109 < 1536 || arg1.anInt5093 >= 11776 || arg1.anInt5109 >= 11776)) {
			arg1.anInt5125 = -1;
			arg1.anInt5123 = 0;
			arg1.anInt5087 = -1;
			arg1.anInt5121 = 0;
			arg1.anInt5093 = arg1.anIntArray465[0] * 128 + arg1.method4097() * 64;
			arg1.anInt5109 = arg1.anIntArray468[0] * 128 + arg1.method4097() * 64;
			arg1.method4103();
		}
		Static212.method3614(arg1);
		Static54.method1075(arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
	public static void method2329(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static7.method219(arg0 - 1L);
			Static7.method219(1L);
		} else {
			Static7.method219(arg0);
		}
	}
}
