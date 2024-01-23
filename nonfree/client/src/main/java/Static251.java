import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!ak;")
	public static Class7 aClass7_203;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public static volatile int anInt5124 = 0;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	public static int anInt5125 = 0;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString174 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean395 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qn;")
	public static RuntimeException_Sub1 method3951(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString149 = local12.aString149 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILclient!le;IIIII)V")
	public static void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 & 0x3;
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (local9 == 1 || local9 == 3) {
			local18 = arg3.anInt2817;
			local21 = arg3.anInt2814;
		} else {
			local18 = arg3.anInt2814;
			local21 = arg3.anInt2817;
		}
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (local21 + arg5 > 104) {
			local38 = arg5;
			local42 = arg5 + 1;
		} else {
			local38 = arg5 + (local21 >> 1);
			local42 = arg5 + (local21 + 1 >> 1);
		}
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (arg7 + local18 > 104) {
			local69 = arg7;
			local73 = arg7 + 1;
		} else {
			local69 = (local18 >> 1) + arg7;
			local73 = arg7 + (local18 + 1 >> 1);
		}
		@Pc(111) int local111 = (arg5 << 7) + (local21 << 6);
		@Pc(119) int local119 = (arg7 << 7) + (local18 << 6);
		@Pc(123) int[][] local123 = Static163.anIntArrayArrayArray16[arg6];
		@Pc(152) int local152 = local123[local69][local38] + local123[local73][local38] + local123[local69][local42] + local123[local73][local42] >> 2;
		@Pc(154) int local154 = 0;
		@Pc(161) int[][] local161;
		if (arg6 != 0) {
			local161 = Static163.anIntArrayArrayArray16[0];
			local154 = local152 - (local161[local73][local42] + local161[local69][local42] + local161[local69][local38] + local161[local73][local38] >> 2);
		}
		local161 = null;
		if (arg6 < 3) {
			local161 = Static163.anIntArrayArrayArray16[arg6 + 1];
		}
		@Pc(218) Class169 local218 = arg3.method2356(arg2, null, local111, local119, true, arg1, local161, local123, local152, false);
		Static78.method1338(local218.aClass48_Sub2_5, local119 - arg4, local154, local111 - arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!jj;)V")
	public static void method3953(@OriginalArg(1) Class1_Sub18 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static37.aClass66_5 != null) {
			try {
				Static37.aClass66_5.method1538(0L);
				Static37.aClass66_5.method1533(local16);
				@Pc(30) int local30;
				for (local30 = 0; local30 < 24 && local16[local30] == 0; local30++) {
				}
				if (local30 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (@Pc(54) int local54 = 0; local54 < 24; local54++) {
					local16[local54] = -1;
				}
			}
		}
		arg0.method3080(24, local16);
	}
}
