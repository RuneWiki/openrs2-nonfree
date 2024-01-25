import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "[I")
	public static final int[] anIntArray227 = new int[5];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBLclient!n;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class42 method2774(@OriginalArg(0) int arg0, @OriginalArg(2) Interface11 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class42_Sub3(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!lm;Z)Z")
	public static boolean method2775(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static51.aClass215Array6 == Static67.aClass215Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7813();
		if (arg0.aShort115 < 0 || arg0.aShort112 < 0 || arg0.aShort113 >= Static537.anInt9566 || arg0.aShort114 >= Static509.anInt9164) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort115; local34 <= arg0.aShort113; local34++) {
			for (local38 = arg0.aShort112; local38 <= arg0.aShort114; local38++) {
				@Pc(45) Class37 local45 = Static201.method3812(arg0.aByte99, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort115) {
						local49++;
					}
					if (local34 < arg0.aShort113) {
						local49 += 4;
					}
					if (local38 > arg0.aShort112) {
						local49 += 8;
					}
					if (local38 < arg0.aShort114) {
						local49 += 2;
					}
					@Pc(74) Class243 local74 = Static230.method4116(arg0, local49);
					@Pc(77) Class243 local77 = local45.aClass243_3;
					if (local77 == null) {
						local45.aClass243_3 = local74;
					} else {
						while (local77.aClass243_11 != null) {
							local77 = local77.aClass243_11;
						}
						local77.aClass243_11 = local74;
					}
					local45.aByte27 = (byte) (local45.aByte27 | local49);
					if (local6 && (Static287.anIntArrayArray52[local34][local38] & 0xFF000000) != 0) {
						local8 = Static287.anIntArrayArray52[local34][local38];
						local10 = Static119.aShortArrayArray1[local34][local38];
						local12 = Static51.aByteArrayArray28[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort115; local38 <= arg0.aShort113; local38++) {
				for (@Pc(150) int local150 = arg0.aShort112; local150 <= arg0.aShort114; local150++) {
					if ((Static287.anIntArrayArray52[local38][local150] & 0xFF000000) == 0) {
						Static287.anIntArrayArray52[local38][local150] = local8;
						Static119.aShortArrayArray1[local38][local150] = local10;
						Static51.aByteArrayArray28[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static9.aClass30_Sub1Array1[Static261.anInt5286++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public static void method2776() {
		Static178.aClipboard1 = null;
		Static530.aBoolean673 = false;
		Static445.method6725();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	public static void method2777(@OriginalArg(0) int arg0) {
		@Pc(16) Class12_Sub4_Sub1 local16 = Static389.method6156(8, arg0);
		local16.method823();
	}
}
