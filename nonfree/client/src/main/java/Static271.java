import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "Lclient!si;")
	public static final Class338 aClass338_24 = new Class338(4);

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_47 = new Class286(22, 7);

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V")
	public static void method4143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static622.aClass67_15 == null) {
			return;
		}
		@Pc(16) int local16 = Static310.anInt5521;
		@Pc(18) int local18 = Static643.anInt10383;
		Static108.method1947(arg0, arg1);
		if (Static293.anInt5243 == 0) {
			Static488.anInterface20_1 = null;
			Static488.anInterface20_1 = Static622.aClass67_15.method7638(Static622.aClass67_15.method7717(Static306.anInt5501, Static648.anInt10431), Static622.aClass67_15.method7689(Static306.anInt5501, Static648.anInt10431));
		} else if (Static293.anInt5243 == 1 && (Static76.anInterface20Array1 == null || local16 != Static310.anInt5521 || Static643.anInt10383 != local18)) {
			Static76.anInterface20Array1 = new Interface20[Static310.anInt5521 * Static643.anInt10383];
			for (@Pc(80) int local80 = 0; local80 < Static76.anInterface20Array1.length; local80++) {
				Static76.anInterface20Array1[local80] = Static622.aClass67_15.method7638(Static622.aClass67_15.method7717(Static299.anInt6879, Static523.anInt8898), Static622.aClass67_15.method7689(Static299.anInt6879, Static523.anInt8898));
			}
			Static277.anIntArray289 = new int[Static643.anInt10383 * Static310.anInt5521];
			Static686.anInt7557 = 1;
		}
		Static70.aBoolean89 = true;
	}
}
