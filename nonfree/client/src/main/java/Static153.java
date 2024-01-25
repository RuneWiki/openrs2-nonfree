import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jk", name = "Wb", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jk", name = "Nb", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_114 = new Class221(100, 12);

	@OriginalMember(owner = "client!jk", name = "Sb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[8];

	@OriginalMember(owner = "client!jk", name = "Vb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(IB)V")
	public static void method3166() {
		Static319.aBoolean562 = false;
		Static230.anInt5823 = 1;
		Static92.anInt1809 = 2;
		Static167.anInt3809 = -1;
		Static139.anInt3012 = -1;
		Static341.aClass104_24 = null;
		Static81.anInt1526 = 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!l;")
	public static RuntimeException_Sub1 method3173(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString40 = local12.aString40 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
