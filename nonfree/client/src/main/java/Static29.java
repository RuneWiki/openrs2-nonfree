import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!wia;")
	public static Class386 aClass386_6;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!wia;I)V")
	public static void method651(@OriginalArg(0) Class386 arg0) {
		Static273.anInt4736 = 0;
		Static620.anInt10428 = 0;
		Static319.aClass376_5 = new Class376();
		Static602.aClass12_Sub7_Sub2_Sub1Array2 = new Class12_Sub7_Sub2_Sub1[1024];
		Static128.aClass12_Sub4Array1 = new Class12_Sub4[Static158.anIntArray254[Class12_Sub2_Sub3_Sub1.lb] + 1];
		Static606.anInt10225 = 0;
		Static213.anInt4036 = 0;
		Static492.method7264(arg0);
		Static150.method2369(arg0);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
	public static int method654() {
		return Static568.anInt9804++;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public static void method658(@OriginalArg(0) int arg0) {
		Static404.anInt7413 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public static void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 6);
		local9.method2817();
		local9.anInt3419 = arg1;
	}
}
