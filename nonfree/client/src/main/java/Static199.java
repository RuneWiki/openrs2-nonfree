import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public static int anInt3480;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "Lclient!gb;")
	public static Class88 aClass88_4;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_20 = new Class220(4, 1, 1, 1);

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Lclient!oq;")
	public static final Class182 aClass182_4 = new Class182("", 11);

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_103 = new Class12(91, -1);

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString45 = null;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public static final int anInt3481 = 1407;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)[Lclient!it;")
	public static Class116[] method2830() {
		if (Static271.aClass116Array2 == null) {
			@Pc(15) Class116[] local15 = Static292.method4000(Static183.aClass83_2);
			@Pc(19) Class116[] local19 = new Class116[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(77) int local77;
			@Pc(83) Class116 local83;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class116 local29 = local15[local23];
				if ((local29.anInt3135 <= 0 || local29.anInt3135 >= 24) && local29.anInt3138 >= 800 && local29.anInt3141 >= 600 && (Static270.anInt4858 >= 96 || Static14.anInt293 != 0 || local29.anInt3138 <= 1024 && local29.anInt3141 <= 768)) {
					for (local77 = 0; local77 < local21; local77++) {
						local83 = local19[local77];
						if (local83.anInt3138 == local29.anInt3138 && local83.anInt3141 == local29.anInt3141) {
							if (local29.anInt3135 > local83.anInt3135) {
								local19[local77] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static271.aClass116Array2 = new Class116[local21];
			Static468.method5039(local19, 0, Static271.aClass116Array2, 0, local21);
			@Pc(143) int[] local143 = new int[Static271.aClass116Array2.length];
			for (local77 = 0; local77 < Static271.aClass116Array2.length; local77++) {
				local83 = Static271.aClass116Array2[local77];
				local143[local77] = local83.anInt3138 * local83.anInt3141;
			}
			Static146.method2181(Static271.aClass116Array2, local143);
		}
		return Static271.aClass116Array2;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBIZZ)I")
	public static int method2831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class1_Sub43 local10 = Static346.method4702(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray507.length; local18++) {
			if (local10.anIntArray507[local18] >= 0 && Static342.aClass155_2.anInt4483 > local10.anIntArray507[local18]) {
				@Pc(43) Class162 local43 = Static342.aClass155_2.method3548(local10.anIntArray507[local18]);
				@Pc(53) int local53 = local43.method3710(Static65.aClass86_1.method1919(arg1).anInt2688, arg1);
				if (arg2) {
					local16 += local10.anIntArray506[local18] * local53;
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}
}
