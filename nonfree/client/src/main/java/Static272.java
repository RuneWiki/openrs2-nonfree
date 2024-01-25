import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!kga;")
	public static Class196 aClass196_7;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!kf;")
	public static final Class194 aClass194_6 = new Class194();

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public static int anInt5181 = 999999;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_233 = new Class64(6, -2);

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public static int anInt5182 = 0;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIIII[BIII)V")
	public static void method4391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg4; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg7++;
				arg5[local30] = (byte) (arg5[local30] - arg0[arg1++]);
				@Pc(43) int local43 = arg7++;
				arg5[local43] = (byte) (arg5[local43] - arg0[arg1++]);
				@Pc(56) int local56 = arg7++;
				arg5[local56] = (byte) (arg5[local56] - arg0[arg1++]);
				@Pc(69) int local69 = arg7++;
				arg5[local69] = (byte) (arg5[local69] - arg0[arg1++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg7++;
				arg5[local30] = (byte) (arg5[local30] - arg0[arg1++]);
			}
			arg1 += arg6;
			arg7 += arg2;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4392(@OriginalArg(0) String arg0) {
		return Static431.method6133(arg0, 10);
	}
}
