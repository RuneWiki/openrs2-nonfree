import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public static int anInt7087;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIILclient!cea;I)Ljava/awt/Frame;")
	private static Frame method6346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class48 arg3) {
		if (!arg3.method1315()) {
			return null;
		}
		@Pc(18) Class277[] local18 = Static478.method7626(arg3);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg2 == local18[local26].anInt8153 && local18[local26].anInt8154 == arg0 && (!local24 || arg1 < local18[local26].anInt8157)) {
				local24 = true;
				arg1 = local18[local26].anInt8157;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(93) Class268 local93 = arg3.method1322(arg0, arg2, arg1);
		while (local93.anInt8008 == 0) {
			Static650.method9565(10L);
		}
		@Pc(105) Frame local105 = (Frame) local93.anObject19;
		if (local105 == null) {
			return null;
		} else if (local93.anInt8008 == 2) {
			Static536.method4062(arg3, local105);
			return null;
		} else {
			return local105;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIZ)V")
	public static void method6348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static102.aFrame2 != null && (arg1 != 3 || Static377.anInt7161 != arg0 || arg3 != Static431.anInt2502)) {
			Static536.method4062(Static96.aClass48_5, Static102.aFrame2);
			Static102.aFrame2 = null;
		}
		if (arg1 == 3 && Static102.aFrame2 == null) {
			Static102.aFrame2 = method6346(arg3, 0, arg0, Static96.aClass48_5);
			if (Static102.aFrame2 != null) {
				Static431.anInt2502 = arg3;
				Static377.anInt7161 = arg0;
				Static482.method7663();
			}
		}
		if (arg1 == 3 && Static102.aFrame2 == null) {
			method6348(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), arg2, -1, true);
			return;
		}
		@Pc(67) Container local67;
		@Pc(78) Insets local78;
		if (Static102.aFrame2 != null) {
			local67 = Static102.aFrame2;
			Static360.anInt6884 = arg3;
			Static97.anInt1735 = arg0;
		} else if (Static46.aFrame1 == null) {
			if (Static637.anApplet2 == null) {
				local67 = Static172.anApplet_Sub1_1;
			} else {
				local67 = Static637.anApplet2;
			}
			Static97.anInt1735 = local67.getSize().width;
			Static360.anInt6884 = local67.getSize().height;
		} else {
			local78 = Static46.aFrame1.getInsets();
			Static97.anInt1735 = Static46.aFrame1.getSize().width - local78.right - local78.left;
			@Pc(96) int local96 = local78.bottom + local78.top;
			Static360.anInt6884 = Static46.aFrame1.getSize().height - local96;
			local67 = Static46.aFrame1;
		}
		if (arg1 == 1) {
			Static309.anInt5584 = 0;
			Static406.anInt7570 = Static26.anInt458;
			Static19.anInt352 = Static340.anInt6390;
			Static17.anInt8637 = (Static97.anInt1735 - Static26.anInt458) / 2;
		} else {
			Static432.method7063();
		}
		if (Static235.aClass37_5 != Static314.aClass37_6) {
			@Pc(154) boolean local154;
			if (Static406.anInt7570 < 1024 && Static19.anInt352 < 768) {
				local154 = true;
			} else {
				local154 = false;
			}
		}
		if (arg4) {
			Static235.method4260();
		} else {
			Static641.aCanvas13.setSize(Static406.anInt7570, Static19.anInt352);
			if (Static450.aBoolean606) {
				Static606.method9086(Static641.aCanvas13);
			} else {
				Static607.aClass101_15.method8092(Static641.aCanvas13, Static406.anInt7570, Static19.anInt352);
			}
			if (local67 == Static46.aFrame1) {
				local78 = Static46.aFrame1.getInsets();
				Static641.aCanvas13.setLocation(local78.left + Static17.anInt8637, local78.top - -Static309.anInt5584);
			} else {
				Static641.aCanvas13.setLocation(Static17.anInt8637, Static309.anInt5584);
			}
		}
		if (arg1 < 2) {
			Static448.aBoolean605 = false;
		} else {
			Static448.aBoolean605 = true;
		}
		if (Static567.anInt9844 != -1) {
			Static94.method1626(true);
		}
		if (Static395.aClass207_2 != null && Static259.method4507(Static579.anInt10049)) {
			Static62.method1157();
		}
		for (@Pc(237) int local237 = 0; local237 < 100; local237++) {
			Static561.aBooleanArray58[local237] = true;
		}
		Static328.aBoolean442 = true;
	}
}
