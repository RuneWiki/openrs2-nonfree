import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static423 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_110 = new Class231("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)I")
	public static int method5707(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
	public static boolean method5708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static289.method4312(arg1, arg0) || Static371.method5157(arg0, arg1);
	}
}
