import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_24 = new Class77(5, -1);

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_36 = new Class221("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	public static int anInt1143 = 0;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_25 = new Class77(12, 6);

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Lclient!id;")
	public static Class2_Sub18 aClass2_Sub18_1 = null;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Lclient!du;")
	public static final Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method1064() {
		@Pc(5) Class154 local5 = Static285.aClass154_38;
		synchronized (Static285.aClass154_38) {
			Static285.aClass154_38.method3746();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method1065(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static379.anInt1197; local18++) {
			if (arg0.equalsIgnoreCase(Static217.aStringArray24[local18])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static93.aStringArray11[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)V")
	public static void method1067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1009) {
			Static157.method2605(Static206.aClass144_6, arg1, arg2);
		} else if (arg0 == 1003) {
			Static157.method2605(Static111.aClass144_5, arg1, arg2);
		} else if (arg0 == 1006) {
			Static157.method2605(Static217.aClass144_8, arg1, arg2);
		} else if (arg0 == 1008) {
			Static157.method2605(Static371.aClass144_11, arg1, arg2);
		} else if (arg0 == 1012) {
			Static157.method2605(Static58.aClass144_10, arg1, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
	public static void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class214 local10 = new Class214(16);
		for (@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) Static147.aClass214_14.method5060(); local15 != null; local15 = (Class2_Sub5) Static147.aClass214_14.method5064()) {
			local15.method5745();
			@Pc(26) int local26 = (int) (local15.aLong208 >> 28);
			@Pc(36) int local36 = (int) (local15.aLong208 >> 14 & 0x3FFFL) - arg0;
			@Pc(44) int local44 = (int) (local15.aLong208 & 0x3FFFL) - arg1;
			if (local44 >= 0 && local36 >= 0 && local44 < Static392.anInt6751 && Static307.anInt5484 > local36) {
				local10.method5065((long) (local44 | local26 << 28 | local36 << 14), local15);
			}
		}
		Static147.aClass214_14 = local10;
	}
}
