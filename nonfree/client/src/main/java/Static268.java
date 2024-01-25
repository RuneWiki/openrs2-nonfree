import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
	public static int anInt9015;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_158 = new Class254(38, 19);

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "Lclient!ce;")
	public static final Class49 aClass49_12 = new Class49();

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_63 = new Class245(4);

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_159 = new Class254(87, -1);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method7570(@OriginalArg(1) Class9 arg0) {
		for (@Pc(12) Class5_Sub2 local12 = (Class5_Sub2) Static574.aClass267_8.method6544(); local12 != null; local12 = (Class5_Sub2) Static574.aClass267_8.method6543()) {
			if (local12.aBoolean357) {
				local12.method3781(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIII)V")
	public static void method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static104.aClass6_Sub6_Sub1_4.anInt1155 != 0 && arg0 != 0 && Static521.anInt9062 < 50 && arg1 != -1) {
			Static360.aClass161Array1[Static521.anInt9062++] = new Class161((byte) 1, arg1, arg0, arg4, arg3, arg2);
		}
	}
}
