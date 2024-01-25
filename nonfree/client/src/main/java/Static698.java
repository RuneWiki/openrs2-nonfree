import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static698 {

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "[I")
	public static int[] anIntArray610;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "[I")
	public static final int[] anIntArray611 = new int[13];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
	public static void method9142(@OriginalArg(0) int arg0) {
		Static167.aClass400_1 = Static532.aClass400_3;
		Static707.anInt11053 = arg0;
		Static293.anInt5245 = 2;
		Static441.method6405(true, "", Static364.aString94.equals(""), Static364.aString94);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public static void method9143() {
		Static670.aClass298_1 = new Class298(8);
		Static604.anInt9835 = 0;
		for (@Pc(25) Class19_Sub9 local25 = (Class19_Sub9) Static296.aClass66_5.method1381(); local25 != null; local25 = (Class19_Sub9) Static296.aClass66_5.method1380()) {
			local25.method6778();
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIB)I")
	public static int method9144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
