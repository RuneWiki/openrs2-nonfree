import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fda", name = "J", descriptor = "Lclient!q;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!fda", name = "L", descriptor = "Lclient!gh;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!fda", name = "N", descriptor = "Lclient!gh;")
	public static Class106 aClass106_3;

	@OriginalMember(owner = "client!fda", name = "Q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!fda", name = "P", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_22 = new Class71();

	@OriginalMember(owner = "client!fda", name = "R", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_34 = new Class158(61, 15);

	@OriginalMember(owner = "client!fda", name = "S", descriptor = "I")
	public static int anInt2736 = 0;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2293() {
		Static370.anIntArray620 = null;
		Static10.anIntArray109 = null;
		Static485.aBoolean644 = false;
		Static465.anIntArray713 = null;
		Static371.anIntArray621 = null;
		Static504.anIntArray776 = null;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLclient!rt;)Lclient!mb;")
	public static Class30_Sub2 method2296(@OriginalArg(1) Class3_Sub27 arg0) {
		return new Class30_Sub2(arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7551(), arg0.method7548());
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZII)V")
	public static void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static258.aFrame2 != null && (arg0 != 3 || arg2 != Static7.aClass3_Sub15_Sub1_1.anInt8372 || arg4 != Static7.aClass3_Sub15_Sub1_1.anInt8380)) {
			Static523.method7515(Static258.aFrame2, Static401.aClass285_11);
			Static258.aFrame2 = null;
		}
		if (arg0 == 3 && Static258.aFrame2 == null) {
			Static258.aFrame2 = Static446.method6777(arg2, Static401.aClass285_11, arg4, 0);
			if (Static258.aFrame2 != null) {
				Static7.aClass3_Sub15_Sub1_1.anInt8380 = arg4;
				Static7.aClass3_Sub15_Sub1_1.anInt8372 = arg2;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
			}
		}
		if (arg0 == 3 && Static258.aFrame2 == null) {
			method2300(Static7.aClass3_Sub15_Sub1_1.anInt8369, arg1, -1, true, -1);
			return;
		}
		@Pc(83) Container local83;
		@Pc(100) Insets local100;
		if (Static258.aFrame2 != null) {
			local83 = Static258.aFrame2;
			Static211.anInt4645 = arg4;
			Static265.anInt5511 = arg2;
		} else if (Static107.aFrame1 == null) {
			if (Static370.anApplet1 == null) {
				local83 = Static391.anApplet_Sub1_1;
			} else {
				local83 = Static370.anApplet1;
			}
			Static265.anInt5511 = local83.getSize().width;
			Static211.anInt4645 = local83.getSize().height;
		} else {
			local100 = Static107.aFrame1.getInsets();
			Static265.anInt5511 = Static107.aFrame1.getSize().width - local100.left - local100.right;
			Static211.anInt4645 = Static107.aFrame1.getSize().height - local100.top - local100.bottom;
			local83 = Static107.aFrame1;
		}
		if (arg0 == 1) {
			Static531.anInt9232 = 0;
			Static480.anInt8652 = Static238.anInt4976;
			Static412.anInt7547 = Static172.anInt3949;
			Static493.anInt9484 = (Static265.anInt5511 - Static238.anInt4976) / 2;
		} else {
			Static127.method2251();
		}
		if (Static327.aClass253_10 != Static464.aClass253_15) {
			@Pc(171) boolean local171;
			if (Static480.anInt8652 < 1024 && Static412.anInt7547 < 768) {
				local171 = true;
			} else {
				local171 = false;
			}
		}
		if (arg3) {
			Static169.method3228();
		} else {
			Static549.aCanvas15.setSize(Static480.anInt8652, Static412.anInt7547);
			Static121.aClass5_7.method7442(Static549.aCanvas15);
			if (Static107.aFrame1 == local83) {
				local100 = Static107.aFrame1.getInsets();
				Static549.aCanvas15.setLocation(Static493.anInt9484 + local100.left, Static531.anInt9232 + local100.top);
			} else {
				Static549.aCanvas15.setLocation(Static493.anInt9484, Static531.anInt9232);
			}
		}
		if (arg0 >= 2) {
			Static388.aBoolean632 = true;
		} else {
			Static388.aBoolean632 = false;
		}
		if (Static422.anInt8667 != -1) {
			Static47.method7753(true);
		}
		if (Static467.aClass41_1 != null && Static471.method7030(Static512.anInt8932)) {
			Static528.method7621();
		}
		for (@Pc(239) int local239 = 0; local239 < 100; local239++) {
			Static125.aBooleanArray12[local239] = true;
		}
		Static2.aBoolean13 = true;
	}
}
