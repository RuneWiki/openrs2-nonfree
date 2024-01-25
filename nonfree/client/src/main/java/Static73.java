import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!op;")
	public static final Class275 aClass275_8 = new Class275("", 21);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "S")
	public static short aShort43 = 320;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
	public static final int[] anIntArray175 = new int[32];

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method3135() {
		Static36.aBoolean37 = true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIFIIZI)[I")
	public static int[] method3137(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub8_Sub15 local10 = new Class6_Sub8_Sub15();
		local10.aBoolean405 = true;
		local10.anInt5361 = 8;
		local10.anInt5360 = 8;
		local10.anInt5367 = 35;
		local10.anInt5364 = (int) (arg0 * 4096.0F);
		local10.anInt5371 = 4;
		local10.method8936();
		Static497.method7321(2048, 1);
		local10.method4916(0, local6);
		return local6;
	}
}
