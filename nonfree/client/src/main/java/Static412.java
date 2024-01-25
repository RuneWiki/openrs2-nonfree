import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!jia;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)I")
	public static int method5192(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local25 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)[Lclient!de;")
	public static Class60[] method5193() {
		return new Class60[] { Static215.aClass60_4, Static596.aClass60_11, Static342.aClass60_10, Static495.aClass60_8, Static238.aClass60_5, Static677.aClass60_12, Static423.aClass60_7 };
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIZI)V")
	public static void method5195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if ((arg4 ? Static124.aClass4_Sub20_4.aClass8_Sub22_1.method7414() : Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414()) != 0 && arg2 != 0 && Static655.anInt10336 < 50 && arg3 != -1) {
			Static665.aClass129Array1[Static655.anInt10336++] = new Class129((byte) (arg4 ? 3 : 2), arg3, arg2, arg5, arg1, 0, arg0, (Class3_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZZ)V")
	public static void method5196(@OriginalArg(0) boolean arg0) {
		if (Static31.aClass353_3 == null) {
			Static614.method8042();
		}
		if (arg0) {
			Static31.aClass353_3.method7681();
		}
	}
}
