import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static711 {

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Lclient!tm;")
	public static Class361 aClass361_8;

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "I")
	public static int anInt10997;

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "Lclient!rj;")
	public static Class326 aClass326_2;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
	public static int anInt11000;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_112 = new Class144(82, 2);

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_16 = new Class344(13, 3);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Z)V")
	public static void method9320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class3_Sub29 local6 = Static248.method3511();
		local6.aClass3_Sub2_Sub1_1.method2065(Static596.aClass146_6.anInt3686);
		local6.aClass3_Sub2_Sub1_1.method2032(0);
		@Pc(21) int local21 = local6.aClass3_Sub2_Sub1_1.anInt2178;
		local6.aClass3_Sub2_Sub1_1.method2032(665);
		@Pc(32) int[] local32 = Static507.method6906(22, local6);
		@Pc(36) int local36 = local6.aClass3_Sub2_Sub1_1.anInt2178;
		local6.aClass3_Sub2_Sub1_1.method2073(arg0);
		local6.aClass3_Sub2_Sub1_1.method2032(Static281.anInt4321);
		local6.aClass3_Sub2_Sub1_1.method2073(arg2);
		local6.aClass3_Sub2_Sub1_1.method2016(Static268.aLong150);
		local6.aClass3_Sub2_Sub1_1.method2065(Static456.anInt7118);
		local6.aClass3_Sub2_Sub1_1.method2065(Static346.aClass309_6.anInt8217);
		Static263.method3738(local6.aClass3_Sub2_Sub1_1);
		@Pc(75) String local75 = Static353.aString68;
		local6.aClass3_Sub2_Sub1_1.method2065(local75 == null ? 0 : 1);
		if (local75 != null) {
			local6.aClass3_Sub2_Sub1_1.method2073(local75);
		}
		local6.aClass3_Sub2_Sub1_1.method2065(arg1);
		local6.aClass3_Sub2_Sub1_1.method2065(arg3 ? 1 : 0);
		local6.aClass3_Sub2_Sub1_1.anInt2178 += 7;
		local6.aClass3_Sub2_Sub1_1.method2021(local32, local6.aClass3_Sub2_Sub1_1.anInt2178, local36);
		local6.aClass3_Sub2_Sub1_1.method2076(local6.aClass3_Sub2_Sub1_1.anInt2178 - local21);
		Static95.aClass292_1.method6855(local6);
		Static446.anInt6827 = 1;
		Static468.anInt7366 = -3;
		Static77.anInt1738 = 0;
		Static266.anInt4140 = 0;
		if (arg1 < 13) {
			Static504.aBoolean540 = true;
			Static434.method9045();
		}
	}
}
