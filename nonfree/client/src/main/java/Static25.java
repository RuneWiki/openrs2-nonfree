import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_22 = new Class221("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
	public static int anInt604 = -1;

	@OriginalMember(owner = "client!bq", name = "Y", descriptor = "[S")
	public static short[] aShortArray14 = new short[256];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method675(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static16.aClass20_1 != null) {
			@Pc(25) int local25;
			try {
				Static16.aClass20_1.method491(0L);
				Static16.aClass20_1.method492(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method4191(24, local13);
	}
}
