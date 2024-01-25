import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_118 = new Class40(51, 14);

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_9 = new Class216(0, 5);

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "[I")
	public static int[] anIntArray466 = new int[1];

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;IIIIII)V")
	public static void method4180(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class102_Sub3 local7 = new Class102_Sub3();
		local7.anInt7040 = Static358.anInt6263 + arg1;
		local7.aString86 = arg0;
		local7.anInt7047 = arg4;
		local7.anInt7045 = arg6;
		local7.anInt7042 = arg5;
		local7.anInt7043 = arg2;
		local7.anInt7046 = arg3;
		Static206.aClass249_3.method5809(local7);
	}
}
