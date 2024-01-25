import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!hp;")
	public static Class110 aClass110_2;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!oi;")
	public static Class185 aClass185_55;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	public static void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class160 local12 = Static369.aClass160ArrayArray1[arg2][arg1];
		Static355.method4659(local12 == null ? Static147.aClass160_1 : local12, arg0);
	}
}
