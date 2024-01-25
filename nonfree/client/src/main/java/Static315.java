import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_75 = new Class134("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "[Lclient!qp;")
	public static final Class204[] aClass204Array1 = new Class204[6];

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public static int anInt5432 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!ws;II)V")
	public static void method4296(@OriginalArg(1) Class2_Sub46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static261.aClass156_13.aClass2_159) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7286;
		@Pc(18) int local18 = arg0.anInt7287;
		@Pc(26) int local26 = arg0.anInt7283;
		@Pc(30) int local30 = (int) arg0.aLong226;
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(39) long local39 = arg0.aLong226;
		@Pc(49) Class2_Sub28 local49;
		@Pc(64) Class3_Sub4_Sub1_Sub1 local64;
		if (local26 == 21) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static445.anInt7141 = 2;
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static411.anInt6741 = arg2;
				Static29.method451(Static283.aClass102_140);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3568(local30);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 1007) {
			Static445.anInt7141 = 2;
			Static55.anInt1028 = arg1;
			Static411.anInt6741 = arg2;
			Static351.anInt5976 = 0;
			Static29.method451(Static136.aClass102_81);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3568(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static161.method4788(local15, local39, local18);
		}
		@Pc(167) Class3_Sub4_Sub1_Sub2 local167;
		if (local26 == 57) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static411.anInt6741 = arg2;
				Static445.anInt7141 = 2;
				Static351.anInt5976 = 0;
				Static55.anInt1028 = arg1;
				Static29.method451(Static215.aClass102_118);
				Static456.aClass2_Sub13_Sub2_2.method3542(Static279.anInt6428);
				Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3577(local30);
				Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
				Static456.aClass2_Sub13_Sub2_2.method3595(Static368.anInt6201);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 17) {
			Static351.anInt5976 = 0;
			Static411.anInt6741 = arg2;
			Static55.anInt1028 = arg1;
			Static445.anInt7141 = 2;
			Static29.method451(Static390.aClass102_202);
			Static456.aClass2_Sub13_Sub2_2.method3595(local18 + Static209.anInt3497);
			Static456.aClass2_Sub13_Sub2_2.method3546(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3568(local15 + Static275.anInt4506);
			Static456.aClass2_Sub13_Sub2_2.method3595(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static161.method4788(local15, local39, local18);
		}
		if (local26 == 15) {
			Static445.anInt7141 = 2;
			Static55.anInt1028 = arg1;
			Static411.anInt6741 = arg2;
			Static351.anInt5976 = 0;
			Static29.method451(Static98.aClass102_61);
			Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3595(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static456.aClass2_Sub13_Sub2_2.method3577(local15 + Static275.anInt4506);
			Static161.method4788(local15, local39, local18);
		}
		if (local26 == 50) {
			if (Static440.anInt7085 > 0 && Static218.aClass181_1.method3865(82) && Static218.aClass181_1.method3865(81)) {
				Static184.method2530(local15 + Static275.anInt4506, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91, local18 + Static209.anInt3497);
			} else {
				Static445.anInt7141 = 1;
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static29.method451(Static283.aClass102_139);
				Static456.aClass2_Sub13_Sub2_2.method3595(local18 + Static209.anInt3497);
				Static456.aClass2_Sub13_Sub2_2.method3542(local15 + Static275.anInt4506);
			}
		}
		if (local26 == 2) {
			Static445.anInt7141 = 2;
			Static411.anInt6741 = arg2;
			Static351.anInt5976 = 0;
			Static55.anInt1028 = arg1;
			Static29.method451(Static420.aClass102_204);
			Static456.aClass2_Sub13_Sub2_2.method3568(Static368.anInt6201);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3568((int) (local39 >>> 32) & Integer.MAX_VALUE);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
			Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static279.anInt6428);
			Static161.method4788(local15, local39, local18);
		}
		if (local26 == 58) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static445.anInt7141 = 2;
				Static29.method451(Static15.aClass102_14);
				Static456.aClass2_Sub13_Sub2_2.method3577(local30);
				Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 45) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static351.anInt5976 = 0;
				Static445.anInt7141 = 2;
				Static411.anInt6741 = arg2;
				Static55.anInt1028 = arg1;
				Static29.method451(Static354.aClass102_179);
				Static456.aClass2_Sub13_Sub2_2.method3568(local30);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 13) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static411.anInt6741 = arg2;
				Static55.anInt1028 = arg1;
				Static445.anInt7141 = 2;
				Static351.anInt5976 = 0;
				Static29.method451(Static34.aClass102_25);
				Static456.aClass2_Sub13_Sub2_2.method3595(local30);
				Static456.aClass2_Sub13_Sub2_2.method3546(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		@Pc(660) Class16 local660;
		if (local26 == 11) {
			local660 = Static4.method73(local18, local15);
			if (local660 != null) {
				Static377.method3604();
				@Pc(667) Class2_Sub15 local667 = Static55.method815(local660);
				Static352.method4679(local667.method1538(), local660, local667.anInt1899);
				Static76.aString45 = Static460.method5500(local660);
				Static408.aString205 = local660.aString13 + "<col=ffffff>";
				if (Static76.aString45 == null) {
					Static76.aString45 = "Null";
				}
			}
			return;
		}
		if (local26 == 1012 || local26 == 1003 || local26 == 1004 || local26 == 1010 || local26 == 1008) {
			Static157.method2217(local30, local26, local15);
		}
		if (local26 == 47) {
			Static445.anInt7141 = 2;
			Static351.anInt5976 = 0;
			Static55.anInt1028 = arg1;
			Static411.anInt6741 = arg2;
			Static29.method451(Static357.aClass102_163);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3542(local30);
			Static456.aClass2_Sub13_Sub2_2.method3577(local15 + Static275.anInt4506);
			Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static404.method5122(local18, local15);
		}
		if (local26 == 48) {
			Static55.anInt1028 = arg1;
			Static445.anInt7141 = 2;
			Static411.anInt6741 = arg2;
			Static351.anInt5976 = 0;
			Static29.method451(Static273.aClass102_130);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3595(local18 + Static209.anInt3497);
			Static456.aClass2_Sub13_Sub2_2.method3568(local30);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static275.anInt4506 + local15);
			Static404.method5122(local18, local15);
		}
		if (local26 == 18) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static445.anInt7141 = 2;
				Static411.anInt6741 = arg2;
				Static29.method451(Static181.aClass102_108);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3542(local30);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 6) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static55.anInt1028 = arg1;
				Static411.anInt6741 = arg2;
				Static445.anInt7141 = 2;
				Static351.anInt5976 = 0;
				Static29.method451(Static130.aClass102_78);
				Static456.aClass2_Sub13_Sub2_2.method3546(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3542(local30);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 25) {
			local660 = Static4.method73(local18, local15);
			if (local660 != null) {
				Static411.method5210(local660);
			}
		}
		if (local26 == 1006) {
			Static351.anInt5976 = 0;
			Static411.anInt6741 = arg2;
			Static55.anInt1028 = arg1;
			Static445.anInt7141 = 2;
			Static29.method451(Static84.aClass102_59);
			Static456.aClass2_Sub13_Sub2_2.method3568(local30);
		}
		if (local26 == 22) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static445.anInt7141 = 2;
				Static55.anInt1028 = arg1;
				Static29.method451(Static11.aClass102_11);
				Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3577(local30);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 19) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				Static445.anInt7141 = 2;
				Static55.anInt1028 = arg1;
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static29.method451(Static208.aClass102_114);
				Static456.aClass2_Sub13_Sub2_2.method3595(local30);
				Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 59) {
			Static411.anInt6741 = arg2;
			Static445.anInt7141 = 1;
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static29.method451(Static423.aClass102_207);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static279.anInt6428);
			Static456.aClass2_Sub13_Sub2_2.method3543(Static368.anInt6200);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static368.anInt6201);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static209.anInt3497 + local18);
			Static111.method1707(local18, 0, -4, 1, local15, 0, 1, true);
		}
		if (local26 == 46) {
			Static411.anInt6741 = arg2;
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static445.anInt7141 = 2;
			Static29.method451(Static294.aClass102_35);
			Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3568(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3542(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static161.method4788(local15, local39, local18);
		}
		if (local26 == 30) {
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static411.anInt6741 = arg2;
			Static445.anInt7141 = 2;
			Static29.method451(Static44.aClass102_183);
			Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3568(local15 + Static275.anInt4506);
			Static456.aClass2_Sub13_Sub2_2.method3542(local30);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static209.anInt3497 + local18);
			Static404.method5122(local18, local15);
		}
		if (local26 == 5) {
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static411.anInt6741 = arg2;
			Static445.anInt7141 = 2;
			Static29.method451(Static331.aClass102_162);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static209.anInt3497 + local18);
			Static456.aClass2_Sub13_Sub2_2.method3595(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static456.aClass2_Sub13_Sub2_2.method3595(local15 + Static275.anInt4506);
			Static161.method4788(local15, local39, local18);
		}
		if (local26 == 49) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static55.anInt1028 = arg1;
				Static411.anInt6741 = arg2;
				Static351.anInt5976 = 0;
				Static445.anInt7141 = 2;
				Static29.method451(Static94.aClass102_216);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3568(local30);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 1009) {
			Static411.anInt6741 = arg2;
			Static351.anInt5976 = 0;
			Static445.anInt7141 = 2;
			Static55.anInt1028 = arg1;
			Static29.method451(Static104.aClass102_64);
			Static456.aClass2_Sub13_Sub2_2.method3568(local30);
		}
		if (local26 == 51) {
			Static411.anInt6741 = arg2;
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static445.anInt7141 = 2;
			Static29.method451(Static17.aClass102_17);
			Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static279.anInt6428);
			Static456.aClass2_Sub13_Sub2_2.method3595(local30);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static368.anInt6201);
			Static456.aClass2_Sub13_Sub2_2.method3568(local18 + Static209.anInt3497);
			Static456.aClass2_Sub13_Sub2_2.method3585(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static404.method5122(local18, local15);
		}
		if (local26 == 12) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static445.anInt7141 = 2;
				Static351.anInt5976 = 0;
				Static55.anInt1028 = arg1;
				Static411.anInt6741 = arg2;
				Static29.method451(Static15.aClass102_13);
				Static456.aClass2_Sub13_Sub2_2.method3542(local30);
				Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 16) {
			Static411.anInt6741 = arg2;
			Static445.anInt7141 = 2;
			Static351.anInt5976 = 0;
			Static55.anInt1028 = arg1;
			Static29.method451(Static215.aClass102_118);
			Static456.aClass2_Sub13_Sub2_2.method3542(Static279.anInt6428);
			Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3577(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt4915);
			Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
			Static456.aClass2_Sub13_Sub2_2.method3595(Static368.anInt6201);
		}
		if (local26 == 23 || local26 == 1002) {
			Static386.method4944(local15, arg0.aString206, local18, local30);
		}
		if (local26 == 8 && Static324.aClass16_16 == null) {
			Static162.method2264(local18, local15);
			Static324.aClass16_16 = Static4.method73(local18, local15);
			Static176.method70(Static324.aClass16_16);
		}
		if (local26 == 20) {
			Static351.anInt5976 = 0;
			Static445.anInt7141 = 2;
			Static411.anInt6741 = arg2;
			Static55.anInt1028 = arg1;
			Static29.method451(Static278.aClass102_135);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3568(Static275.anInt4506 + local15);
			Static456.aClass2_Sub13_Sub2_2.method3568(local18 + Static209.anInt3497);
			Static456.aClass2_Sub13_Sub2_2.method3568(local30);
			Static404.method5122(local18, local15);
		}
		if (local26 == 9) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				Static445.anInt7141 = 2;
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static29.method451(Static431.aClass102_215);
				Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3577(Static368.anInt6201);
				Static456.aClass2_Sub13_Sub2_2.method3561(Static368.anInt6200);
				Static456.aClass2_Sub13_Sub2_2.method3568(local30);
				Static456.aClass2_Sub13_Sub2_2.method3568(Static279.anInt6428);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 44) {
			Static411.anInt6741 = arg2;
			Static445.anInt7141 = 2;
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static29.method451(Static325.aClass102_161);
			Static456.aClass2_Sub13_Sub2_2.method3568(local15 + Static275.anInt4506);
			Static456.aClass2_Sub13_Sub2_2.method3577(local30);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
			Static456.aClass2_Sub13_Sub2_2.method3542(local18 + Static209.anInt3497);
			Static404.method5122(local18, local15);
		}
		if (local26 == 10) {
			if (Static440.anInt7085 > 0 && Static218.aClass181_1.method3865(82) && Static218.aClass181_1.method3865(81)) {
				Static184.method2530(local15 + Static275.anInt4506, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91, local18 + Static209.anInt3497);
			} else {
				Static274.method3668(local18, local15, local30);
				if (local30 == 1) {
					Static456.aClass2_Sub13_Sub2_2.method3602(-1);
					Static456.aClass2_Sub13_Sub2_2.method3602(-1);
					Static456.aClass2_Sub13_Sub2_2.method3568((int) Static113.aFloat19);
					Static456.aClass2_Sub13_Sub2_2.method3602(57);
					Static456.aClass2_Sub13_Sub2_2.method3602(Static363.anInt6120);
					Static456.aClass2_Sub13_Sub2_2.method3602(Static454.anInt7274);
					Static456.aClass2_Sub13_Sub2_2.method3602(89);
					Static456.aClass2_Sub13_Sub2_2.method3568(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833);
					Static456.aClass2_Sub13_Sub2_2.method3568(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835);
					Static456.aClass2_Sub13_Sub2_2.method3602(63);
				} else {
					Static351.anInt5976 = 0;
					Static445.anInt7141 = 1;
					Static55.anInt1028 = arg1;
					Static411.anInt6741 = arg2;
				}
				Static111.method1707(local18, 0, -4, 1, local15, 0, 1, true);
			}
		}
		if (local26 == 3) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static445.anInt7141 = 2;
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static411.anInt6741 = arg2;
				Static29.method451(Static76.aClass102_54);
				Static456.aClass2_Sub13_Sub2_2.method3542(local30);
				Static456.aClass2_Sub13_Sub2_2.method3583(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (local26 == 1001) {
			Static445.anInt7141 = 2;
			Static55.anInt1028 = arg1;
			Static351.anInt5976 = 0;
			Static411.anInt6741 = arg2;
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				@Pc(1996) Class245 local1996 = local64.aClass245_1;
				if (local1996.anIntArray560 != null) {
					local1996 = local1996.method5205(Static138.aClass268_1);
				}
				if (local1996 != null) {
					Static29.method451(Static306.aClass102_153);
					Static456.aClass2_Sub13_Sub2_2.method3568(local1996.anInt6723);
				}
			}
		}
		if (local26 == 4) {
			local49 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local30);
			if (local49 != null) {
				Static411.anInt6741 = arg2;
				Static55.anInt1028 = arg1;
				local64 = local49.aClass3_Sub4_Sub1_Sub1_1;
				Static445.anInt7141 = 2;
				Static351.anInt5976 = 0;
				Static29.method451(Static21.aClass102_10);
				Static456.aClass2_Sub13_Sub2_2.method3546(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3568(local30);
				Static111.method1707(local64.anIntArray424[0], 0, -2, local64.method4009(), local64.anIntArray425[0], 0, local64.method4009(), true);
			}
		}
		if (local26 == 60) {
			local167 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local30];
			if (local167 != null) {
				Static411.anInt6741 = arg2;
				Static445.anInt7141 = 2;
				Static55.anInt1028 = arg1;
				Static351.anInt5976 = 0;
				Static29.method451(Static8.aClass102_8);
				Static456.aClass2_Sub13_Sub2_2.method3542(local30);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static218.aClass181_1.method3865(82) ? 1 : 0);
				Static111.method1707(local167.anIntArray424[0], 0, -2, local167.method4009(), local167.anIntArray425[0], 0, local167.method4009(), true);
			}
		}
		if (Static215.aBoolean217) {
			Static377.method3604();
		}
		if (Static219.aClass16_19 != null && Static38.anInt701 == 0) {
			Static176.method70(Static219.aClass16_19);
		}
	}
}
