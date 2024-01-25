import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "Lclient!rg;")
	public static Class310 aClass310_54;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	public static int anInt4668;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Lclient!as;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_131 = new Class160(40, -2);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4080(@OriginalArg(0) String arg0) {
		return Static356.aHashtable4.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!jc;Z)Lclient!lr;")
	public static Class225_Sub1 method4081(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(7) Class225 local7 = Static297.method4856(arg0);
		@Pc(11) int local11 = arg0.method7755();
		return new Class225_Sub1(local7.anInt6159, local7.aClass258_7, local7.aClass205_11, local7.anInt6158, local7.anInt6156, local11);
	}
}
