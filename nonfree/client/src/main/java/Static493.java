import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "Lclient!kb;")
	public static Class12_Sub13_Sub2 aClass12_Sub13_Sub2_3;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[Lclient!mc;")
	public static Class198[] aClass198Array2;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "[I")
	public static int[] anIntArray661;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	public static void method7335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg2 >= Static251.anInt5168 && arg2 + arg3 <= Static341.anInt6481 && Static507.anInt9124 <= arg1 - arg2 && Static234.anInt4897 >= arg1 + arg2) {
			Static476.method2146(arg0, arg1, arg3, arg2);
		} else {
			Static408.method6387(arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!vs;IIIII)V")
	public static void method7336(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7556 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static130.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class97 local35 = Static485.aClass97Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7556; local37++) {
							if (arg0.aClass12_Sub7Array6[local37] == local35.aClass12_Sub7_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass12_Sub7Array6[arg0.anInt7556++] = local35.aClass12_Sub7_1;
						if (arg0.anInt7556 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7556; local7 < 4; local7++) {
			arg0.aClass12_Sub7Array6[local7] = null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)Lclient!fh;")
	public static Class12_Sub4_Sub6 method7338(@OriginalArg(1) int arg0) {
		@Pc(10) Class12_Sub4_Sub6 local10 = (Class12_Sub4_Sub6) Static474.aClass14_3.method357((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static306.aClass16_77.method408(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static208.method3863(local20);
			Static474.aClass14_3.method359((long) arg0, local10);
			return local10;
		}
	}
}
