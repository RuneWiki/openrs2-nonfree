import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_445 = new Class64(80, 4);

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Lclient!lt;")
	public static final Class215 aClass215_2 = new Class215("LIVE", 0);

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "[I")
	public static final int[] anIntArray684 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
	public static void method7402(@OriginalArg(1) byte arg0) {
		if (Static567.aByteArrayArrayArray21 == null) {
			Static567.aByteArrayArrayArray21 = new byte[4][Static38.anInt740][Static38.anInt741];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static38.anInt740; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static38.anInt741; local30++) {
					Static567.aByteArrayArrayArray21[local22][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!gba;II)V")
	public static void method7403(@OriginalArg(1) Class115 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static524.aBoolean617) {
			@Pc(13) Class59 local13 = Static466.anInt7871 == -1 ? null : Static53.aClass152_1.method3679(Static466.anInt7871);
			if (Static69.method1233(arg0).method4971() && (Static360.anInt6361 & 0x20) != 0 && (local13 == null || arg0.method3136(local13.anInt1575, Static466.anInt7871) != local13.anInt1575)) {
				Static100.method7901(arg0.anInt3464, false, true, Static238.aString94 + " -> " + arg0.aString33, 0L, 50, arg0.anInt3517, arg0.anInt3510, Static178.anInt3780, Static404.aString82);
			}
		}
		@Pc(82) String local82;
		for (@Pc(75) int local75 = 9; local75 >= 5; local75--) {
			local82 = Static97.method6651(arg0, local75);
			if (local82 != null) {
				Static100.method7901(arg0.anInt3464, false, true, arg0.aString33, (long) (local75 + 1), 1006, arg0.anInt3517, arg0.anInt3510, Static274.method4406(arg0, local75), local82);
			}
		}
		local82 = Static511.method843(arg0);
		if (local82 != null) {
			Static100.method7901(arg0.anInt3464, false, true, arg0.aString33, 0L, 10, arg0.anInt3517, arg0.anInt3510, arg0.anInt3493, local82);
		}
		for (@Pc(149) int local149 = 4; local149 >= 0; local149--) {
			@Pc(156) String local156 = Static97.method6651(arg0, local149);
			if (local156 != null) {
				Static100.method7901(arg0.anInt3464, false, true, arg0.aString33, (long) (local149 + 1), 4, arg0.anInt3517, arg0.anInt3510, Static274.method4406(arg0, local149), local156);
			}
		}
		if (!Static69.method1233(arg0).method4974()) {
			return;
		}
		if (arg0.aString30 == null) {
			Static100.method7901(arg0.anInt3464, false, true, "", 0L, 12, arg0.anInt3517, arg0.anInt3510, -1, Static275.aClass198_8.method4407(Static56.anInt953));
		} else {
			Static100.method7901(arg0.anInt3464, false, true, "", 0L, 12, arg0.anInt3517, arg0.anInt3510, -1, arg0.aString30);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[[[Lclient!fba;)V")
	public static void method7405(@OriginalArg(1) Class100[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class100[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class100 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass10_Sub5_1 instanceof Interface17) {
							((Interface17) local23.aClass10_Sub5_1).method7741();
						}
						if (local23.aClass10_Sub4_1 instanceof Interface17) {
							((Interface17) local23.aClass10_Sub4_1).method7741();
						}
						if (local23.aClass10_Sub4_2 instanceof Interface17) {
							((Interface17) local23.aClass10_Sub4_2).method7741();
						}
						if (local23.aClass10_Sub2_3 instanceof Interface17) {
							((Interface17) local23.aClass10_Sub2_3).method7741();
						}
						if (local23.aClass10_Sub2_2 instanceof Interface17) {
							((Interface17) local23.aClass10_Sub2_2).method7741();
						}
						for (@Pc(73) Class35 local73 = local23.aClass35_2; local73 != null; local73 = local73.aClass35_1) {
							@Pc(78) Class10_Sub1 local78 = local73.aClass10_Sub1_1;
							if (local78 instanceof Interface17) {
								((Interface17) local78).method7741();
							}
						}
					}
				}
			}
		}
	}
}
