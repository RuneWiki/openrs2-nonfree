import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "Lclient!sj;")
	public static final Class296 aClass296_2 = new Class296();

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)V")
	public static void method4073(@OriginalArg(1) boolean arg0) {
		Static253.method4028(arg0, Static219.anInt4263, Static443.anInt7718, Static300.anInt5516);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V")
	public static void method4078() {
		Static504.aClass1_Sub8_Sub3_33.method4666();
		Static352.anInt6186 = 1;
		Static250.aClass111_52 = null;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
	public static byte[] method4081(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static90.method1762(arg1, arg0, local6);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
