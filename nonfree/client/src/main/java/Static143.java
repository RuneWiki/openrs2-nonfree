import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
	public static int anInt3376;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_15;

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "Lclient!c;")
	public static Class10 aClass10_112;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_984 = Static38.method685(" <col=ffff00>");

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "[I")
	public static int[] anIntArray297 = new int[50];

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!ai;")
	private static Class6 aClass6_987 = Static38.method685("Select a world");

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_985 = aClass6_987;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_986 = Static38.method685("Hidden)2");

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_988 = Static38.method685("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "[I")
	public static int[] anIntArray299 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[I[I[Lclient!de;)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class18[] arg4) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(12) int local12 = arg1 - 1;
		@Pc(16) int local16 = arg0 + 1;
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(26) Class18 local26 = arg4[local22];
		arg4[local22] = arg4[arg1];
		arg4[arg1] = local26;
		while (local16 > local12) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(73) int local73;
			@Pc(80) int local80;
			do {
				local16--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg3[local43] == 2) {
						local80 = local26.anInt737;
						local73 = arg4[local16].anInt737;
					} else if (arg3[local43] == 1) {
						local73 = arg4[local16].anInt744;
						if (local73 == -1 && arg2[local43] == 1) {
							local73 = 2001;
						}
						local80 = local26.anInt744;
						if (local80 == -1 && arg2[local43] == 1) {
							local80 = 2001;
						}
					} else if (arg3[local43] == 3) {
						local73 = arg4[local16].aBoolean30 ? 1 : 0;
						local80 = local26.aBoolean30 ? 1 : 0;
					} else {
						local73 = arg4[local16].anInt738;
						local80 = local26.anInt738;
					}
					if (local73 != local80) {
						if ((arg2[local43] != 1 || local73 <= local80) && (arg2[local43] != 0 || local80 <= local73)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local12++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg3[local43] == 2) {
						local73 = arg4[local12].anInt737;
						local80 = local26.anInt737;
					} else if (arg3[local43] == 1) {
						local73 = arg4[local12].anInt744;
						local80 = local26.anInt744;
						if (local80 == -1 && arg2[local43] == 1) {
							local80 = 2001;
						}
						if (local73 == -1 && arg2[local43] == 1) {
							local73 = 2001;
						}
					} else if (arg3[local43] == 3) {
						local80 = local26.aBoolean30 ? 1 : 0;
						local73 = arg4[local12].aBoolean30 ? 1 : 0;
					} else {
						local80 = local26.anInt738;
						local73 = arg4[local12].anInt738;
					}
					if (local80 != local73) {
						if ((arg2[local43] != 1 || local73 >= local80) && (arg2[local43] != 0 || local80 >= local73)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local12 < local16) {
				@Pc(317) Class18 local317 = arg4[local12];
				arg4[local12] = arg4[local16];
				arg4[local16] = local317;
			}
		}
		method2223(local16, arg1, arg2, arg3, arg4);
		method2223(arg0, local16 + 1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public static void method2224() {
		aClass6_985 = null;
		aClass6_987 = null;
		aClass6_984 = null;
		anIntArray298 = null;
		anIntArray297 = null;
		anIntArray299 = null;
		aClass10_112 = null;
		aClass6_988 = null;
		aClass6_986 = null;
		aClass10_Sub1_15 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
	public static int method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return (4096 - arg1) * arg0 + arg1 * arg2 >> 12;
	}
}
