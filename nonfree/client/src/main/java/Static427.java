import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
	public static long aLong219 = 0L;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_258 = new Class67(98, 0);

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!du;")
	public static final Class62 aClass62_38 = new Class62(9, 16);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	public static boolean method5425(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Lclient!bd;")
	public static Class1_Sub3_Sub1 method5426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub3_Sub1 local15 = (Class1_Sub3_Sub1) Static391.aClass208_35.method4405((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class1_Sub3_Sub1(arg1, arg0);
			Static391.aClass208_35.method4413(local15.aLong236, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)[Lclient!nl;")
	public static Class174[] method5427() {
		if (Static87.aClass174Array1 == null) {
			@Pc(7) Class174[] local7 = Static25.method357(Static259.aClass177_2);
			@Pc(11) Class174[] local11 = new Class174[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(66) int local66;
			@Pc(72) Class174 local72;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class174 local21 = local7[local15];
				if ((local21.anInt4752 <= 0 || local21.anInt4752 >= 24) && local21.anInt4753 >= 800 && local21.anInt4754 >= 600 && (Static45.anInt669 >= 96 || Static214.anInt3968 != 0 || local21.anInt4753 <= 1024 && local21.anInt4754 <= 768)) {
					for (local66 = 0; local66 < local13; local66++) {
						local72 = local11[local66];
						if (local72.anInt4753 == local21.anInt4753 && local72.anInt4754 == local21.anInt4754) {
							if (local21.anInt4752 > local72.anInt4752) {
								local11[local66] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static87.aClass174Array1 = new Class174[local13];
			Static471.method3067(local11, 0, Static87.aClass174Array1, 0, local13);
			@Pc(128) int[] local128 = new int[Static87.aClass174Array1.length];
			for (local66 = 0; local66 < Static87.aClass174Array1.length; local66++) {
				local72 = Static87.aClass174Array1[local66];
				local128[local66] = local72.anInt4753 * local72.anInt4754;
			}
			Static447.method5748(Static87.aClass174Array1, local128);
		}
		return Static87.aClass174Array1;
	}
}
