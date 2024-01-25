import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[[[Lclient!ut;")
	public static Class252[][][] aClass252ArrayArrayArray2;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!qm;")
	public static Class209 aClass209_3;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!pt;IIIII)V")
	public static void method1305(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt1886 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static457.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class75 local35 = Static135.aClass75Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt1886; local37++) {
							if (arg0.aClass1_Sub4Array2[local37] == local35.aClass1_Sub4_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub4Array2[arg0.anInt1886++] = local35.aClass1_Sub4_2;
						if (arg0.anInt1886 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt1886; local7 < 4; local7++) {
			arg0.aClass1_Sub4Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method1306() {
		if (Static9.aBoolean184) {
			Static406.aClass137_14 = null;
			Static9.aBoolean184 = false;
			Static398.aClass137_19 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	public static void method1308() {
		@Pc(7) int local7 = Static180.anInt3908;
		@Pc(9) int[] local9 = Static274.anIntArray500;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class30_Sub1_Sub1_Sub2 local26 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local9[local18]];
			if (local26 != null) {
				Static342.method4810(local26, local26.method944());
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([I[JI)V")
	public static void method1309(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static298.method4340(arg1.length - 1, arg1, arg0, 0);
	}
}
