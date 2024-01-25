import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array15;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_108 = new Class92(36, 7);

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public static int anInt5426 = 0;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	public static int anInt5427 = -1;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	public static int anInt5428 = 0;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public static void method4532() {
		Static403.method5961(Static247.aClass92_91);
		Static109.aClass6_Sub1_Sub1_5.method6439(Static374.method5599());
		Static109.aClass6_Sub1_Sub1_5.method6453(Static348.anInt6272);
		Static109.aClass6_Sub1_Sub1_5.method6453(Static199.anInt3767);
		Static109.aClass6_Sub1_Sub1_5.method6439(Static291.aClass28_Sub1_1.anInt1038);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZILclient!eq;ILclient!fs;Lclient!ts;III)V")
	public static void method4533(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) Class239 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class260 local15 = Static244.aClass169_29.method3948(arg6);
		if (local15 == null || !local15.aBoolean487 || !local15.method6336(Static393.aClass207_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray531 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray531.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static429.anInt7656 == 4) {
					local47 = (int) Static265.aFloat51 & 0x3FFF;
				} else {
					local47 = (int) Static265.aFloat51 + Static439.anInt418 & 0x3FFF;
				}
				@Pc(61) int local61 = Class145.anIntArray279[local47];
				@Pc(65) int local65 = Class145.anIntArray280[local47];
				if (Static429.anInt7656 != 4) {
					local65 = local65 * 256 / (Static280.anInt5012 + 256);
					local61 = local61 * 256 / (Static280.anInt5012 + 256);
				}
				local33[local35 * 2] = (local65 * (local15.anIntArray531[local35 * 2] * 4 + arg0) + (arg5 + local15.anIntArray531[local35 * 2 + 1] * 4) * local61 >> 15) + arg4.anInt6898 / 2 + arg2;
				local33[local35 * 2 + 1] = arg7 + arg4.anInt6899 / 2 - (-((local15.anIntArray531[local35 * 2] * 4 + arg0) * local61) + local65 * (local15.anIntArray531[local35 * 2 - -1] * 4 + arg5) >> 15);
			}
			Static239.method3682(arg1, local33, local15.anInt7747, arg4.anIntArray479, arg4.anIntArray482);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg1.method5068(local33[local47 * 2], local33[local47 * 2 + 1], local33[local47 * 2 + 2], local33[local47 * 2 + 1 + 2], local15.anInt7740, arg3, arg2, arg7);
			}
			arg1.method5068(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt7740, arg3, arg2, arg7);
		}
		@Pc(265) Class87 local265 = null;
		if (local15.anInt7745 != -1) {
			local265 = local15.method6335(arg1, false);
			if (local265 != null) {
				Static231.method6536(arg7, arg0, arg3, arg5, local265, arg2, arg4);
			}
		}
		if (local15.aString70 == null) {
			return;
		}
		local35 = 0;
		if (local265 != null) {
			local35 = local265.method6554();
		}
		@Pc(298) Class29 local298 = Static440.aClass29_3;
		@Pc(300) Class166 local300 = Static8.aClass166_1;
		if (local15.anInt7751 == 1) {
			local298 = Static35.aClass29_1;
			local300 = Static58.aClass166_6;
		}
		if (local15.anInt7751 == 2) {
			local300 = Static237.aClass166_8;
			local298 = Static236.aClass29_2;
		}
		Static407.method6011(arg3, local298, arg5, local35, arg2, local15.anInt7729, arg4, local300, arg7, arg0, local15.aString70);
		return;
	}
}
