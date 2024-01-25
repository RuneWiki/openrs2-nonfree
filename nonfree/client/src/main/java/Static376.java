import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_155 = new Class119("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_163 = new Class12(47, 12);

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
	public static int anInt6336 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIII)V")
	public static void method4977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static272.method3804(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (Static289.anInt5053 <= arg3 && arg3 <= Static93.anInt1676) {
			@Pc(52) int[] local52 = Static67.anIntArrayArray13[arg3];
			local61 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - arg2);
			local69 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg2 + arg5);
			local78 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local15);
			local87 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + local15);
			Static2.method38(local78, arg1, local52, local61);
			Static2.method38(local87, arg0, local52, local78);
			Static2.method38(local69, arg1, local52, local87);
		}
		while (local21 > local10) {
			local38 += 2;
			local36 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				Static236.anIntArray278[local31] = local10;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(255) int local255;
			@Pc(266) int[] local266;
			@Pc(152) int local152;
			if (local29 >= 0) {
				local21--;
				local29 -= local21 << 1;
				local152 = arg3 - local21;
				local61 = local21 + arg3;
				if (Static289.anInt5053 <= local61 && local152 <= Static93.anInt1676) {
					if (local21 >= local15) {
						local69 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local10 + arg5);
						local78 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local10);
						if (Static93.anInt1676 >= local61) {
							Static2.method38(local69, arg1, Static67.anIntArrayArray13[local61], local78);
						}
						if (Static289.anInt5053 <= local152) {
							Static2.method38(local69, arg1, Static67.anIntArrayArray13[local152], local78);
						}
					} else {
						local69 = Static236.anIntArray278[local21];
						local78 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local10 + arg5);
						local87 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local10);
						local246 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + local69);
						local255 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local69);
						if (local61 <= Static93.anInt1676) {
							local266 = Static67.anIntArrayArray13[local61];
							Static2.method38(local255, arg1, local266, local87);
							Static2.method38(local246, arg0, local266, local255);
							Static2.method38(local78, arg1, local266, local246);
						}
						if (local152 >= Static289.anInt5053) {
							local266 = Static67.anIntArrayArray13[local152];
							Static2.method38(local255, arg1, local266, local87);
							Static2.method38(local246, arg0, local266, local255);
							Static2.method38(local78, arg1, local266, local246);
						}
					}
				}
			}
			local152 = arg3 - local10;
			local61 = arg3 + local10;
			if (local61 >= Static289.anInt5053 && Static93.anInt1676 >= local152) {
				local69 = local21 + arg5;
				local78 = arg5 - local21;
				if (local69 >= Static427.anInt7214 && Static434.anInt7302 >= local78) {
					local69 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local69);
					local78 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local78);
					if (local10 >= local15) {
						if (local61 <= Static93.anInt1676) {
							Static2.method38(local69, arg1, Static67.anIntArrayArray13[local61], local78);
						}
						if (Static289.anInt5053 <= local152) {
							Static2.method38(local69, arg1, Static67.anIntArrayArray13[local152], local78);
						}
					} else {
						local87 = local10 <= local31 ? local31 : Static236.anIntArray278[local10];
						local246 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 + local87);
						local255 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg5 - local87);
						if (local61 <= Static93.anInt1676) {
							local266 = Static67.anIntArrayArray13[local61];
							Static2.method38(local255, arg1, local266, local78);
							Static2.method38(local246, arg0, local266, local255);
							Static2.method38(local69, arg1, local266, local246);
						}
						if (local152 >= Static289.anInt5053) {
							local266 = Static67.anIntArrayArray13[local152];
							Static2.method38(local255, arg1, local266, local78);
							Static2.method38(local246, arg0, local266, local255);
							Static2.method38(local69, arg1, local266, local246);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)V")
	public static void method4979() {
		Static36.aClass37_3.method4749();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static153.aLongArray5[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static213.aLongArray2[local29] = 0L;
		}
		Static418.anInt7122 = 0;
	}
}
