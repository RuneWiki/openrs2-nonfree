import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public static int anInt5075;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_78 = new Class11(53, 6);

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray132 = new String[8];

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static final int[] anIntArray1000 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method4413(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		Static64.method1050(arg4, arg3, arg1, arg0, arg2, null, -1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	public static String method4416(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static212.anInterface1_1 != null) {
			@Pc(17) String local17 = Static212.anInterface1_1.method1694(arg1, arg0, arg2);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!wt;")
	public static Class1_Sub5 method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class46 local14 = local7.aClass46_3; local14 != null; local14 = local14.aClass46_1) {
			@Pc(18) Class1_Sub5 local18 = local14.aClass1_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort96 == arg1 && local18.aShort97 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!kk;B)V")
	public static void method4420(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(9) int local9 = arg0.method5311();
		Static326.aClass215Array1 = new Class215[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static326.aClass215Array1[local19] = new Class215();
			Static326.aClass215Array1[local19].anInt5178 = arg0.method5311();
			Static326.aClass215Array1[local19].aString57 = arg0.method5314();
		}
		Static206.anInt3798 = arg0.method5311();
		Static133.anInt2726 = arg0.method5311();
		Static232.anInt4151 = arg0.method5311();
		Static48.aClass138_Sub1Array1 = new Class138_Sub1[Static133.anInt2726 + 1 - Static206.anInt3798];
		for (@Pc(67) int local67 = 0; local67 < Static232.anInt4151; local67++) {
			@Pc(73) int local73 = arg0.method5311();
			@Pc(81) Class138_Sub1 local81 = Static48.aClass138_Sub1Array1[local73] = new Class138_Sub1();
			local81.anInt3872 = arg0.method5350();
			local81.anInt3869 = arg0.method5346();
			local81.anInt3885 = local73 + Static206.anInt3798;
			local81.aString46 = arg0.method5314();
			local81.aString45 = arg0.method5314();
		}
		Static174.anInt3363 = arg0.method5346();
		Static195.aBoolean279 = true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4422(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local53.append(Static213.aCharArray3[(int) (local57 - arg0 * 37L)]);
			}
			return local53.reverse().toString();
		}
	}
}
