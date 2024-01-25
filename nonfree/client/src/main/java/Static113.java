import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "F")
	public static float aFloat19 = 0.0F;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_51 = new Class211(98, -1);

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
	public static int anInt2094 = -1;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1715() {
		if (Static356.aClass38_1 != null) {
			Static356.aClass38_1.method1490();
		}
		if (Static385.aClass38_2 != null) {
			Static385.aClass38_2.method1490();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Lclient!oa;")
	public static Class3_Sub2 method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub2_3;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public static void method1719() {
		if (Static28.aBoolean54) {
			return;
		}
		Static257.aBoolean292 = true;
		Static28.aBoolean54 = true;
		if (Static2.aClass148_Sub1_1.aBoolean245) {
			aFloat19 = (int) aFloat19 - 65 & 0xFFFFFF80;
		} else {
			Static126.aFloat5 += (-Static126.aFloat5 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	public static void method1720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(16, arg0);
		local8.method3098();
		local8.anInt3911 = arg1;
	}
}
