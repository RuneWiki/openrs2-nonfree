import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "Lclient!ef;")
	public static Class97 aClass97_3;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
	public static final int[] anIntArray279 = new int[2048];

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public static int anInt4896 = -2;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method4177(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static640.method8766(local6, arg0, arg1);
			return local6;
		} catch (@Pc(16) IOException local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)V")
	public static void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static367.method9035(false, true, local35);
	}
}
