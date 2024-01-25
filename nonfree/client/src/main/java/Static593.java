import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static593 {

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
	public static int anInt10029;

	@OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
	public static int anInt10031 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZILclient!ca;)V")
	public static void method8179(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		if (Static397.aBoolean583) {
			Static397.aBoolean583 = false;
			arg0 = 0;
		}
		if (Static1.aClass40_6 != null && Static1.aClass40_6.method1718(arg1)) {
			return;
		}
		Static1.aClass40_6 = arg1;
		Static207.aLong128 = Static582.method8056();
		Static96.anInt2771 = arg0;
		Static502.anInt7209 = arg0;
		if (Static502.anInt7209 == 0) {
			Static506.method7277();
			return;
		}
		Static272.aClass31_3 = Static70.aClass31_2;
		Static302.anInt6140 = Static539.anInt9345;
		Static260.aFloat123 = Static299.aFloat127;
		Static589.aFloat183 = Static461.aFloat161;
		Static56.anInt1870 = Static99.anInt2817;
		Static139.anInt3315 = Static465.anInt8296;
		Static415.aFloat155 = Static273.aFloat124;
		Static631.aFloat189 = Static95.aFloat69;
		Static298.aFloat126 = Static173.aFloat75;
		Static7.aFloat22 = Static384.aFloat141;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)Z")
	public static boolean method8180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static5.method442(arg0, arg1) & ((arg0 & 0x2000) != 0 | Static531.method7545(arg1, arg0) | Static329.method5521(arg0, arg1));
	}
}
