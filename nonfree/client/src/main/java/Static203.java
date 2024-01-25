import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	public static int anInt4455;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public static int anInt4459 = 0;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "[I")
	public static final int[] anIntArray199 = new int[5];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!oi;I)I")
	public static int method3700(@OriginalArg(0) Class9_Sub4_Sub2_Sub1 arg0) {
		if (arg0.anInt4342 == 0) {
			return 0;
		}
		@Pc(70) int local70;
		@Pc(63) int local63;
		if (arg0.anInt4293 != -1) {
			@Pc(19) Class9_Sub4_Sub2_Sub1 local19 = null;
			if (arg0.anInt4293 < 32768) {
				@Pc(35) Class6_Sub42 local35 = (Class6_Sub42) Static461.aClass380_35.method8747((long) arg0.anInt4293);
				if (local35 != null) {
					local19 = local35.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				}
			} else if (arg0.anInt4293 >= 32768) {
				local19 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[arg0.anInt4293 - 32768];
			}
			if (local19 != null) {
				local63 = arg0.anInt10360 - local19.anInt10360;
				local70 = arg0.anInt10357 - local19.anInt10357;
				if (local63 != 0 || local70 != 0) {
					arg0.method3628((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class9_Sub4_Sub2_Sub1_Sub2) {
			@Pc(169) Class9_Sub4_Sub2_Sub1_Sub2 local169 = (Class9_Sub4_Sub2_Sub1_Sub2) arg0;
			if (local169.anInt4362 != -1 && (local169.anInt4359 == 0 || local169.anInt4358 > 0)) {
				local169.method3628(local169.anInt4362);
				local169.anInt4362 = -1;
			}
		} else if (arg0 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
			@Pc(99) Class9_Sub4_Sub2_Sub1_Sub1 local99 = (Class9_Sub4_Sub2_Sub1_Sub1) arg0;
			if (local99.anInt2291 != -1 && (local99.anInt4359 == 0 || local99.anInt4358 > 0)) {
				local63 = local99.anInt10360 - (local99.anInt2291 - Static477.anInt8412 - Static477.anInt8412) * 256;
				local70 = local99.anInt10357 - (local99.anInt2285 - Static227.anInt5049 - Static227.anInt5049) * 256;
				if (local63 != 0 || local70 != 0) {
					local99.method3628((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
				local99.anInt2291 = -1;
			}
		}
		return arg0.method3619();
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
	public static void method3702() {
		if (Static643.anInt10750 == 1 || Static643.anInt10750 == 3 || Static218.anInt4657 != Static643.anInt10750 && (Static643.anInt10750 == 0 || Static218.anInt4657 == 0)) {
			Static288.anInt5977 = 0;
			Static337.anInt6701 = 0;
			Static461.aClass380_35.method8751();
		}
		Static218.anInt4657 = Static643.anInt10750;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method3703(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static91.aString16 = Static91.aString16 + arg0[0];
			Static364.anInt7027 += arg0[0].length();
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			if (arg0[local33].startsWith("pause")) {
				@Pc(52) int local52 = 5;
				try {
					local52 = Integer.parseInt(arg0[local33].substring(6));
				} catch (@Pc(61) Exception local61) {
				}
				Static552.method7749("Pausing for " + local52 + " seconds...");
				Static315.anInt6315 = local33 + 1;
				Static285.aStringArray17 = arg0;
				Static364.aLong190 = Static582.method8056() + (long) (local52 * 1000);
				return;
			}
			Static91.aString16 = arg0[local33];
			Static515.method7371(false);
		}
	}
}
