import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!fh;")
	public static Class58 aClass58_84;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!kj;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt4394 = -1;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method3651(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(32) int local32 = arg1.length();
		@Pc(34) int local34 = 0;
		for (@Pc(42) int local42 = 0; local42 < local32; local42++) {
			@Pc(53) char local53 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local53 == '-') {
					local27 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local53 >= '0' && local53 <= '9') {
				local98 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local98 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local98 = local53 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local98) {
				throw new NumberFormatException();
			}
			if (local27) {
				local98 = -local98;
			}
			@Pc(132) int local132 = local98 + arg0 * local34;
			if (local132 / arg0 != local34) {
				throw new NumberFormatException();
			}
			local29 = true;
			local34 = local132;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local34;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void method3652(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static21.anInt1047 = arg2;
		Static114.aString132 = arg1;
		Static63.aString76 = arg0;
		if (Static114.aString132.equals("") || Static63.aString76.equals("")) {
			Static75.anInt1641 = 3;
		} else if (Static254.anInt4847 == -1) {
			Static150.anInt2974 = 0;
			Static266.anInt5118 = 1;
			Static75.anInt1641 = -3;
			Static217.anInt4217 = 0;
			@Pc(50) Class4_Sub10 local50 = new Class4_Sub10(128);
			local50.method4618(10);
			local50.method4654((int) (Math.random() * 9.9999999E7D));
			local50.method4619(Static108.method1747(Static114.aString132));
			local50.method4654((int) (Math.random() * 9.9999999E7D));
			local50.method4612(Static63.aString76);
			local50.method4654((int) (Math.random() * 9.9999999E7D));
			local50.method4665(Static71.aBigInteger1, Static263.aBigInteger2);
			Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4618(24);
			Static110.aClass4_Sub10_Sub1_1.method4618(local50.anInt5713 + 2);
			Static110.aClass4_Sub10_Sub1_1.method4668(550);
			Static110.aClass4_Sub10_Sub1_1.method4631(local50.aByteArray71, local50.anInt5713);
		} else {
			Static6.method101();
		}
	}
}
