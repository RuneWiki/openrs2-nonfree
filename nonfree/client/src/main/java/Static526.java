import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!wd;")
	public static final Class366 aClass366_11 = new Class366(1);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public static int anInt9111 = -1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZIIII)V")
	public static void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static197.aFrame1 != null && (arg2 != 3 || arg4 != Static239.anInt5360 || arg0 != Static296.anInt5972)) {
			Static618.method8387(Static51.aClass118_1, Static197.aFrame1);
			Static197.aFrame1 = null;
		}
		if (arg2 == 3 && Static197.aFrame1 == null) {
			Static197.aFrame1 = Static162.method3263(Static51.aClass118_1, arg0, arg4, 0);
			if (Static197.aFrame1 != null) {
				Static239.anInt5360 = arg4;
				Static296.anInt5972 = arg0;
				Static35.method7912();
			}
		}
		if (arg2 == 3 && Static197.aFrame1 == null) {
			method7465(-1, true, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), arg3, -1);
			return;
		}
		@Pc(91) Container local91;
		@Pc(108) Insets local108;
		if (Static197.aFrame1 != null) {
			Static354.anInt6829 = arg4;
			local91 = Static197.aFrame1;
			Static69.anInt7730 = arg0;
		} else if (Static602.aFrame3 == null) {
			if (Static152.anApplet1 == null) {
				local91 = Static370.anApplet_Sub1_1;
			} else {
				local91 = Static152.anApplet1;
			}
			Static354.anInt6829 = local91.getSize().width;
			Static69.anInt7730 = local91.getSize().height;
		} else {
			local108 = Static602.aFrame3.getInsets();
			Static354.anInt6829 = Static602.aFrame3.getSize().width - local108.left - local108.right;
			@Pc(125) int local125 = -local108.bottom;
			Static69.anInt7730 = Static602.aFrame3.getSize().height + local125 - local108.top;
			local91 = Static602.aFrame3;
		}
		if (arg2 == 1) {
			Static235.anInt5298 = Static328.anInt9768;
			Static34.anInt8073 = 0;
			Static313.anInt6355 = Static594.anInt10159;
			Static508.anInt8942 = (Static354.anInt6829 - Static328.anInt9768) / 2;
		} else {
			Static132.method2910();
		}
		if (Static277.aClass313_9 != Static101.aClass313_5) {
			@Pc(177) boolean local177;
			if (Static235.anInt5298 < 1024 && Static313.anInt6355 < 768) {
				local177 = true;
			} else {
				local177 = false;
			}
		}
		if (arg1) {
			Static314.method5187();
		} else {
			Static549.aCanvas13.setSize(Static235.anInt5298, Static313.anInt6355);
			if (Static513.aBoolean642) {
				Static188.method3577(Static549.aCanvas13);
			} else {
				Static171.aClass16_5.method6129(Static549.aCanvas13, Static235.anInt5298, Static313.anInt6355);
			}
			if (local91 == Static602.aFrame3) {
				local108 = Static602.aFrame3.getInsets();
				Static549.aCanvas13.setLocation(local108.left + Static508.anInt8942, Static34.anInt8073 + local108.top);
			} else {
				Static549.aCanvas13.setLocation(Static508.anInt8942, Static34.anInt8073);
			}
		}
		if (arg2 >= 2) {
			Static455.aBoolean599 = true;
		} else {
			Static455.aBoolean599 = false;
		}
		if (Static212.anInt4965 != -1) {
			Static131.method2902(true);
		}
		if (Static319.aClass240_2 != null && Static564.method7850(Static435.anInt8191)) {
			Static499.method7247();
		}
		for (@Pc(255) int local255 = 0; local255 < 100; local255++) {
			Static620.aBooleanArray29[local255] = true;
		}
		Static277.aBoolean412 = true;
	}
}
