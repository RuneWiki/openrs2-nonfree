import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	public static int anInt5220;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString312 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!gh;B)V")
	public static void method4458(@OriginalArg(0) Class1_Sub18 arg0) {
		@Pc(1) long local1 = 0L;
		if (arg0.anInt1779 == 0) {
			local1 = Static30.method495(arg0.anInt1780, arg0.anInt1791, arg0.anInt1785);
		}
		@Pc(29) int local29 = -1;
		if (arg0.anInt1779 == 1) {
			local1 = Static74.method1466(arg0.anInt1780, arg0.anInt1791, arg0.anInt1785);
		}
		if (arg0.anInt1779 == 2) {
			local1 = Static86.method1602(arg0.anInt1780, arg0.anInt1791, arg0.anInt1785);
		}
		@Pc(58) int local58 = 0;
		if (arg0.anInt1779 == 3) {
			local1 = Static38.method3321(arg0.anInt1780, arg0.anInt1791, arg0.anInt1785);
		}
		@Pc(75) int local75 = 0;
		if (local1 != 0L) {
			local29 = Integer.MAX_VALUE & (int) (local1 >>> 32);
			local75 = (int) local1 >> 20 & 0x3;
			local58 = (int) local1 >> 14 & 0x1F;
		}
		arg0.anInt1782 = local58;
		arg0.anInt1788 = local75;
		arg0.anInt1781 = local29;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)J")
	public static long method4459() {
		return Static53.aClass45_1.method4595();
	}
}
