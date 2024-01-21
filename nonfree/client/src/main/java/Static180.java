import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wh", name = "rb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1246 = Static8.method128("flash1:");

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1244 = aClass18_1246;

	@OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
	public static int anInt4776 = 0;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
	public static int anInt4777 = 0;

	@OriginalMember(owner = "client!wh", name = "cb", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!wh", name = "db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1245 = aClass18_1246;

	@OriginalMember(owner = "client!wh", name = "eb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array25 = new Class18[500];

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
	public static int anInt4780 = 0;

	@OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
	public static int anInt4785 = 0;

	@OriginalMember(owner = "client!wh", name = "tb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1247 = Static8.method128("VOLL");

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
	public static void method3218() {
		aClass18_1246 = null;
		aClass18_1247 = null;
		aClass18_1245 = null;
		aClass18_1244 = null;
		aClass18Array25 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Lclient!ef;I)V")
	public static void method3220(@OriginalArg(1) Class20[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class20 local14 = arg0[local8];
			if (local14 != null) {
				if (local14.anInt1213 == 0) {
					if (local14.aClass20Array1 != null) {
						method3220(local14.aClass20Array1, arg1);
					}
					@Pc(38) Class1_Sub8 local38 = (Class1_Sub8) Static155.aClass14_14.method569((long) local14.anInt1240);
					if (local38 != null) {
						Static58.method1198(local38.anInt1188, arg1);
					}
				}
				@Pc(56) Class1_Sub10 local56;
				if (arg1 == 0 && local14.anObjectArray5 != null) {
					local56 = new Class1_Sub10();
					local56.aClass20_6 = local14;
					local56.anObjectArray28 = local14.anObjectArray5;
					Static97.method2118(local56);
				}
				if (arg1 == 1 && local14.anObjectArray18 != null) {
					if (local14.anInt1200 >= 0) {
						@Pc(85) Class20 local85 = Static84.method1826(local14.anInt1240);
						if (local85 == null || local85.aClass20Array1 == null || local85.aClass20Array1.length <= local14.anInt1200 || local85.aClass20Array1[local14.anInt1200] != local14) {
							continue;
						}
					}
					local56 = new Class1_Sub10();
					local56.anObjectArray28 = local14.anObjectArray18;
					local56.aClass20_6 = local14;
					Static97.method2118(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ef;B)Lclient!ea;")
	public static Class18 method3221(@OriginalArg(0) Class20 arg0) {
		if (Static22.method380(Static36.method758(arg0)) == 0) {
			return null;
		} else if (arg0.aClass18_292 == null || arg0.aClass18_292.method726().method747() == 0) {
			return Static33.aBoolean37 ? Static76.aClass18_564 : null;
		} else {
			return arg0.aClass18_292;
		}
	}
}
