import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static int anInt527 = 0;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
	public static boolean aBoolean29 = true;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	public static int anInt535 = -1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!hc;ZLclient!hc;Lclient!hc;)V")
	public static void method252(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) Class51 arg2) {
		Static138.aClass51_46 = arg0;
		Static264.aClass51_88 = arg2;
		Static121.aClass51_41 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method253(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static18.aBooleanArray1[arg0]) {
			return;
		}
		Static57.aClass51_21.method1853(arg0);
		if (Static80.aClass122ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static80.aClass122ArrayArray1[arg0].length; local29++) {
			if (Static80.aClass122ArrayArray1[arg0][local29] != null) {
				if (Static80.aClass122ArrayArray1[arg0][local29].anInt4656 == 2) {
					local27 = false;
				} else {
					Static80.aClass122ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static80.aClass122ArrayArray1[arg0] = null;
		}
		Static18.aBooleanArray1[arg0] = false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
	public static void method254(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static156.method2772(arg0)) {
			return;
		}
		@Pc(23) Class122[] local23 = Static80.aClass122ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class122 local31 = local23[local25];
			if (local31.anObjectArray18 != null) {
				@Pc(38) Class1_Sub30 local38 = new Class1_Sub30();
				local38.anObjectArray32 = local31.anObjectArray18;
				local38.aClass122_18 = local31;
				Static136.method2541(local38, 2000000);
			}
		}
	}
}
