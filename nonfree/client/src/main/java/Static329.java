import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public static int anInt5895;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_138 = new Class25(95, 0);

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt5883 = 0;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4685(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static259.anInt4591; local11++) {
			if (arg0.equalsIgnoreCase(Static449.aStringArray67[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZIBI)V")
	public static void method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static50.aFrame1 != null && (arg0 != 3 || arg1 != Static434.aClass165_Sub1_1.anInt4212 || arg3 != Static434.aClass165_Sub1_1.anInt4211)) {
			Static95.method1419(Static138.aClass194_2, Static50.aFrame1);
			Static50.aFrame1 = null;
		}
		if (arg0 == 3 && Static50.aFrame1 == null) {
			Static50.aFrame1 = Static259.method3650(Static138.aClass194_2, arg1, 0, arg3);
			if (Static50.aFrame1 != null) {
				Static434.aClass165_Sub1_1.anInt4212 = arg1;
				Static434.aClass165_Sub1_1.anInt4211 = arg3;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
			}
		}
		if (arg0 == 3 && Static50.aFrame1 == null) {
			method4692(Static434.aClass165_Sub1_1.anInt4206, -1, true, -1, arg4);
			return;
		}
		@Pc(101) Container local101;
		@Pc(75) Insets local75;
		if (Static50.aFrame1 != null) {
			Static119.anInt2042 = arg1;
			local101 = Static50.aFrame1;
			Static268.anInt4657 = arg3;
		} else if (Static393.aFrame2 == null) {
			local101 = Static138.aClass194_2.anApplet1;
			Static119.anInt2042 = local101.getSize().width;
			Static268.anInt4657 = local101.getSize().height;
		} else {
			local75 = Static393.aFrame2.getInsets();
			Static119.anInt2042 = Static393.aFrame2.getSize().width - local75.right - local75.left;
			Static268.anInt4657 = Static393.aFrame2.getSize().height - local75.bottom - local75.top;
			local101 = Static393.aFrame2;
		}
		@Pc(153) int local153;
		if (arg0 == 1) {
			Static344.anInt6105 = Static163.anInt2922;
			Static124.anInt2074 = (Static119.anInt2042 - Static132.anInt2509) / 2;
			Static49.anInt789 = Static132.anInt2509;
			Static226.anInt3803 = 0;
		} else if (Static170.anInt3068 < 96 && Static404.anInt2752 == 0) {
			local153 = Static119.anInt2042 <= 1024 ? Static119.anInt2042 : 1024;
			@Pc(162) int local162 = Static268.anInt4657 <= 768 ? Static268.anInt4657 : 768;
			Static124.anInt2074 = (Static119.anInt2042 - local153) / 2;
			Static49.anInt789 = local153;
			Static344.anInt6105 = local162;
			Static226.anInt3803 = 0;
		} else {
			Static226.anInt3803 = 0;
			Static49.anInt789 = Static119.anInt2042;
			Static124.anInt2074 = 0;
			Static344.anInt6105 = Static268.anInt4657;
		}
		if (Static429.aClass129_8 != Static112.aClass129_4) {
			@Pc(196) boolean local196;
			if (Static49.anInt789 < 1024 && Static344.anInt6105 < 768) {
				local196 = true;
			} else {
				local196 = false;
			}
		}
		if (arg2) {
			Static277.method3961();
		} else {
			Static291.aCanvas6.setSize(Static49.anInt789, Static344.anInt6105);
			Static257.aClass75_8.method6012(Static291.aCanvas6);
			if (Static393.aFrame2 == local101) {
				local75 = Static393.aFrame2.getInsets();
				Static291.aCanvas6.setLocation(local75.left + Static124.anInt2074, Static226.anInt3803 + local75.top);
			} else {
				Static291.aCanvas6.setLocation(Static124.anInt2074, Static226.anInt3803);
			}
		}
		if (arg0 < 2) {
			Static429.aBoolean496 = false;
		} else {
			Static429.aBoolean496 = true;
		}
		if (Static103.anInt5365 != -1) {
			Static92.method1399(true);
		}
		if (Static339.aClass66_2 != null && Static263.method3698(Static433.anInt7309)) {
			Static414.method5687();
		}
		for (local153 = 0; local153 < 100; local153++) {
			Static186.aBooleanArray12[local153] = true;
		}
		Static448.aBoolean509 = true;
	}
}
