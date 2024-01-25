import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
	public static int anInt6175 = 0;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Lclient!fb;")
	public static Class72 method4864() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!dn;ZI)Lclient!ce;")
	public static Class3_Sub3_Sub5 method4865(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub2 local14 = new Class3_Sub2(arg1.method1384(arg2, arg0));
		@Pc(56) Class3_Sub3_Sub5 local56 = new Class3_Sub3_Sub5(arg0, local14.method6027(), local14.method6027(), local14.method6014(), local14.method6014(), local14.method6053() == 1, local14.method6053(), local14.method6053());
		@Pc(60) int local60 = local14.method6053();
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			local56.aClass229_7.method5321(new Class3_Sub34(local14.method6053(), local14.method6004(), local14.method6004(), local14.method6004(), local14.method6004(), local14.method6004(), local14.method6004(), local14.method6004(), local14.method6004()));
		}
		local56.method1023();
		return local56;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static342.aFrame2 != null && (arg3 != 3 || arg0 != Static123.aClass21_Sub1_1.anInt874 || Static123.aClass21_Sub1_1.anInt882 != arg2)) {
			Static180.method3068(Static342.aFrame2, Static295.aClass103_5);
			Static342.aFrame2 = null;
		}
		if (arg3 == 3 && Static342.aFrame2 == null) {
			Static342.aFrame2 = Static8.method200(arg0, 0, Static295.aClass103_5, arg2);
			if (Static342.aFrame2 != null) {
				Static123.aClass21_Sub1_1.anInt882 = arg2;
				Static123.aClass21_Sub1_1.anInt874 = arg0;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
			}
		}
		if (arg3 == 3 && Static342.aFrame2 == null) {
			method4866(-1, arg1, -1, Static123.aClass21_Sub1_1.anInt878, true);
			return;
		}
		@Pc(78) Container local78;
		@Pc(98) Insets local98;
		if (Static342.aFrame2 != null) {
			Static196.anInt3872 = arg0;
			local78 = Static342.aFrame2;
			Static251.anInt4721 = arg2;
		} else if (Static225.aFrame1 == null) {
			local78 = Static295.aClass103_5.anApplet1;
			Static196.anInt3872 = local78.getSize().width;
			Static251.anInt4721 = local78.getSize().height;
		} else {
			local98 = Static225.aFrame1.getInsets();
			Static196.anInt3872 = Static225.aFrame1.getSize().width - local98.left - local98.right;
			@Pc(115) int local115 = -local98.bottom;
			Static251.anInt4721 = Static225.aFrame1.getSize().height + local115 - local98.top;
			local78 = Static225.aFrame1;
		}
		@Pc(152) int local152;
		if (arg3 == 1) {
			Static405.anInt7048 = (Static196.anInt3872 - Static124.anInt2689) / 2;
			Static385.anInt6686 = Static124.anInt2689;
			Static120.anInt2616 = Static245.anInt4639;
			Static370.anInt6575 = 0;
		} else if (Static102.anInt619 < 96 && Static347.anInt6318 == 0) {
			local152 = Static196.anInt3872 > 1024 ? 1024 : Static196.anInt3872;
			Static385.anInt6686 = local152;
			@Pc(163) int local163 = Static251.anInt4721 > 768 ? 768 : Static251.anInt4721;
			Static405.anInt7048 = (Static196.anInt3872 - local152) / 2;
			Static370.anInt6575 = 0;
			Static120.anInt2616 = local163;
		} else {
			Static405.anInt7048 = 0;
			Static120.anInt2616 = Static251.anInt4721;
			Static385.anInt6686 = Static196.anInt3872;
			Static370.anInt6575 = 0;
		}
		if (Static411.aClass238_7 != Static356.aClass238_6) {
			@Pc(200) boolean local200;
			if (Static385.anInt6686 < 1024 && Static120.anInt2616 < 768) {
				local200 = true;
			} else {
				local200 = false;
			}
		}
		if (arg4) {
			Static267.method4012();
		} else {
			Static351.aCanvas6.setSize(Static385.anInt6686, Static120.anInt2616);
			Static266.aClass75_7.method2591(Static351.aCanvas6);
			if (local78 == Static225.aFrame1) {
				local98 = Static225.aFrame1.getInsets();
				Static351.aCanvas6.setLocation(local98.left + Static405.anInt7048, Static370.anInt6575 + local98.top);
			} else {
				Static351.aCanvas6.setLocation(Static405.anInt7048, Static370.anInt6575);
			}
		}
		if (arg3 < 2) {
			Static323.aBoolean417 = false;
		} else {
			Static323.aBoolean417 = true;
		}
		if (Static337.anInt6221 != -1) {
			Static300.method4442(true);
		}
		if (Static122.aClass27_1 != null && (Static142.anInt3209 == 30 || Static142.anInt3209 == 25)) {
			Static147.method2666();
		}
		for (local152 = 0; local152 < 100; local152++) {
			Static308.aBooleanArray18[local152] = true;
		}
		Static91.aBoolean161 = true;
	}
}
