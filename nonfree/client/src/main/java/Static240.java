import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array17;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_155 = new Class175("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_163 = new Class184(42, 8);

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Z")
	public static boolean aBoolean348 = true;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_164 = new Class184(40, 10);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;IILclient!gk;)Lclient!hd;")
	public static Class94 method3748(@OriginalArg(0) String arg0, @OriginalArg(3) Class75_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static383.anIntArray479, 0);
		if (Static383.anIntArray479[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class94(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIZZ)Lclient!dn;")
	public static Class56 method3749(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(13) Class117 local13 = null;
		if (Static101.aClass240_3 != null) {
			local13 = new Class117(arg0, Static101.aClass240_3, Static193.aClass240Array5[arg0], 1000000);
		}
		Static58.aClass50_Sub1Array1[arg0] = Static164.aClass164_1.method3969(Static349.aClass117_27, arg0, local13);
		if (arg1) {
			Static58.aClass50_Sub1Array1[arg0].method1831();
		}
		return new Class56(Static58.aClass50_Sub1Array1[arg0], arg2, 1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I")
	public static int method3750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}
}
