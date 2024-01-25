import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "[I")
	public static int[] anIntArray151;

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "Lclient!kw;")
	public static Class200 aClass200_3;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "[I")
	public static final int[] anIntArray150 = new int[13];

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_50 = new Class235(93, 12);

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZBIIII)V")
	public static void method1468(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static264.aFrame2 != null && (arg3 != 3 || Static348.aClass1_Sub30_Sub1_1.anInt4873 != arg1 || arg2 != Static348.aClass1_Sub30_Sub1_1.anInt4860)) {
			Static448.method6203(Static362.aClass109_5, Static264.aFrame2);
			Static264.aFrame2 = null;
		}
		if (arg3 == 3 && Static264.aFrame2 == null) {
			Static264.aFrame2 = Static507.method7075(0, arg1, arg2, Static362.aClass109_5);
			if (Static264.aFrame2 != null) {
				Static348.aClass1_Sub30_Sub1_1.anInt4873 = arg1;
				Static348.aClass1_Sub30_Sub1_1.anInt4860 = arg2;
				Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
			}
		}
		if (arg3 == 3 && Static264.aFrame2 == null) {
			method1468(true, -1, -1, Static348.aClass1_Sub30_Sub1_1.anInt4878, arg4);
			return;
		}
		@Pc(73) Container local73;
		@Pc(90) Insets local90;
		if (Static264.aFrame2 != null) {
			Static38.anInt603 = arg2;
			local73 = Static264.aFrame2;
			Static493.anInt8493 = arg1;
		} else if (Static142.aFrame1 == null) {
			if (Static590.anApplet2 == null) {
				local73 = Static170.anApplet_Sub1_1;
			} else {
				local73 = Static590.anApplet2;
			}
			Static493.anInt8493 = local73.getSize().width;
			Static38.anInt603 = local73.getSize().height;
		} else {
			local90 = Static142.aFrame1.getInsets();
			Static493.anInt8493 = Static142.aFrame1.getSize().width - local90.right - local90.left;
			Static38.anInt603 = Static142.aFrame1.getSize().height - local90.top - local90.bottom;
			local73 = Static142.aFrame1;
		}
		if (arg3 == 1) {
			Static499.anInt4149 = Static103.anInt2084;
			Static281.anInt4923 = (Static493.anInt8493 - Static573.anInt9475) / 2;
			Static272.anInt4785 = 0;
			Static130.anInt2566 = Static573.anInt9475;
		} else {
			Static309.method4298();
		}
		if (Static199.aClass308_3 != Static357.aClass308_6) {
			@Pc(155) boolean local155;
			if (Static130.anInt2566 < 1024 && Static499.anInt4149 < 768) {
				local155 = true;
			} else {
				local155 = false;
			}
		}
		if (arg0) {
			Static190.method2927();
		} else {
			Static499.aCanvas9.setSize(Static130.anInt2566, Static499.anInt4149);
			Static16.aClass134_1.method6909(Static499.aCanvas9);
			if (local73 == Static142.aFrame1) {
				local90 = Static142.aFrame1.getInsets();
				Static499.aCanvas9.setLocation(Static281.anInt4923 + local90.left, Static272.anInt4785 + local90.top);
			} else {
				Static499.aCanvas9.setLocation(Static281.anInt4923, Static272.anInt4785);
			}
		}
		if (arg3 < 2) {
			Static342.aBoolean452 = false;
		} else {
			Static342.aBoolean452 = true;
		}
		if (Static422.anInt7311 != -1) {
			Static482.method6526(true);
		}
		if (Static568.aClass149_2 != null && Static443.method6122(Static216.anInt4135)) {
			Static243.method3633();
		}
		for (@Pc(223) int local223 = 0; local223 < 100; local223++) {
			Static166.aBooleanArray5[local223] = true;
		}
		Static573.aBoolean741 = true;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLclient!mo;)Lclient!ap;")
	public static Class1_Sub1 method1470(@OriginalArg(1) Class1_Sub35 arg0) {
		arg0.method5750();
		@Pc(13) int local13 = arg0.method5750();
		@Pc(17) Class1_Sub1 local17 = Static586.method5386(local13);
		local17.anInt9443 = arg0.method5750();
		@Pc(31) int local31 = arg0.method5750();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method5750();
			local17.method7708(arg0, local39);
		}
		local17.method7699();
		return local17;
	}
}
