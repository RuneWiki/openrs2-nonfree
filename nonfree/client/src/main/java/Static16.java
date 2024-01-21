import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "[S")
	public static short[] aShortArray3;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array2;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!ji;")
	public static Class5_Sub2_Sub10 aClass5_Sub2_Sub10_1;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_3;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_148 = Static161.method2452("Okay");

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public static final int anInt324 = 2301979;

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z")
	public static boolean method274(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
	public static boolean method275(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!wa;Lclient!wa;)V")
	public static void method276(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		Static67.aClass23_78 = arg1;
		Static120.aClass23_46 = arg0;
		Static65.anInt1413 = Static120.aClass23_46.method752(3);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ia;III)V")
	public static void method277(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class5_Sub3 local12;
		if (arg2 < Static210.anInt919) {
			local12 = Static157.aClass5_Sub3ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass73_1 != null && local12.aClass73_1.aClass1_8.method2448()) {
				arg0.method2442(local12.aClass73_1.aClass1_8, 128, 0, 0, true);
			}
		}
		if (arg3 < Static210.anInt919) {
			local12 = Static157.aClass5_Sub3ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass73_1 != null && local12.aClass73_1.aClass1_8.method2448()) {
				arg0.method2442(local12.aClass73_1.aClass1_8, 0, 0, 128, true);
			}
		}
		if (arg2 < Static210.anInt919 && arg3 < Static31.anInt671) {
			local12 = Static157.aClass5_Sub3ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass73_1 != null && local12.aClass73_1.aClass1_8.method2448()) {
				arg0.method2442(local12.aClass73_1.aClass1_8, 128, 0, 128, true);
			}
		}
		if (arg2 < Static210.anInt919 && arg3 > 0) {
			local12 = Static157.aClass5_Sub3ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass73_1 != null && local12.aClass73_1.aClass1_8.method2448()) {
				arg0.method2442(local12.aClass73_1.aClass1_8, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!dc;")
	public static Class20 method278(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class20 local18 = new Class20();
		local18.anInt712 = 0;
		local18.aByteArray10 = local9;
		for (@Pc(34) int local34 = 0; local34 < local9.length; local34++) {
			if (local9[local34] != 0) {
				local9[local18.anInt712++] = local9[local34];
			}
		}
		return local18;
	}
}
