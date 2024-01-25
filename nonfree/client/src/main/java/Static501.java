import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!vd;")
	public static Class353 aClass353_100;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "Lclient!qq;")
	public static Class276 aClass276_6;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!vd;")
	public static Class353 aClass353_101;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public static int anInt8668 = 0;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_160 = new Class268(58, 4);

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
	public static int anInt8669 = 0;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray46 = new boolean[100];

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
	public static int anInt8676 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)I")
	public static int method7466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class100_Sub1.anIntArray429[arg3 * 8192 / arg0] >> 1;
		return ((65536 - local21) * arg1 >> 16) + (local21 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;IILclient!wh;)Lclient!qi;")
	public static Class273 method7467(@OriginalArg(0) String arg0, @OriginalArg(3) Class100_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static523.anIntArray559, 0);
		if (Static523.anIntArray559[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class273(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I")
	public static int method7468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
