import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString210 = "flash2:";

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI[B)I")
	public static int method4503(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static189.method3561(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ec;I)Lclient!sg;")
	public static Class184 method4504(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(7) Class184 local7 = new Class184();
		local7.anInt5404 = arg0.method4021();
		local7.aClass6_Sub2_Sub7_1 = Static333.method5536(local7.anInt5404);
		return local7;
	}
}
