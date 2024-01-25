import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public static int anInt5817;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt5818 = 0;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lclient!in;")
	public static final Class5_Sub1_Sub9[] aClass5_Sub1_Sub9Array6 = new Class5_Sub1_Sub9[14];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!ne;IBILclient!gf;)Lclient!ea;")
	public static synchronized Class55 method5183(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			if (!Static146.aBooleanArray11[local7]) {
				local5 = local7;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(56) Class55 local56;
		if (arg3 == 0) {
			local56 = Static191.method3415(local5, arg0, arg4);
		} else if (arg3 == 1) {
			local56 = Static274.method4820(arg1, local5, arg4, arg0, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static146.aBooleanArray11[local5] = true;
		return local56;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)I")
	public static int method5194(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public static void method5230() {
		Static1.aClass109_1.method2850();
		Static69.aClass109_18.method2850();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ij;I)V")
	public static void method5236(@OriginalArg(0) Class93 arg0) {
		Static184.aClass93_113 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(CI)Z")
	public static boolean method5239(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
