import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!tn;")
	public static final Class339 aClass339_15 = new Class339(4);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!vba;)I")
	public static int method8377(@OriginalArg(1) Class5_Sub3_Sub20 arg0) {
		@Pc(15) String local15 = Static161.method4598(arg0);
		@Pc(17) int[] local17 = null;
		if (Static408.method5981(arg0.anInt10178)) {
			local17 = Static110.aClass105_1.method2659((int) arg0.aLong289).anIntArray390;
		} else if (arg0.anInt10174 != -1) {
			local17 = Static110.aClass105_1.method2659(arg0.anInt10174).anIntArray390;
		} else if (Static335.method5134(arg0.anInt10178)) {
			@Pc(103) Class5_Sub25 local103 = (Class5_Sub25) Static56.aClass300_8.method7188((long) (int) arg0.aLong289);
			if (local103 != null) {
				@Pc(108) Class28_Sub1_Sub4_Sub2_Sub1 local108 = local103.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				@Pc(111) Class134 local111 = local108.aClass134_1;
				if (local111.anIntArray191 != null) {
					local111 = local111.method3276(Static161.aClass237_3);
				}
				if (local111 != null) {
					local17 = local111.anIntArray192;
				}
			}
		} else if (Static591.method8116(arg0.anInt10178)) {
			@Pc(68) Class164 local68;
			if (arg0.anInt10178 == 1009) {
				local68 = Static568.aClass315_5.method7511((int) arg0.aLong289);
			} else {
				local68 = Static568.aClass315_5.method7511((int) (arg0.aLong289 >>> 32 & 0x7FFFFFFFL));
			}
			if (local68.anIntArray247 != null) {
				local68 = local68.method3908(Static161.aClass237_3);
			}
			if (local68 != null) {
				local17 = local68.anIntArray244;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static496.method7110(local17);
		}
		@Pc(143) int local143 = Static299.aClass247_11.method5764(local15, Static364.aClass50Array8);
		if (arg0.aBoolean869) {
			local143 += Static642.aClass50_37.method6002() + 4;
		}
		return local143;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public static void method8378() {
		Static577.anInt9443 = 0;
		Static171.anInt3389 = 2;
		Static439.aClass5_Sub17_Sub1_3 = null;
		Static561.anInt9131 = -1;
		Static234.aClass390_55 = null;
		Static128.aBoolean231 = false;
		Static67.anInt1002 = -1;
		Static26.anInt352 = 1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!uaa;I)Ljava/lang/String;")
	public static String method8379(@OriginalArg(1) Class345 arg0, @OriginalArg(2) int arg1) {
		if (!Static84.method1822(arg0).method453(arg1) && arg0.anObjectArray30 == null) {
			return null;
		} else if (arg0.aStringArray54 == null || arg1 >= arg0.aStringArray54.length || arg0.aStringArray54[arg1] == null || arg0.aStringArray54[arg1].trim().length() == 0) {
			return Static202.aBoolean307 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray54[arg1];
		}
	}
}
