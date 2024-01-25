import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!su", name = "s", descriptor = "Lclient!td;")
	public static Class148_Sub1 aClass148_Sub1_7;

	@OriginalMember(owner = "client!su", name = "r", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_227 = new Class214(71, 2);

	@OriginalMember(owner = "client!su", name = "t", descriptor = "[Lclient!lo;")
	public static final Class1_Sub3_Sub11[] aClass1_Sub3_Sub11Array115 = new Class1_Sub3_Sub11[14];

	@OriginalMember(owner = "client!su", name = "u", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!su", name = "v", descriptor = "[I")
	public static final int[] anIntArray385 = new int[1000];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZLclient!dh;)V")
	public static void method4839(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static58.aClass173_2 != null) {
			@Pc(24) int local24;
			try {
				Static58.aClass173_2.method3440(0L);
				Static58.aClass173_2.method3439(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method4480(local12, 24);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class146 local13 = local7.aClass146_1; local13 != null; local13 = local13.aClass146_3) {
			@Pc(17) Class20_Sub3 local17 = local13.aClass20_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort85 == arg1 && local17.aShort88 == arg2) {
				Static178.method2382(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I[B)Z")
	public static boolean method4841(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(arg0);
		@Pc(18) int local18 = local8.method4463();
		if (local18 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method4463() == 1;
		if (local34) {
			Static80.method1233(local8);
		}
		Static154.method4420(local8);
		return true;
	}
}
