import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_186 = new Class126(66, 5);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_187 = new Class126(73, -1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V")
	public static void method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static177.method2932(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (Static255.anInt4818 <= arg3 && Static658.anInt10079 >= arg3) {
			@Pc(56) int[] local56 = Static299.anIntArrayArray58[arg3];
			local65 = Static400.method5735(Static303.anInt9951, arg0 - arg2, Static408.anInt6951);
			local73 = Static400.method5735(Static303.anInt9951, arg0 + arg2, Static408.anInt6951);
			local84 = Static400.method5735(Static303.anInt9951, arg0 - local15, Static408.anInt6951);
			local92 = Static400.method5735(Static303.anInt9951, local15 + arg0, Static408.anInt6951);
			Static526.method7369(local56, local84, local65, arg1);
			Static526.method7369(local56, local92, local84, arg4);
			Static526.method7369(local56, local73, local92, arg1);
		}
		while (local10 < local21) {
			local36 += 2;
			local38 += 2;
			local24 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				Static608.anIntArray621[local31] = local10;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(212) int local212;
			@Pc(221) int local221;
			@Pc(228) int[] local228;
			@Pc(161) int local161;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local161 = arg3 - local21;
				local65 = arg3 + local21;
				if (local65 >= Static255.anInt4818 && Static658.anInt10079 >= local161) {
					if (local15 > local21) {
						local73 = Static608.anIntArray621[local21];
						local84 = Static400.method5735(Static303.anInt9951, arg0 + local10, Static408.anInt6951);
						local92 = Static400.method5735(Static303.anInt9951, arg0 - local10, Static408.anInt6951);
						local212 = Static400.method5735(Static303.anInt9951, arg0 + local73, Static408.anInt6951);
						local221 = Static400.method5735(Static303.anInt9951, arg0 - local73, Static408.anInt6951);
						if (local65 <= Static658.anInt10079) {
							local228 = Static299.anIntArrayArray58[local65];
							Static526.method7369(local228, local221, local92, arg1);
							Static526.method7369(local228, local212, local221, arg4);
							Static526.method7369(local228, local84, local212, arg1);
						}
						if (local161 >= Static255.anInt4818) {
							local228 = Static299.anIntArrayArray58[local161];
							Static526.method7369(local228, local221, local92, arg1);
							Static526.method7369(local228, local212, local221, arg4);
							Static526.method7369(local228, local84, local212, arg1);
						}
					} else {
						local73 = Static400.method5735(Static303.anInt9951, local10 + arg0, Static408.anInt6951);
						local84 = Static400.method5735(Static303.anInt9951, arg0 - local10, Static408.anInt6951);
						if (local65 <= Static658.anInt10079) {
							Static526.method7369(Static299.anIntArrayArray58[local65], local73, local84, arg1);
						}
						if (Static255.anInt4818 <= local161) {
							Static526.method7369(Static299.anIntArrayArray58[local161], local73, local84, arg1);
						}
					}
				}
			}
			local161 = arg3 - local10;
			local65 = local10 + arg3;
			if (local65 >= Static255.anInt4818 && local161 <= Static658.anInt10079) {
				local73 = local21 + arg0;
				local84 = arg0 - local21;
				if (Static303.anInt9951 <= local73 && Static408.anInt6951 >= local84) {
					local73 = Static400.method5735(Static303.anInt9951, local73, Static408.anInt6951);
					local84 = Static400.method5735(Static303.anInt9951, local84, Static408.anInt6951);
					if (local15 > local10) {
						local92 = local31 < local10 ? Static608.anIntArray621[local10] : local31;
						local212 = Static400.method5735(Static303.anInt9951, local92 + arg0, Static408.anInt6951);
						local221 = Static400.method5735(Static303.anInt9951, arg0 - local92, Static408.anInt6951);
						if (Static658.anInt10079 >= local65) {
							local228 = Static299.anIntArrayArray58[local65];
							Static526.method7369(local228, local221, local84, arg1);
							Static526.method7369(local228, local212, local221, arg4);
							Static526.method7369(local228, local73, local212, arg1);
						}
						if (Static255.anInt4818 <= local161) {
							local228 = Static299.anIntArrayArray58[local161];
							Static526.method7369(local228, local221, local84, arg1);
							Static526.method7369(local228, local212, local221, arg4);
							Static526.method7369(local228, local73, local212, arg1);
						}
					} else {
						if (Static658.anInt10079 >= local65) {
							Static526.method7369(Static299.anIntArrayArray58[local65], local73, local84, arg1);
						}
						if (local161 >= Static255.anInt4818) {
							Static526.method7369(Static299.anIntArrayArray58[local161], local73, local84, arg1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method7676() {
		Static200.method3158();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lu;B)[Lclient!mb;")
	public static Class234[] method7677(@OriginalArg(0) Class231 arg0) {
		if (!arg0.method5294()) {
			return new Class234[0];
		}
		@Pc(21) Class129 local21 = arg0.method5303();
		while (local21.anInt3299 == 0) {
			Static365.method3472(10L);
		}
		if (local21.anInt3299 == 2) {
			return new Class234[0];
		}
		@Pc(40) int[] local40 = (int[]) local21.anObject7;
		@Pc(46) Class234[] local46 = new Class234[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(54) Class234 local54 = new Class234();
			local46[local48] = local54;
			local54.anInt6403 = local40[local48 << 2];
			local54.anInt6402 = local40[(local48 << 2) + 1];
			local54.anInt6409 = local40[(local48 << 2) + 2];
			local54.anInt6408 = local40[(local48 << 2) + 3];
		}
		return local46;
	}
}
