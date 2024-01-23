import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!vl;")
	public static Class177 aClass177_5;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString131 = " has logged in.";

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "Lclient!ec;")
	public static Class46 aClass46_19 = new Class46(64);

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean202 = true;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)Lclient!ml;")
	public static Class2_Sub3_Sub17 method2231(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub17 local8 = (Class2_Sub3_Sub17) Static296.aClass53_13.method1254((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(24) byte[] local24 = Static171.aClass84_68.method2127(0, arg0);
		if (local24 == null) {
			return null;
		}
		local8 = new Class2_Sub3_Sub17();
		@Pc(44) Class2_Sub26 local44 = new Class2_Sub26(local24);
		local44.anInt5328 = local44.aByteArray72.length - 2;
		@Pc(55) int local55 = local44.method4242();
		@Pc(66) int local66 = local44.aByteArray72.length - local55 - 12 - 2;
		local44.anInt5328 = local66;
		@Pc(73) int local73 = local44.method4228();
		local8.anInt3451 = local44.method4242();
		local8.anInt3453 = local44.method4242();
		local8.anInt3448 = local44.method4242();
		local8.anInt3450 = local44.method4242();
		@Pc(101) int local101 = local44.method4261();
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (local101 > 0) {
			local8.aClass79Array1 = new Class79[local101];
			for (local109 = 0; local109 < local101; local109++) {
				local116 = local44.method4242();
				@Pc(123) Class79 local123 = new Class79(Static7.method217(local116));
				local8.aClass79Array1[local109] = local123;
				while (local116-- > 0) {
					@Pc(138) int local138 = local44.method4228();
					@Pc(142) int local142 = local44.method4228();
					local123.method1994((long) local138, new Class2_Sub21(local142));
				}
			}
		}
		local44.anInt5328 = 0;
		local109 = 0;
		local8.aString168 = local44.method4232();
		local8.anIntArray265 = new int[local73];
		local8.aStringArray16 = new String[local73];
		local8.anIntArray264 = new int[local73];
		while (local66 > local44.anInt5328) {
			local116 = local44.method4242();
			if (local116 == 3) {
				local8.aStringArray16[local109] = local44.method4265().intern();
			} else if (local116 >= 100 || local116 == 21 || local116 == 38 || local116 == 39) {
				local8.anIntArray264[local109] = local44.method4261();
			} else {
				local8.anIntArray264[local109] = local44.method4228();
			}
			local8.anIntArray265[local109++] = local116;
		}
		Static296.aClass53_13.method1258((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2234(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static165.aClass128_1);
		arg0.removeFocusListener(Static165.aClass128_1);
		Static70.anInt1540 = -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public static void method2237(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static116.aBooleanArray12[arg0]) {
			return;
		}
		Static277.aClass84_118.method2132(arg0);
		if (Static219.aClass115ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < Static219.aClass115ArrayArray1[arg0].length; local30++) {
			if (Static219.aClass115ArrayArray1[arg0][local30] != null) {
				if (Static219.aClass115ArrayArray1[arg0][local30].anInt3538 == 2) {
					local28 = false;
				} else {
					Static219.aClass115ArrayArray1[arg0][local30] = null;
				}
			}
		}
		if (local28) {
			Static219.aClass115ArrayArray1[arg0] = null;
		}
		Static116.aBooleanArray12[arg0] = false;
	}
}
