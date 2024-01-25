import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jv", name = "E", descriptor = "Lclient!pca;")
	public static Class251 aClass251_6;

	@OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
	public static int anInt5089;

	@OriginalMember(owner = "client!jv", name = "F", descriptor = "J")
	public static long aLong126 = 0L;

	@OriginalMember(owner = "client!jv", name = "G", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
	public static int anInt5087 = 0;

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "[I")
	public static final int[] anIntArray239 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIZII)V")
	public static void method4069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static178.aFrame3 != null && (arg1 != 3 || arg4 != Static348.aClass3_Sub51_Sub1_5.anInt9970 || arg3 != Static348.aClass3_Sub51_Sub1_5.anInt9947)) {
			Static244.method3850(Static467.aClass168_12, Static178.aFrame3);
			Static178.aFrame3 = null;
		}
		if (arg1 == 3 && Static178.aFrame3 == null) {
			Static178.aFrame3 = Static267.method4074(arg3, arg4, Static467.aClass168_12, 0);
			if (Static178.aFrame3 != null) {
				Static348.aClass3_Sub51_Sub1_5.anInt9947 = arg3;
				Static348.aClass3_Sub51_Sub1_5.anInt9970 = arg4;
				Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
			}
		}
		if (arg1 == 3 && Static178.aFrame3 == null) {
			method4069(arg0, Static348.aClass3_Sub51_Sub1_5.anInt9953, true, -1, -1);
			return;
		}
		@Pc(79) Container local79;
		@Pc(96) Insets local96;
		if (Static178.aFrame3 != null) {
			Static429.anInt7984 = arg3;
			local79 = Static178.aFrame3;
			Static483.anInt8361 = arg4;
		} else if (Static302.aFrame2 == null) {
			if (Static304.anApplet1 == null) {
				local79 = Static350.anApplet_Sub1_1;
			} else {
				local79 = Static304.anApplet1;
			}
			Static483.anInt8361 = local79.getSize().width;
			Static429.anInt7984 = local79.getSize().height;
		} else {
			local96 = Static302.aFrame2.getInsets();
			@Pc(104) int local104 = local96.right + local96.left;
			Static483.anInt8361 = Static302.aFrame2.getSize().width - local104;
			@Pc(112) int local112 = -local96.top;
			Static429.anInt7984 = Static302.aFrame2.getSize().height + local112 - local96.bottom;
			local79 = Static302.aFrame2;
		}
		if (arg1 == 1) {
			Static490.anInt8427 = 0;
			Static34.anInt3201 = Static333.anInt6024;
			Static537.anInt9359 = (Static483.anInt8361 - Static333.anInt6024) / 2;
			Static492.anInt8445 = Static473.anInt8221;
		} else {
			Static338.method4925();
		}
		if (Static332.aClass5_3 != Static412.aClass5_7) {
			@Pc(160) boolean local160;
			if (Static34.anInt3201 < 1024 && Static492.anInt8445 < 768) {
				local160 = true;
			} else {
				local160 = false;
			}
		}
		if (arg2) {
			Static109.method2201();
		} else {
			Static129.aCanvas6.setSize(Static34.anInt3201, Static492.anInt8445);
			Static319.aClass31_11.method8049(Static129.aCanvas6);
			if (Static302.aFrame2 == local79) {
				local96 = Static302.aFrame2.getInsets();
				Static129.aCanvas6.setLocation(local96.left + Static537.anInt9359, local96.top - -Static490.anInt8427);
			} else {
				Static129.aCanvas6.setLocation(Static537.anInt9359, Static490.anInt8427);
			}
		}
		if (arg1 >= 2) {
			Static342.aBoolean435 = true;
		} else {
			Static342.aBoolean435 = false;
		}
		if (Static79.anInt2118 != -1) {
			Static542.method7422(true);
		}
		if (Static451.aClass223_6 != null && Static223.method3689(Static409.anInt1461)) {
			Static339.method4964();
		}
		for (@Pc(233) int local233 = 0; local233 < 100; local233++) {
			Static544.aBooleanArray32[local233] = true;
		}
		Static69.aBoolean465 = true;
	}
}
