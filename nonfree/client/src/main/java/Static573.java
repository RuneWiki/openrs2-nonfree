import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public static int anInt9368;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
	public static void method7838() throws Exception_Sub1 {
		if (Static634.anInt10113 == 1) {
			Static371.aClass143_7.method6196(Static435.anInt7679, Static437.anInt7720);
		} else {
			Static371.aClass143_7.method6196(0, 0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!iw;I)V")
	public static void method7839(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static74.anInt1181; local5++) {
			@Pc(10) int local10 = Static450.anIntArray436[local5];
			@Pc(14) Class41_Sub1_Sub1_Sub3_Sub2 local14 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local10];
			@Pc(18) int local18 = arg0.method3642();
			if ((local18 & 0x20) != 0) {
				local18 += arg0.method3642() << 8;
			}
			if ((local18 & 0x100) != 0) {
				local18 += arg0.method3642() << 16;
			}
			Static207.method2882(local18, arg0, local10, local14);
		}
	}
}
