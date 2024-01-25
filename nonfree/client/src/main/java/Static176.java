import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Lclient!ii;")
	public static Class105 aClass105_10;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt3719 = 0;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Opened title screen";

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)V")
	public static void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(11, arg2);
		local8.method4783();
		local8.anInt5467 = arg1;
		local8.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3147(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static271.method4880(Static195.method5823(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public static void method3149() {
		if (Static25.method408() || Static127.anInt2487 == Static98.anInt1912) {
			Static94.method1481(Static217.aClass105_5);
			if (Static127.anInt2487 != Static285.anInt5731) {
				Static35.method683();
			}
		} else {
			Static172.method3082(false, Static177.anInt3736, Static127.anInt2487, Static232.anInt4829, false, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0]);
		}
	}
}
