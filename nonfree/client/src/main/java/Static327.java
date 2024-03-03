import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array25;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V", line = 143)
	public static void method5877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
		Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_6.anInt7025);
		Class14.aClass2_Sub4_Sub2_4.method4843(arg2);
		Class14.aClass2_Sub4_Sub2_4.method4843(arg3);
		Class14.aClass2_Sub4_Sub2_4.method4844(arg1);
		Class14.aClass2_Sub4_Sub2_4.method4844(arg0);
		Class219.anInt6097 = 0;
		Class2_Sub3_Sub9.anInt1623 = 0;
		Class213.anInt5956 = -3;
		Class2_Sub3_Sub15.anInt2649 = 1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 181)
	public static void method5878() {
		if (Static338.aFrame2 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static207.aFrame1 == null) {
			local13 = Static305.aClass152_5.anApplet1;
		} else {
			local13 = Static207.aFrame1;
		}
		Static133.anInt2660 = local13.getSize().width;
		Static166.anInt2316 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (local13 == Static207.aFrame1) {
			local31 = Static207.aFrame1.getInsets();
			Static166.anInt2316 -= local31.bottom + local31.top;
			Static133.anInt2660 -= local31.right + local31.left;
		}
		if (Static135.method2694() == 1) {
			Static161.anInt3295 = Class2_Sub3_Sub23.anInt4824;
			Static231.anInt4656 = Class171.anInt4692;
			Class53.anInt1644 = 0;
			Class63.anInt1840 = (Static133.anInt2660 - Class171.anInt4692) / 2;
		} else if (Class208.anInt5790 < 96 && Class2_Sub10.anInt1760 == 0) {
			@Pc(70) int local70 = Static133.anInt2660 > 1024 ? 1024 : Static133.anInt2660;
			@Pc(79) int local79 = Static166.anInt2316 > 768 ? 768 : Static166.anInt2316;
			Static231.anInt4656 = local70;
			Class63.anInt1840 = (Static133.anInt2660 - local70) / 2;
			Class53.anInt1644 = 0;
			Static161.anInt3295 = local79;
		} else {
			Static161.anInt3295 = Static166.anInt2316;
			Static231.anInt4656 = Static133.anInt2660;
			Class53.anInt1644 = 0;
			Class63.anInt1840 = 0;
		}
		if (Class132.aClass127_6 != Static114.aClass127_4) {
			@Pc(130) boolean local130;
			if (Static231.anInt4656 < 1024 && Static161.anInt3295 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static21.aCanvas1.setSize(Static231.anInt4656, Static161.anInt3295);
		if (Static177.aClass19_8 != null) {
			Static177.aClass19_8.method2805();
		}
		if (local13 == Static207.aFrame1) {
			local31 = Static207.aFrame1.getInsets();
			Static21.aCanvas1.setLocation(Class63.anInt1840 + local31.left, local31.top - -Class53.anInt1644);
		} else {
			Static21.aCanvas1.setLocation(Class63.anInt1840, Class53.anInt1644);
		}
		if (Class97.anInt2592 != -1) {
			Static56.method891(true);
		}
		Static347.method6261();
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V", line = 350)
	public static void method5881() {
		if (Class2_Sub3_Sub37.aBoolean471) {
			return;
		}
		Class2_Sub13.aBoolean156 = true;
		if (Static203.aClass177_Sub1_2.aBoolean351) {
			Class187.aFloat66 = (int) Class187.aFloat66 + 191 & 0xFFFFFF80;
		} else {
			Class128.aFloat38 += (24.0F - Class128.aFloat38) / 2.0F;
		}
		Class2_Sub3_Sub37.aBoolean471 = true;
	}
}
