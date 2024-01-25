import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "Lclient!gda;")
	public static Class126 aClass126_4;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
	public static int anInt102;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!qa;")
	public static Class296 aClass296_1 = new Class296(8);

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method122() {
		Static399.aClass238Array3 = null;
		if (Static377.aBoolean419 && Static260.method4249() != 1) {
			Static45.method786(0, 0, Static21.method349(), Static177.method3100(), Static652.anInt10664 == 3 || Static652.anInt10664 == 7);
		}
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		if (Static377.aBoolean419) {
			local53 = Static194.method8971();
			local55 = Static5.method9220();
		}
		Static520.method7109(local55, -1, Static256.anInt4629 + local55, local53 - -Static85.anInt9921, local55, Static381.anInt6411, local53, local53);
		if (Static399.aClass238Array3 != null) {
			Static469.method6636(local55 + Static256.anInt4629, local53, -1412584499, Static399.aClass238Array3, true, Static535.anInt8531, local55, Static74.anInt1311, Static230.aClass238_4.anInt5957, Static85.anInt9921 + local53);
			Static399.aClass238Array3 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
	public static void method123(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg0, 6);
		local16.method7444();
	}
}
