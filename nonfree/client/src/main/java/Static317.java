import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!rt", name = "K", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_197 = new Class221("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!rt", name = "X", descriptor = "J")
	public static long aLong174 = -1L;

	@OriginalMember(owner = "client!rt", name = "eb", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method4924(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static289.method4417(arg1, 0, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
	public static void method4925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static60.aClass216_3.method5073(Static5.aClass221_239.method5229(Static189.anInt5185));
		@Pc(28) int local28;
		for (@Pc(20) Class2_Sub7 local20 = (Class2_Sub7) Static66.aClass210_43.method5035(); local20 != null; local20 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			local28 = Static349.method5338(local20);
			if (local15 < local28) {
				local15 = local28;
			}
		}
		local15 += 8;
		local28 = Static379.anInt1192 * 16 + 21;
		@Pc(58) int local58 = arg1 - local15 / 2;
		if (Static335.anInt5875 < local15 + local58) {
			local58 = Static335.anInt5875 - local15;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(81) int local81 = arg0;
		if (arg0 + local28 > Static263.anInt4662) {
			local81 = Static263.anInt4662 - local28;
		}
		if (local81 < 0) {
			local81 = 0;
		}
		Static8.anInt189 = local58;
		Static48.aBoolean87 = true;
		Static40.anInt6591 = local81;
		Static71.anInt1351 = Static379.anInt1192 * 16 + (Static372.aBoolean487 ? 26 : 22);
		Static300.anInt5403 = local15;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z[[[Lclient!ui;)V")
	public static void method4926(@OriginalArg(1) Class227[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class227[][] local14 = arg0[local8];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class227 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass12_Sub5_2 instanceof Interface11) {
							((Interface11) local28.aClass12_Sub5_2).method5022();
						}
						if (local28.aClass12_Sub4_3 instanceof Interface11) {
							((Interface11) local28.aClass12_Sub4_3).method5022();
						}
						if (local28.aClass12_Sub4_2 instanceof Interface11) {
							((Interface11) local28.aClass12_Sub4_2).method5022();
						}
						if (local28.aClass12_Sub2_2 instanceof Interface11) {
							((Interface11) local28.aClass12_Sub2_2).method5022();
						}
						if (local28.aClass12_Sub2_3 instanceof Interface11) {
							((Interface11) local28.aClass12_Sub2_3).method5022();
						}
						for (@Pc(78) Class164 local78 = local28.aClass164_25; local78 != null; local78 = local78.aClass164_19) {
							@Pc(83) Class12_Sub1 local83 = local78.aClass12_Sub1_2;
							if (local83 instanceof Interface11) {
								((Interface11) local83).method5022();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
	public static void method4927() {
		if (Static73.aBoolean116) {
			return;
		}
		if (Static223.aBoolean308) {
			Static18.aFloat8 = (int) Static18.aFloat8 + 191 & 0xFFFFFF80;
		} else {
			Static375.aFloat45 += (24.0F - Static375.aFloat45) / 2.0F;
		}
		Static73.aBoolean116 = true;
		Static92.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V")
	public static void method4928() {
		Static52.anImage5 = null;
		Static390.aFont1 = null;
	}
}
