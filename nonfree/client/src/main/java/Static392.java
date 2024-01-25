import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!lt;")
	public static final Class142 aClass142_3 = new Class142(16);

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "[I")
	public static final int[] anIntArray498 = new int[50];

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_86 = new Class215(61, 2);

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	public static int anInt6542 = 0;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "[Lclient!kf;")
	public static Class78_Sub1[] aClass78_Sub1Array1 = new Class78_Sub1[0];

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "[Lclient!ah;")
	public static final Class8[] aClass8Array1 = new Class8[16];

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	public static int anInt6543 = 0;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_134 = new Class83("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Lclient!uu;")
	public static Class247 method5121(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static297.aClass247ArrayArray2[local15] == null || Static297.aClass247ArrayArray2[local15][local19] == null) {
			@Pc(35) boolean local35 = Static112.method2034(local15);
			if (!local35) {
				return null;
			}
		}
		return Static297.aClass247ArrayArray2[local15][local19];
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLclient!fd;Ljava/lang/String;)Lclient!td;")
	public static Class225 method5125(@OriginalArg(2) Class19_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static47.anIntArray47, 0);
		if (Static47.anIntArray47[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class225(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
