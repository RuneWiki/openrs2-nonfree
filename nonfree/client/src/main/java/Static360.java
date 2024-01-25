import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public static int anInt6168 = 64;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString77 = null;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)I")
	public static int method5459(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BIII)V")
	public static void method5460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 * Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829() >> 8;
		if (local15 == 0 || arg2 == -1) {
			return;
		}
		if (!Static460.aBoolean599 && Static184.anInt7567 != -1 && Static104.method1717() && !Static277.method4685()) {
			Static157.aClass14_Sub1_Sub3_1 = Static214.method3270();
			@Pc(55) Class14_Sub1_Sub3 local55 = Static216.method5671(Static157.aClass14_Sub1_Sub3_1);
			Static202.method3017(local55);
		}
		Static494.method7429(local15, Static581.aClass310_113, arg2);
		Static588.method8381(-1, 255);
		Static460.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method5462() {
		if (Static571.aClass37_3 != null) {
			Static571.aClass37_3.method4371();
		}
		if (Static337.aClass37_1 != null) {
			Static337.aClass37_1.method4371();
		}
	}
}
