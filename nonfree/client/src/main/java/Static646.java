import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	public static int anInt9924;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "[I")
	public static final int[] anIntArray641 = new int[32];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method8453() {
		return Static463.aBoolean600 || Static614.aClass3_Sub6_Sub16_4 == null ? "" : Static614.aClass3_Sub6_Sub16_4.aString95;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8454(@OriginalArg(0) String arg0) {
		if (Static199.aClass172Array30 != null) {
			@Pc(15) Class3_Sub44 local15 = Static275.method5689(Static196.aClass376_52, Static540.aClass282_4);
			local15.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg0));
			local15.aClass3_Sub17_Sub2_3.method4878(arg0);
			Static616.method8089(local15);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	public static int method8455() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = eka.class.getDeclaredFields();
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			@Pc(27) Field local27 = local17[local21];
			if (gk.class.isAssignableFrom(local27.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}
}
