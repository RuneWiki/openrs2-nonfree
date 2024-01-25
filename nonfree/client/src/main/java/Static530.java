import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array14;

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	public static int anInt8943 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIII)V")
	public static void method7638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg2 * Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413() >> 8;
		if (local19 == 0 || arg0 == -1) {
			return;
		}
		if (!Static152.aBoolean200 && Static252.anInt4340 != -1 && Static41.method691(51 - 51) && !Static672.method9267()) {
			Static57.aClass5_Sub16_Sub4_2 = Static193.method7063();
			@Pc(57) Class5_Sub16_Sub4 local57 = Static45.method8835(Static57.aClass5_Sub16_Sub4_2);
			Static645.method9008(local57);
		}
		Static335.method5111(local19, Static367.aClass208_141, arg0);
		Static376.method5512(-1, 255);
		Static152.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!cn;B)V")
	public static void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2) {
		Static149.aClass73_7 = arg2;
		Static639.anInt10403 = arg0;
		Static440.anInt7534 = arg1;
	}
}
