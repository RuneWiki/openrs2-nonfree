import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public static int anInt2670;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public static int anInt2679 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!pi;I)V")
	public static void method2178(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (Static202.aClass31_4 == null) {
			return;
		}
		try {
			Static202.aClass31_4.method952(0L);
			Static202.aClass31_4.method953(arg1, 24, arg0.aByteArray47);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static void method2180() {
		Static84.aClass172_14.method4346();
	}
}
