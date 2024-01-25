import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kv", name = "M", descriptor = "Lclient!ov;")
	public static Class179 aClass179_10;

	@OriginalMember(owner = "client!kv", name = "P", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!kv", name = "J", descriptor = "[I")
	public static final int[] anIntArray325 = new int[50];

	@OriginalMember(owner = "client!kv", name = "L", descriptor = "I")
	public static int anInt4311 = 0;

	@OriginalMember(owner = "client!kv", name = "O", descriptor = "Lclient!jr;")
	public static final Class127 aClass127_23 = new Class127(16);

	@OriginalMember(owner = "client!kv", name = "Q", descriptor = "I")
	public static int anInt4313 = 2;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
	public static void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static123.aClass21_Sub1_1.anInt868 != 0 && arg2 != 0 && Static205.anInt4113 < 50 && arg0 != -1) {
			Static192.aClass83Array1[Static205.anInt4113++] = new Class83((byte) 1, arg0, arg2, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[B)Z")
	public static boolean method3519(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		@Pc(12) int local12 = local8.method6053();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method6053() == 1;
		if (local28) {
			Static183.method3363(local8);
		}
		Static275.method4098(local8);
		return true;
	}
}
