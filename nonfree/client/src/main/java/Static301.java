import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_119 = new Class40(60, 5);

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
	public static int anInt4912 = 104;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)V")
	public static void method4219(@OriginalArg(1) int arg0) {
		if (arg0 == Static63.anInt1007) {
			return;
		}
		anInt4912 = Static473.anInt7969 = Static500.anIntArray647[arg0];
		Static142.method2152();
		Static56.anIntArrayArray8 = new int[anInt4912][Static473.anInt7969];
		Static236.anIntArrayArray50 = new int[anInt4912][Static473.anInt7969];
		Static127.anIntArrayArrayArray9 = new int[4][anInt4912 >> 3][Static473.anInt7969 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static296.aClass295Array3[local42] = Static289.method4066(Static473.anInt7969, anInt4912);
		}
		Static393.aByteArrayArrayArray16 = new byte[4][anInt4912][Static473.anInt7969];
		Static145.method2166(Static473.anInt7969, anInt4912);
		Static353.method5291(anInt4912 >> 3, Static176.aClass121_5, Static473.anInt7969 >> 3);
		Static63.anInt1007 = arg0;
	}
}
