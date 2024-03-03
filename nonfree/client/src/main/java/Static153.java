import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lclient!ku;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIZ)V", line = 8)
	public static void method3101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static312.method5695();
		}
		if (Static338.aFrame2 != null && (arg3 != 3 || arg0 != Static203.aClass177_Sub1_2.anInt4874 || Static203.aClass177_Sub1_2.anInt4883 != arg1)) {
			Static17.method4216(Static338.aFrame2, Static305.aClass152_5);
			Static338.aFrame2 = null;
		}
		if (arg3 == 3 && Static338.aFrame2 == null) {
			Static338.aFrame2 = Static5.method85(arg1, Static305.aClass152_5, arg0, 0);
			if (Static338.aFrame2 != null) {
				Static203.aClass177_Sub1_2.anInt4883 = arg1;
				Static203.aClass177_Sub1_2.anInt4874 = arg0;
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
			}
		}
		if (arg3 == 3 && Static338.aFrame2 == null) {
			method3101(-1, -1, arg2, Static203.aClass177_Sub1_2.anInt4884, true);
			return;
		}
		@Pc(81) Container local81;
		@Pc(88) Insets local88;
		if (Static338.aFrame2 != null) {
			Static133.anInt2660 = arg0;
			Static166.anInt2316 = arg1;
			local81 = Static338.aFrame2;
		} else if (Static207.aFrame1 == null) {
			local81 = Static305.aClass152_5.anApplet1;
			Static133.anInt2660 = local81.getSize().width;
			Static166.anInt2316 = local81.getSize().height;
		} else {
			local88 = Static207.aFrame1.getInsets();
			@Pc(96) int local96 = local88.left + local88.right;
			Static133.anInt2660 = Static207.aFrame1.getSize().width - local96;
			Static166.anInt2316 = Static207.aFrame1.getSize().height - local88.bottom - local88.top;
			local81 = Static207.aFrame1;
		}
		@Pc(159) int local159;
		if (arg3 == 1) {
			Class63.anInt1840 = (Static133.anInt2660 - Class171.anInt4692) / 2;
			Static231.anInt4656 = Class171.anInt4692;
			Static161.anInt3295 = Class2_Sub3_Sub23.anInt4824;
			Class53.anInt1644 = 0;
		} else if (Class208.anInt5790 < 96 && Class2_Sub10.anInt1760 == 0) {
			local159 = Static133.anInt2660 > 1024 ? 1024 : Static133.anInt2660;
			Static231.anInt4656 = local159;
			@Pc(170) int local170 = Static166.anInt2316 <= 768 ? Static166.anInt2316 : 768;
			Class63.anInt1840 = (Static133.anInt2660 - local159) / 2;
			Class53.anInt1644 = 0;
			Static161.anInt3295 = local170;
		} else {
			Static231.anInt4656 = Static133.anInt2660;
			Class63.anInt1840 = 0;
			Static161.anInt3295 = Static166.anInt2316;
			Class53.anInt1644 = 0;
		}
		if (Class132.aClass127_6 != Static114.aClass127_4) {
			@Pc(206) boolean local206;
			if (Static231.anInt4656 < 1024 && Static161.anInt3295 < 768) {
				local206 = true;
			} else {
				local206 = false;
			}
		}
		if (arg4) {
			Static74.method5702(Class2_Sub10.anInt1760);
		} else {
			Static21.aCanvas1.setSize(Static231.anInt4656, Static161.anInt3295);
			if (Static177.aClass19_8 != null) {
				Static177.aClass19_8.method2805();
			}
			if (Static207.aFrame1 == local81) {
				local88 = Static207.aFrame1.getInsets();
				Static21.aCanvas1.setLocation(Class63.anInt1840 + local88.left, local88.top + Class53.anInt1644);
			} else {
				Static21.aCanvas1.setLocation(Class63.anInt1840, Class53.anInt1644);
			}
		}
		if (arg3 >= 2) {
			Class11_Sub5_Sub6.aBoolean464 = true;
		} else {
			Class11_Sub5_Sub6.aBoolean464 = false;
		}
		if (Class97.anInt2592 != -1) {
			Static56.method891(true);
		}
		if (Static312.aClass111_4 != null && (Class2_Sub3_Sub35.anInt6430 == 30 || Class2_Sub3_Sub35.anInt6430 == 25)) {
			Static87.method2004();
		}
		for (local159 = 0; local159 < 100; local159++) {
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[local159] = true;
		}
		Class2_Sub2_Sub16.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZBIZ)Lclient!r;", line = 161)
	public static Class197 method3102(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class207 local5 = null;
		if (Static103.aClass205_1 != null) {
			local5 = new Class207(arg1, Static103.aClass205_1, Class129.aClass205Array1[arg1], 1000000);
		}
		Class242.aClass25_Sub1Array2[arg1] = Static51.aClass154_1.method3872(arg1, Static18.aClass207_1, local5);
		if (arg0) {
			Class242.aClass25_Sub1Array2[arg1].method899();
		}
		return new Class197(Class242.aClass25_Sub1Array2[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 184)
	public static void method3103(@OriginalArg(1) String arg0) {
		if (Static44.aClass214Array1 != null) {
			Static85.method1962(Class55.aClass145_57);
			Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0));
			Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nk;)Ljava/lang/String;", line = 215)
	public static String method3105(@OriginalArg(1) Class161 arg0) {
		if (Static42.method1406(arg0).method1854() == 0) {
			return null;
		} else if (arg0.aString44 == null || arg0.aString44.trim().length() == 0) {
			return Class15_Sub1.aBoolean30 ? "Hidden-use" : null;
		} else {
			return arg0.aString44;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 274)
	public static void method3106() {
		if (Class2_Sub2_Sub1.aBoolean5) {
			return;
		}
		Static164.method3326(Static364.aClass67ArrayArrayArray5);
		if (Static84.aClass67ArrayArrayArray4 != null) {
			Static164.method3326(Static84.aClass67ArrayArrayArray4);
		}
		Class2_Sub2_Sub1.aBoolean5 = true;
	}
}
