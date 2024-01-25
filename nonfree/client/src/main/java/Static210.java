import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array8;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public static int anInt3709;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public static int anInt3710 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lclient!fr;")
	public static Class12_Sub3 method3275() {
		@Pc(8) Class12_Sub3 local8 = (Class12_Sub3) Static295.aClass22_7.method285();
		if (local8 == null) {
			return new Class12_Sub3();
		} else {
			Static328.anInt5561--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
	public static int method3276(@OriginalArg(1) int arg0) {
		if (Static12.aClass145_2 != null) {
			Static12.aClass145_2.method3136();
			Static12.aClass145_2 = null;
		}
		Static251.anInt4511++;
		if (Static251.anInt4511 > 4) {
			Static251.anInt4511 = 0;
			Static255.anInt4584 = 0;
			return arg0;
		}
		if (Static222.anInt3950 == Static253.anInt4563) {
			Static253.anInt4563 = Static1.anInt11;
		} else {
			Static253.anInt4563 = Static222.anInt3950;
		}
		Static255.anInt4584 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public static void method3278(@OriginalArg(1) int arg0) {
		Static296.anInt5113 = 100;
		Static179.anInt3177 = 3;
		Static246.anInt4423 = -1;
		Static384.anInt6421 = arg0;
	}
}
