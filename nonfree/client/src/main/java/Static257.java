import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mr", name = "R", descriptor = "Z")
	public static boolean aBoolean291;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_100 = new Class211(28, 8);

	@OriginalMember(owner = "client!mr", name = "W", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_101 = new Class211(96, 8);

	@OriginalMember(owner = "client!mr", name = "cb", descriptor = "Z")
	public static boolean aBoolean292 = true;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)V")
	public static void method3280() {
		Static29.method451(Static296.aClass102_144);
		for (@Pc(17) Class2_Sub21 local17 = (Class2_Sub21) Static418.aClass72_44.method1655(); local17 != null; local17 = (Class2_Sub21) Static418.aClass72_44.method1649()) {
			if (!local17.method5702()) {
				local17 = (Class2_Sub21) Static418.aClass72_44.method1655();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt2586 == 0) {
				Static74.method1091(local17, true, true);
			}
		}
		if (Static324.aClass16_16 != null) {
			Static176.method70(Static324.aClass16_16);
			Static324.aClass16_16 = null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	public static void method3284() {
		@Pc(7) int local7 = Static119.anInt2204;
		@Pc(9) int[] local9 = Static200.anIntArray295;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub4_Sub1_Sub2 local19 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt4961 > 0) {
				local19.anInt4961--;
				if (local19.anInt4961 == 0) {
					local19.aString146 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static351.anInt5969; local48++) {
			@Pc(55) long local55 = (long) Static40.anIntArray84[local48];
			@Pc(61) Class2_Sub28 local61 = (Class2_Sub28) Static49.aClass72_11.method1659(local55);
			if (local61 != null) {
				@Pc(66) Class3_Sub4_Sub1_Sub1 local66 = local61.aClass3_Sub4_Sub1_Sub1_1;
				if (local66.anInt4961 > 0) {
					local66.anInt4961--;
					if (local66.anInt4961 == 0) {
						local66.aString146 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BII)I")
	public static int method3285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static312.method4254(arg0, 0, arg1);
	}
}
