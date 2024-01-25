import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZZI)I")
	public static int method1283(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub32 local13 = Static238.method3609(arg2, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && local13.anIntArray340.length > arg0) {
			return local13.anIntArray340[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
	public static int method1284(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vj;Ljava/lang/String;II)Lclient!tq;")
	public static Class237 method1285(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static277.anIntArray344, 0);
		if (Static277.anIntArray344[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class237(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
