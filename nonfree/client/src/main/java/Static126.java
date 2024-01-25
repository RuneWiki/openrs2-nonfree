import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public static int anInt4529;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_81 = new Class231(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_73 = new Class186(3, -2);

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_82 = new Class231("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public static int anInt4528 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Z")
	public static boolean method4050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static330.method3977(arg0, arg1) || Static73.method1405(arg1, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)S")
	public static short method4051(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(44) int local44 = local19 + local39;
		@Pc(52) int local52;
		if (local44 == 0) {
			local52 = local39 << 1;
		} else {
			local52 = (local39 << 8) / local44;
		}
		return (short) (local44 | local9 << 10 | local52 >> 4 << 7);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZLjava/lang/String;Lclient!lt;)Lclient!ws;")
	public static Class267 method4052(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class158 arg2) {
		@Pc(10) int local10 = arg2.method3677(arg1);
		if (local10 == -1) {
			return new Class267(0);
		}
		@Pc(29) int[] local29 = arg2.method3687(local10);
		@Pc(35) Class267 local35 = new Class267(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt7259) {
				@Pc(53) Class6_Sub15 local53 = new Class6_Sub15(arg2.method3672(local29[local39++], local10));
				@Pc(57) int local57 = local53.method3109();
				@Pc(61) int local61 = local53.method3108();
				@Pc(65) int local65 = local53.method3111();
				if (!arg0 && local65 == 1) {
					local35.anInt7259--;
				} else {
					local35.anIntArray636[local37] = local57;
					local35.anIntArray637[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}
}
