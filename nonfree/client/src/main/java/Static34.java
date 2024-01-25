import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "A", descriptor = "Lclient!ga;")
	public static Class111 aClass111_6;

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "Lclient!pb;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B[BII[BIIII)V")
	public static void method808(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg0[local26] += arg3[arg1++];
				@Pc(38) int local38 = arg7++;
				arg0[local38] += arg3[arg1++];
				@Pc(50) int local50 = arg7++;
				arg0[local50] += arg3[arg1++];
				@Pc(62) int local62 = arg7++;
				arg0[local62] += arg3[arg1++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg7++;
				arg0[local26] += arg3[arg1++];
			}
			arg1 += arg5;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!to;I)V")
	public static void method813(@OriginalArg(0) Class1_Sub48 arg0) {
		Static225.aClass361_49.method7855(arg0);
		arg0.anInt8519 = arg0.aClass1_Sub20_Sub1_2.anInt5238;
		Static478.anInt8068 += arg0.anInt8519;
		arg0.aClass1_Sub20_Sub1_2.anInt5238 = 0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)I")
	public static int method815(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method817(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static443.method6341("\n", "%0a", arg0));
	}
}
