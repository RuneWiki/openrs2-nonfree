import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public static final int anInt3954 = 1401;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_56 = new Class183(10, -1);

	@OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
	public static final int[] anIntArray299 = new int[13];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	public static int anInt3962 = -1;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!m", name = "G", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_136 = new Class62("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lclient!db;")
	public static Class49 method3458(@OriginalArg(0) int arg0) {
		@Pc(15) Class49[] local15 = Static154.method2745();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class49 local23 = local15[local17];
			if (arg0 == local23.anInt1393) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	public static void method3470() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static302.aClass188ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static302.aClass188ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static176.anInt3742; local6++) {
					for (local9 = 0; local9 < Static285.anInt5263; local9++) {
						if (Static302.aClass188ArrayArrayArray4[local3][local6][local9] != null) {
							Static302.aClass188ArrayArrayArray4[local3][local6][local9].method4616();
						}
						Static302.aClass188ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static302.aClass188ArrayArrayArray4 = null;
		Static210.aClass149Array5 = null;
		if (Static89.aClass188ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static89.aClass188ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static176.anInt3742; local6++) {
					for (local9 = 0; local9 < Static285.anInt5263; local9++) {
						if (Static89.aClass188ArrayArrayArray3[local3][local6][local9] != null) {
							Static89.aClass188ArrayArrayArray3[local3][local6][local9].method4616();
						}
						Static89.aClass188ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static89.aClass188ArrayArrayArray3 = null;
		Static248.aClass149Array3 = null;
		Static45.aClass188ArrayArrayArray5 = null;
		Static128.aClass149Array1 = null;
		Static174.anInt3565 = 0;
		if (Static326.aClass153Array2 != null) {
			for (local3 = 0; local3 < Static174.anInt3565; local3++) {
				Static326.aClass153Array2[local3] = null;
			}
		}
		if (Static313.aClass1_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static94.anInt2018; local3++) {
				Static313.aClass1_Sub2Array3[local3] = null;
			}
			Static94.anInt2018 = 0;
		}
		if (Static41.aClass2_Sub8_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static184.anInt3912; local3++) {
				Static41.aClass2_Sub8_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static73.anInt1624; local6++) {
				for (local9 = 0; local9 < Static176.anInt3742; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static285.anInt5263; local160++) {
						Static132.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static184.anInt3912 = 0;
		}
		Static33.anIntArrayArrayArray2 = null;
		Static141.method2427();
		Static349.aClass199_7.method4905();
		Static139.aByteArrayArray11 = null;
		Static199.anIntArrayArray19 = null;
		Static102.aByteArrayArray8 = null;
		Static185.aClass19_1 = null;
		Static221.aClass21_13 = null;
		Static59.aClass48_2 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/Object;III[J)V")
	public static void method3471(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (arg3[local46] < (long) (local46 & 0x1) + local20) {
				@Pc(67) long local67 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local67;
				@Pc(81) Object local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method3471(arg0, local16 - 1, arg2, arg3);
		method3471(arg0, arg1, local16 + 1, arg3);
	}
}
