import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!an;")
	public static Class16 aClass16_120;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_153 = new Class45(13, 0);

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public static int anInt9578 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	public static void method7930(@OriginalArg(1) int arg0) {
		Static391.anInt6916 = arg0;
		@Pc(7) Class125 local7 = Static268.aClass125_41;
		synchronized (Static268.aClass125_41) {
			Static268.aClass125_41.method3440();
		}
		local7 = Static156.aClass125_21;
		synchronized (Static156.aClass125_21) {
			Static156.aClass125_21.method3440();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!be;I)V")
	public static void method7931(@OriginalArg(0) Class30_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class30_Sub1_Sub1_Sub2) {
			@Pc(14) Class30_Sub1_Sub1_Sub2 local14 = (Class30_Sub1_Sub1_Sub2) arg0;
			if (local14.aClass130_1 != null) {
				Static392.method6186(local14, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local14.aByte99);
			}
		} else if (arg0 instanceof Class30_Sub1_Sub1_Sub1) {
			@Pc(40) Class30_Sub1_Sub1_Sub1 local40 = (Class30_Sub1_Sub1_Sub1) arg0;
			Static51.method7362(local40.aByte99 != Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99, local40);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIB)I")
	public static int method7933(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class12_Sub23 local13 = Static292.method4742(arg2, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local13.anIntArray333.length) {
			return local13.anIntArray333[arg1];
		} else {
			return -1;
		}
	}
}
