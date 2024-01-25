import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "Lclient!jia;")
	public static Class172 aClass172_7;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "Lclient!sca;")
	public static Class304 aClass304_4;

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "[I")
	public static final int[] anIntArray466 = new int[4];

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_110 = new Class200(109, 0);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6615(@OriginalArg(0) Class5 arg0) {
		if (Static176.anInt3422 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 && (Static330.aClass77ArrayArrayArray2 != null && Static27.method1048(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, arg0))) {
			Static176.anInt3422 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)V")
	public static void method6616(@OriginalArg(1) boolean arg0) {
		Static188.method3219(Static330.anInt6165, arg0, Static307.anInt5465, Static109.anInt2357);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)V")
	public static void method6617() {
		Static265.aClass223_21.method5862();
		Static629.anInt10094 = 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method6618(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZB)V")
	public static void method6619() {
		@Pc(14) Class3_Sub14 local14 = Static139.method2308(Static618.aClass130_134, Static24.aClass233_1);
		Static562.method8096(local14);
		for (@Pc(22) Class3_Sub29 local22 = (Class3_Sub29) Static356.aClass280_29.method7110(); local22 != null; local22 = (Class3_Sub29) Static356.aClass280_29.method7108()) {
			if (!local22.method8770()) {
				local22 = (Class3_Sub29) Static356.aClass280_29.method7110();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt4603 == 0) {
				Static54.method1546(true, true, local22);
			}
		}
		if (Static25.aClass279_13 != null) {
			Static482.method7193(Static25.aClass279_13);
			Static25.aClass279_13 = null;
		}
	}
}
