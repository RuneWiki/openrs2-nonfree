import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public static int anInt2743;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!ha;")
	public static Class2 aClass2_18;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!im;")
	public static final Class140 aClass140_50 = new Class140(98, 0);

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "S")
	public static short aShort39 = 1;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!jq;)V")
	public static void method2333(@OriginalArg(1) Class156 arg0) {
		if (arg0.anInt4735 == 5 && arg0.anInt4697 != -1) {
			Static420.method6173(arg0, Static513.aClass122_10);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I")
	public static int method2334(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIII)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class260 local3 = new Class260();
		local3.anInt7451 = arg1 >> Static451.anInt7905;
		local3.anInt7454 = arg2 >> Static451.anInt7905;
		local3.anInt7455 = arg3 >> Static451.anInt7905;
		local3.anInt7440 = arg4 >> Static451.anInt7905;
		local3.anInt7444 = arg0;
		local3.anInt7437 = arg1;
		local3.anInt7448 = arg2;
		local3.anInt7447 = arg3;
		local3.anInt7439 = arg4;
		local3.anInt7450 = arg5;
		local3.anInt7453 = arg6;
		Static224.aClass260Array1[Static216.anInt4206++] = local3;
	}
}
