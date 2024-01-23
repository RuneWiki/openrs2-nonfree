import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	public static int anInt2729;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "Z")
	public static boolean aBoolean220 = false;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "[I")
	public static int[] anIntArray203 = new int[14];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	public static void method2319() {
		Static287.anIntArray512 = null;
		Static57.aByteArrayArrayArray5 = null;
		Static108.aByteArrayArrayArray7 = null;
		Static58.anIntArray100 = null;
		Static170.anIntArray293 = null;
		Static176.anIntArray303 = null;
		Static25.aByteArrayArrayArray14 = null;
		Static297.aByteArrayArrayArray17 = null;
		Static188.anIntArrayArrayArray9 = null;
		Static33.anIntArray49 = null;
		Static190.anIntArray355 = null;
		Static170.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[II)V")
	public static void method2321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6 = arg0 - 1;
		@Pc(10) int local10 = local6 - 7;
		arg1--;
		while (arg1 < local10) {
			@Pc(16) int local16 = arg1 + 1;
			arg2[local16] = arg3;
			@Pc(21) int local21 = local16 + 1;
			arg2[local21] = arg3;
			@Pc(26) int local26 = local21 + 1;
			arg2[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg2[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg2[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg2[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg2[local46] = arg3;
			arg1 = local46 + 1;
			arg2[arg1] = arg3;
		}
		while (local6 > arg1) {
			arg1++;
			arg2[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	public static void method2322() {
		if (Static219.anInt4587 < 0) {
			Static157.anInt3299 = -1;
			Static34.anInt1968 = -1;
			Static219.anInt4587 = 0;
		}
		if (Static142.anInt3081 < Static219.anInt4587) {
			Static157.anInt3299 = -1;
			Static219.anInt4587 = Static142.anInt3081;
			Static34.anInt1968 = -1;
		}
		if (Static61.anInt2999 < 0) {
			Static157.anInt3299 = -1;
			Static61.anInt2999 = 0;
			Static34.anInt1968 = -1;
		}
		if (Static61.anInt2999 > Static52.anInt1205) {
			Static61.anInt2999 = Static52.anInt1205;
			Static34.anInt1968 = -1;
			Static157.anInt3299 = -1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)Z")
	public static boolean method2323(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}
}
