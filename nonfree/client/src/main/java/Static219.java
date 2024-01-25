import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_106 = new Class131(9, 4);

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_70 = new Class237(70, -1);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static421.aFrame2 != null && (arg3 != 3 || Static389.aClass128_Sub1_1.anInt3570 != arg1 || arg0 != Static389.aClass128_Sub1_1.anInt3560)) {
			Static32.method552(Static119.aClass138_7, Static421.aFrame2);
			Static421.aFrame2 = null;
		}
		if (arg3 == 3 && Static421.aFrame2 == null) {
			Static421.aFrame2 = Static319.method4500(Static119.aClass138_7, 0, arg0, arg1);
			if (Static421.aFrame2 != null) {
				Static389.aClass128_Sub1_1.anInt3570 = arg1;
				Static389.aClass128_Sub1_1.anInt3560 = arg0;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
			}
		}
		if (arg3 == 3 && Static421.aFrame2 == null) {
			method3314(-1, -1, arg2, Static389.aClass128_Sub1_1.anInt3566, true);
			return;
		}
		@Pc(80) Container local80;
		@Pc(93) Insets local93;
		if (Static421.aFrame2 != null) {
			Static119.anInt7598 = arg0;
			Static288.anInt5035 = arg1;
			local80 = Static421.aFrame2;
		} else if (Static97.aFrame1 == null) {
			local80 = Static119.aClass138_7.anApplet1;
			Static288.anInt5035 = local80.getSize().width;
			Static119.anInt7598 = local80.getSize().height;
		} else {
			local93 = Static97.aFrame1.getInsets();
			@Pc(99) int local99 = -local93.left;
			Static288.anInt5035 = Static97.aFrame1.getSize().width + local99 - local93.right;
			Static119.anInt7598 = Static97.aFrame1.getSize().height - local93.top - local93.bottom;
			local80 = Static97.aFrame1;
		}
		@Pc(145) int local145;
		if (arg3 == 1) {
			Static207.anInt3842 = Static256.anInt4583;
			Static340.anInt5935 = 0;
			Static255.anInt4574 = Static8.anInt239;
			Static226.anInt4101 = (Static288.anInt5035 - Static256.anInt4583) / 2;
		} else if (Static113.anInt5764 < 96 && Static285.anInt7839 == 0) {
			local145 = Static288.anInt5035 > 1024 ? 1024 : Static288.anInt5035;
			Static226.anInt4101 = (Static288.anInt5035 - local145) / 2;
			@Pc(158) int local158 = Static119.anInt7598 <= 768 ? Static119.anInt7598 : 768;
			Static207.anInt3842 = local145;
			Static255.anInt4574 = local158;
			Static340.anInt5935 = 0;
		} else {
			Static340.anInt5935 = 0;
			Static255.anInt4574 = Static119.anInt7598;
			Static207.anInt3842 = Static288.anInt5035;
			Static226.anInt4101 = 0;
		}
		if (Static221.aClass176_5 != Static234.aClass176_7) {
			@Pc(201) boolean local201;
			if (Static207.anInt3842 < 1024 && Static255.anInt4574 < 768) {
				local201 = true;
			} else {
				local201 = false;
			}
		}
		if (arg4) {
			Static423.method5679();
		} else {
			Static299.aCanvas5.setSize(Static207.anInt3842, Static255.anInt4574);
			Static276.aClass109_10.method4731(Static299.aCanvas5);
			if (Static97.aFrame1 == local80) {
				local93 = Static97.aFrame1.getInsets();
				Static299.aCanvas5.setLocation(Static226.anInt4101 + local93.left, Static340.anInt5935 + local93.top);
			} else {
				Static299.aCanvas5.setLocation(Static226.anInt4101, Static340.anInt5935);
			}
		}
		if (arg3 < 2) {
			Static123.aBoolean119 = false;
		} else {
			Static123.aBoolean119 = true;
		}
		if (Static273.anInt4878 != -1) {
			Static189.method2894(true);
		}
		if (Static372.aClass161_6 != null && (Static151.anInt2579 == 30 || Static151.anInt2579 == 25)) {
			Static296.method2398();
		}
		for (local145 = 0; local145 < 100; local145++) {
			Static22.aBooleanArray12[local145] = true;
		}
		Static335.aBoolean59 = true;
	}
}
