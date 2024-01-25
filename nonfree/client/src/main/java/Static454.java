import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!pe;")
	public static Class232 aClass232_8;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public static int anInt7746;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
	public static int anInt7748;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	public static int anInt7750;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Lclient!f;")
	public static final Class1_Sub15 aClass1_Sub15_2 = new Class1_Sub15(0, -1);

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Lclient!im;")
	public static final Class140 aClass140_124 = new Class140(104, -2);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method6444(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg4; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg5++;
				arg7[local30] = (byte) (arg7[local30] - arg1[arg2++]);
				@Pc(43) int local43 = arg5++;
				arg7[local43] = (byte) (arg7[local43] - arg1[arg2++]);
				@Pc(56) int local56 = arg5++;
				arg7[local56] = (byte) (arg7[local56] - arg1[arg2++]);
				@Pc(69) int local69 = arg5++;
				arg7[local69] = (byte) (arg7[local69] - arg1[arg2++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg5++;
				arg7[local30] = (byte) (arg7[local30] - arg1[arg2++]);
			}
			arg5 += arg6;
			arg2 += arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method6446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)I")
	public static int method6447(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static441.method6334(arg0);
	}
}
