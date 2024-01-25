import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mk", name = "O", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "[Lclient!wv;")
	public static Class365[] aClass365Array1;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "Lclient!ed;")
	public static final Class84 aClass84_3 = new Class84();

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "[I")
	public static final int[] anIntArray379 = new int[50];

	@OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
	public static int anInt5893 = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)V")
	public static void method4964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static68.anInt1585 == 1) {
			Static394.method5603(arg1, Static330.aClass1_Sub23_2, arg0);
		} else if (Static68.anInt1585 == 2) {
			Static198.method3416(arg0, arg1);
		}
		Static330.aClass1_Sub23_2 = null;
		Static68.anInt1585 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!io;ILclient!gba;I)V")
	public static void method4965(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2) {
		@Pc(9) Class1_Sub36 local9 = new Class1_Sub36();
		local9.anInt6251 = arg0.method4393();
		local9.anInt6250 = arg0.method4371();
		local9.anIntArray420 = new int[local9.anInt6251];
		local9.anIntArray419 = new int[local9.anInt6251];
		local9.aClass23Array1 = new Class23[local9.anInt6251];
		local9.anIntArray418 = new int[local9.anInt6251];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt6251][][];
		local9.aClass23Array2 = new Class23[local9.anInt6251];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt6251; local56++) {
			try {
				@Pc(62) int local62 = arg0.method4393();
				@Pc(88) String local88;
				@Pc(92) String local92;
				@Pc(96) int local96;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local88 = arg0.method4388();
					local92 = arg0.method4388();
					local96 = 0;
					if (local62 == 1) {
						local96 = arg0.method4371();
					}
					local9.anIntArray420[local56] = local62;
					local9.anIntArray418[local56] = local96;
					local9.aClass23Array1[local56] = arg2.method2500(local92, Static558.method7523(local88));
				} else if (local62 == 3 || local62 == 4) {
					local88 = arg0.method4388();
					local92 = arg0.method4388();
					local96 = arg0.method4393();
					@Pc(99) String[] local99 = new String[local96];
					for (@Pc(101) int local101 = 0; local101 < local96; local101++) {
						local99[local101] = arg0.method4388();
					}
					@Pc(116) byte[][] local116 = new byte[local96][];
					@Pc(127) int local127;
					if (local62 == 3) {
						for (@Pc(121) int local121 = 0; local121 < local96; local121++) {
							local127 = arg0.method4371();
							local116[local121] = new byte[local127];
							arg0.method4425(local116[local121], local127);
						}
					}
					local9.anIntArray420[local56] = local62;
					@Pc(156) Class[] local156 = new Class[local96];
					for (local127 = 0; local127 < local96; local127++) {
						local156[local127] = Static558.method7523(local99[local127]);
					}
					local9.aClass23Array2[local56] = arg2.method2507(local92, Static558.method7523(local88), local156);
					local9.aByteArrayArrayArray6[local56] = local116;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray419[local56] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray419[local56] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray419[local56] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray419[local56] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray419[local56] = -5;
			}
		}
		Static258.aClass361_52.method7855(local9);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method4967(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(1, arg0);
		local8.method488();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!rc;)Lclient!ri;")
	public static Class285 method4969(@OriginalArg(1) Class20_Sub2_Sub4 arg0) {
		@Pc(7) Class285 local7;
		if (Static180.aClass285_4 == null) {
			local7 = new Class285();
		} else {
			local7 = Static180.aClass285_4;
			Static180.aClass285_4 = Static180.aClass285_4.aClass285_5;
			local7.aClass285_5 = null;
			Static4.anInt80--;
		}
		local7.aClass20_Sub2_Sub4_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([S[Ljava/lang/String;III)V")
	public static void method4970(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local20 == null || arg1[local46] != null && arg1[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local71;
				@Pc(85) short local85 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method4970(arg0, arg1, local16 - 1, arg3);
		method4970(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void method4971() {
		for (@Pc(1) int local1 = 0; local1 < Static428.anInt4959; local1++) {
			@Pc(6) Class20_Sub2_Sub4 local6 = Static316.aClass20_Sub2_Sub4Array1[local1];
			Static81.method1660(local6, true);
			Static316.aClass20_Sub2_Sub4Array1[local1] = null;
		}
		Static428.anInt4959 = 0;
	}
}
