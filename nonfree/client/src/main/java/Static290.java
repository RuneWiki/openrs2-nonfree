import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	public static int anInt5128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!qp;")
	public static Class18 method4601() {
		try {
			return (Class18) Class.forName("am").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
	public static void method4605(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class5 local11 = Static268.aClass306_19.method6941(); local11 != null; local11 = Static268.aClass306_19.method6940()) {
			if ((long) arg0 == (local11.aLong312 >> 48 & 0xFFFFL)) {
				local11.method9222();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public static void method4607() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static451.aClass128ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static451.aClass128ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static672.anInt10829; local6++) {
					for (local9 = 0; local9 < Static532.anInt8517; local9++) {
						if (Static451.aClass128ArrayArrayArray2[local3][local6][local9] != null) {
							Static451.aClass128ArrayArrayArray2[local3][local6][local9].method3124();
						}
						Static451.aClass128ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static451.aClass128ArrayArrayArray2 = null;
		Static668.aClass84Array4 = null;
		if (Static681.aClass128ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static681.aClass128ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static672.anInt10829; local6++) {
					for (local9 = 0; local9 < Static532.anInt8517; local9++) {
						if (Static681.aClass128ArrayArrayArray3[local3][local6][local9] != null) {
							Static681.aClass128ArrayArrayArray3[local3][local6][local9].method3124();
						}
						Static681.aClass128ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static681.aClass128ArrayArrayArray3 = null;
		Static77.aClass84Array1 = null;
		Static283.aClass128ArrayArrayArray1 = null;
		Static177.aClass84Array2 = null;
		Static407.aBooleanArrayArray8 = null;
		Static241.aBooleanArrayArray5 = null;
		Static112.anIntArray98 = null;
		Static115.aBooleanArrayArrayArray1 = null;
		Static637.aBooleanArrayArrayArray3 = null;
		Static270.method4448();
		if (Static414.aClass4_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static107.anInt1735; local3++) {
				Static414.aClass4_Sub1_Sub1Array1[local3] = null;
			}
			Static107.anInt1735 = 0;
		}
		Static623.aClass4_Sub1Array11 = null;
		Static194.aClass4_Sub1Array13 = null;
		Static321.aClass4_Sub1Array5 = null;
		if (Static552.aClass4_Sub1Array10 != null) {
			for (local3 = 0; local3 < Static552.aClass4_Sub1Array10.length; local3++) {
				Static552.aClass4_Sub1Array10[local3] = null;
			}
			Static347.anInt5727 = 0;
		}
		if (Static388.aClass4_Sub1Array8 != null) {
			for (local3 = 0; local3 < Static388.aClass4_Sub1Array8.length; local3++) {
				Static388.aClass4_Sub1Array8[local3] = null;
			}
			Static574.anInt8994 = 0;
		}
		if (Static665.aClass204Array3 != null) {
			for (local3 = 0; local3 < Static257.anInt4639; local3++) {
				Static665.aClass204Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static237.anInt4100; local6++) {
				for (local9 = 0; local9 < Static672.anInt10829; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static532.anInt8517; local217++) {
						Static680.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static257.anInt4639 = 0;
		}
		Static665.method4488();
		Static605.aClass321_3 = Static605.aClass321_2;
		Static605.aClass321_3.method7352();
		Static220.aByteArrayArray10 = null;
		Static503.anIntArrayArray57 = null;
		Static206.aShortArrayArray11 = null;
		if (Static312.aClass291Array1 != null) {
			Static676.method9165();
			Static44.aClass100_1.method8662(1);
			Static44.aClass100_1.method8608(0);
		}
		if (Static57.aClass287Array1 != null) {
			Static57.aClass287Array1 = null;
		}
		Static44.aClass100_1 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFIFFF[BLclient!kda;IIIII)V")
	public static void method4609(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) Class198 arg6, @OriginalArg(8) int arg7) {
		for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
			Static556.method7522(arg5, arg2, arg3, arg7, arg0, arg4, arg1, local10, arg6);
			arg7 += 16384;
		}
	}
}
