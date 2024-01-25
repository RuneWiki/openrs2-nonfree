import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pda", name = "z", descriptor = "Lclient!kha;")
	public static Class181 aClass181_102;

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!pda", name = "I", descriptor = "[Lclient!aj;")
	public static Class2_Sub2[] aClass2_Sub2Array3;

	@OriginalMember(owner = "client!pda", name = "F", descriptor = "[I")
	public static final int[] anIntArray561 = new int[1];

	@OriginalMember(owner = "client!pda", name = "J", descriptor = "Z")
	public static boolean aBoolean751 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method7358(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local6 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local6 <= local25 - 2 || Static494.method7241(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local25 - 1 >= local6 || Static494.method7241(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(74) byte[] local74 = new byte[local31];
		Static459.method6903(local74, 0, arg0);
		return local74;
	}
}
