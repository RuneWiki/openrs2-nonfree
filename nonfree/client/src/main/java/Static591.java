import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt9904;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!ul;")
	public static Class5_Sub1_Sub5 aClass5_Sub1_Sub5_4;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt9907;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_49 = new Class98("", 17);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!rs;ILjava/lang/String;)Lclient!ica;")
	public static Class156 method8515(@OriginalArg(1) Class133_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static376.anIntArray347, 0);
		if (Static376.anIntArray347[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class156(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILclient!pe;III)V")
	public static void method8516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		Static551.method8046(arg0, arg2.anInt10229, arg2.anInt10231, arg3, arg1, 0, arg2.aByte132);
	}
}
