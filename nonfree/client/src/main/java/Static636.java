import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
	public static int anInt10299;

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
	public static int anInt10300;

	@OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
	public static int anInt10302;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_17 = new Class206(13, -1);

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
	public static int anInt10303 = -1;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)I")
	public static int method8628(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(IIIIIII)V")
	public static void method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static383.method5756(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static384.anIntArrayArray38[arg0];
		@Pc(41) int local41 = arg2 - local15;
		Static482.method7040(arg5, arg2 - arg3, local37, local41);
		@Pc(54) int local54 = local15 + arg2;
		Static482.method7040(arg1, local41, local37, local54);
		Static482.method7040(arg5, local54, local37, arg3 + arg2);
		while (local21 > local10) {
			local33 += 2;
			local31 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static394.anIntArray381[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(122) int[] local122;
			@Pc(129) int[] local129;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local15 > local21) {
					local122 = Static384.anIntArrayArray38[local21 + arg0];
					local129 = Static384.anIntArrayArray38[arg0 - local21];
					local133 = Static394.anIntArray381[local21];
					local138 = arg2 + local10;
					local142 = arg2 - local10;
					local146 = arg2 + local133;
					local151 = arg2 - local133;
					Static482.method7040(arg5, local142, local122, local151);
					Static482.method7040(arg1, local151, local122, local146);
					Static482.method7040(arg5, local146, local122, local138);
					Static482.method7040(arg5, local142, local129, local151);
					Static482.method7040(arg1, local151, local129, local146);
					Static482.method7040(arg5, local146, local129, local138);
				} else {
					local122 = Static384.anIntArrayArray38[local21 + arg0];
					local129 = Static384.anIntArrayArray38[arg0 - local21];
					local133 = arg2 + local10;
					local138 = arg2 - local10;
					Static482.method7040(arg5, local138, local122, local133);
					Static482.method7040(arg5, local138, local129, local133);
				}
			}
			local122 = Static384.anIntArrayArray38[arg0 + local10];
			local129 = Static384.anIntArrayArray38[arg0 - local10];
			local133 = local21 + arg2;
			local138 = arg2 - local21;
			if (local15 <= local10) {
				Static482.method7040(arg5, local138, local122, local133);
				Static482.method7040(arg5, local138, local129, local133);
			} else {
				local142 = local26 < local10 ? Static394.anIntArray381[local10] : local26;
				local146 = local142 + arg2;
				local151 = arg2 - local142;
				Static482.method7040(arg5, local138, local122, local151);
				Static482.method7040(arg1, local151, local122, local146);
				Static482.method7040(arg5, local146, local122, local133);
				Static482.method7040(arg5, local138, local129, local151);
				Static482.method7040(arg1, local151, local129, local146);
				Static482.method7040(arg5, local146, local129, local133);
			}
		}
	}
}
