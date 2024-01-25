import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_200 = new Class88("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	public static int anInt6865 = -1;

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_15 = new Class225(0, 2, 2, 1);

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "J")
	public static long aLong180 = 0L;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
	public static int anInt6867 = -1;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!an;IB)Lclient!pu;")
	public static Class244 method5738(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method410(arg1);
		return local13 == null ? null : new Class244(local13);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dj;I)V")
	public static void method5739(@OriginalArg(0) Object arg0, @OriginalArg(1) Class71 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static17.method388(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)V")
	public static void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg1 << 1) - 3);
		@Pc(76) int local76 = local54;
		@Pc(98) int local98;
		@Pc(107) int local107;
		if (arg4 >= Static507.anInt9124 && Static234.anInt4897 >= arg4) {
			local98 = Static108.method2267(arg0 + arg3, Static251.anInt5168, Static341.anInt6481);
			local107 = Static108.method2267(arg3 - arg0, Static251.anInt5168, Static341.anInt6481);
			Static118.method2461(Static228.anIntArrayArray46[arg4], local98, arg2, local107);
		}
		@Pc(121) int local121 = (arg1 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local76;
				local7++;
				local62 += local54;
				local76 += local54;
			}
			local38 += -local121;
			local46 += -local70;
			local70 -= local50;
			local9--;
			local121 -= local50;
			local98 = arg4 - local9;
			local107 = local9 + arg4;
			if (Static507.anInt9124 <= local107 && Static234.anInt4897 >= local98) {
				@Pc(221) int local221 = Static108.method2267(local7 + arg3, Static251.anInt5168, Static341.anInt6481);
				@Pc(230) int local230 = Static108.method2267(arg3 - local7, Static251.anInt5168, Static341.anInt6481);
				if (local98 >= Static507.anInt9124) {
					Static118.method2461(Static228.anIntArrayArray46[local98], local221, arg2, local230);
				}
				if (Static234.anInt4897 >= local107) {
					Static118.method2461(Static228.anIntArrayArray46[local107], local221, arg2, local230);
				}
			}
		}
	}
}
