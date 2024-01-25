import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
	public static int anInt2111;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_38 = new Class337(24, 3);

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
	public static int anInt2114 = -1;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	public static void method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 != null) {
			Static397.method5885(local7.aClass4_Sub2_Sub2_1);
			if (local7.aClass4_Sub2_Sub2_1 != null) {
				local7.aClass4_Sub2_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([IIIIIIII)V")
	public static void method1741(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static413.method8723(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static413.method8723(arg1)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg3 < arg1 ? arg3 : arg1;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(59) int[] local59 = arg0;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local42, arg2, arg3, arg1, 0, 32993, arg4, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(82) int local82 = 0;
				@Pc(84) int local84 = 0;
				@Pc(89) int local89 = arg3;
				for (@Pc(91) int local91 = 0; local91 < local57; local91++) {
					for (@Pc(95) int local95 = 0; local95 < local53; local95++) {
						@Pc(102) int local102 = local59[local84++];
						@Pc(107) int local107 = local59[local84++];
						@Pc(112) int local112 = local59[local89++];
						@Pc(118) int local118 = local102 >> 8 & 0xFF;
						@Pc(124) int local124 = local102 >> 24 & 0xFF;
						@Pc(129) int local129 = local59[local89++];
						@Pc(135) int local135 = local102 >> 16 & 0xFF;
						@Pc(139) int local139 = local102 & 0xFF;
						@Pc(147) int local147 = local118 + (local107 >> 8 & 0xFF);
						@Pc(155) int local155 = local124 + (local107 >> 24 & 0xFF);
						@Pc(161) int local161 = local139 + (local107 & 0xFF);
						@Pc(169) int local169 = local135 + (local107 >> 16 & 0xFF);
						@Pc(177) int local177 = local147 + (local112 >> 8 & 0xFF);
						@Pc(183) int local183 = local161 + (local112 & 0xFF);
						@Pc(191) int local191 = local169 + (local112 >> 16 & 0xFF);
						@Pc(199) int local199 = local155 + (local112 >> 24 & 0xFF);
						@Pc(207) int local207 = local191 + (local129 >> 16 & 0xFF);
						@Pc(213) int local213 = local183 + (local129 & 0xFF);
						@Pc(221) int local221 = local199 + (local129 >> 24 & 0xFF);
						@Pc(229) int local229 = local177 + (local129 >> 8 & 0xFF);
						local64[local82++] = (local229 & 0x3FC) << 6 | local221 << 22 & 0xFF000000 | (local207 & 0x3FC) << 14 | local213 >> 2 & 0xFF;
					}
					local84 += arg3;
					local89 += arg3;
				}
				@Pc(278) int[] local278 = local64;
				local64 = local59;
				arg1 = local57;
				local59 = local278;
				arg3 = local53;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)V")
	public static void method1742() {
		if (Static353.aClass277Array1 == null) {
			Static353.aClass277Array1 = Static437.method6655();
			Static505.aClass277_22 = Static353.aClass277Array1[0];
			Static141.aLong70 = Static95.method1587();
		}
		if (Static299.aClass347_1 == null) {
			Static633.method8957();
		}
		@Pc(23) Class277 local23 = Static505.aClass277_22;
		@Pc(26) int local26 = Static339.method5107();
		if (local23 == Static505.aClass277_22) {
			Static244.aString47 = Static505.aClass277_22.aClass120_63.method2690(Static266.anInt4796);
			if (Static505.aClass277_22.aBoolean536) {
				Static119.anInt2201 = Static505.aClass277_22.anInt7504 + local26 * (Static505.aClass277_22.anInt7507 - Static505.aClass277_22.anInt7504) / 100;
			}
			if (Static505.aClass277_22.aBoolean535) {
				Static244.aString47 = Static244.aString47 + Static119.anInt2201 + "%";
			}
		} else if (Static505.aClass277_22 == Static437.aClass277_21) {
			Static299.aClass347_1 = null;
			Static358.method5312(3);
		} else {
			Static244.aString47 = local23.aClass120_64.method2690(Static266.anInt4796);
			if (Static505.aClass277_22.aBoolean535) {
				Static244.aString47 = Static244.aString47 + local23.anInt7507 + "%";
			}
			Static119.anInt2201 = local23.anInt7507;
			if (Static505.aClass277_22.aBoolean536 || local23.aBoolean536) {
				Static141.aLong70 = Static95.method1587();
			}
		}
		if (Static299.aClass347_1 == null) {
			return;
		}
		Static299.aClass347_1.method8238(Static141.aLong70, Static119.anInt2201, Static505.aClass277_22, Static244.aString47);
		if (Static9.anInterface2Array1 == null) {
			return;
		}
		for (@Pc(127) int local127 = Static181.anInt3232 + 1; local127 < Static9.anInterface2Array1.length; local127++) {
			if (Static9.anInterface2Array1[local127].method8793() >= 100 && local127 - 1 == Static181.anInt3232 && Static151.anInt2620 >= 1 && Static299.aClass347_1.method8228()) {
				try {
					Static9.anInterface2Array1[local127].method8794();
				} catch (@Pc(159) Exception local159) {
					Static9.anInterface2Array1 = null;
					break;
				}
				Static299.aClass347_1.method8227(Static9.anInterface2Array1[local127]);
				Static181.anInt3232++;
				if (Static181.anInt3232 >= Static9.anInterface2Array1.length - 1 && Static9.anInterface2Array1.length > 1) {
					Static181.anInt3232 = Static294.aClass11_1.method221() ? 0 : -1;
				}
			}
		}
	}
}
