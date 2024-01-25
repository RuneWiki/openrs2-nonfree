import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lclient!id;")
	public static final Class112[] aClass112Array1 = new Class112[4];

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[Lclient!d;")
	public static final Class1_Sub2_Sub6[] aClass1_Sub2_Sub6Array5 = new Class1_Sub2_Sub6[14];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method2698() {
		Static269.aClass109_9.ua(((float) Static389.aClass128_Sub1_1.anInt3562 * 0.1F + 0.7F) * 1.1523438F);
		Static269.aClass109_9.XA(Static267.anInt4801, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static269.aClass109_9.V(Static281.anInt4959, -1, 256);
		Static269.aClass109_9.method4711(Static33.aClass78_1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!qa;III)Lclient!c;")
	public static Class37 method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class109 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(17) Class37 local17 = (Class37) Static199.aClass83_32.method1658(local6);
		if (local17 == null) {
			@Pc(27) Class264 local27 = Static358.method4932(Static204.aClass250_47, arg3);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt7617 < 13) {
				local27.method5909();
			}
			local17 = arg2.method4697(local27, 2055, Static301.anInt3999, 64, 768);
			Static199.aClass83_32.method1675(local6, local17);
		}
		local17 = local17.method4221((byte) 2, 2055, true);
		if (arg4 != 0) {
			local17.k(arg4);
		}
		if (arg0 != 0) {
			local17.WA(arg0);
		}
		if (arg1 != 0) {
			local17.o(arg1);
		}
		if (arg5 != 0) {
			local17.ja(0, arg5, 0);
		}
		return local17;
	}
}
