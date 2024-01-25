import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "[I")
	public static int[] anIntArray602;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "[Lclient!sa;")
	public static Class75[] aClass75Array2;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	public static int anInt7875;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_24 = new Class91(7, 2);

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	public static int anInt7873 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lclient!waa;")
	public static Class1_Sub4 method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub4_1 == null ? null : local7.aClass1_Sub4_1;
	}
}
