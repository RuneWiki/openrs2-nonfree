import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "Lclient!gj;")
	public static Class124 aClass124_8;

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
	public static int anInt10534 = 0;

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "[I")
	public static final int[] anIntArray775 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
	public static int anInt10537 = 0;

	@OriginalMember(owner = "client!vda", name = "L", descriptor = "[I")
	public static final int[] anIntArray776 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)V")
	public static void method8782(@OriginalArg(0) long arg0) {
		Static170.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ea;Lclient!ea;I)V")
	public static void method8783(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1) {
		if (arg0.aClass12_67 != null) {
			arg0.method9143();
		}
		arg0.aClass12_68 = arg1;
		arg0.aClass12_67 = arg1.aClass12_67;
		arg0.aClass12_67.aClass12_68 = arg0;
		arg0.aClass12_68.aClass12_67 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIII[B)V")
	public static void method8790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(25) int local25 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local25--;
			if (local25 < 0) {
				local25 = arg2 - arg0 & 0x3;
				while (true) {
					local25--;
					if (local25 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(34) int local34 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			arg1 = local44 + 1;
			arg3[local44] = 1;
		}
	}
}
