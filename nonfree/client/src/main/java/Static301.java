import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!xa;")
	public static Class58 aClass58_27;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_89 = new Class47(16, 8);

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Lclient!uo;")
	public static Class4_Sub2 method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_2;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FFF[BFIILclient!kda;FBIII)V")
	public static void method4764(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class84 arg6, @OriginalArg(8) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static468.method6536(arg6, arg1, arg2, arg0, local7, arg7, arg4, arg5, arg3);
			arg5 += 16384;
		}
	}
}
