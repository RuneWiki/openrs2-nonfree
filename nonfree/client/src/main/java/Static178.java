import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_98 = new Class151("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ir", name = "N", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_112 = new Class214(10, 3);

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
	public static int anInt2910 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!sq;)V")
	public static void method2382(@OriginalArg(0) Class20_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort85; local2 <= arg0.aShort87; local2++) {
			for (@Pc(6) int local6 = arg0.aShort88; local6 <= arg0.aShort86; local6++) {
				@Pc(16) Class82 local16 = Static159.aClass82ArrayArrayArray2[arg0.aByte89][local2][local6];
				if (local16 != null) {
					@Pc(21) Class146 local21 = local16.aClass146_1;
					@Pc(23) Class146 local23 = null;
					while (local21 != null) {
						if (local21.aClass20_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass146_1 = local21.aClass146_3;
							} else {
								local23.aClass146_3 = local21.aClass146_3;
							}
							local21.method2997();
							break;
						}
						local23 = local21;
						local21 = local21.aClass146_3;
					}
					local16.aByte21 = 0;
					for (@Pc(56) Class146 local56 = local16.aClass146_1; local56 != null; local56 = local56.aClass146_3) {
						local16.aByte21 = (byte) (local16.aByte21 | local56.anInt3663);
					}
				}
			}
		}
	}
}
