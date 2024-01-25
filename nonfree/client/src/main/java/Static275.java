import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array7;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString43 = null;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "F")
	public static float aFloat105 = 1024.0F;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZIII)Lclient!kaa;")
	public static Class4_Sub28 method3975(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub28 local7 = new Class4_Sub28();
		local7.anInt4697 = arg3;
		local7.anInt4696 = arg2;
		Static242.aClass66_17.method1985(local7, (long) arg0);
		Static242.method3572(arg3);
		@Pc(26) Class199 local26 = Static569.method7534(arg0);
		if (local26 != null) {
			Static331.method4565(local26);
		}
		if (Static451.aClass199_11 != null) {
			Static331.method4565(Static451.aClass199_11);
			Static451.aClass199_11 = null;
		}
		Static258.method3731();
		if (local26 != null) {
			Static284.method4095(!arg1, local26);
		}
		if (!arg1) {
			Static237.method3391(arg3);
		}
		if (!arg1 && Static77.anInt1630 != -1) {
			Static135.method2426(Static77.anInt1630, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!bt;Lclient!ha;Z)V")
	public static void method3980(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(10) Class51[] local10 = Static682.method1651(arg0, Static389.anInt5686);
		Static359.aClass17Array11 = new Class17[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static359.aClass17Array11[local16] = arg1.method8147(local10[local16], true);
		}
		local10 = Static682.method1651(arg0, Static114.anInt2222);
		Static169.aClass17Array5 = new Class17[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static169.aClass17Array5[local43] = arg1.method8147(local10[local43], true);
		}
		local10 = Static682.method1651(arg0, Static312.anInt4876);
		aClass17Array7 = new Class17[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			aClass17Array7[local74] = arg1.method8147(local10[local74], true);
		}
		local10 = Static682.method1651(arg0, Static41.anInt850);
		Static404.aClass17Array15 = new Class17[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static404.aClass17Array15[local105] = arg1.method8147(local10[local105], true);
		}
		local10 = Static682.method1651(arg0, Static110.anInt2179);
		Static455.aClass17Array16 = new Class17[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static455.aClass17Array16[local136] = arg1.method8147(local10[local136], true);
		}
		local10 = Static682.method1651(arg0, Static206.anInt3355);
		Static384.aClass17Array12 = new Class17[local10.length];
		for (@Pc(167) int local167 = 0; local167 < local10.length; local167++) {
			Static384.aClass17Array12[local167] = arg1.method8147(local10[local167], true);
		}
		local10 = Static682.method1651(arg0, Static148.anInt2698);
		Static404.aClass17Array14 = new Class17[local10.length];
		for (@Pc(198) int local198 = 0; local198 < local10.length; local198++) {
			Static404.aClass17Array14[local198] = arg1.method8147(local10[local198], true);
		}
		local10 = Static682.method1651(arg0, Static416.anInt5990);
		Static388.aClass17Array13 = new Class17[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static388.aClass17Array13[local225] = arg1.method8147(local10[local225], true);
		}
		local10 = Static682.method1651(arg0, Static201.anInt3303);
		Static300.aClass17Array9 = new Class17[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static300.aClass17Array9[local256] = arg1.method8147(local10[local256], true);
		}
		local10 = Static682.method1651(arg0, Static303.anInt4791);
		Static338.aClass17Array10 = new Class17[local10.length];
		for (@Pc(294) int local294 = 0; local294 < local10.length; local294++) {
			Static338.aClass17Array10[local294] = arg1.method8147(local10[local294], true);
		}
		local10 = Static682.method1651(arg0, Static6.anInt87);
		Static152.aClass17Array4 = new Class17[local10.length];
		for (@Pc(321) int local321 = 0; local321 < local10.length; local321++) {
			Static152.aClass17Array4[local321] = arg1.method8147(local10[local321], true);
		}
		local10 = Static682.method1651(arg0, Static220.anInt3540);
		Static638.aClass17Array18 = new Class17[local10.length];
		for (@Pc(352) int local352 = 0; local352 < local10.length; local352++) {
			Static638.aClass17Array18[local352] = arg1.method8147(local10[local352], true);
		}
		Static217.aClass17_32 = arg1.method8147(Static682.method1662(arg0, Static654.anInt10323, 0), true);
		Static93.aClass17_14 = arg1.method8147(Static682.method1662(arg0, Static36.anInt795, 0), true);
		local10 = Static682.method1651(arg0, Static128.anInt2407);
		Static577.aClass17Array17 = new Class17[local10.length];
		for (@Pc(399) int local399 = 0; local399 < local10.length; local399++) {
			Static577.aClass17Array17[local399] = arg1.method8147(local10[local399], true);
		}
	}
}
