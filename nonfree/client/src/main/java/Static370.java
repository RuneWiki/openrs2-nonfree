import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "Lclient!lb;")
	public static Class221 aClass221_103;

	@OriginalMember(owner = "client!lka", name = "g", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array24;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ILclient!q;II)V")
	public static void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (!Static555.aBoolean678) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(19) Class3_Sub4_Sub5 local19 = (Class3_Sub4_Sub5) arg1.aClass283_10.method7031(); local19 != null; local19 = (Class3_Sub4_Sub5) arg1.aClass283_10.method7035()) {
			local25 = Static494.method7145(local19);
			if (local25 > local11) {
				local11 = local25;
			}
		}
		local11 += 8;
		local25 = arg1.anInt8611 * 16 + 21;
		Static382.anInt6839 = arg1.anInt8611 * 16 + (Static470.aBoolean628 ? 26 : 22);
		@Pc(64) int local64 = Static655.anInt10491 + Static121.anInt2335;
		if (Static575.anInt9435 < local64 + local11) {
			local64 = Static121.anInt2335 - local11;
		}
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(89) int local89 = Static470.aBoolean628 ? 33 : 31;
		@Pc(96) int local96 = arg0 + 13 - local89;
		if (local96 + local25 > Static272.anInt5005) {
			local96 = Static272.anInt5005 - local25;
		}
		Static614.anInt9938 = local64;
		if (local96 < 0) {
			local96 = 0;
		}
		Static239.aClass3_Sub4_Sub17_1 = arg1;
		Static725.anInt11302 = local96;
		Static618.anInt6014 = local11;
	}

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "(B)Lclient!kka;")
	public static Class143 method5350() {
		try {
			return (Class143) Class.forName("hb").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
