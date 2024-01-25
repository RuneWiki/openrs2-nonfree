import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fs", name = "V", descriptor = "I")
	public static int anInt1910;

	@OriginalMember(owner = "client!fs", name = "I", descriptor = "Lclient!at;")
	public static final Class17 aClass17_16 = new Class17();

	@OriginalMember(owner = "client!fs", name = "K", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_16 = new Class227(260);

	@OriginalMember(owner = "client!fs", name = "X", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;I)V")
	public static void method1537(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static313.anIntArray626[local7] = Static313.anIntArray626[local7 - 1];
			Static348.anIntArray712[local7] = Static348.anIntArray712[local7 - 1];
			Static277.aStringArray69[local7] = Static277.aStringArray69[local7 - 1];
			Static364.aStringArray82[local7] = Static364.aStringArray82[local7 - 1];
			Static283.aStringArray70[local7] = Static283.aStringArray70[local7 - 1];
			Static16.aStringArray7[local7] = Static16.aStringArray7[local7 - 1];
			Static24.anIntArray74[local7] = Static24.anIntArray74[local7 - 1];
		}
		Static313.anIntArray626[0] = arg2;
		Static348.anIntArray712[0] = arg6;
		Static277.aStringArray69[0] = arg1;
		Static364.aStringArray82[0] = arg3;
		Static283.aStringArray70[0] = arg0;
		Static301.anInt5122 = Static105.anInt1853;
		Static16.aStringArray7[0] = arg5;
		Static24.anIntArray74[0] = arg4;
		Static162.anInt2945++;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!vc;IILclient!tq;)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(2) Class236 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class164 arg4) {
		@Pc(9) Class206 local9 = Static309.aClass184_3.method4224(arg1.anInt5922);
		if (local9.anInt5347 == -1) {
			return;
		}
		if (arg1.aBoolean547) {
			@Pc(28) int local28 = arg2 + arg1.anInt5920;
			arg2 = local28 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class51 local40 = local9.method4645(arg4, arg1.aBoolean552, arg2);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg1.anInt5893;
		@Pc(49) int local49 = arg1.anInt5912;
		if ((arg2 & 0x1) == 1) {
			local46 = arg1.anInt5912;
			local49 = arg1.anInt5893;
		}
		@Pc(63) int local63 = local40.method4682();
		@Pc(66) int local66 = local40.method4673();
		if (local9.aBoolean505) {
			local66 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt5351 == 0) {
			local40.method4679(arg3, arg0 + 4 - local49 * 4, local63, local66);
		} else {
			local40.method4677(arg3, arg0 - (local49 - 1) * 4, local63, local66, 1, local9.anInt5351 | 0xFF000000, 1);
		}
	}
}
