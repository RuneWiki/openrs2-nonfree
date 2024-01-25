import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
	public static int anInt3988;

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "Lclient!bk;")
	public static Class6_Sub4_Sub2 aClass6_Sub4_Sub2_1;

	@OriginalMember(owner = "client!ks", name = "Z", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Lclient!um;")
	public static final Class244 aClass244_19 = new Class244();

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "[I")
	public static int[] anIntArray288 = new int[1];

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)V")
	public static void method3309() {
		for (@Pc(10) Class6_Sub23 local10 = (Class6_Sub23) Static428.aClass244_45.method5976(); local10 != null; local10 = (Class6_Sub23) Static428.aClass244_45.method5964()) {
			if (local10.anInt4208 > 0) {
				local10.anInt4208--;
			}
			if (local10.anInt4208 != 0) {
				if (local10.anInt4209 > 0) {
					local10.anInt4209--;
				}
				if (local10.anInt4209 == 0 && local10.anInt4218 >= 1 && local10.anInt4215 >= 1 && Static181.anInt3574 - 2 >= local10.anInt4218 && local10.anInt4215 <= Static117.anInt2450 - 2 && (local10.anInt4216 < 0 || Static44.method988(local10.anInt4216, local10.anInt4210))) {
					Static295.method4601(local10.anInt4218, local10.anInt4210, local10.anInt4219, local10.anInt4215, local10.anInt4214, local10.anInt4216, -1, local10.anInt4211);
					local10.anInt4209 = -1;
					if (local10.anInt4217 == local10.anInt4216 && local10.anInt4217 == -1) {
						local10.method6525();
					} else if (local10.anInt4216 == local10.anInt4217 && local10.anInt4220 == local10.anInt4214 && local10.anInt4210 == local10.anInt4213) {
						local10.method6525();
					}
				}
			} else if (local10.anInt4217 < 0 || Static44.method988(local10.anInt4217, local10.anInt4213)) {
				Static295.method4601(local10.anInt4218, local10.anInt4213, local10.anInt4219, local10.anInt4215, local10.anInt4220, local10.anInt4217, -1, local10.anInt4211);
				local10.method6525();
			}
		}
	}
}
