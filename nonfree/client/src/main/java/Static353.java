import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mga", name = "N", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_9;

	@OriginalMember(owner = "client!mga", name = "Y", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!mga", name = "db", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!mga", name = "S", descriptor = "[I")
	public static final int[] anIntArray399 = new int[13];

	@OriginalMember(owner = "client!mga", name = "W", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIII)V")
	public static void method5308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class299 local13 = Static403.aClass299ArrayArray1[arg2][arg0];
		Static432.method6265(local13 == null ? Static67.aClass299_2 : local13, arg1);
	}
}
