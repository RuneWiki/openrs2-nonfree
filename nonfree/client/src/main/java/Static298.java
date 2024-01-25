import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray220 = new int[32];

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "J")
	public static long aLong137 = -1L;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray221 = new int[50];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BILjava/lang/String;II)V")
	public static void method3453(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class20 local8 = Static244.method3731(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(19) Class3_Sub7 local19 = new Class3_Sub7();
			local19.aString5 = arg1;
			local19.anInt377 = arg0;
			local19.anObjectArray1 = local8.anObjectArray30;
			local19.aClass20_2 = local8;
			Static185.method2811(local19);
		}
		if (Static178.anInt3225 != 11 || !Static87.method1164(local8).method4620(arg0 - 1)) {
			return;
		}
		@Pc(62) Class3_Sub48 local62;
		if (arg0 == 1) {
			local62 = Static89.method1200(Static129.aClass286_24, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 2) {
			local62 = Static89.method1200(Static568.aClass286_125, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 3) {
			local62 = Static89.method1200(Static188.aClass286_33, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 4) {
			local62 = Static89.method1200(Static81.aClass286_18, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 5) {
			local62 = Static89.method1200(Static583.aClass286_100, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 6) {
			local62 = Static89.method1200(Static688.aClass286_7, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 7) {
			local62 = Static89.method1200(Static158.aClass286_28, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 8) {
			local62 = Static89.method1200(Static371.aClass286_64, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 9) {
			local62 = Static89.method1200(Static343.aClass286_57, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
		if (arg0 == 10) {
			local62 = Static89.method1200(Static454.aClass286_77, Static532.aClass400_3.aClass399_2);
			Static19.method320(arg2, local62, local8.anInt595, arg3);
			Static532.aClass400_3.method9223(local62);
		}
	}
}
