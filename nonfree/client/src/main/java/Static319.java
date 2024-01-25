import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public static int anInt5771;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "[Lclient!bt;")
	public static final Class3_Sub2[] aClass3_Sub2Array1 = new Class3_Sub2[2048];

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!wk;I)Z")
	public static boolean method4635(@OriginalArg(0) Interface12 arg0) {
		@Pc(17) Class128 local17 = Static55.aClass25_1.method855(arg0.method5847());
		if (local17.anInt4028 == -1) {
			return true;
		} else {
			@Pc(30) Class208 local30 = Static404.aClass123_3.method3180(local17.anInt4028);
			return local30.anInt6540 == -1 ? true : local30.method5145();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!qt;I)V")
	public static void method4637(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt6092 && arg0 != -1) {
			@Pc(16) Class96 local16 = Static196.aClass30_2.method942(arg0);
			@Pc(19) int local19 = local16.anInt3320;
			if (local19 == 1) {
				arg1.anInt6127 = 1;
				arg1.anInt6082 = 0;
				arg1.anInt6121 = 0;
				arg1.anInt6083 = arg2;
				arg1.lb = 0;
				Static86.method1483(arg1.anInt6053, arg1.anInt6082, arg1.aByte77, arg1.anInt6055, local16, false);
			}
			if (local19 == 2) {
				arg1.anInt6121 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt6092 == -1 || Static196.aClass30_2.method942(arg0).anInt3323 >= Static196.aClass30_2.method942(arg1.anInt6092).anInt3323) {
			arg1.anInt6127 = 1;
			arg1.anInt6121 = 0;
			arg1.anInt6082 = 0;
			arg1.lb = 0;
			arg1.anInt6083 = arg2;
			arg1.anInt6092 = arg0;
			arg1.anInt6136 = arg1.anInt6133;
			if (arg1.anInt6092 != -1) {
				Static86.method1483(arg1.anInt6053, arg1.anInt6082, arg1.aByte77, arg1.anInt6055, Static196.aClass30_2.method942(arg1.anInt6092), false);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4638(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local49.append(Static405.aCharArray11[(int) (local52 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method4639(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static139.method2522(12, arg0);
		local12.method1563();
	}
}
