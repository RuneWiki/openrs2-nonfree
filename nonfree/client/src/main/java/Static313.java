import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!po", name = "n", descriptor = "Lclient!lt;")
	public static Class158 aClass158_69;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_89 = new Class186(87, 12);

	@OriginalMember(owner = "client!po", name = "l", descriptor = "S")
	public static short aShort69 = 1;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_82 = new Class25(58, 3);

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public static int anInt5099 = -1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bl;I[Lclient!uh;)Lclient!sj;")
	public static Class230 method4477(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) Class243[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong198 <= 0L) {
				return null;
			}
		}
		@Pc(43) long local43 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(45) int local45 = 0; local45 < arg1.length; local45++) {
			OpenGL.glAttachObjectARB(local43, arg1[local45].aLong198);
		}
		OpenGL.glLinkProgramARB(local43);
		OpenGL.glGetObjectParameterivARB(local43, 35714, Static231.anIntArray337, 0);
		if (Static231.anIntArray337[0] == 0) {
			if (Static231.anIntArray337[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local43, 35716, Static231.anIntArray337, 1);
			if (Static231.anIntArray337[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static231.anIntArray337[1]];
				OpenGL.glGetInfoLogARB(local43, Static231.anIntArray337[1], Static231.anIntArray337, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static231.anIntArray337[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local43, arg1[local119].aLong198);
				}
				OpenGL.glDeleteObjectARB(local43);
				return null;
			}
		}
		return new Class230(arg0, local43, arg1);
	}
}
