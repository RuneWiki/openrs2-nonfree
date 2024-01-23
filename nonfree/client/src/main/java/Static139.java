import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!dh;")
	public static Class33 aClass33_23 = new Class33(64);

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Z")
	public static boolean aBoolean188 = true;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public static int anInt2870 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIILclient!en;Lclient!en;IIJ)V")
	public static void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class43 local8 = new Class43();
		local8.aLong44 = arg8;
		local8.anInt1230 = arg1 * 128 + 64;
		local8.anInt1226 = arg2 * 128 + 64;
		local8.anInt1225 = arg3;
		local8.aClass12_5 = arg4;
		local8.aClass12_4 = arg5;
		local8.anInt1227 = arg6;
		local8.anInt1231 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static127.aClass4_Sub11ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static127.aClass4_Sub11ArrayArrayArray1[local42][arg1][arg2] = new Class4_Sub11(local42, arg1, arg2);
			}
		}
		Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local8;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public static void method2269() {
		aClass33_23 = null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qb;III)V")
	public static void method2270(@OriginalArg(0) Class12_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0.anInt4178 && arg2 != -1) {
			@Pc(22) Class141 local22 = Static296.method1376(arg2);
			@Pc(25) int local25 = local22.anInt4349;
			if (local25 == 1) {
				arg0.anInt4170 = 0;
				arg0.anInt4152 = 1;
				arg0.anInt4112 = 0;
				arg0.anInt4119 = arg1;
				arg0.anInt4120 = 0;
				Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local22, arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
			}
			if (local25 == 2) {
				arg0.anInt4112 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4178 == -1 || Static296.method1376(arg2).anInt4358 >= Static296.method1376(arg0.anInt4178).anInt4358) {
			arg0.anInt4170 = 0;
			arg0.anInt4152 = 1;
			arg0.anInt4120 = 0;
			arg0.anInt4119 = arg1;
			arg0.anInt4178 = arg2;
			arg0.anInt4189 = arg0.anInt4157;
			arg0.anInt4112 = 0;
			if (arg0.anInt4178 != -1) {
				Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, Static296.method1376(arg0.anInt4178), arg0.anInt4141, arg0.anInt4113, arg0.anInt4170);
			}
		}
	}
}
