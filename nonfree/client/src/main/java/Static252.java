import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!cu;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4221(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static353.method5667(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static191.anInt3579; local25++) {
			@Pc(31) String local31 = Static151.aStringArray24[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static353.method5667(local31);
			if (local31 != null && local31.equals(local20)) {
				Static191.anInt3579--;
				for (@Pc(55) int local55 = local25; local55 < Static191.anInt3579; local55++) {
					Static151.aStringArray24[local55] = Static151.aStringArray24[local55 + 1];
					Static209.aStringArray30[local55] = Static209.aStringArray30[local55 + 1];
					Static193.aStringArray82[local55] = Static193.aStringArray82[local55 + 1];
					Static492.aStringArray70[local55] = Static492.aStringArray70[local55 + 1];
					Static158.aBooleanArray9[local55] = Static158.aBooleanArray9[local55 + 1];
				}
				Static492.anInt8360 = Static303.anInt8405;
				@Pc(116) Class3_Sub27 local116 = Static59.method1040(Static325.aClass20_2, Static159.aClass314_52);
				local116.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg0));
				local116.aClass3_Sub9_Sub2_2.method5638(arg0);
				Static148.method2572(local116);
				return;
			}
		}
	}
}
