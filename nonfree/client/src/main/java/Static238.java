import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
	public static int anInt4224;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "[I")
	public static final int[] anIntArray478 = new int[14];

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Lclient!o;")
	public static final Class171 aClass171_4 = new Class171("LIVE", 0);

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public static int anInt4220 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3917(@OriginalArg(1) String arg0) {
		@Pc(11) String local11 = Static298.method4598(Static21.method260(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BB)[B")
	public static byte[] method3919(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static400.method1877(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!b;II)Lclient!rm;")
	public static Class3_Sub37 method3920(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method224(arg1);
		return local8 == null ? null : new Class3_Sub37(local8);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	public static void method3921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static229.method3783(Static21.aClass244_8);
		}
		if (arg1 == 1) {
			Static229.method3783(Static62.aClass244_17);
		}
		Static23.aClass3_Sub5_Sub1_1.method2756(Static322.aClass89_25.method1847(82) ? 1 : 0);
		Static23.aClass3_Sub5_Sub1_1.method2732(Static21.anInt265 + arg0);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg2 + Static103.anInt2044);
		Static109.anInt2145 = arg2;
		Static361.anInt6050 = arg0;
		Static66.aBoolean72 = false;
		Static329.method5024();
	}
}
