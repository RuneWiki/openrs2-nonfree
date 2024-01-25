import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_62 = new Class265(10, -1);

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public static int anInt3179 = 2;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_18 = new Class163(512);

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_63 = new Class265(55, 6);

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_68 = new Class209("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
	public static int method2555(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;IILclient!ef;)Lclient!km;")
	public static Class143 method2556(@OriginalArg(0) String arg0, @OriginalArg(3) Class49_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static11.anIntArray31, 0);
		if (Static11.anIntArray31[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class143(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIIII)I")
	public static int method2557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg2 & 0xF;
		@Pc(22) int local22 = local15 >= 8 ? arg0 : arg3;
		@Pc(41) int local41 = local15 >= 4 ? (local15 == 12 || local15 == 14 ? arg3 : arg1) : arg0;
		return ((local15 & 0x1) == 0 ? local22 : -local22) + ((local15 & 0x2) == 0 ? local41 : -local41);
	}
}
