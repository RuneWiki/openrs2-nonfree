import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "[Lclient!ga;")
	public static Class82[] aClass82Array2;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Lclient!te;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!of;")
	public static final Class174 aClass174_191 = new Class174("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Z")
	public static boolean method5484() {
		return Static360.aBoolean422;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(JB)V")
	public static void method5485(@OriginalArg(0) long arg0) {
		if (Static389.aClass227ArrayArrayArray3 != null) {
			if (Static27.anInt490 == 1 || Static27.anInt490 == 5) {
				Static49.method921(arg0);
			} else if (Static27.anInt490 == 4) {
				Static366.method5111(arg0);
			}
		}
		Static13.method239((long) Static172.anInt3107, Static413.aClass167_11);
		if (Static343.anInt5785 != -1) {
			Static275.method3806(Static343.anInt5785);
		}
		for (@Pc(40) int local40 = 0; local40 < Static100.anInt1815; local40++) {
			if (Static391.aBooleanArray22[local40]) {
				Static15.aBooleanArray3[local40] = true;
			}
			Static375.aBooleanArray21[local40] = Static391.aBooleanArray22[local40];
			Static391.aBooleanArray22[local40] = false;
		}
		Static185.anInt3401 = Static172.anInt3107;
		if (Static413.aClass167_11.method6024()) {
			Static185.aBoolean257 = true;
		}
		if (Static343.anInt5785 != -1) {
			Static100.anInt1815 = 0;
			Static61.method1152();
		}
		Static413.aClass167_11.H();
		Static384.method5329(Static413.aClass167_11);
		@Pc(86) int local86 = Static123.method1958();
		if (local86 == -1) {
			local86 = Static302.anInt5198;
		}
		if (local86 == -1) {
			local86 = Static122.anInt2179;
		}
		Static371.method5206(local86);
		Static68.method1252(Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557, Static46.anInt814);
		Static46.anInt814 = 0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BIII)I")
	public static int method5487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static264.anInt4384 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg0 - Static211.anInt278;
		@Pc(26) int local26 = arg1 - Static211.anInt276;
		for (@Pc(31) Class3_Sub16 local31 = (Class3_Sub16) Static211.aClass193_3.method4519(); local31 != null; local31 = (Class3_Sub16) Static211.aClass193_3.method4525()) {
			if (local31.anInt1896 == arg2) {
				@Pc(44) int local44 = local31.anInt1893;
				@Pc(47) int local47 = local31.anInt1897;
				@Pc(57) int local57 = Static211.anInt276 + local47 | Static211.anInt278 + local44 << 14;
				@Pc(76) int local76 = (local26 - local47) * (local26 - local47) + (local21 - local44) * (-local44 + local21);
				if (local14 < 0 || local16 > local76) {
					local14 = local57;
					local16 = local76;
				}
			}
		}
		return local14;
	}
}
