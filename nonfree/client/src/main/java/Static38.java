import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt954;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
	public static boolean aBoolean61 = true;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[200];

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lclient!g;")
	public static Class56 method715(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static262.aClass56ArrayArray1[local7] == null || Static262.aClass56ArrayArray1[local7][local16] == null) {
			@Pc(32) boolean local32 = Static268.method4233(local7);
			if (!local32) {
				return null;
			}
		}
		return Static262.aClass56ArrayArray1[local7][local16];
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!cb;)V")
	public static void method717(@OriginalArg(1) Class15_Sub2_Sub1 arg0) {
		for (@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) Static195.aClass44_29.method1352(); local15 != null; local15 = (Class2_Sub31) Static195.aClass44_29.method1360()) {
			if (local15.aClass15_Sub2_Sub1_1 == arg0) {
				if (local15.aClass2_Sub3_Sub2_3 != null) {
					Static173.aClass2_Sub3_Sub4_2.method4662(local15.aClass2_Sub3_Sub2_3);
					local15.aClass2_Sub3_Sub2_3 = null;
				}
				local15.method4743();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!ml;JZ)V")
	public static void method718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class191 local6 = new Class191();
		local6.aClass15_10 = arg4;
		local6.anInt5934 = arg1 * 128 + 64;
		local6.anInt5932 = arg2 * 128 + 64;
		local6.anInt5935 = arg3;
		local6.aLong209 = arg5;
		local6.aBoolean394 = arg6;
		if (Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub13(arg0, arg1, arg2);
		}
		Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass191_1 = local6;
	}
}
