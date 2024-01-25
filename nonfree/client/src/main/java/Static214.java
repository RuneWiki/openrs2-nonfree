import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray4 = new int[2][][];

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_45 = new Class187(74, -1);

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_21 = new Class265(20);

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!pg;")
	public static final Class271 aClass271_13 = new Class271();

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public static int anInt3450 = 500;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt3451 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method3085() {
		Static62.anInt991 = 1;
		Static69.anInt1053 = -1;
		if (Static328.aString57 == null) {
			Static97.method1623(35);
		} else {
			@Pc(20) Class5_Sub15 local20 = new Class5_Sub15(Static324.method5062(Static532.method7417(Static328.aString57)));
			@Pc(24) long local24 = local20.method3634();
			Static416.aLong216 = local20.method3634();
			Static96.method1621("", true, Static618.method8284(local24));
		}
	}
}
