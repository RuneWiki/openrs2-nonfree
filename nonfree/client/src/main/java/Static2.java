import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!rn;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!kb;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt23 = 0;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	public static int anInt31 = 0;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	public static int anInt34 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
	public static void method24(@OriginalArg(0) int arg0) {
		Static152.anInt2876--;
		if (Static152.anInt2876 == arg0) {
			return;
		}
		Static326.method4272(Static73.aStringArray13, arg0 + 1, Static73.aStringArray13, arg0, Static152.anInt2876 - arg0);
		Static326.method4272(Static103.aStringArray19, arg0 + 1, Static103.aStringArray19, arg0, Static152.anInt2876 - arg0);
		Static326.method4269(Static153.anIntArray332, arg0 + 1, Static153.anIntArray332, arg0, Static152.anInt2876 - arg0);
		Static326.method4271(Static259.aShortArray87, arg0 + 1, Static259.aShortArray87, arg0, Static152.anInt2876 - arg0);
		Static326.method4268(Static259.aLongArray12, arg0 + 1, Static259.aLongArray12, arg0, Static152.anInt2876 - arg0);
		Static326.method4269(Static56.anIntArray99, arg0 + 1, Static56.anIntArray99, arg0, Static152.anInt2876 - arg0);
		Static326.method4269(Static196.anIntArray438, arg0 + 1, Static196.anIntArray438, arg0, Static152.anInt2876 - arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method25(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!ui;")
	public static Class3_Sub4_Sub21 method27(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub4_Sub21 local18 = (Class3_Sub4_Sub21) Static274.aClass33_14.method828((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static51.aClass155_28.method4121(5, arg0);
		local18 = new Class3_Sub4_Sub21();
		if (local30 != null) {
			local18.method4614(new Class3_Sub26(local30));
		}
		Static274.aClass33_14.method827(local18, (long) arg0);
		return local18;
	}
}
