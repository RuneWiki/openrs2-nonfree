import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "Z")
	public static boolean aBoolean33;

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "Lclient!uo;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_10 = new Class62("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method170(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static158.anInt3256; local16++) {
			if (arg0.equalsIgnoreCase(Static190.aStringArray19[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static68.aStringArray9[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static273.method4589(arg2);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg2 - arg5;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local20;
		@Pc(34) int local34 = -local20;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static152.anIntArrayArray30[arg3];
		@Pc(47) int local47 = arg4 - local20;
		Static307.method5019(local42, local47, arg0, arg4 - arg2);
		@Pc(60) int local60 = local20 + arg4;
		Static307.method5019(local42, local60, arg1, local47);
		Static307.method5019(local42, arg2 + arg4, arg0, local60);
		while (local15 < local26) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static226.anIntArray378[local31] = local15;
				local31--;
				local34 -= local31 << 1;
			}
			local15++;
			@Pc(130) int[] local130;
			@Pc(136) int[] local136;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local20 > local26) {
					local130 = Static152.anIntArrayArray30[local26 + arg3];
					local136 = Static152.anIntArrayArray30[arg3 - local26];
					local140 = Static226.anIntArray378[local26];
					local144 = local15 + arg4;
					local149 = arg4 - local15;
					local154 = arg4 + local140;
					local159 = arg4 - local140;
					Static307.method5019(local130, local159, arg0, local149);
					Static307.method5019(local130, local154, arg1, local159);
					Static307.method5019(local130, local144, arg0, local154);
					Static307.method5019(local136, local159, arg0, local149);
					Static307.method5019(local136, local154, arg1, local159);
					Static307.method5019(local136, local144, arg0, local154);
				} else {
					local130 = Static152.anIntArrayArray30[arg3 + local26];
					local136 = Static152.anIntArrayArray30[arg3 - local26];
					local140 = local15 + arg4;
					local144 = arg4 - local15;
					Static307.method5019(local130, local140, arg0, local144);
					Static307.method5019(local136, local140, arg0, local144);
				}
			}
			local130 = Static152.anIntArrayArray30[local15 + arg3];
			local136 = Static152.anIntArrayArray30[arg3 - local15];
			local140 = local26 + arg4;
			local144 = arg4 - local26;
			if (local20 > local15) {
				local149 = local31 < local15 ? Static226.anIntArray378[local15] : local31;
				local154 = arg4 + local149;
				local159 = arg4 - local149;
				Static307.method5019(local130, local159, arg0, local144);
				Static307.method5019(local130, local154, arg1, local159);
				Static307.method5019(local130, local140, arg0, local154);
				Static307.method5019(local136, local159, arg0, local144);
				Static307.method5019(local136, local154, arg1, local159);
				Static307.method5019(local136, local140, arg0, local154);
			} else {
				Static307.method5019(local130, local140, arg0, local144);
				Static307.method5019(local136, local140, arg0, local144);
			}
		}
	}
}
