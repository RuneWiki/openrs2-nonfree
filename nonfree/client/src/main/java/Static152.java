import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString56;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[100];

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "[Lclient!bm;")
	public static final Class24[] aClass24Array3 = new Class24[4];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JB)V")
	public static void method5137(@OriginalArg(0) long arg0) {
		Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
		Static125.aClass5_Sub12_Sub2_3.method5089(21);
		Static125.aClass5_Sub12_Sub2_3.method5065(arg0);
		Static41.anInt725 = 0;
		Static18.anInt359 = 0;
		Static350.anInt6718 = 1;
		Static8.anInt187 = -3;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!rd;Z)I")
	public static int method5138(@OriginalArg(0) Class4_Sub5_Sub2_Sub2 arg0) {
		@Pc(6) Class106 local6 = arg0.aClass106_1;
		if (local6.anIntArray326 != null) {
			local6 = local6.method2829();
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(25) int local25 = local6.anInt3138;
		@Pc(29) Class88 local29 = arg0.method4805();
		if (arg0.aBoolean446) {
			local25 = local6.anInt3149;
		} else if (local29.anInt2272 == arg0.anInt5361 || local29.anInt2286 == arg0.anInt5361 || arg0.anInt5361 == local29.anInt2290 || arg0.anInt5361 == local29.anInt2275) {
			local25 = local6.anInt3155;
		} else if (local29.anInt2276 == arg0.anInt5361 || local29.anInt2308 == arg0.anInt5361 || arg0.anInt5361 == local29.anInt2314 || local29.anInt2305 == arg0.anInt5361) {
			local25 = local6.anInt3145;
		}
		return local25;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method5139(@OriginalArg(1) Class93 arg0) {
		Static38.aClass93_13 = arg0;
		Static216.anInt4317 = Static38.aClass93_13.method2418(4);
	}
}
