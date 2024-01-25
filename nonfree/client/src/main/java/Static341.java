import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "Lclient!st;")
	public static final Class314 aClass314_97 = new Class314(69, 2);

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "Z")
	public static final boolean aBoolean464 = false;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BB)V")
	public static void method5447(@OriginalArg(1) byte arg0) {
		if (Static171.aByteArrayArrayArray10 == null) {
			Static171.aByteArrayArrayArray10 = new byte[4][Static399.anInt7121][Static24.anInt345];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static399.anInt7121; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static24.anInt345; local22++) {
					Static171.aByteArrayArrayArray10[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!uu;BZJIII)V")
	public static void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(4) long arg2, @OriginalArg(6) int arg3) {
		Static634.aBoolean764 = false;
		Static491.anInt8356 = 0;
		Static151.anInt3054 = 0;
		Static229.anInt4628 = arg0;
		Static169.anInt3281 = 1;
		Static471.anInt8063 = arg3;
		Static240.aClass343_120 = arg1;
		Static263.aLong139 = arg2;
		Static522.aClass3_Sub3_Sub1_4 = null;
		Static428.anInt7479 = 10000;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5452(@OriginalArg(0) String arg0) {
		if (Static95.aClass253Array1 != null) {
			@Pc(20) Class3_Sub27 local20 = Static59.method1040(Static325.aClass20_2, Static389.aClass314_109);
			local20.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg0));
			local20.aClass3_Sub9_Sub2_2.method5638(arg0);
			Static148.method2572(local20);
		}
	}
}
