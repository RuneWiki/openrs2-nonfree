import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!en", name = "N", descriptor = "Lclient!wo;")
	public static Class216 aClass216_24;

	@OriginalMember(owner = "client!en", name = "S", descriptor = "Lclient!wo;")
	public static Class216 aClass216_25;

	@OriginalMember(owner = "client!en", name = "W", descriptor = "Lclient!aq;")
	public static Class12 aClass12_4;

	@OriginalMember(owner = "client!en", name = "X", descriptor = "Lclient!wo;")
	public static Class216 aClass216_26;

	@OriginalMember(owner = "client!en", name = "ab", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!en", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!en", name = "Y", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!en", name = "Z", descriptor = "[S")
	public static final short[] aShortArray33 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZLclient!uo;I[[I)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(4) int[][] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			@Pc(15) int[][] local15;
			@Pc(17) int local17;
			@Pc(21) int local21;
			if (arg3 == null) {
				local15 = null;
			} else {
				local15 = new int[Static233.anInt5573 + 1][Static134.anInt2971 + 1];
				for (local17 = 0; local17 <= Static134.anInt2971; local17++) {
					for (local21 = 0; local21 <= Static233.anInt5573; local21++) {
						local15[local21][local17] = Static251.anIntArrayArrayArray15[local3][local21][local17] - arg3[local21][local17];
					}
				}
			}
			local17 = 0;
			local21 = 0;
			if (!arg1) {
				if (Static129.aBoolean269) {
					local17 = 2;
				}
				if (Static304.aBoolean580) {
					local21 = 8;
				}
				if (Static163.anInt3549 != 0) {
					if (local3 == 0 || Static257.anInt5344 >= 96) {
						local21 |= 0x10;
					}
					local17 |= 0x1;
				}
			}
			if (Static129.aBoolean269) {
				local21 |= 0x7;
			}
			@Pc(108) Class53 local108 = arg2.method2167(Static233.anInt5573, Static134.anInt2971, Static251.anIntArrayArrayArray15[local3], local15, local17, local21);
			Static177.method3700(local3, local108);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!aq;B)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2) {
		@Pc(12) Class52 local12 = arg2.method367(Static208.aClass32_11);
		if (local12 == null) {
			return;
		}
		Static208.aClass32_11.method2226(arg0, arg1, arg0 + arg2.lb, arg1 + arg2.anInt446);
		if (Static144.anInt3144 < 3) {
			Static137.aClass5_15.method3622((float) arg0 + (float) arg2.lb / 2.0F, (float) arg2.anInt446 / 2.0F + (float) arg1, ((int) -Static75.aFloat13 & 0x3FFF) << 2, local12, arg0, arg1);
		} else {
			Static208.aClass32_11.method2156(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILclient!qc;Lclient!qc;)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17_Sub4 arg3, @OriginalArg(4) Class17_Sub4 arg4) {
		if (Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static269.method4738(arg0, arg1, arg2);
		}
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub4_1 = arg3;
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub4_2 = arg4;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
	public static boolean method1686() {
		return Static115.anInt2635 > 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(CB)Z")
	public static boolean method1687(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static31.aCharArray2;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (local35 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
