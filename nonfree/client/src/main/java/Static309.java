import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
	public static int anInt5881;

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "[I")
	public static final int[] anIntArray332 = new int[5];

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIII)V")
	public static void method4868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg2);
		@Pc(15) int local15 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg3);
		@Pc(21) int local21 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg0);
		@Pc(27) int local27 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1);
		for (@Pc(29) int local29 = local9; local29 <= local15; local29++) {
			Static197.method3240(local27, Static16.anIntArrayArray2[local29], local21, arg4);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V")
	public static void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static588.anInt9671 = arg0;
		Static342.anInt6251 = arg2;
		Static491.anInt8247 = arg3;
		Static121.anInt2492 = arg1;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)V")
	public static void method4879() {
		Static505.aClass340_50.method8000();
		Static598.aClass340_61.method8000();
		Static399.aClass340_41.method8000();
		Static553.aClass340_57.method8000();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBLjava/awt/Canvas;I)Lclient!hca;")
	public static Class5_Sub26 method4880(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) Class local16 = Class.forName("Class5_Sub26_Sub2");
			@Pc(20) Class5_Sub26 local20 = (Class5_Sub26) local16.getDeclaredConstructor().newInstance();
			local20.method3764(arg2, arg0, arg1);
			return local20;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class5_Sub26_Sub1 local33 = new Class5_Sub26_Sub1();
			local33.method3764(arg2, arg0, arg1);
			return local33;
		}
	}
}
