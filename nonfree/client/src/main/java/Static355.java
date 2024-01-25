import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wo", name = "Q", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_368 = new Class159("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public static void method5663() {
		Static345.anInt6784 = Static348.aClass16_8.anInt382 + Static348.aClass16_8.anInt383 + 2;
		Static278.aStringArray85 = new String[500];
		Static178.anInt3732 = Static330.aClass16_7.anInt383 + Static330.aClass16_7.anInt382 + 2;
		for (@Pc(31) int local31 = 0; local31 < Static278.aStringArray85.length; local31++) {
			Static278.aStringArray85[local31] = "";
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)V")
	public static void method5664(@OriginalArg(0) byte arg0) {
		if (Static63.aByteArrayArrayArray3 == null) {
			Static63.aByteArrayArrayArray3 = new byte[4][Static350.anInt6637][Static105.anInt2647];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static350.anInt6637; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static105.anInt2647; local26++) {
					Static63.aByteArrayArrayArray3[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Lclient!ko;")
	public static Class4_Sub4_Sub9 method5665(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub9 local10 = (Class4_Sub4_Sub9) Static327.aClass124_8.method3525((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static339.aClass193_2.method5047(Static324.method5268(arg0), Static245.method4355(arg0));
		local10 = new Class4_Sub4_Sub9();
		if (local24 != null) {
			local10.method3296(new Class4_Sub11(local24));
		}
		Static327.aClass124_8.method3528(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method5666(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static203.aClass193_73.anInt5952 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		@Pc(75) int local75;
		for (@Pc(18) int local18 = 0; local18 < Static2.anInt58; local18++) {
			@Pc(24) Class210 local24 = Static177.method3465(local18);
			if ((!arg1 || local24.aBoolean473) && local24.anInt6496 == -1 && local24.anInt6509 == -1 && local24.anInt6473 == 0 && local24.aString65.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static204.aShortArray53 = null;
					Static209.anInt4336 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(73) short[] local73 = new short[local14.length * 2];
					for (local75 = 0; local75 < local16; local75++) {
						local73[local75] = local14[local75];
					}
					local14 = local73;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static209.anInt4336 = local16;
		Static140.anInt3221 = 0;
		Static204.aShortArray53 = local14;
		@Pc(124) String[] local124 = new String[Static209.anInt4336];
		for (local75 = 0; local75 < Static209.anInt4336; local75++) {
			local124[local75] = Static177.method3465(local14[local75]).aString65;
		}
		Static312.method5145(local124, Static204.aShortArray53);
		Static203.aClass193_73.method5062();
		Static203.aClass193_73.anInt5952 = 2;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method5668(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static48.method958(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static250.method4420(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(BI)V")
	public static void method5669(@OriginalArg(1) int arg0) {
		if (!Static166.method3253(arg0)) {
			return;
		}
		@Pc(14) Class21[] local14 = Static271.aClass21ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class21 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt764 = 1;
				local22.anInt749 = 0;
				local22.anInt756 = 0;
			}
		}
	}
}
