import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_254 = new Class359(121, 7);

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	public static int anInt10820 = -1;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "[I")
	public static final int[] anIntArray610 = new int[2];

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
	public static boolean aBoolean919 = false;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "[C")
	public static final char[] aCharArray19 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	public static void method9004() {
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			Static122.aClass374Array3[local9] = null;
		}
		Static406.anInt7204 = 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[B)[B")
	public static byte[] method9007(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static686.method4972(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!rga;")
	public static Class244 method9008(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class244_Sub1(arg0, 15000);
	}
}
