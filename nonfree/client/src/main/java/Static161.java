import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
	public static int anInt3171;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Lclient!fh;")
	public static Class58 aClass58_69;

	@OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
	public static int anInt3183 = -1;

	@OriginalMember(owner = "client!lj", name = "mb", descriptor = "[F")
	public static float[] aFloatArray36 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lclient!co;")
	public static Class33 method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				Static122.method1903(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
	public static int method2608(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(18) int local18 = local4 | local4 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!wf;B)Ljava/lang/String;")
	public static String method2610(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1) {
		if (!Static41.method687(arg1).method3279(arg0) && arg1.anObjectArray18 == null) {
			return null;
		} else if (arg1.aStringArray43 == null || arg0 >= arg1.aStringArray43.length || arg1.aStringArray43[arg0] == null || arg1.aStringArray43[arg0].trim().length() == 0) {
			return Static27.aBoolean26 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray43[arg0];
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method2612(@OriginalArg(0) Class58 arg0) {
		Static251.aClass58_90 = arg0;
	}
}
