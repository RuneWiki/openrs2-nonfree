import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public static int anInt4294;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public static int anInt4298;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_163 = new Class179(98, 8);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static final int[] anIntArray253 = new int[25];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!rv;B)V")
	public static void method3603(@OriginalArg(0) Class312 arg0) {
		Static586.aClass312_1 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!gga;I)Lclient!dd;")
	public static Class63_Sub1_Sub1 method3608(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(14) Class63_Sub1 local14 = Static104.method1705(arg0);
		@Pc(18) int local18 = arg0.method8395();
		return new Class63_Sub1_Sub1(local14.aClass7_9, local14.aClass249_12, local14.anInt8533, local14.anInt8532, local14.anInt8537, local14.anInt8536, local14.anInt8538, local14.anInt8535, local14.anInt8534, local14.anInt1778, local14.anInt1777, local14.anInt1779, local14.anInt1783, local14.anInt1780, local14.anInt1776, local18);
	}
}
