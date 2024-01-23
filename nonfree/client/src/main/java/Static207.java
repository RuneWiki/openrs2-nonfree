import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt4319;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public static int anInt4318 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method3483(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg0;
			return arg1 ? Static18.method408(local22) : local22;
		} else if (arg0 instanceof Class10) {
			@Pc(36) Class10 local36 = (Class10) arg0;
			return local36.method288();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method3484() {
		if (!Static133.aBoolean219) {
			return;
		}
		@Pc(12) Class115 local12 = Static266.method4442(Static25.anInt5783, Static297.anInt6213);
		if (local12 != null && local12.anObjectArray15 != null) {
			@Pc(21) Class2_Sub6 local21 = new Class2_Sub6();
			local21.aClass115_4 = local12;
			local21.anObjectArray1 = local12.anObjectArray15;
			Static73.method1363(local21);
		}
		Static133.aBoolean219 = false;
		Static260.anInt5409 = -1;
		Static298.method4263(local12);
	}
}
