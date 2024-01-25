import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_55 = new Class397(26, 6);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public static int anInt3283 = 0;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)Lclient!ika;")
	public static Class3_Sub2 method2977() {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(518);
		Static155.anIntArray176 = new int[4];
		Static155.anIntArray176[0] = (int) (Math.random() * 9.9999999E7D);
		Static155.anIntArray176[1] = (int) (Math.random() * 9.9999999E7D);
		Static155.anIntArray176[2] = (int) (Math.random() * 9.9999999E7D);
		Static155.anIntArray176[3] = (int) (Math.random() * 9.9999999E7D);
		local8.method2065(10);
		local8.method2018(Static155.anIntArray176[0]);
		local8.method2018(Static155.anIntArray176[1]);
		local8.method2018(Static155.anIntArray176[2]);
		local8.method2018(Static155.anIntArray176[3]);
		return local8;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method2978(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static140.method2390(0, arg0, arg1.length - 1, arg1);
	}
}
