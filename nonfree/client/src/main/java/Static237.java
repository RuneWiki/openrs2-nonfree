import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_147 = new Class214(72, -1);

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[Lclient!id;")
	public static Class114_Sub1[] aClass114_Sub1Array3 = new Class114_Sub1[0];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3118(@OriginalArg(0) String arg0) {
		return Static428.method5379(arg0, 10);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIB)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) Class1_Sub3_Sub13 local17 = Static397.method4998(10, arg1);
		local17.method3459();
		local17.anInt4297 = arg0;
		local17.anInt4301 = arg2;
		local17.anInt4295 = arg3;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public static void method3121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static336.aClass106_Sub1_1.anInt5696 != 0 && arg0 != 0 && Static353.anInt5858 < 50 && arg1 != -1) {
			Static104.aClass98Array2[Static353.anInt5858++] = new Class98((byte) 2, arg1, arg0, arg2, arg3, 0);
		}
	}
}
