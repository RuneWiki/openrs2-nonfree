import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
	public static int anInt8596;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "Lclient!fa;")
	public static Class94 aClass94_9;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
	public static int anInt8592 = -1;

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)I")
	public static int method6935() {
		if (Static254.aFrame32 == null) {
			return Static241.aBoolean305 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method6936(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static178.aClass117_97.anInt3362 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static451.aClass67_2.anInt2179; local23++) {
			@Pc(30) Class22 local30 = Static451.aClass67_2.method2006(local23);
			if ((!arg1 || local30.aBoolean18) && local30.anInt538 == -1 && local30.anInt564 == -1 && local30.anInt592 == 0 && local30.aString15.toLowerCase().indexOf(local11) != -1) {
				if (local21 >= 250) {
					Static235.aShortArray46 = null;
					Static273.anInt5367 = -1;
					return;
				}
				if (local21 >= local14.length) {
					@Pc(78) short[] local78 = new short[local14.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local21; local80++) {
						local78[local80] = local14[local80];
					}
					local14 = local78;
				}
				local14[local21++] = (short) local23;
			}
		}
		Static273.anInt5367 = local21;
		Static235.aShortArray46 = local14;
		Static265.anInt5240 = 0;
		@Pc(114) String[] local114 = new String[Static273.anInt5367];
		for (@Pc(116) int local116 = 0; local116 < Static273.anInt5367; local116++) {
			local114[local116] = Static451.aClass67_2.method2006(local14[local116]).aString15;
		}
		Static306.method4963(Static235.aShortArray46, local114);
		Static178.aClass117_97.method2952();
		Static178.aClass117_97.anInt3362 = 2;
	}
}
