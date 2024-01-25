import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "Lclient!f;")
	public static Class80 aClass80_20;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "[I")
	public static final int[] anIntArray639 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt7384 = -1;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt7386 = 0;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_41 = new Class27(512);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
	public static void method5721(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub1 local12 = Static258.method5559(arg0, 3);
		local12.method195();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5722() {
		for (@Pc(14) Class1_Sub2_Sub15 local14 = (Class1_Sub2_Sub15) Static136.aClass266_16.method6000(); local14 != null; local14 = (Class1_Sub2_Sub15) Static136.aClass266_16.method5994()) {
			@Pc(19) Class26_Sub2_Sub3 local19 = local14.aClass26_Sub2_Sub3_1;
			if (local19.aBoolean263) {
				local14.method6071();
				local19.method3158();
			} else if (local19.anInt3800 <= Static403.anInt6978) {
				local19.method3160(Static9.anInt248);
				if (local19.aBoolean263) {
					local14.method6071();
				} else {
					Static176.method2753(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public static void method5723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(0, 15);
		local8.method202();
		local8.anInt218 = arg0;
		local8.anInt214 = arg1;
	}
}
