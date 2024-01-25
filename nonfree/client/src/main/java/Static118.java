import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public static int anInt6324;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!aj;")
	public static Class10 aClass10_52 = new Class10(16);

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
	public static volatile long aLong220 = 0L;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString418 = "Loading textures - ";

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public static void method5339() {
		Static330.aClass26Array2 = null;
		Static258.method4347(Static161.anInt3337, 0, 0, 0, -1, Static128.anInt2823, Static214.anInt4266, 0);
		if (Static330.aClass26Array2 != null) {
			Static77.method1575(Static104.anInt2480, Static133.anInt2886, Static298.aClass26_28.anInt571, 0, Static330.aClass26Array2, Static214.anInt4266, 0, Static128.anInt2823, -1412584499);
			Static330.aClass26Array2 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method5344(@OriginalArg(1) int arg0) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(6, arg0);
		local13.method4788();
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)I")
	public static int method5346() {
		if (Static34.aBoolean59) {
			return 0;
		} else if (Static105.method5089()) {
			return Class22_Sub2_Sub5.lb ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method5348() {
		@Pc(12) Class7_Sub1_Sub15 local12 = Static315.method5104(15, 0);
		local12.method4788();
	}
}
