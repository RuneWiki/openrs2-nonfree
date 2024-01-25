import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
	public static int anInt4649;

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "Lclient!o;")
	public static Class80 aClass80_14;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_74 = new Class27(53, -1);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZIIII)V")
	public static void method3758(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static95.aFrame1 != null && (arg2 != 3 || arg3 != Static361.aClass85_Sub1_1.anInt2500 || arg1 != Static361.aClass85_Sub1_1.anInt2480)) {
			Static429.method5679(Static171.aClass159_1, Static95.aFrame1);
			Static95.aFrame1 = null;
		}
		if (arg2 == 3 && Static95.aFrame1 == null) {
			Static95.aFrame1 = Static243.method3555(arg1, Static171.aClass159_1, arg3, 0);
			if (Static95.aFrame1 != null) {
				Static361.aClass85_Sub1_1.anInt2500 = arg3;
				Static361.aClass85_Sub1_1.anInt2480 = arg1;
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
			}
		}
		if (arg2 == 3 && Static95.aFrame1 == null) {
			method3758(true, -1, Static361.aClass85_Sub1_1.anInt2483, -1, arg4);
			return;
		}
		@Pc(78) Container local78;
		@Pc(91) Insets local91;
		if (Static95.aFrame1 != null) {
			Static370.anInt6388 = arg3;
			Static299.anInt4635 = arg1;
			local78 = Static95.aFrame1;
		} else if (Static451.aFrame2 == null) {
			local78 = Static171.aClass159_1.anApplet1;
			Static370.anInt6388 = local78.getSize().width;
			Static299.anInt4635 = local78.getSize().height;
		} else {
			local91 = Static451.aFrame2.getInsets();
			Static370.anInt6388 = Static451.aFrame2.getSize().width - local91.right - local91.left;
			@Pc(109) int local109 = local91.bottom + local91.top;
			Static299.anInt4635 = Static451.aFrame2.getSize().height - local109;
			local78 = Static451.aFrame2;
		}
		@Pc(151) int local151;
		if (arg2 == 1) {
			Static399.anInt6748 = (Static370.anInt6388 - Static29.anInt504) / 2;
			Static340.anInt5756 = Static348.anInt5939;
			Static350.anInt5988 = 0;
			Static90.anInt1891 = Static29.anInt504;
		} else if (Static108.anInt2167 < 96 && Static423.anInt7114 == 0) {
			local151 = Static370.anInt6388 <= 1024 ? Static370.anInt6388 : 1024;
			@Pc(158) int local158 = Static299.anInt4635 > 768 ? 768 : Static299.anInt4635;
			Static399.anInt6748 = (Static370.anInt6388 - local151) / 2;
			Static90.anInt1891 = local151;
			Static350.anInt5988 = 0;
			Static340.anInt5756 = local158;
		} else {
			Static350.anInt5988 = 0;
			Static399.anInt6748 = 0;
			Static90.anInt1891 = Static370.anInt6388;
			Static340.anInt5756 = Static299.anInt4635;
		}
		if (Static110.aClass151_5 != Static284.aClass151_8) {
			@Pc(199) boolean local199;
			if (Static90.anInt1891 < 1024 && Static340.anInt5756 < 768) {
				local199 = true;
			} else {
				local199 = false;
			}
		}
		if (arg0) {
			Static432.method5721();
		} else {
			Static412.aCanvas7.setSize(Static90.anInt1891, Static340.anInt5756);
			Static412.aClass50_8.method5825(Static412.aCanvas7);
			if (Static451.aFrame2 == local78) {
				local91 = Static451.aFrame2.getInsets();
				Static412.aCanvas7.setLocation(Static399.anInt6748 + local91.left, local91.top - -Static350.anInt5988);
			} else {
				Static412.aCanvas7.setLocation(Static399.anInt6748, Static350.anInt5988);
			}
		}
		if (arg2 < 2) {
			Static235.aBoolean288 = false;
		} else {
			Static235.aBoolean288 = true;
		}
		if (Static189.anInt3826 != -1) {
			Static241.method3528(true);
		}
		if (Static160.aClass253_3 != null && Static7.method78(Static358.anInt6086)) {
			Static95.method1722();
		}
		for (local151 = 0; local151 < 100; local151++) {
			Static432.aBooleanArray24[local151] = true;
		}
		Static108.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3759(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!da;)V")
	public static void method3761(@OriginalArg(1) Class50_Sub1 arg0) {
		@Pc(24) byte[] local24;
		if (Static290.anObject7 == null) {
			@Pc(17) Class77_Sub1_Sub1 local17 = new Class77_Sub1_Sub1();
			local24 = local17.method4691();
			Static290.anObject7 = Static102.method1793(local24);
		}
		if (Static51.anObject4 == null) {
			@Pc(35) Class77_Sub2_Sub1 local35 = new Class77_Sub2_Sub1();
			local24 = local35.method5152();
			Static51.anObject4 = Static102.method1793(local24);
		}
		@Pc(50) Class242 local50 = arg0.aClass242_1;
		if (local50.method5277() && Static238.anObject6 == null) {
			local24 = Static263.method5395(new Class189_Sub1(419684), 0.6F, 16.0F, 4.0F, 0.5F, 4.0F);
			Static238.anObject6 = Static102.method1793(local24);
		}
	}
}
