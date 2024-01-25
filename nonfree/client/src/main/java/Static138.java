import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!go", name = "t", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "[I")
	public static int[] anIntArray215;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "Lclient!pb;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_62 = new Class25(11, -2);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BIIII)I")
	public static int method2162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class229.anIntArray536[arg2 * 8192 / arg3] >> 1;
		return (local21 * arg1 >> 16) + (arg0 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)V")
	public static void method2164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static204.anInt3500 = arg3;
		Static329.anInt5895 = arg1;
		Static265.anInt4442 = arg2;
		Static437.anInt7354 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method2166(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static363.method5110(arg0, local13);
		} else if (arg1 instanceof Class185) {
			@Pc(25) Class185 local25 = (Class185) arg1;
			return local25.method4071(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
