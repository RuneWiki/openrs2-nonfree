import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "Lclient!ka;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "Lclient!ie;")
	public static Class115 aClass115_3;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
	public static final int anInt4515 = 1407;

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
	public static int anInt4522 = 0;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_64 = new Class142("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;Lclient!ih;IB)Lclient!ug;")
	public static Class249 method3587(@OriginalArg(0) String arg0, @OriginalArg(1) Class117_Sub1 arg1) {
		@Pc(13) int local13 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local13);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static107.anIntArray152, 0);
		if (Static107.anIntArray152[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class249(arg1, 34336, local13);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Lclient!be;")
	public static Class27 method3592(@OriginalArg(1) int arg0) {
		@Pc(10) Class27 local10 = (Class27) Static196.aClass77_29.method1387((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static304.aClass185_16.method4002(0, arg0);
		local10 = new Class27();
		if (local20 != null) {
			local10.method389(arg0, new Class1_Sub19(local20));
		}
		Static196.aClass77_29.method1396(local10, (long) arg0);
		return local10;
	}
}
