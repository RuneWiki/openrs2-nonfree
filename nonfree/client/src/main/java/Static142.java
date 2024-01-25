import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!ps;")
	public static Class262 aClass262_3;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public static int anInt3360;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_50 = new Class287(4, 3);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLclient!rfa;[[B)V")
	public static void method2741(@OriginalArg(1) Class268_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int local12 = Static260.aByteArrayArray25.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static178.anIntArray159[local14] >> 8) * 64 - Static321.anInt5874;
				@Pc(44) int local44 = (Static178.anIntArray159[local14] & 0xFF) * 64 - Static137.anInt3293;
				Static245.method3870();
				arg0.method6303(local20, local33, local44, Static319.aClass31_11, Static187.aClass220Array1);
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BIII)I")
	public static int method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2744() {
		Static196.aClass31_8.ra(((float) Static348.aClass3_Sub51_Sub1_5.anInt9950 * 0.1F + 0.7F) * 1.1523438F);
		Static196.aClass31_8.VA(Static83.anInt2240, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static196.aClass31_8.pa(Static19.anInt200, -1, 0);
		Static196.aClass31_8.method8068(Static178.aClass47_2);
	}
}
