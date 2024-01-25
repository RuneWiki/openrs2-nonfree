import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!iq;")
	public static Class104 aClass104_25;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public static int anInt516;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static243.aByteArrayArrayArray10[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static243.aByteArrayArrayArray10[arg3][arg0][arg1] & 0x10) == 0) {
			return Static104.method2070(arg1, arg3, arg0) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IC)Z")
	public static boolean method439(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method441(@OriginalArg(1) int arg0) {
		if (!Static204.aBoolean384) {
			arg0 = -1;
		}
		if (Static197.anInt4303 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class94 local20 = Static330.method5380(arg0);
			@Pc(24) Class40 local24 = local20.method2508();
			if (local24 == null) {
				arg0 = -1;
			} else {
				Static62.aClass179_2.method4878(new Point(local20.anInt2752, local20.anInt2755), local24.method845(), local24.method838(), local24.method835(), Static95.aCanvas3);
				Static197.anInt4303 = arg0;
			}
		}
		if (arg0 == -1 && Static197.anInt4303 != -1) {
			Static62.aClass179_2.method4878(new Point(), null, -1, -1, Static95.aCanvas3);
			Static197.anInt4303 = -1;
		}
	}
}
