import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!an", name = "W", descriptor = "I")
	public static final int anInt503 = 7000;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V")
	public static void method441(@OriginalArg(0) int arg0) {
		if (Static67.method1102(arg0)) {
			Static29.method573(Static115.aClass160ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!ac;)Lclient!ec;")
	public static Class75 method442(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(13) int local13 = arg0.method7945();
		return new Class75(local13);
	}
}
