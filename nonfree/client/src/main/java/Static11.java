import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "Fb", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!aj", name = "Ib", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "(I)V")
	public static void method397() {
		Static231.aClass5_37.method110();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)V")
	public static void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static210.aFloat98 > Static210.aFloat97) {
			Static210.aFloat97 = (float) ((double) Static210.aFloat97 + (double) Static210.aFloat97 / 30.0D);
			if (Static210.aFloat98 < Static210.aFloat97) {
				Static210.aFloat97 = Static210.aFloat98;
			}
			Static220.method3501();
			Static210.anInt7493 = (int) Static210.aFloat97 >> 1;
			Static210.aByteArrayArrayArray17 = Static275.method4094(Static210.anInt7493);
		} else if (Static210.aFloat97 > Static210.aFloat98) {
			Static210.aFloat97 = (float) ((double) Static210.aFloat97 - (double) Static210.aFloat97 / 30.0D);
			if (Static210.aFloat98 > Static210.aFloat97) {
				Static210.aFloat97 = Static210.aFloat98;
			}
			Static220.method3501();
			Static210.anInt7493 = (int) Static210.aFloat97 >> 1;
			Static210.aByteArrayArrayArray17 = Static275.method4094(Static210.anInt7493);
		}
		if (Static293.anInt3444 != -1 && Static336.anInt6190 != -1) {
			@Pc(85) int local85 = Static293.anInt3444 - Static189.anInt3807;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(103) int local103 = Static336.anInt6190 - Static372.anInt1537;
			Static189.anInt3807 += local85;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			if (local85 == 0 && local103 == 0) {
				Static293.anInt3444 = -1;
				Static336.anInt6190 = -1;
			}
			Static372.anInt1537 += local103;
			Static220.method3501();
		}
		if (Static284.anInt5213 > 0) {
			Static27.anInt771--;
			if (Static27.anInt771 == 0) {
				Static27.anInt771 = 100;
				Static284.anInt5213--;
			}
		} else {
			Static411.anInt7104 = -1;
			Static166.anInt3528 = -1;
		}
		if (!Static442.aBoolean518 || Static316.aClass229_35 == null) {
			return;
		}
		for (@Pc(169) Class3_Sub41 local169 = (Class3_Sub41) Static316.aClass229_35.method5328(); local169 != null; local169 = (Class3_Sub41) Static316.aClass229_35.method5325()) {
			@Pc(179) Class223 local179 = Static210.aClass61_4.method1426(local169.aClass3_Sub8_1.anInt1157);
			if (local169.method5312(arg0, arg1)) {
				if (local179.aStringArray158 != null) {
					if (local179.aStringArray158[4] != null) {
						Static112.method4934(0, 1002, (long) local169.aClass3_Sub8_1.anInt1157, -1, local179.anInt6730, false, local179.aString62, true, local179.aStringArray158[4], -1);
					}
					if (local179.aStringArray158[3] != null) {
						Static112.method4934(0, 1003, (long) local169.aClass3_Sub8_1.anInt1157, -1, local179.anInt6730, false, local179.aString62, true, local179.aStringArray158[3], -1);
					}
					if (local179.aStringArray158[2] != null) {
						Static112.method4934(0, 1010, (long) local169.aClass3_Sub8_1.anInt1157, -1, local179.anInt6730, false, local179.aString62, true, local179.aStringArray158[2], -1);
					}
					if (local179.aStringArray158[1] != null) {
						Static112.method4934(0, 1006, (long) local169.aClass3_Sub8_1.anInt1157, -1, local179.anInt6730, false, local179.aString62, true, local179.aStringArray158[1], -1);
					}
					if (local179.aStringArray158[0] != null) {
						Static112.method4934(0, 1011, (long) local169.aClass3_Sub8_1.anInt1157, -1, local179.anInt6730, false, local179.aString62, true, local179.aStringArray158[0], -1);
					}
				}
				if (!local169.aClass3_Sub8_1.aBoolean94) {
					local169.aClass3_Sub8_1.aBoolean94 = true;
					Static272.method4049(Static3.aClass180_8, local169.aClass3_Sub8_1.anInt1157, local179.anInt6730);
				}
				if (local169.aClass3_Sub8_1.aBoolean94) {
					Static272.method4049(Static215.aClass180_3, local169.aClass3_Sub8_1.anInt1157, local179.anInt6730);
				}
			} else if (local169.aClass3_Sub8_1.aBoolean94) {
				local169.aClass3_Sub8_1.aBoolean94 = false;
				Static272.method4049(Static312.aClass180_7, local169.aClass3_Sub8_1.anInt1157, local179.anInt6730);
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Lclient!mu;")
	public static Class1_Sub2 method399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub2_1 == null ? null : local7.aClass1_Sub2_1;
	}
}
