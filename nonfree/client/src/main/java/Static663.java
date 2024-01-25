import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!jc;")
	public static Class6_Sub15 aClass6_Sub15_176;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray194 = new byte[1000][];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method9048(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(20) String local20 = Static273.method4625(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static287.anInt5151; local26++) {
			@Pc(32) String local32 = Static73.aStringArray11[local26];
			@Pc(36) String local36 = Static273.method4625(local32);
			if (Static591.method8213(arg0, local36, local32, local20)) {
				Static287.anInt5151--;
				for (@Pc(49) int local49 = local26; local49 < Static287.anInt5151; local49++) {
					Static73.aStringArray11[local49] = Static73.aStringArray11[local49 + 1];
					Static591.aStringArray36[local49] = Static591.aStringArray36[local49 + 1];
					Static433.aStringArray31[local49] = Static433.aStringArray31[local49 + 1];
					Static353.aStringArray26[local49] = Static353.aStringArray26[local49 + 1];
					Static510.aBooleanArray29[local49] = Static510.aBooleanArray29[local49 + 1];
				}
				Static535.anInt4136 = Static633.anInt8242;
				@Pc(110) Class260 local110 = Static629.method8573();
				@Pc(116) Class6_Sub13 local116 = Static30.method353(Static421.aClass241_92, local110.aClass270_2);
				local116.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg0));
				local116.aClass6_Sub15_Sub1_1.method2991(arg0);
				local110.method6404(local116);
				return;
			}
		}
	}
}
