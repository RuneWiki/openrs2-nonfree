import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	public static int anInt6602;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_161 = new Class25(17, -1);

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	public static int anInt6606 = 0;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)I")
	public static int method5252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!za;I)V")
	public static void method5253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		Static28.aClass75_3 = arg2;
		Static57.aClass226ArrayArray1 = new Class226[arg1][arg0];
		if (Static27.anIntArray45 != null) {
			Static434.aClass141_4 = Static114.method1875(Static27.anIntArray45[4], Static27.anIntArray45[0], Static27.anIntArray45[5], Static27.anIntArray45[2], Static27.anIntArray45[3], Static27.anIntArray45[1]);
		}
		Static433.aClass226_2 = new Class226();
		Static114.method1874();
	}
}
