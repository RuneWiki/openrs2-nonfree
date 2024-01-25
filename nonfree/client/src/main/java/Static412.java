import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
	public static int anInt6773;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_239 = new Class103(8, 0);

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
	public static boolean aBoolean743 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!mh;)Z")
	public static boolean method5314(@OriginalArg(1) Interface8 arg0) {
		@Pc(15) Class68 local15 = Static341.aClass75_4.method1616(arg0.method4623());
		if (local15.anInt1800 == -1) {
			return true;
		} else {
			@Pc(28) Class204 local28 = Static355.aClass263_4.method5835(local15.anInt1800);
			return local28.anInt5707 == -1 ? true : local28.method4496();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lclient!jk;")
	public static Class124 method5315(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static87.aClass124ArrayArray7[local7] == null || Static87.aClass124ArrayArray7[local7][local17] == null) {
			@Pc(31) boolean local31 = Static69.method1137(local7);
			if (!local31) {
				return null;
			}
		}
		return Static87.aClass124ArrayArray7[local7][local17];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZII)I")
	public static int method5316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg2 > arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	public static void method5317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		if (arg0 != Static395.anInt6592) {
			Static119.anIntArray146 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static119.anIntArray146[local18] = (local18 << 12) / arg0;
			}
			Static80.anInt1499 = arg0 * 32;
			Static395.anInt6592 = arg0;
			Static247.anInt4469 = arg0 - 1;
		}
		if (arg1 == Static186.anInt3223) {
			return;
		}
		if (Static395.anInt6592 == arg1) {
			Static419.anIntArray472 = Static119.anIntArray146;
		} else {
			Static419.anIntArray472 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static419.anIntArray472[local18] = (local18 << 12) / arg1;
			}
		}
		Static452.anInt7487 = arg1 - 1;
		Static186.anInt3223 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BD)V")
	public static void method5318(@OriginalArg(1) double arg0) {
		if (Static348.aDouble9 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static127.anIntArray157[local7] = local19 <= 255 ? local19 : 255;
		}
		Static348.aDouble9 = arg0;
	}
}
