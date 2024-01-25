import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public static int anInt5312;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public static int anInt5313;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!no", name = "A", descriptor = "[I")
	public static final int[] anIntArray501 = new int[5];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ih;IILjava/lang/String;)Lclient!bh;")
	public static Class26 method4076(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static454.anIntArray747, 0);
		if (Static454.anIntArray747[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class26(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method4077(@OriginalArg(0) Class1_Sub3 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static286.anInt5429; local15++) {
			@Pc(21) int local21 = arg0.method1168();
			@Pc(25) int local25 = arg0.method1177();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static361.aClass103_Sub1Array4[local21] != null) {
				Static361.aClass103_Sub1Array4[local21].anInt3185 = local25;
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ec;I)I")
	public static int method4080(@OriginalArg(1) Class68 arg0, @OriginalArg(2) int arg1) {
		if (!Static55.method1059(arg0).method4029(arg1) && arg0.anObjectArray7 == null) {
			return -1;
		} else if (arg0.anIntArray223 == null || arg0.anIntArray223.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray223[arg1];
		}
	}
}
