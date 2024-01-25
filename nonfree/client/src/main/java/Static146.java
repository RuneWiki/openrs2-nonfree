import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "Lclient!rj;")
	public static final Class320 aClass320_3 = new Class320();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIZII)V")
	public static void method2412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static713.aClass3_Sub55_31.aClass15_Sub8_1.method2888() : Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888()) != 0 && arg4 != 0 && Static581.anInt9508 < 50 && arg5 != -1) {
			Static326.aClass239Array1[Static581.anInt9508++] = new Class239((byte) (arg3 ? 3 : 2), arg5, arg4, arg2, arg1, 0, arg0, (Class19_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method2414(@OriginalArg(0) int[] arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer();
		@Pc(17) int local17 = Static447.anInt7862;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(28) Class207 local28 = Static12.aClass94_1.method2425(arg0[local19]);
			if (local28.anInt5849 != -1) {
				@Pc(40) Class9 local40 = (Class9) Static416.aClass338_40.method8049((long) local28.anInt5849);
				if (local40 == null) {
					@Pc(48) Class194 local48 = Static728.method4757(Static403.aClass221_115, local28.anInt5849, 0);
					if (local48 != null) {
						local40 = Static488.aClass67_12.method7659(local48, true);
						Static416.aClass338_40.method8044((long) local28.anInt5849, local40);
					}
				}
				if (local40 != null) {
					Static432.aClass9Array28[local17] = local40;
					local15.append(" <img=").append(local17).append(">");
					local17++;
				}
			}
		}
		return local15.toString();
	}
}
