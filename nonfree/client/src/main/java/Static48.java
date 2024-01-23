import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!nm;")
	public static Class119 aClass119_17;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt1073;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt1075;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public static int anInt1077 = 0;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt1079 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ge;ZIBII)Lclient!lj;")
	public static Class1_Sub5_Sub6 method899(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = (arg0 << 17) + (arg2 ? 65536 : 0) + arg4 + (arg5 << 19);
		@Pc(37) long local37 = (long) arg3 * 3147483667L + (long) local26 * 3849834839L;
		@Pc(43) Class1_Sub5_Sub6 local43 = (Class1_Sub5_Sub6) Static181.aClass175_27.method4295(local37);
		if (local43 != null) {
			return local43;
		}
		Static119.aBoolean207 = false;
		local43 = Static145.method2525(arg1, arg3, arg4, arg5, arg0, false, arg2, false);
		if (local43 != null && !Static119.aBoolean207) {
			Static181.aClass175_27.method4285(local43, local37);
		}
		return local43;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public static void method900(@OriginalArg(1) byte arg0) {
		if (Static35.aByteArrayArrayArray2 == null) {
			Static35.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				for (@Pc(29) int local29 = 0; local29 < 104; local29++) {
					Static35.aByteArrayArrayArray2[local11][local24][local29] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method901() {
		Static146.aClass175_26.method4288(5);
		Static295.aClass175_42.method4288(5);
		Static145.aClass175_23.method4288(5);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method902() {
		Static52.method956((long) Static167.anInt637);
		if (Static315.anInt5636 != -1) {
			Static203.method2971(Static315.anInt5636);
		}
		for (@Pc(19) int local19 = 0; local19 < Static37.anInt686; local19++) {
			if (Static166.aBooleanArray11[local19]) {
				Static88.aBooleanArray5[local19] = true;
			}
			Static276.aBooleanArray22[local19] = Static166.aBooleanArray11[local19];
			Static166.aBooleanArray11[local19] = false;
		}
		Static101.anInt2153 = Static167.anInt637;
		Static129.anInt2559 = -1;
		Static179.anInt3467 = -1;
		Static134.aClass157_11 = null;
		if (Static71.aBoolean165) {
			Static172.aBoolean293 = true;
		}
		if (Static315.anInt5636 != -1) {
			Static37.anInt686 = 0;
			Static79.method1635();
		}
		if (Static71.aBoolean165) {
			Static93.method1776();
		} else {
			Static77.method1604();
		}
		Static38.anInt722 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII)I")
	public static int method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg2;
			arg2 = local6;
		}
		@Pc(24) int local24 = arg0 & 0x3;
		if (local24 == 0) {
			return arg3;
		} else if (local24 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local24 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg5;
		}
	}
}
