import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!wt;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[Lclient!vi;")
	public static final Class2_Sub52[] aClass2_Sub52Array1 = new Class2_Sub52[300];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ol;)V")
	public static void method128(@OriginalArg(1) Class2_Sub8 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static78.anInt1437; local3++) {
			@Pc(9) int local9 = arg0.method5173();
			@Pc(13) int local13 = arg0.method5211();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static4.aClass234_Sub1Array1[local9] != null) {
				Static4.aClass234_Sub1Array1[local9].anInt7085 = local13;
			}
		}
	}
}
