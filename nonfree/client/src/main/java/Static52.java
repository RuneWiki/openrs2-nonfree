import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!pk;")
	public static Class132 aClass132_17;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!wn;")
	public static Class182 aClass182_5 = new Class182();

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt1146 = 100;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!wn;")
	public static Class182 aClass182_6 = new Class182();

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
	public static int[] anIntArray81 = new int[50];

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString44 = " is already on your friend list.";

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
	public static void method839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class8_Sub1_Sub6 local13 = Static181.method2779(10, arg3);
		local13.method931();
		local13.anInt1289 = arg2;
		local13.anInt1286 = arg0;
		local13.anInt1284 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method840(@OriginalArg(1) String[] arg0) {
		@Pc(4) String[] local4 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local4[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local4[local18] = local4[local18] + arg0[local18];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)[Lclient!p;")
	public static Class126[] method841() {
		if (Static203.aClass126Array1 == null) {
			@Pc(20) Class126[] local20 = Static209.method3310(Static199.aClass17_3);
			@Pc(22) int local22 = 0;
			@Pc(26) Class126[] local26 = new Class126[local20.length];
			label52: for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
				@Pc(40) Class126 local40 = local20[local28];
				if ((local40.anInt3882 <= 0 || local40.anInt3882 >= 24) && local40.anInt3884 >= 800 && local40.anInt3887 >= 600) {
					for (@Pc(64) int local64 = 0; local64 < local22; local64++) {
						@Pc(71) Class126 local71 = local26[local64];
						if (local71.anInt3884 == local40.anInt3884 && local71.anInt3887 == local40.anInt3887) {
							if (local40.anInt3882 > local71.anInt3882) {
								local26[local64] = local40;
							}
							continue label52;
						}
					}
					local26[local22] = local40;
					local22++;
				}
			}
			Static203.aClass126Array1 = new Class126[local22];
			Static301.method495(local26, 0, Static203.aClass126Array1, 0, local22);
			@Pc(125) int[] local125 = new int[Static203.aClass126Array1.length];
			for (@Pc(127) int local127 = 0; local127 < Static203.aClass126Array1.length; local127++) {
				@Pc(135) Class126 local135 = Static203.aClass126Array1[local127];
				local125[local127] = local135.anInt3884 * local135.anInt3887;
			}
			Static226.method3503(Static203.aClass126Array1, local125);
		}
		return Static203.aClass126Array1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public static void method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class8_Sub1_Sub6 local4 = Static181.method2779(13, arg0);
		local4.method931();
		local4.anInt1284 = arg1;
	}
}
