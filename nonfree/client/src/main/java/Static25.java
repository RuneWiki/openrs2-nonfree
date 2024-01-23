import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
	public static int anInt450;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString6 = "Loading wordpack - ";

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	public static int anInt448 = -1;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Loaded wordpack";

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;)V")
	public static void method381(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static276.anIntArray455[local7] = Static276.anIntArray455[local7 - 1];
			Static117.aStringArray20[local7] = Static117.aStringArray20[local7 - 1];
			Static19.aStringArray3[local7] = Static19.aStringArray3[local7 - 1];
			Static49.aStringArray8[local7] = Static49.aStringArray8[local7 - 1];
			Static160.anIntArray286[local7] = Static160.anIntArray286[local7 - 1];
		}
		Static189.anInt4950++;
		Static22.anInt422 = Static177.anInt3485;
		Static117.aStringArray20[0] = arg3;
		Static19.aStringArray3[0] = arg1;
		Static49.aStringArray8[0] = arg4;
		Static276.anIntArray455[0] = arg2;
		Static160.anIntArray286[0] = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method382() {
		aString7 = null;
		aString6 = null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!en;III)V")
	public static void method383(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub11 local12;
		if (arg2 < Static247.anInt4706) {
			local12 = Static127.aClass4_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass135_1 != null && local12.aClass135_1.aClass12_8.method3351()) {
				arg0.method3356(local12.aClass135_1.aClass12_8, 128, 0, 0, true);
			}
		}
		if (arg3 < Static247.anInt4706) {
			local12 = Static127.aClass4_Sub11ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass135_1 != null && local12.aClass135_1.aClass12_8.method3351()) {
				arg0.method3356(local12.aClass135_1.aClass12_8, 0, 0, 128, true);
			}
		}
		if (arg2 < Static247.anInt4706 && arg3 < Static24.anInt439) {
			local12 = Static127.aClass4_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass135_1 != null && local12.aClass135_1.aClass12_8.method3351()) {
				arg0.method3356(local12.aClass135_1.aClass12_8, 128, 0, 128, true);
			}
		}
		if (arg2 < Static247.anInt4706 && arg3 > 0) {
			local12 = Static127.aClass4_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass135_1 != null && local12.aClass135_1.aClass12_8.method3351()) {
				arg0.method3356(local12.aClass135_1.aClass12_8, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method384(@OriginalArg(1) Class98 arg0) {
		Static183.anInt3584 = arg0.method2376("runes");
	}
}
