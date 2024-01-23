import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
	public static int anInt77;

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!a", name = "S", descriptor = "Lclient!vm;")
	public static Class171 aClass171_1 = new Class171();

	@OriginalMember(owner = "client!a", name = "U", descriptor = "I")
	public static int anInt74 = 0;

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
	public static int anInt78 = 2301979;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBI)V")
	public static void method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = -arg2;
		@Pc(28) int local28 = Static223.method941(arg0 + arg2, Static88.anInt2052, Static102.anInt2239);
		@Pc(30) int local30 = -1;
		@Pc(39) int local39 = Static223.method941(arg0 - arg2, Static88.anInt2052, Static102.anInt2239);
		Static89.method1538(Static57.anIntArrayArray9[arg3], local28, local39, arg1);
		@Pc(49) int local49 = arg2;
		while (local49 > local16) {
			local30 += 2;
			local19 += local30;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(99) int local99;
			@Pc(108) int local108;
			if (local19 > 0) {
				local49--;
				local73 = arg3 - local49;
				local77 = local49 + arg3;
				if (Static152.anInt3532 <= local77 && Static223.anInt1245 >= local73) {
					local99 = Static223.method941(arg0 + local16, Static88.anInt2052, Static102.anInt2239);
					local108 = Static223.method941(arg0 - local16, Static88.anInt2052, Static102.anInt2239);
					if (Static223.anInt1245 >= local77) {
						Static89.method1538(Static57.anIntArrayArray9[local77], local99, local108, arg1);
					}
					if (Static152.anInt3532 <= local73) {
						Static89.method1538(Static57.anIntArrayArray9[local73], local99, local108, arg1);
					}
				}
				local19 -= local49 << 1;
			}
			local16++;
			local73 = arg3 - local16;
			local77 = arg3 + local16;
			if (local77 >= Static152.anInt3532 && Static223.anInt1245 >= local73) {
				local99 = Static223.method941(local49 + arg0, Static88.anInt2052, Static102.anInt2239);
				local108 = Static223.method941(arg0 - local49, Static88.anInt2052, Static102.anInt2239);
				if (Static223.anInt1245 >= local77) {
					Static89.method1538(Static57.anIntArrayArray9[local77], local99, local108, arg1);
				}
				if (Static152.anInt3532 <= local73) {
					Static89.method1538(Static57.anIntArrayArray9[local73], local99, local108, arg1);
				}
			}
		}
	}
}
