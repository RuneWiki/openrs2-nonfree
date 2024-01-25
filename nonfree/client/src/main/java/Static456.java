import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt7778;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_185 = new Class81(11, 12);

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!vu;")
	public static final Class349 aClass349_13 = new Class349();

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_144 = new Class319(2, 4);

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_186 = new Class81(47, 5);

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static final int[] anIntArray516 = new int[1000];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIFF[FIIIIIFI)V")
	public static void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg8 - arg0;
		@Pc(9) int local9 = arg1 - arg9;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = arg4[2] * (float) local9 + arg4[1] * (float) local17 + (float) local5 * arg4[0];
		@Pc(59) float local59 = (float) local5 * arg4[3] + (float) local17 * arg4[4] + arg4[5] * (float) local9;
		@Pc(80) float local80 = arg4[8] * (float) local9 + (float) local5 * arg4[6] + (float) local17 * arg4[7];
		@Pc(103) float local103;
		@Pc(97) float local97;
		if (arg6 == 0) {
			local97 = arg10 + 0.5F - local80;
			local103 = arg2 + local38 + 0.5F;
		} else if (arg6 == 1) {
			local97 = local80 + arg10 + 0.5F;
			local103 = local38 + arg2 + 0.5F;
		} else if (arg6 == 2) {
			local103 = arg2 + 0.5F - local38;
			local97 = arg3 + 0.5F - local59;
		} else if (arg6 == 3) {
			local97 = arg3 + 0.5F - local59;
			local103 = arg2 + local38 + 0.5F;
		} else if (arg6 == 4) {
			local97 = arg3 + 0.5F - local59;
			local103 = local80 + arg10 + 0.5F;
		} else {
			local103 = arg10 + 0.5F - local80;
			local97 = arg3 + 0.5F - local59;
		}
		@Pc(212) float local212;
		if (arg11 == 1) {
			local212 = local103;
			local103 = -local97;
			local97 = local212;
		} else if (arg11 == 2) {
			local103 = -local103;
			local97 = -local97;
		} else if (arg11 == 3) {
			local212 = local103;
			local103 = local97;
			local97 = -local212;
		}
		Static302.aFloat64 = local97;
		Static411.aFloat177 = local103;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IIZ)I")
	public static int method6391(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(69) int local69;
			if (local41 >= '0' && local41 <= '9') {
				local69 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local69 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local69 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local69 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local69 = -local69;
			}
			@Pc(117) int local117 = arg1 * local30 + local69;
			if (local30 != local117 / arg1) {
				throw new NumberFormatException();
			}
			local30 = local117;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!io;)Ljava/lang/String;")
	public static String method6392(@OriginalArg(1) Class1_Sub20 arg0) {
		return Static133.method2256(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!wv;III)V")
	public static void method6393(@OriginalArg(0) Class365 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static476.aClass365_15 = arg0;
		Static508.anInt1420 = arg1;
		Static527.anInt8735 = arg2;
	}
}
