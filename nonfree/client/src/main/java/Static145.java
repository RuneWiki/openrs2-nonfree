import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1113 = Static64.method1101("(Y<)4col>");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
	public static int[] anIntArray216 = new int[2048];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[B)V")
	public static void method2493(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = 0;
		while (true) {
			while (local11 < arg0.length) {
				@Pc(29) int local29 = (arg0[local11++] & 0xFF) * 64 - Static200.anInt4248;
				@Pc(41) int local41 = (arg0[local11++] & 0xFF) * 64 - Static108.anInt2405;
				@Pc(75) byte local75;
				@Pc(68) int local68;
				if (local29 > 0 && local41 > 0 && Static3.anInt75 > local29 + 64 && Static87.anInt2017 > local41 + 64) {
					local68 = local29 >> 6;
					@Pc(101) int local101 = Static87.anInt2017 - local41 - 1 >> 6;
					for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
						for (@Pc(107) int local107 = -64; local107 < 0; local107++) {
							local75 = arg0[local11++];
							if (local75 != 0) {
								if (Static7.aByteArrayArrayArray1[local68][local101] == null) {
									Static7.aByteArrayArrayArray1[local68][local101] = new byte[4096];
								}
								Static7.aByteArrayArrayArray1[local68][local101][(-(local107 + 1) << 6) + local103] = local75;
								@Pc(150) byte local150 = arg0[local11++];
								if (Static72.aByteArrayArrayArray7[local68][local101] == null) {
									Static72.aByteArrayArrayArray7[local68][local101] = new byte[4096];
								}
								Static72.aByteArrayArrayArray7[local68][local101][(-(local107 + 1) << 6) + local103] = local150;
							}
						}
					}
				} else {
					for (local68 = -4096; local68 < 0; local68++) {
						local75 = arg0[local11++];
						if (local75 != 0) {
							local11++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/Object;Lclient!mi;B)V")
	public static void method2494(@OriginalArg(0) Object arg0, @OriginalArg(1) Class72 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static186.method3115(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass62_1 != null && local7.aClass62_1.aLong84 == arg3) {
			return true;
		} else if (local7.aClass65_1 != null && local7.aClass65_1.aLong85 == arg3) {
			return true;
		} else if (local7.aClass119_1 != null && local7.aClass119_1.aLong163 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1124; local46++) {
				if (local7.aClass83Array3[local46].aLong118 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
