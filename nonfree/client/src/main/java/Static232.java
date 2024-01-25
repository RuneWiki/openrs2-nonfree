import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "Lclient!da;")
	public static Class63 aClass63_6;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IB)V")
	public static void method3991(@OriginalArg(0) int arg0) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub19_1.method6303() == 0) {
			arg0 = -1;
		}
		if (Static257.anInt5006 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(32) Class365 local32 = Static114.aClass67_1.method1573(arg0);
			@Pc(36) Class251 local36 = local32.method8427();
			if (local36 == null) {
				arg0 = -1;
			} else {
				Static48.aClass298_12.method7284(new Point(local32.anInt9924, local32.anInt9929), local36.method6340(), local36.method6336(), local36.method6333(), Static617.aCanvas13);
				Static257.anInt5006 = arg0;
			}
		}
		if (arg0 == -1 && Static257.anInt5006 != -1) {
			Static48.aClass298_12.method7284(new Point(), -1, (int[]) null, -1, Static617.aCanvas13);
			Static257.anInt5006 = -1;
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(ILclient!dc;)Lclient!cv;")
	public static Class35 method3992(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(10) Class293 local10 = Static76.method1319()[arg0.method5633()];
		@Pc(17) Class15 local17 = Static582.method8112()[arg0.method5633()];
		@Pc(21) int local21 = arg0.method5624();
		@Pc(25) int local25 = arg0.method5624();
		@Pc(29) int local29 = arg0.method5610();
		@Pc(41) int local41 = arg0.method5610();
		@Pc(45) int local45 = arg0.method5624();
		@Pc(49) int local49 = arg0.method5585();
		@Pc(53) int local53 = arg0.method5585();
		return new Class35(local10, local17, local21, local25, local29, local41, local45, local49, local53);
	}
}
