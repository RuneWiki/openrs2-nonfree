import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_74 = new Class45(83, -1);

	@OriginalMember(owner = "client!kda", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
	public static int anInt5168 = 0;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;Lclient!pu;IIIILclient!mc;Lclient!ra;BILclient!pa;)V")
	public static void method4332(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class244 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class198 arg7, @OriginalArg(8) Class80 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class145 arg10) {
		@Pc(14) int local14;
		if (Static242.anInt4993 == 4) {
			local14 = (int) Static500.aFloat186 & 0x3FFF;
		} else {
			local14 = (int) Static500.aFloat186 + Static432.anInt7990 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg7.anInt5762 / 2, arg7.anInt5715 / 2) + 10;
		@Pc(41) int local41 = arg5 * arg5 + arg9 * arg9;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(55) int local55 = Class12_Sub1_Sub36.anIntArray667[local14];
		@Pc(59) int local59 = Class12_Sub1_Sub36.anIntArray668[local14];
		if (Static242.anInt4993 != 4) {
			local55 = local55 * 256 / (Static339.anInt6470 + 256);
			local59 = local59 * 256 / (Static339.anInt6470 + 256);
		}
		@Pc(90) int local90 = arg5 * local55 + local59 * arg9 >> 15;
		@Pc(106) int local106 = local59 * arg5 - arg9 * local55 >> 15;
		@Pc(115) int local115 = arg2.method6159(null, arg1, 100);
		@Pc(123) int local123 = arg2.method6157(null, arg1);
		@Pc(129) int local129 = local90 - local115 / 2;
		if (-arg7.anInt5762 <= local129 && local129 <= arg7.anInt5762 && local106 >= -arg7.anInt5715 && arg7.anInt5715 >= local106) {
			arg8.method7778(arg0, arg7.anInt5715 / 2 + arg4 - local123 - local106 - arg6, arg4, arg1, arg3, arg10, null, 0, arg7.anInt5762 / 2 + arg3 + local129, 50, local115, 0, null);
		}
	}
}
