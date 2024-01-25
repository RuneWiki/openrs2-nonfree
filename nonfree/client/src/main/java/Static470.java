import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	public static int anInt5389;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public static int anInt5390;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_60 = new Class341(8, 8);

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_143 = new Class169(130, 8);

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Lclient!lo;")
	public static final Class220 aClass220_6 = new Class220();

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "[Lclient!rc;")
	public static final Class309[] aClass309Array3 = new Class309[100];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4884(@OriginalArg(1) Class101 arg0) {
		for (@Pc(12) Class15_Sub5 local12 = (Class15_Sub5) Static559.aClass60_8.method1547(); local12 != null; local12 = (Class15_Sub5) Static559.aClass60_8.method1546()) {
			if (local12.aBoolean185) {
				local12.method2302(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)I")
	public static int method4887() {
		if (Static267.aClass357_180 == null) {
			if (!Static183.aBoolean305 && Static577.aClass2_Sub1_Sub13_4 != null) {
				return Static577.aClass2_Sub1_Sub13_4.anInt6872;
			}
			@Pc(23) int local23 = Static7.aClass6_1.method7048();
			@Pc(27) int local27 = Static7.aClass6_1.method7049();
			@Pc(65) int local65;
			@Pc(67) int local67;
			@Pc(80) int local80;
			@Pc(147) Class2_Sub1_Sub13 local147;
			if (Static672.aBoolean808) {
				@Pc(142) Class126 local142;
				if (local23 > Static537.anInt9380 && Static22.anInt384 + Static537.anInt9380 > local23) {
					local65 = -1;
					for (local67 = 0; local67 < Static488.anInt8750; local67++) {
						if (Static300.aBoolean723) {
							local80 = local67 * 16 + Static297.anInt5412 + 33;
							if (local27 > local80 - 13 && local80 + 3 >= local27) {
								local65 = local67;
							}
						} else {
							local80 = Static297.anInt5412 + local67 * 16 + 31;
							if (local27 > local80 - 13 && local27 <= local80 + 3) {
								local65 = local67;
							}
						}
					}
					if (local65 != -1) {
						local80 = 0;
						local142 = new Class126(Static112.aClass279_6);
						for (@Pc(236) Class2_Sub1_Sub19 local236 = (Class2_Sub1_Sub19) local142.method3766(); local236 != null; local236 = (Class2_Sub1_Sub19) local142.method3767()) {
							if (local65 == local80++) {
								return ((Class2_Sub1_Sub13) local236.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67).anInt6872;
							}
						}
					}
				} else if (Static214.aClass2_Sub1_Sub19_1 != null && local23 > Static429.anInt7876 && Static100.anInt1550 + Static429.anInt7876 > local23) {
					local65 = -1;
					for (local67 = 0; local67 < Static214.aClass2_Sub1_Sub19_1.anInt9806; local67++) {
						if (Static300.aBoolean723) {
							local80 = Static659.anInt11274 + local67 * 16 + 33;
							if (local27 > local80 - 13 && local27 <= local80 + 3) {
								local65 = local67;
							}
						} else {
							local80 = Static659.anInt11274 + local67 * 16 + 31;
							if (local27 > local80 - 13 && local80 + 3 >= local27) {
								local65 = local67;
							}
						}
					}
					if (local65 != -1) {
						local80 = 0;
						local142 = new Class126(Static214.aClass2_Sub1_Sub19_1.aClass279_13);
						for (local147 = (Class2_Sub1_Sub13) local142.method3766(); local147 != null; local147 = (Class2_Sub1_Sub13) local142.method3767()) {
							if (local65 == local80++) {
								return local147.anInt6872;
							}
						}
					}
				}
			} else if (Static537.anInt9380 < local23 && local23 < Static22.anInt384 + Static537.anInt9380) {
				local65 = -1;
				for (local67 = 0; local67 < Static276.anInt5124; local67++) {
					if (Static300.aBoolean723) {
						local80 = (Static276.anInt5124 - local67 - 1) * 16 + Static297.anInt5412 + 33;
						if (local80 - 13 < local27 && local27 <= local80 + 3) {
							local65 = local67;
						}
					} else {
						local80 = (Static276.anInt5124 - local67 - 1) * 16 + Static297.anInt5412 + 31;
						if (local80 - 13 < local27 && local27 <= local80 + 3) {
							local65 = local67;
						}
					}
				}
				if (local65 != -1) {
					local80 = 0;
					@Pc(360) Class370 local360 = new Class370(Static61.aClass271_6);
					for (local147 = (Class2_Sub1_Sub13) local360.method9306(); local147 != null; local147 = (Class2_Sub1_Sub13) local360.method9305()) {
						if (local65 == local80++) {
							return local147.anInt6872;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method4889(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static555.method8483(arg1, arg0, -1, -1);
	}
}
