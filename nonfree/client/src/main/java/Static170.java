import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_35 = new Class171(37, 5);

	@OriginalMember(owner = "client!fia", name = "m", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!fia", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
	public static int anInt3111 = 0;

	@OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
	public static int anInt3112 = 1;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2690(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static681.method4034(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLclient!of;)V")
	public static void method2691(@OriginalArg(1) Class264 arg0) {
		Static438.aClass264_1 = arg0;
	}
}
