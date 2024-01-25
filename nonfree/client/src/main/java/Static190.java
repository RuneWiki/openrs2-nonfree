import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	public static int anInt4120 = 0;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_142 = new Class123(20, 3);

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Lclient!hg;")
	public static final Class122 aClass122_1 = new Class122();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FLclient!ss;IIFIIIFIFF[B)V")
	public static void method3341(@OriginalArg(0) float arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static64.method1584(arg3, arg6, arg5, local12, arg1, arg7, arg4, arg2, arg0);
			arg2 += 16384;
		}
	}
}
