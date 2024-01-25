import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static695 {

	@OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
	public static int anInt7835;

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_125 = new Class397(141, 8);

	@OriginalMember(owner = "client!vr", name = "T", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_26 = new Class320(41);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)Z")
	public static boolean method6727(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([I[JI)V")
	public static void method6729(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static722.method9545(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!hla;IIIBIILclient!ha;III)V")
	public static void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class22 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 > arg6 && arg5 < arg9 + arg6 && arg10 - 13 < arg4 && arg4 < arg10 + 3 && arg1.aBoolean245) {
			arg0 = arg8;
		}
		@Pc(66) int[] local66 = null;
		if (Static594.method6761(arg1.anInt3913)) {
			local66 = Static606.aClass62_2.method1887((int) arg1.aLong145).lb;
		} else if (arg1.anInt3912 != -1) {
			local66 = Static606.aClass62_2.method1887(arg1.anInt3912).lb;
		} else if (Static496.method6774(arg1.anInt3913)) {
			@Pc(125) Class3_Sub52 local125 = (Class3_Sub52) Static94.aClass313_8.method7104((long) (int) arg1.aLong145);
			if (local125 != null) {
				@Pc(130) Class9_Sub1_Sub1_Sub2_Sub2 local130 = local125.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(133) Class219 local133 = local130.aClass219_1;
				if (local133.anIntArray405 != null) {
					local133 = local133.method5035(Static380.aClass127_1);
				}
				if (local133 != null) {
					local66 = local133.anIntArray407;
				}
			}
		} else if (Static485.method6599(arg1.anInt3913)) {
			@Pc(102) Class247 local102 = Static216.aClass53_3.method1523((int) (arg1.aLong145 >>> 32 & 0x7FFFFFFFL));
			if (local102.anIntArray477 != null) {
				local102 = local102.method5442(Static380.aClass127_1);
			}
			if (local102 != null) {
				local66 = local102.anIntArray480;
			}
		}
		@Pc(169) String local169 = Static489.method9236(arg1);
		if (local66 != null) {
			local169 = local169 + Static343.method4887(local66);
		}
		Static561.aClass57_10.method9143(Static413.aClass178Array13, Static218.anIntArray249, arg0, local169, arg6 + 3, arg10);
		if (arg1.aBoolean244) {
			Static693.aClass178_30.method7637(arg6 + Static677.aClass169_12.method3653(local169) + 5, arg10 - 12);
		}
	}

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)I")
	public static int method6731() {
		return Static488.anInt7680 == 1 ? Static438.anInt6734 : Static637.anInt8890;
	}
}
