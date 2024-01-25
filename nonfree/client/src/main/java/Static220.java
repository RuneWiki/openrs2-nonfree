import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array38;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
	public static int anInt4427 = 0;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_6 = new Class136("", 10);

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	public static int anInt4431 = 0;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!ab;")
	public static Class3 aClass3_10 = null;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!vt;ILjava/lang/String;)I")
	public static int method3900(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt6669;
		@Pc(10) byte[] local10 = Static280.method4691(arg1);
		arg0.method5762(local10.length);
		arg0.anInt6669 += Static169.aClass25_3.method345(local10, arg0.aByteArray100, arg0.anInt6669, local10.length, 0);
		return arg0.anInt6669 - local6;
	}
}
