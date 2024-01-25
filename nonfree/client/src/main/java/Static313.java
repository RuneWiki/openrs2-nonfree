import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public static int anInt5629;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_73 = new Class208(79, 4);

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public static final int anInt5628 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!sc;IILclient!za;Lclient!qg;ILclient!ho;B)V")
	public static void method4466(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) Class203 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub16 arg6) {
		@Pc(15) int local15 = arg6.anInt2884 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg4.anInt5960 != 0) {
			arg3.method5996(arg0.method5134() * arg2 + arg1 + 1 - local19, local19, arg4.anInt5960, local15, arg5 + 10);
		}
		if (arg4.anInt5961 != 0) {
			arg3.method5993(arg4.anInt5961, arg0.method5134() * arg2 + arg1 + 1 - local19, local19, local15, arg5 + 10);
		}
		@Pc(70) int local70 = arg4.anInt5965;
		if (arg6.aBoolean181 && arg4.anInt5959 != -1) {
			local70 = arg4.anInt5959;
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			@Pc(88) String local88 = Static51.aStringArray9[local82];
			if (local82 < arg2 - 1) {
				local88 = local88.substring(0, local88.length() - 4);
			}
			arg0.method5135(arg3, local88, arg6.anInt2884, arg1, local70);
			arg1 += arg0.method5134();
		}
	}
}
