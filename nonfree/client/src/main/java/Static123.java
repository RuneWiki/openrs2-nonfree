import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZI)Z")
	public static boolean method4143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static599.method8607(arg1, arg0) || Static180.method2777(arg0, arg1) || Static431.method5477(arg1, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z")
	public static boolean method4146() {
		return Static257.aBoolean338;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
	public static void method4148(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static239.anInt4412;
		@Pc(11) int local11 = Static542.anInt9207;
		if (arg0 && Static57.aBoolean65) {
			local5 <<= 0x1;
			local11 = -local5;
		}
		Static213.aClass133_5.f(local11, local5);
	}
}
