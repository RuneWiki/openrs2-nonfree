import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	public static int anInt3143;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public static int anInt3141 = 0;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt3142 = -1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public static void method2477(@OriginalArg(1) int arg0) {
		if (!Static266.aBoolean331) {
			arg0 = -1;
		}
		if (Static230.anInt4514 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class144 local25 = Static239.method3687(arg0);
			@Pc(29) Class4_Sub2_Sub1_Sub1 local29 = local25.method3580();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static87.aClass164_2.method3950(Static235.aCanvas1, new Point(local25.anInt4455, local25.anInt4443), local29.method3482(), local29.anInt4305, local29.anInt4300);
				Static230.anInt4514 = arg0;
			}
		}
		if (arg0 == -1 && Static230.anInt4514 != -1) {
			Static87.aClass164_2.method3950(Static235.aCanvas1, new Point(), null, -1, -1);
			Static230.anInt4514 = -1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public static void method2478() {
		while (true) {
			@Pc(14) Class4_Sub24 local14 = (Class4_Sub24) Static269.aClass10_57.method182();
			if (local14 == null) {
				return;
			}
			@Pc(33) Class12_Sub3 local33;
			@Pc(28) int local28;
			if (local14.anInt3445 < 0) {
				local28 = -local14.anInt3445 - 1;
				if (Static238.anInt4597 == local28) {
					local33 = Static239.aClass12_Sub3_Sub2_2;
				} else {
					local33 = Static257.aClass12_Sub3_Sub2Array1[local28];
				}
			} else {
				local28 = local14.anInt3445 - 1;
				local33 = Static100.aClass12_Sub3_Sub1Array1[local28];
			}
			if (local33 != null) {
				@Pc(57) Class47 local57 = Static170.method2683(local14.anInt3454);
				if (Static210.anInt4103 < 3) {
				}
				@Pc(75) int local75;
				@Pc(78) int local78;
				if (local14.anInt3450 == 1 || local14.anInt3450 == 3) {
					local75 = local57.anInt1354;
					local78 = local57.anInt1327;
				} else {
					local75 = local57.anInt1327;
					local78 = local57.anInt1354;
				}
				@Pc(93) int local93 = (local75 >> 1) + local14.anInt3451;
				@Pc(102) int local102 = local14.anInt3451 + (local75 + 1 >> 1);
				@Pc(110) int local110 = local14.anInt3446 + (local78 >> 1);
				@Pc(119) int local119 = (local78 + 1 >> 1) + local14.anInt3446;
				@Pc(123) int[][] local123 = Static250.anIntArrayArrayArray13[Static210.anInt4103];
				@Pc(150) int local150 = local123[local93][local110] + local123[local102][local110] + local123[local93][local119] + local123[local102][local119] >> 2;
				@Pc(152) Class12 local152 = null;
				@Pc(157) int local157 = Static262.anIntArray441[local14.anInt3447];
				if (local157 == 0) {
					@Pc(169) Class43 local169 = Static173.method2710(Static210.anInt4103, local14.anInt3451, local14.anInt3446);
					if (local169 != null) {
						local152 = local169.aClass12_5;
					}
				} else if (local157 == 1) {
					@Pc(186) Class104 local186 = Static40.method672(Static210.anInt4103, local14.anInt3451, local14.anInt3446);
					if (local186 != null) {
						local152 = local186.aClass12_6;
					}
				} else if (local157 == 2) {
					@Pc(224) Class173 local224 = Static21.method3459(Static210.anInt4103, local14.anInt3451, local14.anInt3446);
					if (local224 != null) {
						local152 = local224.aClass12_10;
					}
				} else if (local157 == 3) {
					@Pc(210) Class135 local210 = Static62.method954(Static210.anInt4103, local14.anInt3451, local14.anInt3446);
					if (local210 != null) {
						local152 = local210.aClass12_8;
					}
				}
				if (local152 != null) {
					Static93.method1494(local14.anInt3446, local14.anInt3451, 0, -1, 0, local14.anInt3459 + 1, local14.anInt3458 + 1, Static210.anInt4103, local157);
					local33.anInt4179 = local150;
					@Pc(259) int local259 = local14.anInt3444;
					local33.anInt4111 = local14.anInt3446 * 128 + local78 * 64;
					local33.anInt4182 = local14.anInt3451 * 128 + local75 * 64;
					local33.anInt4177 = Static104.anInt2226 + local14.anInt3458;
					@Pc(288) int local288 = local14.anInt3455;
					local33.anInt4131 = Static104.anInt2226 + local14.anInt3459;
					@Pc(297) int local297 = local14.anInt3452;
					@Pc(300) int local300 = local14.anInt3457;
					@Pc(305) int local305;
					if (local288 < local259) {
						local305 = local259;
						local259 = local288;
						local288 = local305;
					}
					if (local297 > local300) {
						local305 = local297;
						local297 = local300;
						local300 = local305;
					}
					local33.anInt4174 = local14.anInt3446 + local300;
					local33.anObject6 = local152;
					local33.anInt4139 = local14.anInt3446 + local297;
					local33.anInt4190 = local14.anInt3451 + local259;
					local33.anInt4192 = local14.anInt3451 + local288;
				}
			}
		}
	}
}
