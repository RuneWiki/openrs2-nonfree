import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	public static int anInt7548;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_370 = new Class12(86, 0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BC)Z")
	public static boolean method5811(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static204.method3113(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static208.aCharArray1;
			for (@Pc(29) int local29 = 0; local29 < local18.length; local29++) {
				@Pc(35) char local35 = local18[local29];
				if (local35 == arg0) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static223.aCharArray2;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (local59 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBII)I")
	public static int method5813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static78.method1146(local7, local17);
		@Pc(35) int local35 = Static78.method1146(local7 + 1, local17);
		@Pc(42) int local42 = Static78.method1146(local7, local17 + 1);
		@Pc(56) int local56 = Static78.method1146(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static159.method2521(local35, local28, arg0, local13);
		@Pc(70) int local70 = Static159.method2521(local56, local42, arg0, local13);
		return Static159.method2521(local70, local63, arg0, local23);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[BZ[I[II[B[[B)I")
	public static int method5814(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg3[arg0];
		@Pc(15) int local15 = arg2[arg0] + local9;
		@Pc(19) int local19 = arg3[arg4];
		@Pc(26) int local26 = local19 + arg2[arg4];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = local15;
		if (local26 < local15) {
			local39 = local26;
		}
		@Pc(59) int local59 = arg5[arg0] & 0xFF;
		if ((arg5[arg4] & 0xFF) < local59) {
			local59 = arg5[arg4] & 0xFF;
		}
		@Pc(76) byte[] local76 = arg6[arg0];
		@Pc(80) byte[] local80 = arg1[arg4];
		@Pc(85) int local85 = local28 - local9;
		@Pc(89) int local89 = local28 - local19;
		for (@Pc(91) int local91 = local28; local91 < local39; local91++) {
			@Pc(103) int local103 = local80[local89++] + local76[local85++];
			if (local103 < local59) {
				local59 = local103;
			}
		}
		return -local59;
	}
}
