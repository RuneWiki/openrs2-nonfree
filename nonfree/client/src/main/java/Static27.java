import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!wba;")
	public static Class353 aClass353_3 = new Class353();

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_18 = new Class235(87, 6);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI[BLclient!hp;)Lclient!wq;")
	public static Class362 method315(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class134_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static255.anIntArray363, 0);
		if (Static255.anIntArray363[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class362(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
	public static boolean method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
