import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
	public static int[] anIntArray2 = new int[14];

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString6 = "Please remove ";

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[S")
	public static short[] aShortArray1 = new short[256];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method23() {
		Static36.aClass187_22.method4530();
		Static306.aClass187_153.method4530();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!nk;I)Lclient!pa;")
	public static Class1_Sub2_Sub1 method25(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return Static313.method2575(arg0, 0, arg1) ? Static289.method4413() : null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!lf;)V")
	public static void method27(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static70.aClass68_1 != null) {
			try {
				Static70.aClass68_1.method1973(0L);
				@Pc(18) int local18 = 0;
				Static70.aClass68_1.method1975(local8);
				while (local18 < 24 && local8[local18] == 0) {
					local18++;
				}
				if (local18 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (@Pc(50) int local50 = 0; local50 < 24; local50++) {
					local8[local50] = -1;
				}
			}
		}
		arg0.method1335(24, local8);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method28(@OriginalArg(1) Class121 arg0) {
		Static32.aClass121_67 = arg0;
	}
}
