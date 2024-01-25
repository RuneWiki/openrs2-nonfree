import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_67 = new Class70(76, 7);

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "[Lclient!lm;")
	public static final Class210[] aClass210Array1 = new Class210[4];

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIZ)Lclient!pu;")
	public static Class270 method5051(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(5) Class360 local5 = null;
		if (Static306.aClass363_4 != null) {
			local5 = new Class360(arg0, Static306.aClass363_4, Static253.aClass363Array1[arg0], 1000000);
		}
		Static273.aClass29_Sub1Array1[arg0] = Static371.aClass298_1.method6403(arg0, Static565.aClass360_6, local5);
		Static273.aClass29_Sub1Array1[arg0].method7191();
		return new Class270(Static273.aClass29_Sub1Array1[arg0], arg1, 1);
	}
}
