import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_107 = new Class268("", 11);

	@OriginalMember(owner = "client!pt", name = "J", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_165 = new Class151("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!pt", name = "K", descriptor = "Lclient!cw;")
	public static Class1_Sub10 aClass1_Sub10_2 = null;

	@OriginalMember(owner = "client!pt", name = "L", descriptor = "S")
	public static short aShort60 = 256;

	@OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
	public static int anInt5271 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIII)V")
	public static void method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg3; local7++) {
			Static298.method3891(arg0, arg2, Static106.anIntArrayArray46[local7], arg4);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZI)I")
	public static int method4103(@OriginalArg(2) int arg0) {
		@Pc(14) Class1_Sub20 local14 = Static240.method3131(false, arg0);
		if (local14 == null) {
			return Static119.aClass228_1.method4845(arg0).anInt5268;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray149.length; local26++) {
			if (local14.anIntArray149[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static119.aClass228_1.method4845(arg0).anInt5268 - local14.anIntArray149.length;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!vg;)Z")
	public static boolean method4104(@OriginalArg(1) Class250 arg0) {
		if (arg0.anInt6983 == Static170.anInt2814) {
			Static79.anInt1462 = 250;
			return true;
		} else {
			return false;
		}
	}
}
