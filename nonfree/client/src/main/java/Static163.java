import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array176;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_206 = new Class189("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	public static int[] anIntArray403 = new int[2];

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt6305 = 0;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[S")
	public static final short[] aShortArray126 = new short[] { 17, 4, 11, 9, 22, 12, 20, 30 };

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!cu;)V")
	public static void method4905(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static415.aClass103_5 != null) {
			@Pc(25) int local25;
			try {
				Static415.aClass103_5.method2519(0L);
				Static415.aClass103_5.method2514(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method2595(24, local13);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method4906(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static462.method4611(arg0, arg1, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method4907(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static37.method728(arg0);
	}
}
