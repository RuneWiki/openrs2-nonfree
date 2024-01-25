import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!wo;")
	public static Class216 aClass216_74;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_39 = new Class87(16);

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int anInt4575 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static109.method2359(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (Static197.anInt4211 <= arg0 && arg0 <= Static326.anInt2469) {
			@Pc(52) int[] local52 = Static344.anIntArrayArray65[arg0];
			local61 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - arg1);
			local69 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 + arg2);
			local77 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - local15);
			local86 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 + local15);
			Static39.method919(arg4, local52, local77, local61);
			Static39.method919(arg3, local52, local86, local77);
			Static39.method919(arg4, local52, local69, local86);
		}
		@Pc(108) int local108 = -1;
		while (local10 < local24) {
			local108 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local108;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static102.anIntArray228[local29] = local10;
			}
			local10++;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(235) int[] local235;
			@Pc(159) int local159;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local159 = arg0 - local24;
				local61 = arg0 + local24;
				if (local61 >= Static197.anInt4211 && Static326.anInt2469 >= local159) {
					if (local24 < local15) {
						local69 = Static102.anIntArray228[local24];
						local77 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 + local10);
						local86 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - local10);
						local216 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 + local69);
						local224 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - local69);
						if (Static326.anInt2469 >= local61) {
							local235 = Static344.anIntArrayArray65[local61];
							Static39.method919(arg4, local235, local224, local86);
							Static39.method919(arg3, local235, local216, local224);
							Static39.method919(arg4, local235, local77, local216);
						}
						if (local159 >= Static197.anInt4211) {
							local235 = Static344.anIntArrayArray65[local159];
							Static39.method919(arg4, local235, local224, local86);
							Static39.method919(arg3, local235, local216, local224);
							Static39.method919(arg4, local235, local77, local216);
						}
					} else {
						local69 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 + local10);
						local77 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - local10);
						if (Static326.anInt2469 >= local61) {
							Static39.method919(arg4, Static344.anIntArrayArray65[local61], local69, local77);
						}
						if (local159 >= Static197.anInt4211) {
							Static39.method919(arg4, Static344.anIntArrayArray65[local159], local69, local77);
						}
					}
				}
			}
			local159 = arg0 - local10;
			local61 = arg0 + local10;
			if (Static197.anInt4211 <= local61 && Static326.anInt2469 >= local159) {
				local69 = arg2 + local24;
				local77 = arg2 - local24;
				if (local69 >= Static268.anInt5477 && local77 <= Static342.anInt3000) {
					local69 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local69);
					local77 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local77);
					if (local15 > local10) {
						local86 = local10 > local29 ? Static102.anIntArray228[local10] : local29;
						local216 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local86 + arg2);
						local224 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg2 - local86);
						if (local61 <= Static326.anInt2469) {
							local235 = Static344.anIntArrayArray65[local61];
							Static39.method919(arg4, local235, local224, local77);
							Static39.method919(arg3, local235, local216, local224);
							Static39.method919(arg4, local235, local69, local216);
						}
						if (local159 >= Static197.anInt4211) {
							local235 = Static344.anIntArrayArray65[local159];
							Static39.method919(arg4, local235, local224, local77);
							Static39.method919(arg3, local235, local216, local224);
							Static39.method919(arg4, local235, local69, local216);
						}
					} else {
						if (local61 <= Static326.anInt2469) {
							Static39.method919(arg4, Static344.anIntArrayArray65[local61], local69, local77);
						}
						if (Static197.anInt4211 <= local159) {
							Static39.method919(arg4, Static344.anIntArrayArray65[local159], local69, local77);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!wo;Lclient!wo;Z)V")
	public static void method4115(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1) {
		Static224.aClass216_76 = arg1;
		Static256.aClass216_83 = arg0;
		Static298.anInt5840 = Static224.aClass216_76.method5675(3);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([J[IB)V")
	public static void method4117(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static229.method756(arg0.length - 1, arg1, arg0, 0);
	}
}
