import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Lclient!bd;")
	public static Class26_Sub1 aClass26_Sub1_3;

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!bga;")
	public static Class31 aClass31_5;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Lclient!qs;")
	public static final Class278 aClass278_1 = new Class278();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)I")
	public static int method4697(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static473.method6471(arg0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public static void method4699() {
		Static307.aClass134_8.ra(Static130.aFloat36 * ((float) Static348.aClass1_Sub30_Sub1_1.anInt4882 * 0.1F + 0.7F));
		Static307.aClass134_8.VA(Static125.anInt2496, Static322.aFloat124, Static154.aFloat51, (float) (Static18.anInt221 << 2), (float) (Static223.anInt4253 << 2), (float) (Static369.anInt6131 << 2));
		Static307.aClass134_8.method6913(Static236.aClass83_3);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)Z")
	public static boolean method4700() {
		try {
			if (Static11.anInt142 == 2) {
				if (Static202.aClass1_Sub23_2 == null) {
					Static202.aClass1_Sub23_2 = Static603.method2914(Static500.aClass270_114, Static61.anInt1177, Static24.anInt314);
					if (Static202.aClass1_Sub23_2 == null) {
						return false;
					}
				}
				if (Static214.aClass84_1 == null) {
					Static214.aClass84_1 = new Class84(Static442.aClass270_95, Static547.aClass270_115);
				}
				if (Static97.aClass1_Sub7_Sub2_2.method525(Static214.aClass84_1, Static511.aClass270_105, Static202.aClass1_Sub23_2)) {
					Static97.aClass1_Sub7_Sub2_2.method534();
					if (Static181.anInt3185 > 0) {
						Static11.anInt142 = 3;
						Static97.aClass1_Sub7_Sub2_2.method526(0);
					} else {
						Static11.anInt142 = 0;
						Static97.aClass1_Sub7_Sub2_2.method526(Static403.anInt7063);
					}
					if (Static240.aLong129 > 0L) {
						Static97.aClass1_Sub7_Sub2_2.method537(Static243.aBoolean335, Static240.aLong129, Static202.aClass1_Sub23_2);
					} else {
						Static97.aClass1_Sub7_Sub2_2.method528(Static202.aClass1_Sub23_2, Static243.aBoolean335);
					}
					Static240.aLong129 = 0L;
					Static202.aClass1_Sub23_2 = null;
					Static500.aClass270_114 = null;
					Static214.aClass84_1 = null;
					return true;
				}
			}
		} catch (@Pc(83) Exception local83) {
			local83.printStackTrace();
			Static97.aClass1_Sub7_Sub2_2.method520();
			Static11.anInt142 = 0;
			Static500.aClass270_114 = null;
			Static202.aClass1_Sub23_2 = null;
			Static214.aClass84_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
	public static void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(1, arg1);
		local8.method6594();
		local8.anInt8204 = arg0;
	}
}
