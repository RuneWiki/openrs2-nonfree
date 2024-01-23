import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public static int anInt4000;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	public static int anInt4001;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Lclient!kh;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!ii;")
	public static Class69 aClass69_9 = new Class69(64);

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public static int anInt3999 = 0;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString128 = "red:";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method3258(@OriginalArg(0) Class98 arg0) {
		Static48.aClass98_30 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V")
	public static void method3260() {
		aClass91_1 = null;
		aString128 = null;
		aBooleanArray18 = null;
		aClass69_9 = null;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
	public static void method3261(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static127.aClass4_Sub11ArrayArrayArray1 = Static271.aClass4_Sub11ArrayArrayArray3;
			Static250.anIntArrayArrayArray13 = Static15.anIntArrayArrayArray2;
			Static281.aClass4_Sub14ArrayArray3 = Static76.aClass4_Sub14ArrayArray2;
		} else {
			Static127.aClass4_Sub11ArrayArrayArray1 = Static141.aClass4_Sub11ArrayArrayArray2;
			Static250.anIntArrayArrayArray13 = Static231.anIntArrayArrayArray12;
			Static281.aClass4_Sub14ArrayArray3 = Static42.aClass4_Sub14ArrayArray1;
		}
		Static114.anInt2478 = Static127.aClass4_Sub11ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public static void method3262() {
		for (@Pc(1) int local1 = 0; local1 < Static114.anInt2478; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static247.anInt4706; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static24.anInt439; local11++) {
					@Pc(22) Class4_Sub11 local22 = Static127.aClass4_Sub11ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class43 local27 = local22.aClass43_1;
						if (local27 != null && local27.aClass12_5.method3351()) {
							Static28.method436(local27.aClass12_5, local1, local6, local11, 1, 1);
							if (local27.aClass12_4 != null && local27.aClass12_4.method3351()) {
								Static28.method436(local27.aClass12_4, local1, local6, local11, 1, 1);
								local27.aClass12_5.method3356(local27.aClass12_4, 0, 0, 0, false);
								local27.aClass12_4 = local27.aClass12_4.method3359();
							}
							local27.aClass12_5 = local27.aClass12_5.method3359();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt1054; local83++) {
							@Pc(92) Class173 local92 = local22.aClass173Array1[local83];
							if (local92 != null && local92.aClass12_10.method3351()) {
								Static28.method436(local92.aClass12_10, local1, local6, local11, local92.anInt5163 + 1 - local92.anInt5149, local92.anInt5158 - local92.anInt5157 + 1);
								local92.aClass12_10 = local92.aClass12_10.method3359();
							}
						}
						@Pc(131) Class135 local131 = local22.aClass135_1;
						if (local131 != null && local131.aClass12_8.method3351()) {
							Static25.method383(local131.aClass12_8, local1, local6, local11);
							local131.aClass12_8 = local131.aClass12_8.method3359();
						}
					}
				}
			}
		}
	}
}
