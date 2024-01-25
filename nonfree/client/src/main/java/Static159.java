import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "[I")
	public static final int[] anIntArray157 = new int[2048];

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Lclient!wp;")
	public static Class361 aClass361_3 = null;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	public static int anInt3275 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method2949(@OriginalArg(1) long arg0) {
		Static383.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static383.aCalendar2.get(7);
		@Pc(17) int local17 = Static383.aCalendar2.get(5);
		@Pc(21) int local21 = Static383.aCalendar2.get(2);
		@Pc(25) int local25 = Static383.aCalendar2.get(1);
		@Pc(34) int local34 = Static383.aCalendar2.get(11);
		@Pc(38) int local38 = Static383.aCalendar2.get(12);
		@Pc(42) int local42 = Static383.aCalendar2.get(13);
		return Static95.aStringArray7[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static88.aStringArray5[local21] + "-" + local25 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!hga;)V")
	public static void method2950(@OriginalArg(0) Class129 arg0) {
		if (Static497.anInt8087 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub10 local6 = arg0.aClass3_Sub10_2;
		Static169.aClass129Array1[Static497.anInt8087] = arg0;
		Static364.aBooleanArray3[Static497.anInt8087] = false;
		Static497.anInt8087++;
		@Pc(21) int local21 = arg0.anInt3699;
		if (arg0.aBoolean278) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3699;
		if (arg0.aBoolean277) {
			local29 = Static459.anInt7698 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6015() + Static323.anInt5468 - local6.method6018() >> Static315.anInt5369;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6015() + local6.method6018() - Static323.anInt5468 >> Static315.anInt5369;
			if (local73 >= Static39.anInt747) {
				local73 = Static39.anInt747 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray51[local41++];
				@Pc(105) int local105 = (local6.method6021() + Static323.anInt5468 - local6.method6018() >> Static315.anInt5369) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static155.anInt3254) {
					local113 = Static155.anInt3254 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static473.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static473.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static497.anInt8087;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static473.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static497.anInt8087 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static473.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static497.anInt8087 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static473.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static497.anInt8087 << 48;
					}
				}
			}
		}
	}
}
