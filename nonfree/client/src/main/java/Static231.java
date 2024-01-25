import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
	public static int anInt8415;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!ev;")
	public static Class102 aClass102_6;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_132 = new Class216(42, 3);

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "[I")
	public static final int[] anIntArray576 = new int[5];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!es;)Lclient!eb;")
	public static Class81 method7281(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(7) Class81 local7 = new Class81();
		local7.anInt2221 = arg0.method8859();
		local7.aClass4_Sub5_Sub16_1 = Static410.aClass298_1.method6589(local7.anInt2221);
		return local7;
	}
}
