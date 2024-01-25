import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_448 = new Class305(11, -2);

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "[Lclient!se;")
	public static final Class265[] aClass265Array1 = new Class265[32];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
	public static void method7944() {
		if (Static14.anInt324 != -1) {
			Static348.method5764(false, Static14.anInt324, -1, -1);
			Static14.anInt324 = -1;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)I")
	public static int method7945(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!os;Z)V")
	public static void method7946(@OriginalArg(0) Class1_Sub17 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static329.anInt6176; local13++) {
			@Pc(19) int local19 = arg0.method4480();
			@Pc(23) int local23 = arg0.method4494();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static332.aClass38_Sub1Array99[local19] != null) {
				Static332.aClass38_Sub1Array99[local19].anInt5568 = local23;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V")
	public static void method7947() {
		if (Static398.anInt7023 < 0) {
			return;
		}
		@Pc(11) long local11 = Static110.method2222();
		Static398.anInt7023 = (int) ((long) Static398.anInt7023 + Static205.aLong179 - local11);
		if (Static398.anInt7023 <= 0) {
			Static442.aClass103_4 = Static17.aClass126_1.aClass103_1;
			Static398.anInt7023 = -1;
			Static202.anInt4056 = Static17.aClass126_1.anInt3475;
			Static342.anInt6309 = Static17.aClass126_1.anInt3479;
			Static199.aFloat35 = Static17.aClass126_1.aFloat58;
			Static487.aFloat183 = Static17.aClass126_1.aFloat57;
			Static86.aFloat43 = Static17.aClass126_1.aFloat59;
			Static316.aFloat134 = Static17.aClass126_1.aFloat60;
			Static39.anInt1114 = Static17.aClass126_1.anInt3476;
			Static497.aFloat38 = Static17.aClass126_1.aFloat55;
			Static32.aFloat27 = Static17.aClass126_1.aFloat56;
		} else {
			@Pc(65) int local65 = (Static398.anInt7023 << 8) / Static49.anInt1303;
			@Pc(70) int local70 = 255 - local65;
			@Pc(75) float local75 = (float) local65 / 255.0F;
			@Pc(80) float local80 = 1.0F - local75;
			Static342.anInt6309 = ((Static255.anInt4996 & 0xFF00) * local65 + local70 * (Static17.aClass126_1.anInt3479 & 0xFF00) & 0xFF0000) + (local65 * (Static255.anInt4996 & 0xFF00FF) + (local70 * (Static17.aClass126_1.anInt3479 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static199.aFloat35 = local80 * (Static17.aClass126_1.aFloat58 - Static313.aFloat133) + Static313.aFloat133;
			Static497.aFloat38 = Static351.aFloat138 + local80 * (Static17.aClass126_1.aFloat55 - Static351.aFloat138);
			Static86.aFloat43 = local80 * (Static17.aClass126_1.aFloat59 - Static65.aFloat39) + Static65.aFloat39;
			Static202.anInt4056 = (local65 * (Static39.anInt1115 & 0xFF00) + local70 * (Static17.aClass126_1.anInt3475 & 0xFF00) & 0xFF0000) + ((Static17.aClass126_1.anInt3475 & 0xFF00FF) * local70 + local65 * (Static39.anInt1115 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static487.aFloat183 = local80 * (Static17.aClass126_1.aFloat57 - Static59.aFloat36) + Static59.aFloat36;
			Static39.anInt1114 = local65 * Static540.anInt9540 + local70 * Static17.aClass126_1.anInt3476 >> 8;
			Static32.aFloat27 = local80 * (Static17.aClass126_1.aFloat56 - Static55.aFloat32) + Static55.aFloat32;
			Static316.aFloat134 = Static76.aFloat41 + local80 * (Static17.aClass126_1.aFloat60 - Static76.aFloat41);
			if (Static303.aClass103_3 != Static17.aClass126_1.aClass103_1) {
				Static442.aClass103_4 = Static247.aClass4_7.method7200(Static303.aClass103_3, Static17.aClass126_1.aClass103_1, local80, Static442.aClass103_4);
			}
		}
		Static205.aLong179 = local11;
	}
}
