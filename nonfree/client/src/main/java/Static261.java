import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "Lclient!rk;")
	public static Class180 aClass180_68;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "Lclient!rk;")
	public static Class180 aClass180_69;

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "Lclient!ps;")
	public static Class167 aClass167_3;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "[I")
	public static final int[] anIntArray662 = new int[128];

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString319 = "flash3:";

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!qm", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString320 = "wave:";

	@OriginalMember(owner = "client!qm", name = "S", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "Ljava/lang/String;")
	public static final String aString321 = "yellow:";

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
	public static void method4377() {
		Static89.method1860(Static186.anInt3771);
		@Pc(14) int local14 = (Static350.anInt6609 >> 3) + (Static203.anInt4014 >> 10);
		@Pc(27) int local27 = (Static24.anInt478 >> 10) + (Static237.anInt4696 >> 3);
		Static65.anIntArray235 = new int[18];
		Static58.aByteArrayArray6 = new byte[18][];
		Static121.aByteArrayArray8 = new byte[18][];
		Static222.anIntArray601 = new int[18];
		Static248.aByteArrayArray16 = new byte[18][];
		Static321.anIntArray779 = new int[18];
		Static5.aByteArrayArray3 = new byte[18][];
		Static54.anIntArray214 = new int[18];
		Static154.anIntArrayArray25 = new int[18][4];
		Static75.aByteArrayArray7 = new byte[18][];
		Static94.anIntArray311 = new int[18];
		Static228.anIntArray614 = new int[18];
		@Pc(74) int local74 = 0;
		@Pc(92) int local92;
		for (@Pc(83) int local83 = (local14 - (Static15.anInt287 >> 4)) / 8; local83 <= ((Static15.anInt287 >> 4) + local14) / 8; local83++) {
			for (local92 = (local27 - (Static325.anInt6173 >> 4)) / 8; local92 <= ((Static325.anInt6173 >> 4) + local27) / 8; local92++) {
				@Pc(99) int local99 = local92 + (local83 << 8);
				Static94.anIntArray311[local74] = local99;
				Static54.anIntArray214[local74] = Static87.aClass180_80.method4570("m" + local83 + "_" + local92);
				Static222.anIntArray601[local74] = Static87.aClass180_80.method4570("l" + local83 + "_" + local92);
				Static65.anIntArray235[local74] = Static87.aClass180_80.method4570("n" + local83 + "_" + local92);
				Static321.anIntArray779[local74] = Static87.aClass180_80.method4570("um" + local83 + "_" + local92);
				Static228.anIntArray614[local74] = Static87.aClass180_80.method4570("ul" + local83 + "_" + local92);
				if (Static65.anIntArray235[local74] == -1) {
					Static54.anIntArray214[local74] = -1;
					Static222.anIntArray601[local74] = -1;
					Static321.anIntArray779[local74] = -1;
					Static228.anIntArray614[local74] = -1;
				}
				local74++;
			}
		}
		for (local92 = local74; local92 < Static65.anIntArray235.length; local92++) {
			Static65.anIntArray235[local92] = -1;
			Static54.anIntArray214[local92] = -1;
			Static222.anIntArray601[local92] = -1;
			Static321.anIntArray779[local92] = -1;
			Static228.anIntArray614[local92] = -1;
		}
		Static120.method2555(8, true, false, local27, local14, 0, 8);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Lclient!qi;")
	public static Class170 method4379(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static307.aClass103_63;
		@Pc(16) Class170 local16;
		synchronized (Static307.aClass103_63) {
			local16 = (Class170) Static307.aClass103_63.method2682((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = Static196.aClass180_52.method4560(Static55.method1160(arg0), Static318.method470(arg0));
		local16 = new Class170();
		local16.anInt4955 = arg0;
		if (local45 != null) {
			local16.method4325(new Class7_Sub3(local45));
		}
		local16.method4323();
		@Pc(66) Class103 local66 = Static307.aClass103_63;
		synchronized (Static307.aClass103_63) {
			Static307.aClass103_63.method2687(local16, (long) arg0);
			return local16;
		}
	}
}
