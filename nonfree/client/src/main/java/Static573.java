import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_237 = new Class160(53, 8);

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
	public static int anInt9481 = -1;

	@OriginalMember(owner = "client!sv", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString106 = null;

	@OriginalMember(owner = "client!sv", name = "T", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
	public static byte[] method8186(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static148.method2179(local6, arg0, arg1);
			return local6;
		} catch (@Pc(26) IOException local26) {
			return null;
		}
	}
}
