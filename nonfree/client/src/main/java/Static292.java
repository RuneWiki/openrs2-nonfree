import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_196 = new Class62("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_197 = new Class62("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!da;)V")
	public static void method4814(@OriginalArg(0) Class2_Sub8_Sub1 arg0) {
		if (Static184.anInt3912 >= 65535) {
			return;
		}
		Static41.aClass2_Sub8_Sub1Array1[Static184.anInt3912] = arg0;
		Static160.aBooleanArray16[Static184.anInt3912] = false;
		Static184.anInt3912++;
		@Pc(18) int local18 = arg0.anInt1381;
		if (arg0.aBoolean111) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt1381;
		if (arg0.aBoolean112) {
			local26 = Static73.anInt1624 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt1377 + Static291.anInt5453 - arg0.anInt1374 >> Static162.anInt3362;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt1377 + arg0.anInt1374 - Static291.anInt5453 >> Static162.anInt3362;
			if (local66 >= Static285.anInt5263) {
				local66 = Static285.anInt5263 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray15[local38++];
				@Pc(96) int local96 = (arg0.anInt1379 + Static291.anInt5453 - arg0.anInt1374 >> Static162.anInt3362) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static176.anInt3742) {
					local104 = Static176.anInt3742 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static132.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static132.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static184.anInt3912;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static132.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static184.anInt3912 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static132.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static184.anInt3912 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static132.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static184.anInt3912 << 48;
					}
				}
			}
		}
	}
}
