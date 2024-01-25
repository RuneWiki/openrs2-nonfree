import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "[[Lclient!bw;")
	public static Class31[][] aClass31ArrayArray1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_137 = new Class36(18, 12);

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_102 = new Class242("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt7427 = -1;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!ob;")
	public static final Class170 aClass170_4 = new Class170("LIVE", 0);

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_103 = new Class242(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5728(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static22.anInt6850; local11++) {
			if (arg0.equalsIgnoreCase(Static291.aStringArray33[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
	public static void method5730() {
		if (Static207.anInt3911 < 0) {
			return;
		}
		@Pc(11) long local11 = Static199.method2845();
		Static207.anInt3911 = (int) ((long) Static207.anInt3911 + Static208.aLong106 - local11);
		if (Static207.anInt3911 > 0) {
			@Pc(30) int local30 = (Static207.anInt3911 << 8) / Static315.anInt5650;
			@Pc(34) int local34 = 255 - local30;
			@Pc(39) float local39 = (float) local30 / 255.0F;
			Static28.anInt681 = ((Static173.anInt3222 & 0xFF00FF) * local30 + local34 * (Static229.aClass31_2.anInt1298 & 0xFF00FF) & 0xFF00FF00) + ((Static229.aClass31_2.anInt1298 & 0xFF00) * local34 + (Static173.anInt3222 & 0xFF00) * local30 & 0xFF0000) >>> 8;
			@Pc(76) float local76 = 1.0F - local39;
			Static75.anInt1780 = Static116.anInt2458 * local30 + local34 * Static229.aClass31_2.anInt1297 >> 8;
			Static197.anInt6471 = ((Static229.aClass31_2.anInt1293 & 0xFF00) * local34 + local30 * (Static418.anInt7095 & 0xFF00) & 0xFF0000) + ((Static229.aClass31_2.anInt1293 & 0xFF00FF) * local34 + local30 * (Static418.anInt7095 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static155.aFloat89 = Static155.aFloat90 + (Static229.aClass31_2.aFloat44 - Static155.aFloat90) * local76;
			Static358.aFloat188 = Static306.aFloat150 + (Static229.aClass31_2.aFloat47 - Static306.aFloat150) * local76;
			Static152.aFloat84 = Static249.aFloat125 + local76 * (Static229.aClass31_2.aFloat48 - Static249.aFloat125);
			Static451.aFloat220 = Static272.aFloat137 + local76 * (Static229.aClass31_2.aFloat45 - Static272.aFloat137);
			Static361.aFloat120 = Static408.aFloat204 + (Static229.aClass31_2.aFloat46 - Static408.aFloat204) * local76;
			Static322.aFloat160 = Static31.aFloat19 + local76 * (Static229.aClass31_2.aFloat49 - Static31.aFloat19);
			if (Static229.aClass31_2.aClass59_1 != Static138.aClass59_2) {
				Static186.aClass59_3 = Static413.aClass30_12.method4641(Static138.aClass59_2, Static229.aClass31_2.aClass59_1, local76, Static186.aClass59_3);
			}
		} else {
			Static451.aFloat220 = Static229.aClass31_2.aFloat45;
			Static155.aFloat89 = Static229.aClass31_2.aFloat44;
			Static207.anInt3911 = -1;
			Static361.aFloat120 = Static229.aClass31_2.aFloat46;
			Static75.anInt1780 = Static229.aClass31_2.anInt1297;
			Static322.aFloat160 = Static229.aClass31_2.aFloat49;
			Static152.aFloat84 = Static229.aClass31_2.aFloat48;
			Static197.anInt6471 = Static229.aClass31_2.anInt1293;
			Static186.aClass59_3 = Static229.aClass31_2.aClass59_1;
			Static28.anInt681 = Static229.aClass31_2.anInt1298;
			Static358.aFloat188 = Static229.aClass31_2.aFloat47;
		}
		Static208.aLong106 = local11;
	}
}
