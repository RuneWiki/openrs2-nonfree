import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public static int anInt5702;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Lclient!jg;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_15 = new Class162(1, 4);

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[2048];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBIIIII)V")
	public static void method4822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static371.method5959(arg2);
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 - arg1;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(28) int local28 = arg2;
		@Pc(31) int local31 = -arg2;
		@Pc(33) int local33 = local19;
		@Pc(36) int local36 = -local19;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static46.anIntArrayArray4[arg4];
		@Pc(48) int local48 = arg0 - local19;
		Static306.method5239(local44, local48, arg3, arg0 - arg2);
		@Pc(60) int local60 = arg0 + local19;
		Static306.method5239(local44, local60, arg5, local48);
		Static306.method5239(local44, arg0 + arg2, arg3, local60);
		while (local28 > local15) {
			local40 += 2;
			local38 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				Static115.anIntArray123[local33] = local15;
				local33--;
				local36 -= local33 << 1;
			}
			local15++;
			@Pc(118) int[] local118;
			@Pc(125) int[] local125;
			@Pc(129) int local129;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			if (local31 >= 0) {
				local28--;
				if (local19 > local28) {
					local118 = Static46.anIntArrayArray4[local28 + arg4];
					local125 = Static46.anIntArrayArray4[arg4 - local28];
					local129 = Static115.anIntArray123[local28];
					local133 = local15 + arg0;
					local138 = arg0 - local15;
					local142 = local129 + arg0;
					local146 = arg0 - local129;
					Static306.method5239(local118, local146, arg3, local138);
					Static306.method5239(local118, local142, arg5, local146);
					Static306.method5239(local118, local133, arg3, local142);
					Static306.method5239(local125, local146, arg3, local138);
					Static306.method5239(local125, local142, arg5, local146);
					Static306.method5239(local125, local133, arg3, local142);
				} else {
					local118 = Static46.anIntArrayArray4[arg4 + local28];
					local125 = Static46.anIntArrayArray4[arg4 - local28];
					local129 = arg0 + local15;
					local133 = arg0 - local15;
					Static306.method5239(local118, local129, arg3, local133);
					Static306.method5239(local125, local129, arg3, local133);
				}
				local31 -= local28 << 1;
			}
			local118 = Static46.anIntArrayArray4[arg4 + local15];
			local125 = Static46.anIntArrayArray4[arg4 - local15];
			local129 = local28 + arg0;
			local133 = arg0 - local28;
			if (local15 >= local19) {
				Static306.method5239(local118, local129, arg3, local133);
				Static306.method5239(local125, local129, arg3, local133);
			} else {
				local138 = local33 >= local15 ? local33 : Static115.anIntArray123[local15];
				local142 = local138 + arg0;
				local146 = arg0 - local138;
				Static306.method5239(local118, local146, arg3, local133);
				Static306.method5239(local118, local142, arg5, local146);
				Static306.method5239(local118, local129, arg3, local142);
				Static306.method5239(local125, local146, arg3, local133);
				Static306.method5239(local125, local142, arg5, local146);
				Static306.method5239(local125, local129, arg3, local142);
			}
		}
	}
}
