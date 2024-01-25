import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt5924 = -1;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
	public static final int[] anIntArray316 = new int[3];

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5114(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static54.aClass257_1.anInt7327 : Static54.aClass257_1.anInt7330) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class3_Sub7_Sub14 local38 = Static54.aClass257_1.method6447(local31);
			if (local38.aBoolean365 && local38.method4299().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static306.aShortArray49 = null;
					Static439.anInt9345 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static497.anInt5760 = 0;
		Static439.anInt9345 = local13;
		Static306.aShortArray49 = local11;
		@Pc(113) String[] local113 = new String[Static439.anInt9345];
		for (@Pc(115) int local115 = 0; local115 < Static439.anInt9345; local115++) {
			local113[local115] = Static54.aClass257_1.method6447(local11[local115]).method4299();
		}
		Static141.method2406(Static306.aShortArray49, local113);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public static void method5115(@OriginalArg(0) int arg0) {
		Static373.anInt6819 = arg0;
		@Pc(11) Class136 local11 = Static309.aClass136_36;
		synchronized (Static309.aClass136_36) {
			Static309.aClass136_36.method3142();
		}
		local11 = Static40.aClass136_9;
		synchronized (Static40.aClass136_9) {
			Static40.aClass136_9.method3142();
		}
	}
}
