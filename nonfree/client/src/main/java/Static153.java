import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fha", name = "h", descriptor = "Lclient!aaa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!fha", name = "n", descriptor = "Lclient!cu;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!fha", name = "i", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!fha", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!mfa;II)Z")
	public static boolean method2722(@OriginalArg(0) Class3_Sub9_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method5642(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method5642(1) != 0) {
				method2722(arg0, arg1);
			}
			local28 = arg0.method5642(6);
			local33 = arg0.method5642(6);
			@Pc(43) boolean local43 = arg0.method5642(1) == 1;
			if (local43) {
				Static27.anIntArray33[Static458.anInt7786++] = arg1;
			}
			if (Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class328 local66 = Static370.aClass328Array1[arg1];
			@Pc(74) Class9_Sub2_Sub1_Sub2_Sub1 local74 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[arg1] = new Class9_Sub2_Sub1_Sub2_Sub1();
			local74.anInt10204 = arg1;
			if (Static583.aClass3_Sub9Array20[arg1] != null) {
				local74.method1158(Static583.aClass3_Sub9Array20[arg1]);
			}
			local74.method8621(true, local66.anInt9156);
			local74.anInt10185 = local66.anInt9155;
			local102 = local66.anInt9150;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(125) int local125 = (local112 << 6) + local28 - Static427.anInt7462;
			@Pc(134) int local134 = (local116 << 6) + local33 - Static22.anInt329;
			local74.aBoolean80 = local66.aBoolean677;
			local74.aByteArray107[0] = Static87.aByteArray15[arg1];
			local74.aByte127 = local74.aByte128 = (byte) local106;
			if (Static97.method1657(local134, local125)) {
				local74.aByte128++;
			}
			local74.method1153(local125, local134);
			local74.aBoolean81 = false;
			Static370.aClass328Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method5642(2);
			local33 = Static370.aClass328Array1[arg1].anInt9150;
			Static370.aClass328Array1[arg1].anInt9150 = ((local28 + (local33 >> 28) & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(233) int local233;
			@Pc(238) int local238;
			@Pc(247) int local247;
			if (local8 != 2) {
				local28 = arg0.method5642(18);
				local33 = local28 >> 16;
				local233 = local28 >> 8 & 0xFF;
				local238 = local28 & 0xFF;
				local247 = Static370.aClass328Array1[arg1].anInt9150;
				local102 = local33 + (local247 >> 28) & 0x3;
				local106 = (local247 >> 14) + local233 & 0xFF;
				local112 = local238 + local247 & 0xFF;
				Static370.aClass328Array1[arg1].anInt9150 = local112 + (local102 << 28) + (local106 << 14);
				return false;
			}
			local28 = arg0.method5642(5);
			local33 = local28 >> 3;
			local233 = local28 & 0x7;
			local238 = Static370.aClass328Array1[arg1].anInt9150;
			local247 = (local238 >> 28) + local33 & 0x3;
			local102 = local238 >> 14 & 0xFF;
			local106 = local238 & 0xFF;
			if (local233 == 0) {
				local102--;
				local106--;
			}
			if (local233 == 1) {
				local106--;
			}
			if (local233 == 2) {
				local106--;
				local102++;
			}
			if (local233 == 3) {
				local102--;
			}
			if (local233 == 4) {
				local102++;
			}
			if (local233 == 5) {
				local102--;
				local106++;
			}
			if (local233 == 6) {
				local106++;
			}
			if (local233 == 7) {
				local102++;
				local106++;
			}
			Static370.aClass328Array1[arg1].anInt9150 = local106 + (local102 << 14) + (local247 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
	public static void method2723(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static10.aHashtable1.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(III)Z")
	public static boolean method2724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
