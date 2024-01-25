import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_3 = new Class68(15, 0, 1, 0);

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_15 = new Class344(68, 8);

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II[BI[BIIIB)V")
	public static void method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg4[local26] += arg2[arg1++];
				@Pc(38) int local38 = arg7++;
				arg4[local38] += arg2[arg1++];
				@Pc(50) int local50 = arg7++;
				arg4[local50] += arg2[arg1++];
				@Pc(62) int local62 = arg7++;
				arg4[local62] += arg2[arg1++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg7++;
				arg4[local26] += arg2[arg1++];
			}
			arg7 += arg0;
			arg1 += arg5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)Z")
	public static boolean method1997(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(CI)Z")
	public static boolean method1998(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static73.method1574(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static408.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static396.aCharArray6;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (local50 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)[Lclient!mf;")
	public static Class214[] method1999() {
		return new Class214[] { Static40.aClass214_2, Static449.aClass214_12, Static382.aClass214_9 };
	}
}
