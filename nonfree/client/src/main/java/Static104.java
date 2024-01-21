import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt2874;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_955 = Static161.method2971("mapfunction");

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public static final int anInt2872 = 50;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IJIB)Z")
	public static boolean method2058(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19 = (int) arg1 >> 14 & 0x1F;
		@Pc(26) int local26 = (int) arg1 >> 20 & 0x3;
		@Pc(33) int local33 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local19 == 10 || local19 == 11 || local19 == 22) {
			@Pc(48) Class1_Sub2_Sub14 local48 = Static4.method79(local33);
			@Pc(58) int local58;
			@Pc(61) int local61;
			if (local26 == 0 || local26 == 2) {
				local61 = local48.anInt3314;
				local58 = local48.anInt3302;
			} else {
				local58 = local48.anInt3314;
				local61 = local48.anInt3302;
			}
			@Pc(72) int local72 = local48.anInt3304;
			if (local26 != 0) {
				local72 = (local72 << local26 & 0xF) + (local72 >> 4 - local26);
			}
			Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], local61, 0, true, arg0, arg2, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], local72, local58);
		} else {
			Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, local19 + 1, true, arg0, arg2, 2, local26, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
		}
		Static151.anInt4127 = Static122.anInt3191;
		Static98.anInt3739 = 2;
		Static101.anInt2831 = 0;
		Static119.anInt3146 = Static8.anInt293;
		return true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
	public static void method2059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static1.aClass1_Sub8_Sub1_1.method1654(156);
		Static1.aClass1_Sub8_Sub1_1.method1606(arg0);
		Static1.aClass1_Sub8_Sub1_1.method1614(arg1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method2060() {
		aClass13_955 = null;
		anIntArray268 = null;
	}
}
