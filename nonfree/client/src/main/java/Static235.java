import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!re", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public static int anInt4701;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!df;")
	public static Class33 aClass33_12 = new Class33(64);

	@OriginalMember(owner = "client!re", name = "l", descriptor = "[I")
	public static int[] anIntArray506 = new int[1000];

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public static int anInt4699 = 0;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt4700 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[IBII)V")
	public static void method3988(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg2 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (local15 > arg3) {
			@Pc(20) int local20 = arg3 + 1;
			arg1[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg1[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg1[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg1[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg1[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg1[local45] = arg0;
			@Pc(50) int local50 = local45 + 1;
			arg1[local50] = arg0;
			arg3 = local50 + 1;
			arg1[arg3] = arg0;
		}
		while (local12 > arg3) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IC)Z")
	public static boolean method3989(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_';
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lclient!rg;IZIB)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) Class151[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) Class151 local19 = arg1[local7];
			if (local19 != null && arg0 == local19.anInt4727) {
				Static305.method4914(arg2, local19, arg3, arg4);
				Static41.method573(arg4, local19, arg2);
				if (local19.anInt4720 - local19.anInt4773 < local19.anInt4757) {
					local19.anInt4757 = local19.anInt4720 - local19.anInt4773;
				}
				if (local19.anInt4757 < 0) {
					local19.anInt4757 = 0;
				}
				if (local19.anInt4713 - local19.anInt4751 < local19.anInt4747) {
					local19.anInt4747 = local19.anInt4713 - local19.anInt4751;
				}
				if (local19.anInt4747 < 0) {
					local19.anInt4747 = 0;
				}
				if (local19.anInt4721 == 0) {
					Static282.method4617(local19, arg3);
				}
			}
		}
	}
}
