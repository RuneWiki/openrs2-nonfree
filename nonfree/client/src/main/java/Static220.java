import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public static int anInt3888;

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "Lclient!ok;")
	public static Class178 aClass178_61;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!rm;IIIII)V")
	public static void method3097(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7289 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static194.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class74 local35 = Static302.aClass74Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7289; local37++) {
							if (arg0.aClass7_Sub30Array3[local37] == local35.aClass7_Sub30_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass7_Sub30Array3[arg0.anInt7289++] = local35.aClass7_Sub30_2;
						if (arg0.anInt7289 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7289; local7 < 4; local7++) {
			arg0.aClass7_Sub30Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3098(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static184.anInt3296; local11++) {
			if (arg0.equalsIgnoreCase(Static193.aStringArray30[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)I")
	public static int method3099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static205.method2957(arg0 + 91923, arg1 + 45365, 4) + (Static205.method2957(arg0 + 37821, arg1 - -10294, 2) - 128 >> 1) + (Static205.method2957(arg0, arg1, 1) - 128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3100(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static184.anInt3296 >= 100 && !Static263.aBoolean285 || Static184.anInt3296 >= 200) {
			Static90.method1616(Static208.aClass55_81.method1205(Static5.anInt20));
			return;
		}
		@Pc(27) String local27 = Static345.method4461(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(32) int local32 = 0; local32 < Static184.anInt3296; local32++) {
			@Pc(40) String local40 = Static345.method4461(Static193.aStringArray30[local32]);
			if (local40 != null && local40.equals(local27)) {
				Static90.method1616(arg0 + Static42.aClass55_21.method1205(Static5.anInt20));
				return;
			}
			if (Static448.aStringArray53[local32] != null) {
				local70 = Static345.method4461(Static448.aStringArray53[local32]);
				if (local70 != null && local70.equals(local27)) {
					Static90.method1616(arg0 + Static42.aClass55_21.method1205(Static5.anInt20));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static206.anInt3640; local100++) {
			local70 = Static345.method4461(Static84.aStringArray37[local100]);
			if (local70 != null && local70.equals(local27)) {
				Static90.method1616(Static67.aClass55_32.method1205(Static5.anInt20) + arg0 + Static207.aClass55_80.method1205(Static5.anInt20));
				return;
			}
			if (Static332.aStringArray46[local100] != null) {
				@Pc(143) String local143 = Static345.method4461(Static332.aStringArray46[local100]);
				if (local143 != null && local143.equals(local27)) {
					Static90.method1616(Static67.aClass55_32.method1205(Static5.anInt20) + arg0 + Static207.aClass55_80.method1205(Static5.anInt20));
					return;
				}
			}
		}
		if (Static345.method4461(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69).equals(local27)) {
			Static90.method1616(Static157.aClass55_65.method1205(Static5.anInt20));
		} else {
			Static81.method1414(Static357.aClass2_92);
			Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0));
			Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
		}
	}
}
