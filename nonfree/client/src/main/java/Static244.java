import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
	public static void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static257.method5458(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(44) int local44 = -1;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(90) int local90;
		@Pc(98) int local98;
		if (arg1 >= Static456.anInt7815 && Static604.anInt10083 >= arg1) {
			@Pc(64) int[] local64 = Static569.anIntArrayArray54[arg1];
			local73 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - arg2);
			local82 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + arg2);
			local90 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local15);
			local98 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local15);
			Static646.method7025(local64, local73, local90, arg3);
			Static646.method7025(local64, local90, local98, arg5);
			Static646.method7025(local64, local98, local82, arg3);
		}
		@Pc(118) int local118 = -1;
		while (local10 < local21) {
			local118 += 2;
			local44 += 2;
			local29 += local118;
			local24 += local44;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static326.anIntArray324[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(215) int local215;
			@Pc(224) int local224;
			@Pc(235) int[] local235;
			@Pc(168) int local168;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local168 = arg1 - local21;
				local73 = arg1 + local21;
				if (Static456.anInt7815 <= local73 && Static604.anInt10083 >= local168) {
					if (local21 < local15) {
						local82 = Static326.anIntArray324[local21];
						local90 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local10);
						local98 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local10);
						local215 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local82 + arg0);
						local224 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local82);
						if (Static604.anInt10083 >= local73) {
							local235 = Static569.anIntArrayArray54[local73];
							Static646.method7025(local235, local98, local224, arg3);
							Static646.method7025(local235, local224, local215, arg5);
							Static646.method7025(local235, local215, local90, arg3);
						}
						if (local168 >= Static456.anInt7815) {
							local235 = Static569.anIntArrayArray54[local168];
							Static646.method7025(local235, local98, local224, arg3);
							Static646.method7025(local235, local224, local215, arg5);
							Static646.method7025(local235, local215, local90, arg3);
						}
					} else {
						local82 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local10 + arg0);
						local90 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local10);
						if (local73 <= Static604.anInt10083) {
							Static646.method7025(Static569.anIntArrayArray54[local73], local90, local82, arg3);
						}
						if (local168 >= Static456.anInt7815) {
							Static646.method7025(Static569.anIntArrayArray54[local168], local90, local82, arg3);
						}
					}
				}
			}
			local168 = arg1 - local10;
			local73 = arg1 + local10;
			if (local73 >= Static456.anInt7815 && local168 <= Static604.anInt10083) {
				local82 = arg0 + local21;
				local90 = arg0 - local21;
				if (local82 >= Static642.anInt10429 && local90 <= Static456.anInt7806) {
					local82 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local82);
					local90 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local90);
					if (local10 >= local15) {
						if (local73 <= Static604.anInt10083) {
							Static646.method7025(Static569.anIntArrayArray54[local73], local90, local82, arg3);
						}
						if (Static456.anInt7815 <= local168) {
							Static646.method7025(Static569.anIntArrayArray54[local168], local90, local82, arg3);
						}
					} else {
						local98 = local10 <= local26 ? local26 : Static326.anIntArray324[local10];
						local215 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local98);
						local224 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local98);
						if (Static604.anInt10083 >= local73) {
							local235 = Static569.anIntArrayArray54[local73];
							Static646.method7025(local235, local90, local224, arg3);
							Static646.method7025(local235, local224, local215, arg5);
							Static646.method7025(local235, local215, local82, arg3);
						}
						if (Static456.anInt7815 <= local168) {
							local235 = Static569.anIntArrayArray54[local168];
							Static646.method7025(local235, local90, local224, arg3);
							Static646.method7025(local235, local224, local215, arg5);
							Static646.method7025(local235, local215, local82, arg3);
						}
					}
				}
			}
		}
	}
}
