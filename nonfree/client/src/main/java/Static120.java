import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hj", name = "Qb", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!hj", name = "Nb", descriptor = "Lclient!al;")
	public static final Class11 aClass11_60 = new Class11(50);

	@OriginalMember(owner = "client!hj", name = "Ob", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!hj", name = "Pb", descriptor = "I")
	public static int anInt2681 = -1;

	@OriginalMember(owner = "client!hj", name = "Rb", descriptor = "Ljava/lang/String;")
	public static String aString98 = null;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "(II)I")
	public static int method2561(@OriginalArg(0) int arg0) {
		@Pc(7) Class169 local7 = Static267.method4558(arg0);
		@Pc(10) int local10 = local7.anInt4997;
		@Pc(18) int local18 = local7.anInt4998;
		@Pc(21) int local21 = local7.anInt5002;
		@Pc(27) int local27 = Class45.anIntArray129[local21 - local18];
		return Static102.anIntArray211[local10] >> local18 & local27;
	}
}
