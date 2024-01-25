import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public static int anInt3032;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_14 = new Class353();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(CI)Z")
	public static boolean method2436(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) char[] local26 = Static539.aCharArray7;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public static void method2438() throws IOException {
		if (Static568.aClass149_2 == null || Static278.anInt6257 <= 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		while (true) {
			@Pc(23) Class1_Sub11 local23 = (Class1_Sub11) Static242.aClass353_27.method7677();
			if (local23 == null) {
				Static516.anInt8761 = 0;
				Static344.anInt5736 += local18;
				return;
			}
			Static568.aClass149_2.method3282(local23.aClass1_Sub35_Sub2_1.aByteArray85, local23.anInt1433);
			Static278.anInt6257 -= local23.anInt1433;
			local18 += local23.anInt1433;
			local23.method7859();
			local23.aClass1_Sub35_Sub2_1.method5805();
			local23.method1240();
		}
	}
}
