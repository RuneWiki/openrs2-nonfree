import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[200];

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public static int anInt6142 = 0;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString400 = "Loaded title screen";

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)V")
	public static void method5193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(7, arg0);
		local8.method4790();
		local8.anInt5687 = arg1;
	}
}
