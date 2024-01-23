import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Z")
	public static boolean aBoolean465;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method4609(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static177.aBoolean327) {
			try {
				@Pc(21) Class10 local21 = (Class10) Class.forName("Class10_Sub1").getDeclaredConstructor().newInstance();
				local21.method290(arg0);
				return local21;
			} catch (@Pc(28) Throwable local28) {
				Static177.aBoolean327 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[JII[I)V")
	public static void method4610(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
			if (arg1[local51] < (long) (local51 & 0x1) + local25) {
				@Pc(73) long local73 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21] = local73;
				@Pc(87) int local87 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local87;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method4610(arg0, arg1, local21 - 1, arg3);
		method4610(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg2, 4);
		local8.method2718();
		local8.anInt3324 = arg1;
		local8.anInt3327 = arg0;
		local8.anInt3323 = arg3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method4612(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static254.method4107(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Lclient!ih;")
	public static Class2_Sub3_Sub9 method4614(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub9 local10 = (Class2_Sub3_Sub9) Static174.aClass53_4.method1254((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static290.aClass84_126.method2127(Static55.method1087(arg0), Static277.method4624(arg0));
		local10 = new Class2_Sub3_Sub9();
		if (local30 != null) {
			local10.method1983(new Class2_Sub26(local30));
		}
		Static174.aClass53_4.method1258((long) arg0, local10);
		return local10;
	}
}
