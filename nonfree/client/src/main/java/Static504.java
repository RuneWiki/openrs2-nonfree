import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static504 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_159 = new Class274(64, 4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIIBILclient!ae;Lclient!eq;)V")
	public static void method7814(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class2_Sub2_Sub1 arg2, @OriginalArg(6) Class97 arg3) {
		Static556.method7705(arg0, arg3, arg1);
		Static189.aClass2_Sub2_Sub1_1 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
	public static boolean method7816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z")
	public static boolean method7825(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
