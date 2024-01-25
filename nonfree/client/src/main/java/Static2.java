import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	public static int anInt39;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_2 = new Class160(77, -1);

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Lclient!uaa;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(CI)Z")
	public static boolean method51(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method54(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static456.method6459(local6, arg1, arg0);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
