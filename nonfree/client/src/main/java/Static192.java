import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public static int anInt3800;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public static int anInt3790 = 0;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Created gameworld";

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public static int anInt3804 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIIIIIIIII)V")
	public static void method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class5_Sub32 local7 = new Class5_Sub32();
		local7.anInt4191 = arg7;
		local7.anInt4200 = arg5;
		local7.anInt4192 = arg0;
		local7.anInt4197 = arg4;
		local7.anInt4199 = arg1;
		local7.anInt4204 = arg10;
		local7.anInt4196 = arg8;
		local7.anInt4193 = arg3;
		local7.anInt4194 = arg2;
		local7.anInt4195 = arg9;
		local7.anInt4201 = arg11;
		local7.anInt4198 = arg6;
		Static145.aClass211_38.method5609(local7);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
	public static void method3485(@OriginalArg(0) int arg0) {
		Static193.anInt3823 = arg0;
		Static42.aClass66_13.method1933();
	}
}
