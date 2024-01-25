import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_146 = new Class25(50, -2);

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_32 = new Class181();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tm;")
	public static Class11_Sub5 method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class195 local14 = local7.aClass195_1; local14 != null; local14 = local14.aClass195_2) {
			@Pc(18) Class11_Sub5 local18 = local14.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort108 == arg1 && local18.aShort109 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!gi;B)Lclient!gi;")
	public static Class93 method4859(@OriginalArg(0) Class93 arg0) {
		if (arg0.anInt2426 != -1) {
			return Static160.method2380(arg0.anInt2426);
		}
		@Pc(20) int local20 = arg0.anInt2508 >>> 16;
		@Pc(30) Class204 local30 = new Class204(Static394.aClass220_45);
		for (@Pc(35) Class2_Sub9 local35 = (Class2_Sub9) local30.method4747(); local35 != null; local35 = (Class2_Sub9) local30.method4746()) {
			if (local20 == local35.anInt1143) {
				return Static160.method2380((int) local35.aLong401);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4860(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static155.method2318(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static259.anInt4591; local30++) {
			@Pc(36) String local36 = Static449.aStringArray67[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static155.method2318(local36);
			if (local36 != null && local36.equals(local25)) {
				Static259.anInt4591--;
				for (@Pc(60) int local60 = local30; local60 < Static259.anInt4591; local60++) {
					Static449.aStringArray67[local60] = Static449.aStringArray67[local60 + 1];
					Static197.aStringArray41[local60] = Static197.aStringArray41[local60 + 1];
					Static110.anIntArray137[local60] = Static110.anIntArray137[local60 + 1];
					Static142.aStringArray30[local60] = Static142.aStringArray30[local60 + 1];
					Static142.anIntArray222[local60] = Static142.anIntArray222[local60 + 1];
					Static217.aBooleanArray18[local60] = Static217.aBooleanArray18[local60 + 1];
				}
				Static115.anInt1936 = Static144.anInt2663;
				Static164.method2403(Static186.aClass208_49);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0));
				Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
				return;
			}
		}
	}
}
