import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public static int anInt5462;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!m;")
	public static final Class127 aClass127_29 = new Class127();

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method4597(@OriginalArg(0) Class5_Sub4_Sub4_Sub1 arg0) {
		@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) Static41.aClass24_2.method609((long) arg0.anInt4946);
		if (local15 == null) {
			Static118.method2064(arg0.anIntArray404[0], null, 0, arg0.anIntArray405[0], null, Static163.anInt3184, arg0);
		} else {
			local15.method955();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILclient!ir;IZI)V")
	public static void method4598(@OriginalArg(2) int arg0, @OriginalArg(3) Class100 arg1, @OriginalArg(6) int arg2) {
		Static221.anInt4557 = 1;
		Static37.aBoolean434 = false;
		Static123.aClass100_57 = arg1;
		Static270.anInt5435 = 2;
		Static10.anInt248 = 0;
		Static196.anInt4046 = arg2;
		Static58.anInt1258 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method4600(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3 local12 = Static74.aClass24_7.method595(); local12 != null; local12 = Static74.aClass24_7.method602()) {
			if ((local12.aLong211 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method5717();
			}
		}
	}
}
