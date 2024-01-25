import java.awt.datatransfer.Clipboard;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt5190;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt5192;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_83 = new Class32("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt5189 = -1;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static int anInt5191 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[B")
	public static byte[] method4528(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub10_Sub14 local10 = (Class2_Sub10_Sub14) Static305.aClass166_4.method3688((long) arg0);
		if (local10 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(47) int local47 = 255 - local42;
				@Pc(52) int local52 = Static331.method4885(local26, local47);
				@Pc(56) byte local56 = local20[local52];
				local20[local52] = local20[local47];
				local20[local47] = local20[511 - local42] = local56;
			}
			local10 = new Class2_Sub10_Sub14(local20);
			Static305.aClass166_4.method3693((long) arg0, local10);
		}
		return local10.aByteArray80;
	}
}
