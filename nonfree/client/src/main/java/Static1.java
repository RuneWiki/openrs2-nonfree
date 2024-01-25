import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_3 = new Class158("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public static final int anInt42 = 1401;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
	public static int[] anIntArray4 = new int[2];

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method35() {
		for (@Pc(8) int local8 = 0; local8 < Static424.anInt7540; local8++) {
			@Pc(14) int local14 = Static96.anIntArray253[local8];
			@Pc(22) Class30_Sub1_Sub1_Sub1 local22 = ((Class1_Sub27) Static24.aClass38_3.method765((long) local14)).aClass30_Sub1_Sub1_Sub1_2;
			@Pc(26) int local26 = Static5.aClass1_Sub3_Sub1_1.method1171();
			if ((local26 & 0x80) != 0) {
				local26 += Static5.aClass1_Sub3_Sub1_1.method1171() << 8;
			}
			@Pc(48) int local48;
			@Pc(59) int local59;
			@Pc(63) int local63;
			if ((local26 & 0x2) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (local48 == 65535) {
					local48 = -1;
				}
				local59 = Static5.aClass1_Sub3_Sub1_1.method1186();
				local63 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local22.method956(false, local48, local63, local59);
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt1243 = Static5.aClass1_Sub3_Sub1_1.method1207();
				if (local22.anInt1243 == 65535) {
					local22.anInt1243 = -1;
				}
			}
			if ((local26 & 0x1) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1168();
				local59 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local22.method950(local48, Static187.anInt3975, local59);
				local22.anInt1237 = Static187.anInt3975 + 300;
				local22.anInt1290 = Static5.aClass1_Sub3_Sub1_1.method1170();
			}
			if ((local26 & 0x10) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1168();
				local59 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local22.method950(local48, Static187.anInt3975, local59);
			}
			if ((local26 & 0x1000) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1207();
				if (local48 == 65535) {
					local48 = -1;
				}
				local59 = Static5.aClass1_Sub3_Sub1_1.method1188();
				local63 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local22.method956(true, local48, local63, local59);
			}
			if ((local26 & 0x100) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1217();
				local22.anInt1276 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local22.anInt1241 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local22.aBoolean80 = (local48 & 0x8000) != 0;
				local22.anInt1280 = local48 & 0x7FFF;
				local22.anInt1307 = local22.anInt1276 + local22.anInt1280 + Static187.anInt3975;
			}
			if ((local26 & 0x2000) != 0) {
				local22.anInt1285 = Static5.aClass1_Sub3_Sub1_1.method1220();
				local22.anInt1312 = Static5.aClass1_Sub3_Sub1_1.method1189();
				local22.anInt1259 = Static5.aClass1_Sub3_Sub1_1.method1220();
				local22.anInt1272 = Static5.aClass1_Sub3_Sub1_1.method1189();
				local22.anInt1305 = Static5.aClass1_Sub3_Sub1_1.method1177() + Static187.anInt3975;
				local22.anInt1300 = Static5.aClass1_Sub3_Sub1_1.method1217() + Static187.anInt3975;
				local22.anInt1291 = Static5.aClass1_Sub3_Sub1_1.method1210();
				local22.anInt1314 = 1;
				local22.anInt1315 = 0;
				local22.anInt1312 += local22.anIntArray129[0];
				local22.anInt1259 += local22.anIntArray130[0];
				local22.anInt1272 += local22.anIntArray129[0];
				local22.anInt1285 += local22.anIntArray130[0];
			}
			if ((local26 & 0x4) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (local48 == 65535) {
					local48 = -1;
				}
				local59 = Static5.aClass1_Sub3_Sub1_1.method1170();
				Static122.method1980(local59, local22, local48);
			}
			if ((local26 & 0x800) != 0) {
				local22.aByte31 = Static5.aClass1_Sub3_Sub1_1.method1212();
				local22.aByte30 = Static5.aClass1_Sub3_Sub1_1.method1193();
				local22.aByte29 = Static5.aClass1_Sub3_Sub1_1.method1220();
				local22.aByte28 = (byte) Static5.aClass1_Sub3_Sub1_1.method1218();
				local22.anInt1258 = Static187.anInt3975 + Static5.aClass1_Sub3_Sub1_1.method1217();
				local22.anInt1310 = Static187.anInt3975 + Static5.aClass1_Sub3_Sub1_1.method1217();
			}
			if ((local26 & 0x40) != 0) {
				if (local22.aClass11_1.method134()) {
					Static32.method668(local22);
				}
				local22.method666(Static300.aClass44_2.method999(Static5.aClass1_Sub3_Sub1_1.method1177()));
				local22.method949(local22.aClass11_1.anInt162);
				local22.anInt1302 = local22.aClass11_1.anInt159 << 3;
				if (local22.aClass11_1.method134()) {
					Static418.method5683(local22.aByte102, null, 0, null, local22.anIntArray130[0], local22, local22.anIntArray129[0]);
				}
			}
			if ((local26 & 0x400) != 0) {
				local48 = Static5.aClass1_Sub3_Sub1_1.method1171();
				@Pc(449) int[] local449 = new int[local48];
				@Pc(452) int[] local452 = new int[local48];
				@Pc(455) int[] local455 = new int[local48];
				for (@Pc(457) int local457 = 0; local457 < local48; local457++) {
					@Pc(463) int local463 = Static5.aClass1_Sub3_Sub1_1.method1177();
					if (local463 == 65535) {
						local463 = -1;
					}
					local449[local457] = local463;
					local452[local457] = Static5.aClass1_Sub3_Sub1_1.method1210();
					local455[local457] = Static5.aClass1_Sub3_Sub1_1.method1217();
				}
				Static222.method3440(local449, local452, local22, local455);
			}
			if ((local26 & 0x8) != 0) {
				local22.aString7 = Static5.aClass1_Sub3_Sub1_1.method1201();
				local22.anInt1238 = 100;
			}
			if ((local26 & 0x200) != 0) {
				local22.anInt896 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local22.anInt908 = Static5.aClass1_Sub3_Sub1_1.method1217();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Z")
	public static boolean method36(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IBI)Z")
	public static boolean method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
