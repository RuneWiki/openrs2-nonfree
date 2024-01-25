import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!l;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!qn;")
	public static Class211 aClass211_5;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt119 = 0;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_7 = new Class146(33, 18);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public static void method99() {
		for (@Pc(6) Class4_Sub30 local6 = (Class4_Sub30) Static41.aClass244_2.method5263(); local6 != null; local6 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			if (Static377.method3116(local6.anInt4615)) {
				Static182.method2530(local6);
			}
		}
		if (Static351.anInt5841 == 1) {
			Static412.method5610();
			return;
		}
		Static204.method2868(Static30.anInt522, Static50.anInt816, Static328.anInt5318, Static128.anInt7338);
		@Pc(54) int local54 = Static363.aClass158_11.method3038(Static236.aClass15_64.method180(Static429.anInt6999));
		for (@Pc(59) Class4_Sub30 local59 = (Class4_Sub30) Static41.aClass244_2.method5263(); local59 != null; local59 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			@Pc(65) int local65 = Static406.method5509(local59);
			if (local65 > local54) {
				local54 = local65;
			}
		}
		Static128.anInt7338 = local54 + 8;
		Static30.anInt522 = Static351.anInt5841 * 16 + (Static265.aBoolean325 ? 26 : 22);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(20) Class4_Sub25 local20 = (Class4_Sub25) Static87.aClass67_6.method1429(local14);
		if (local20 == null) {
			local20 = new Class4_Sub25();
			Static87.aClass67_6.method1426(local20, local14);
		}
		if (local20.anIntArray345.length <= arg4) {
			@Pc(41) int[] local41 = new int[arg4 + 1];
			@Pc(46) int[] local46 = new int[arg4 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray345.length; local48++) {
				local41[local48] = local20.anIntArray345[local48];
				local46[local48] = local20.anIntArray344[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray345.length; local74 < arg4; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray344 = local46;
			local20.anIntArray345 = local41;
		}
		local20.anIntArray345[arg4] = arg1;
		local20.anIntArray344[arg4] = arg3;
	}
}
