import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt1192;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public static int anInt1201 = 0;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!ul;")
	public static Class172 aClass172_11 = new Class172(64);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!cg;ZLclient!cg;)I")
	public static int method1025(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method656(Static299.anInt5734)) {
			local5++;
		}
		if (arg1.method656(Static280.anInt5489)) {
			local5++;
		}
		if (arg1.method656(Static237.anInt4716)) {
			local5++;
		}
		if (arg0.method656(Static299.anInt5734)) {
			local5++;
		}
		if (arg0.method656(Static280.anInt5489)) {
			local5++;
		}
		if (arg0.method656(Static237.anInt4716)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!nh;Lclient!nh;)V")
	public static void method1027(@OriginalArg(1) Class4_Sub2 arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		if (arg0.aClass4_Sub2_71 != null) {
			arg0.method4697();
		}
		arg0.aClass4_Sub2_71 = arg1;
		arg0.aClass4_Sub2_72 = arg1.aClass4_Sub2_72;
		arg0.aClass4_Sub2_71.aClass4_Sub2_72 = arg0;
		arg0.aClass4_Sub2_72.aClass4_Sub2_71 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method1028() {
		Static207.aClass4_Sub2_Sub11_7 = null;
		Static170.aClass4_Sub2_Sub11_9 = null;
		Static78.aClass4_Sub2_Sub11_1 = null;
		Static97.aClass4_Sub2_Sub11_10 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
	public static boolean method1030(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && Static213.aBooleanArray29.length > arg0 ? Static213.aBooleanArray29[arg0] : false;
	}
}
