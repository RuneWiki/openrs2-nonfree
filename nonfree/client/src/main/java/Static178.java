import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!je;")
	public static final Class127 aClass127_9 = new Class127(12, 0, 1, 0);

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_62 = new Class27(58, 18);

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "[I")
	public static final int[] anIntArray371 = new int[6];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
	public static boolean method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static181.aByteArrayArrayArray15[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V")
	public static void method2949(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static113.anIntArray203[local7] = Static113.anIntArray203[local7 - 1];
			Static449.anIntArray742[local7] = Static449.anIntArray742[local7 - 1];
			Static19.aStringArray2[local7] = Static19.aStringArray2[local7 - 1];
			Static297.aStringArray33[local7] = Static297.aStringArray33[local7 - 1];
			Static170.aStringArray26[local7] = Static170.aStringArray26[local7 - 1];
			Static383.aStringArray49[local7] = Static383.aStringArray49[local7 - 1];
			Static24.anIntArray37[local7] = Static24.anIntArray37[local7 - 1];
		}
		Static113.anIntArray203[0] = arg6;
		Static449.anIntArray742[0] = arg4;
		Static19.aStringArray2[0] = arg5;
		Static297.aStringArray33[0] = arg3;
		Static170.aStringArray26[0] = arg2;
		Static24.anIntArray37[0] = arg0;
		Static277.anInt4825 = Static193.anInt3856;
		Static383.aStringArray49[0] = arg1;
		Static442.anInt7400++;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method2950(@OriginalArg(1) long arg0) {
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
			@Pc(50) StringBuffer local50 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static163.aCharArray1[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local68 = ' ';
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V")
	public static void method2951(@OriginalArg(1) int arg0) {
		Static64.method1073();
		Static95.method1723();
		Static232.method3818(arg0, true);
		Static341.method4588(Static326.aClass187_99, Static412.aClass50_8, Static21.aClass187_8);
		Static99.method1779(Static412.aClass50_8, Static21.aClass187_8);
		Static234.method2026();
		Static107.method1887(Static301.aClass80Array16);
		Static448.method5473();
		if (Static358.anInt6086 == 2) {
			Static458.method6071(3);
		} else if (Static358.anInt6086 == 6) {
			Static458.method6071(7);
		} else if (Static358.anInt6086 == 9) {
			Static458.method6071(10);
			return;
		} else if (Static358.anInt6086 == 1) {
			Static180.method2969(Static21.aClass187_8, Static412.aClass50_8);
			return;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([FII)[F")
	public static float[] method2953(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static468.method4351(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
