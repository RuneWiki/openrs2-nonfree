import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "[[Lclient!rea;")
	public static Class299[][] aClass299ArrayArray1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!vl;II)V")
	public static void method6008(@OriginalArg(0) Class16_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (Static389.anInt6694 < arg0.anInt8117) {
			Static173.method2998(arg0);
		} else if (arg0.anInt8064 < Static389.anInt6694) {
			Static64.method1473(arg0, false);
			local5 = Static135.anInt2905;
			local7 = Static363.anInt6280;
		} else {
			Static62.method6046(arg0);
		}
		if (arg0.anInt8037 < 512 || arg0.anInt8034 < 512 || (Static456.anInt7428 - 1) * 512 <= arg0.anInt8037 || arg0.anInt8034 >= (Static5.anInt112 - 1) * 512) {
			arg0.anInt8049 = -1;
			arg0.anInt8084 = -1;
			arg0.anIntArray586 = null;
			arg0.anInt8117 = 0;
			arg0.anInt8064 = 0;
			local7 = 0;
			arg0.anInt8053 = -1;
			local5 = -1;
			arg0.anInt8037 = arg0.anIntArray595[0] * 512 + arg0.method6999() * 256;
			arg0.anInt8034 = arg0.anIntArray594[0] * 512 + arg0.method6999() * 256;
			arg0.method7001();
		}
		if (arg0 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 && (arg0.anInt8037 < 6144 || arg0.anInt8034 < 6144 || arg0.anInt8037 >= (Static456.anInt7428 - 12) * 512 || arg0.anInt8034 >= (Static5.anInt112 - 12) * 512)) {
			arg0.anInt8049 = -1;
			arg0.anInt8117 = 0;
			arg0.anInt8064 = 0;
			local5 = -1;
			arg0.anInt8053 = -1;
			arg0.anInt8084 = -1;
			arg0.anIntArray586 = null;
			local7 = 0;
			arg0.anInt8037 = arg0.anIntArray595[0] * 512 + arg0.method6999() * 256;
			arg0.anInt8034 = arg0.anIntArray594[0] * 512 + arg0.method6999() * 256;
			arg0.method7001();
		}
		@Pc(213) int local213 = Static104.method1961(arg0);
		Static410.method6038(arg0);
		Static196.method3384(local213, local7, local5, arg0);
		Static489.method7361(local5, arg0);
		Static159.method2769(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public static int method6009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static216.aByteArrayArray9 == null ? 0 : Static216.aByteArrayArray9[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method6010(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(28) String local28;
		if (Static289.anInt5236 >= 200 && !Static9.aBoolean20 || Static289.anInt5236 >= 200) {
			Static601.method8468(Static573.aClass345_12.method7951(Static496.anInt7407));
			local28 = Static573.aClass345_13.method7951(Static496.anInt7407);
			if (local28 != null) {
				Static601.method8468(local28);
			}
			return;
		}
		local28 = Static529.method7327(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(82) String local82;
		for (@Pc(44) int local44 = 0; local44 < Static289.anInt5236; local44++) {
			@Pc(51) String local51 = Static529.method7327(Static514.aStringArray44[local44]);
			if (local51 != null && local51.equals(local28)) {
				Static601.method8468(arg0 + Static573.aClass345_40.method7951(Static496.anInt7407));
				return;
			}
			if (Static83.aStringArray7[local44] != null) {
				local82 = Static529.method7327(Static83.aStringArray7[local44]);
				if (local82 != null && local82.equals(local28)) {
					Static601.method8468(arg0 + Static573.aClass345_40.method7951(Static496.anInt7407));
					return;
				}
			}
		}
		for (@Pc(113) int local113 = 0; local113 < Static568.anInt9305; local113++) {
			local82 = Static529.method7327(Static84.aStringArray8[local113]);
			if (local82 != null && local82.equals(local28)) {
				Static601.method8468(Static573.aClass345_45.method7951(Static496.anInt7407) + arg0 + Static573.aClass345_46.method7951(Static496.anInt7407));
				return;
			}
			if (Static188.aStringArray22[local113] != null) {
				@Pc(156) String local156 = Static529.method7327(Static188.aStringArray22[local113]);
				if (local156 != null && local156.equals(local28)) {
					Static601.method8468(Static573.aClass345_45.method7951(Static496.anInt7407) + arg0 + Static573.aClass345_46.method7951(Static496.anInt7407));
					return;
				}
			}
		}
		if (Static529.method7327(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82).equals(local28)) {
			Static601.method8468(Static573.aClass345_43.method7951(Static496.anInt7407));
		} else {
			@Pc(217) Class2_Sub31 local217 = Static275.method4480(Static640.aClass314_2, Static551.aClass145_160);
			local217.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg0));
			local217.aClass2_Sub17_Sub1_2.method2856(arg0);
			Static526.method7309(local217);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	public static void method6011(@OriginalArg(1) boolean arg0) {
		Static331.method5042(Static592.anInt9857, arg0, Static71.anInt1925, Class16_Sub1_Sub5_Sub1.lb);
	}
}
