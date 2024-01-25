import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "[I")
	public static final int[] anIntArray395 = new int[14];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[B)Lclient!hk;")
	public static Class4_Sub4_Sub5 method4178(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub4_Sub5 local9 = new Class4_Sub4_Sub5();
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		local14.anInt3768 = local14.aByteArray55.length - 2;
		@Pc(25) int local25 = local14.method3401();
		@Pc(35) int local35 = local14.aByteArray55.length - local25 - 12 - 2;
		local14.anInt3768 = local35;
		@Pc(42) int local42 = local14.method3418();
		local9.anInt2873 = local14.method3401();
		local9.anInt2877 = local14.method3401();
		local9.anInt2874 = local14.method3401();
		local9.anInt2880 = local14.method3401();
		@Pc(66) int local66 = local14.method3440();
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (local66 > 0) {
			local9.aClass43Array1 = new Class43[local66];
			for (local79 = 0; local79 < local66; local79++) {
				local85 = local14.method3401();
				@Pc(92) Class43 local92 = new Class43(Static28.method5505(local85));
				local9.aClass43Array1[local79] = local92;
				while (local85-- > 0) {
					@Pc(103) int local103 = local14.method3418();
					@Pc(107) int local107 = local14.method3418();
					local92.method1276(new Class4_Sub8(local107), (long) local103);
				}
			}
		}
		local14.anInt3768 = 0;
		local9.aString27 = local14.method3433();
		local9.anIntArray246 = new int[local42];
		local9.aStringArray35 = new String[local42];
		local9.anIntArray248 = new int[local42];
		local79 = 0;
		while (local14.anInt3768 < local35) {
			local85 = local14.method3401();
			if (local85 == 3) {
				local9.aStringArray35[local79] = local14.method3446().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray248[local79] = local14.method3440();
			} else {
				local9.anIntArray248[local79] = local14.method3418();
			}
			local9.anIntArray246[local79++] = local85;
		}
		return local9;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!br;I)Z")
	public static boolean method4180(@OriginalArg(0) Class21 arg0) {
		if (arg0.anInt757 == 205) {
			Static128.anInt3034 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(II)Lclient!t;")
	public static Class189 method4181(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static54.aFloat69 == 3.0D) {
				return Static197.aClass189_8;
			}
			if ((double) Static54.aFloat69 == 4.0D) {
				return Static75.aClass189_1;
			}
			if ((double) Static54.aFloat69 == 6.0D) {
				return Static202.aClass189_9;
			}
			if ((double) Static54.aFloat69 >= 8.0D) {
				return Static117.aClass189_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static54.aFloat69 == 3.0D) {
				return Static202.aClass189_9;
			}
			if ((double) Static54.aFloat69 == 4.0D) {
				return Static117.aClass189_4;
			}
			if ((double) Static54.aFloat69 == 6.0D) {
				return Static86.aClass189_3;
			}
			if ((double) Static54.aFloat69 >= 8.0D) {
				return Static151.aClass189_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static54.aFloat69 == 3.0D) {
				return Static86.aClass189_3;
			}
			if ((double) Static54.aFloat69 == 4.0D) {
				return Static151.aClass189_6;
			}
			if ((double) Static54.aFloat69 == 6.0D) {
				return Static165.aClass189_7;
			}
			if ((double) Static54.aFloat69 >= 8.0D) {
				return Static80.aClass189_2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!tj;BLclient!tj;ZI)V")
	public static void method4182(@OriginalArg(0) Class193 arg0, @OriginalArg(2) Class193 arg1, @OriginalArg(4) int arg2) {
		Static202.anInt4158 = arg2;
		Static286.aBoolean484 = true;
		Static282.aClass193_81 = arg1;
		Static115.aClass193_40 = arg0;
	}
}
