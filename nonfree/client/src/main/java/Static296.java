import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array101;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "[I")
	public static final int[] anIntArray263 = new int[8];

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	public static int anInt4978 = 0;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public static int anInt4979 = -1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public static void method3885() {
		@Pc(8) int local8 = Static59.aByteArrayArray9.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static59.aByteArrayArray9[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static24.anInt538; local20++) {
					if (Static334.anIntArray331[local10] == Static408.anIntArray443[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static408.anIntArray443[Static24.anInt538] = Static334.anIntArray331[local10];
					local18 = Static24.anInt538++;
				}
				@Pc(59) Class1_Sub11 local59 = new Class1_Sub11(Static59.aByteArrayArray9[local10]);
				@Pc(61) int local61 = 0;
				while (local59.anInt5766 < Static59.aByteArrayArray9[local10].length && local61 < 511 && Static411.anInt6695 < 1023) {
					@Pc(80) int local80 = local61++ << 6 | local18;
					@Pc(84) int local84 = local59.method4485();
					@Pc(88) int local88 = local84 >> 14;
					@Pc(94) int local94 = local84 >> 7 & 0x3F;
					@Pc(98) int local98 = local84 & 0x3F;
					@Pc(112) int local112 = (Static334.anIntArray331[local10] >> 8) * 64 + local94 - Static101.anInt6646;
					@Pc(125) int local125 = (Static334.anIntArray331[local10] & 0xFF) * 64 + local98 - Static278.anInt4392;
					@Pc(132) Class246 local132 = Static304.aClass27_1.method588(local59.method4485());
					if (Static98.aClass20_Sub3_Sub3_Sub2Array1[local80] == null && (local132.aByte93 & 0x1) > 0 && Static257.anInt6933 == local88 && local112 >= 0 && local112 + local132.anInt6830 < Static425.anInt6922 && local125 >= 0 && Static251.anInt4072 > local125 + local132.anInt6830) {
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local80] = new Class20_Sub3_Sub3_Sub2();
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local80].anInt6045 = local80;
						@Pc(186) Class20_Sub3_Sub3_Sub2 local186 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local80];
						Static220.anIntArray193[Static411.anInt6695++] = local80;
						local186.anInt6043 = Static368.anInt6250;
						local186.method4695(local132);
						local186.method4691(local186.aClass246_1.anInt6830);
						local186.anInt6082 = local186.aClass246_1.anInt6851 << 3;
						if (local186.anInt6082 == 0) {
							local186.method4686(0);
						} else {
							local186.method4686((local186.aClass246_1.aByte91 + 4 & 0x75200007) << 11);
						}
						local186.method4697(local125, local186.method4678(), local112, true, local88);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([Ljava/lang/Object;IB[JI)V")
	public static void method3886(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg3; local54 < arg1; local54++) {
			if (arg2[local54] < (long) (local54 & local52) + local20) {
				@Pc(75) long local75 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16] = local75;
				@Pc(89) Object local89 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16++] = local89;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method3886(arg0, local16 - 1, arg2, arg3);
		method3886(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	public static void method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static6.aClass122_1.method2464(Static328.aClass151_169.method3122(Static188.anInt3028));
		@Pc(26) int local26;
		for (@Pc(20) Class1_Sub45 local20 = (Class1_Sub45) Static50.aClass254_8.method5437(); local20 != null; local20 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			local26 = Static393.method4973(local20);
			if (local26 > local13) {
				local13 = local26;
			}
		}
		local13 += 8;
		local26 = Static19.anInt396 * 16 + 21;
		@Pc(53) int local53 = arg0 - local13 / 2;
		if (local13 + local53 > Static126.anInt2202) {
			local53 = Static126.anInt2202 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (local26 + arg1 > Static92.anInt1618) {
			local77 = Static92.anInt1618 - local26;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static351.anInt5784 = local53;
		Static430.anInt7189 = local77;
		Static163.anInt2682 = local13;
		Static263.aBoolean329 = true;
		Static360.anInt5991 = (Static411.aBoolean546 ? 26 : 22) + Static19.anInt396 * 16;
	}
}
