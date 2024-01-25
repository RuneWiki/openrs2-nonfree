import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!za", name = "u", descriptor = "Z")
	public static boolean aBoolean764;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_191 = new Class44(4, 12);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_14 = new Class276("", 11);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public static void method9319() {
		@Pc(12) Class14_Sub19 local12 = Static286.method4081(Static205.aClass394_1, Static56.aClass100_24);
		local12.aClass14_Sub29_Sub1_1.method5854(0);
		Static576.method8234(local12);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public static void method9321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115() != 0 && arg1 != 0 && Static4.anInt29 < 50 && arg3 != -1) {
			Static178.aClass393Array1[Static4.anInt29++] = new Class393((byte) 1, arg3, arg1, arg5, arg2, arg4, arg0, (Class12_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public static int method9322(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIBI)V")
	public static void method9323(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(12) int local12 = arg3 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg1 < local16) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg1 = local50 + 1;
			arg0[arg1] = arg2;
		}
		while (arg1 < local12) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBI)Z")
	public static boolean method9324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)I")
	public static int method9325() {
		@Pc(12) int local12 = Static330.aClass131_22.method3020();
		if (local12 < Static571.aClass131Array1.length - 1) {
			Static330.aClass131_22 = Static571.aClass131Array1[local12 + 1];
		}
		return 100;
	}
}
