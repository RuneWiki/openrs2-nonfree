import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
	public static final int[] anIntArray83 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ac;Z)V")
	public static void method1543(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.method7971();
		Static528.aClass186Array1 = new Class186[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static528.aClass186Array1[local14] = new Class186();
			Static528.aClass186Array1[local14].anInt4873 = arg0.method7971();
			Static528.aClass186Array1[local14].aString53 = arg0.method7939();
		}
		Static253.anInt4668 = arg0.method7971();
		Static281.anInt5189 = arg0.method7971();
		Static152.anInt2863 = arg0.method7971();
		Static337.aClass248_Sub1Array2 = new Class248_Sub1[Static281.anInt5189 + 1 - Static253.anInt4668];
		for (@Pc(65) int local65 = 0; local65 < Static152.anInt2863; local65++) {
			@Pc(71) int local71 = arg0.method7971();
			@Pc(79) Class248_Sub1 local79 = Static337.aClass248_Sub1Array2[local71] = new Class248_Sub1();
			local79.anInt8297 = arg0.method7974();
			local79.anInt8296 = arg0.method7940();
			local79.anInt8307 = Static253.anInt4668 + local71;
			local79.aString93 = arg0.method7939();
			local79.aString92 = arg0.method7939();
		}
		Static430.anInt7688 = arg0.method7940();
		Static369.aBoolean674 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZLjava/lang/String;IIII)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class11_Sub8 local11 = new Class11_Sub8();
		local11.anInt5618 = Static518.anInt9331 + arg4;
		local11.anInt5612 = arg6;
		local11.anInt5615 = arg0;
		local11.anInt5614 = arg3;
		local11.aString68 = arg2;
		local11.anInt5616 = arg1;
		local11.anInt5613 = arg5;
		Static337.aClass196_5.method4032(local11);
	}
}
