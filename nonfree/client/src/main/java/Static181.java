import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_14 = new Class89(9, 0, 4, 1);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method3307() {
		@Pc(12) Class6_Sub9 local12 = Static560.method8089(Static391.aClass126_1, Static131.aClass208_23);
		local12.aClass6_Sub40_Sub2_1.method8589(Static323.method5374());
		local12.aClass6_Sub40_Sub2_1.method8561(Static321.anInt6137);
		local12.aClass6_Sub40_Sub2_1.method8561(Static356.anInt6630);
		local12.aClass6_Sub40_Sub2_1.method8589(Static348.aClass6_Sub22_19.aClass15_Sub11_1.method4165());
		Static263.method4681(local12);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!kf;")
	public static Class6_Sub27 method3308(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub27_Sub2");
			@Pc(15) Class6_Sub27 local15 = (Class6_Sub27) local11.getDeclaredConstructor().newInstance();
			local15.method6791(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub27_Sub1 local28 = new Class6_Sub27_Sub1();
			local28.method6791(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method3309(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static253.anInt5086 == 2) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[0]);
				Static574.aClass334Array1[1].method8104(Static322.aClass352Array1[1]);
			} else if (Static253.anInt5086 == 3) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[0]);
				Static574.aClass334Array1[1].method8104(Static322.aClass352Array1[1]);
				Static574.aClass334Array1[2].method8104(Static322.aClass352Array1[2]);
			} else {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[0]);
				Static574.aClass334Array1[1].method8104(Static322.aClass352Array1[1]);
				Static574.aClass334Array1[2].method8104(Static322.aClass352Array1[2]);
				Static574.aClass334Array1[3].method8104(Static322.aClass352Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static253.anInt5086 == 2) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[2]);
			} else if (Static253.anInt5086 == 3) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[3]);
				Static574.aClass334Array1[1].method8104(Static322.aClass352Array1[4]);
			} else {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[4]);
				Static574.aClass334Array1[1].method8104(Static322.aClass352Array1[5]);
				Static574.aClass334Array1[2].method8104(Static322.aClass352Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static253.anInt5086 == 2) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[3]);
				return;
			}
			if (Static253.anInt5086 == 3) {
				Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[5]);
				return;
			}
			Static574.aClass334Array1[0].method8104(Static322.aClass352Array1[7]);
		}
	}
}
