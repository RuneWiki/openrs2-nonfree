import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[J")
	public static final long[] aLongArray6 = new long[1000];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!wa;")
	public static final Class1_Sub14 aClass1_Sub14_3 = new Class1_Sub14(8);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1713 = Static118.method2249("rect_debug=");

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt2980 = 0;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1714 = Static118.method2249("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!le;")
	public static Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static int anInt2982 = -1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method2273() {
		Static34.aClass87_17.method3061();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method2274() {
		Static19.aClass1_Sub2_Sub5_Sub3_5.method1314(0, 0);
		Static201.aClass1_Sub2_Sub5_Sub3_6.method1314(382, 0);
		Static195.aClass1_Sub2_Sub5_Sub1_4.method558(382 - Static195.aClass1_Sub2_Sub5_Sub1_4.anInt848 / 2, 18);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method2275(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static30.anInt881 > 0) {
			local16 = Static70.aByteArrayArray17[--Static30.anInt881];
			Static70.aByteArrayArray17[Static30.anInt881] = null;
			return local16;
		} else if (arg0 == 5000 && Static44.anInt1130 > 0) {
			local16 = Static170.aByteArrayArray36[--Static44.anInt1130];
			Static170.aByteArrayArray36[Static44.anInt1130] = null;
			return local16;
		} else if (arg0 == 30000 && Static173.anInt3848 > 0) {
			local16 = Static157.aByteArrayArray41[--Static173.anInt3848];
			Static157.aByteArrayArray41[Static173.anInt3848] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLclient!oc;)V")
	public static void method2277(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(6) short[] local6 = new short[16];
		@Pc(10) Class65 local10 = arg1.method2487();
		@Pc(12) int local12 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static92.anInt2321; local19++) {
			@Pc(24) Class1_Sub2_Sub2 local24 = Static40.method700(local19);
			if ((!arg0 || local24.aBoolean12) && local24.aClass65_229.method2487().method2484(local10) != -1) {
				if (local12 >= 250) {
					Static31.aShortArray20 = null;
					Static199.anInt4285 = -1;
					return;
				}
				if (local12 >= local6.length) {
					@Pc(57) short[] local57 = new short[local6.length * 2];
					for (@Pc(59) int local59 = 0; local59 < local12; local59++) {
						local57[local59] = local6[local59];
					}
					local6 = local57;
				}
				local6[local12++] = (short) local19;
			}
		}
		Static31.aShortArray20 = local6;
		Static199.anInt4285 = local12;
		Static58.anInt1544 = 0;
		@Pc(95) Class65[] local95 = new Class65[Static199.anInt4285];
		for (@Pc(97) int local97 = 0; local97 < Static199.anInt4285; local97++) {
			local95[local97] = Static40.method700(local6[local97]).aClass65_229;
		}
		Static79.method1390(Static31.aShortArray20, local95);
	}
}
