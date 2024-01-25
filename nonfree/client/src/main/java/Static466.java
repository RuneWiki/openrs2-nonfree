import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt8301;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public static int anInt8306;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method6960() {
		Static446.anInt8097 = Static184.aClass213_5.anInt6973 + Static184.aClass213_5.anInt6972 + 2;
		Static363.aStringArray36 = new String[500];
		Static195.anInt4214 = Static2.aClass213_9.anInt6973 + Static2.aClass213_9.anInt6972 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static363.aStringArray36.length; local27++) {
			Static363.aStringArray36[local27] = "";
		}
		Static552.method7749(Static536.aClass316_3.method7577(Static638.anInt10709));
	}
}
