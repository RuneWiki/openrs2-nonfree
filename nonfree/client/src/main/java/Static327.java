import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!ns;")
	public static Class166 aClass166_228;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array10;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method4455(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static389.aBooleanArray25[arg0]) {
			Static247.aClass166_209.method3694(arg0);
			Static320.aClass126ArrayArray2[arg0] = null;
			Static70.aClass126ArrayArray4[arg0] = null;
			Static389.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!tl;)V")
	public static void method4456(@OriginalArg(1) Class4_Sub30 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static442.aClass162_5 != null) {
			@Pc(20) int local20;
			try {
				Static442.aClass162_5.method3598(0L);
				Static442.aClass162_5.method3589(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4843(local8, 24);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method4457() {
		if (Static341.anInt6053 == 5) {
			Static341.anInt6053 = 6;
		}
	}
}
