import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
	public static int anInt6984 = 0;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[200];

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
	public static int anInt6985 = -1;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!lt;ILjava/awt/Canvas;Lclient!l;)Lclient!za;")
	public static Class50 method5481(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface7 arg3) {
		return new w(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBIIII)V")
	public static void method5482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg2 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(88) int local88 = (arg2 - 1) * local52;
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (arg0 >= Static319.anInt5496 && arg0 <= Static160.anInt3220) {
			local111 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg1 + arg3);
			local119 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg1 - arg3);
			Static212.method3267(local119, local111, arg4, Class10_Sub10_Sub1.lb[arg0]);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local78;
					local39 += local64;
					local64 += local56;
					local78 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local48 += local78;
				local39 += local64;
				local7++;
				local78 += local56;
				local64 += local56;
			}
			local48 += -local72;
			local39 += -local88;
			local9--;
			local88 -= local52;
			local72 -= local52;
			local111 = arg0 - local9;
			local119 = local9 + arg0;
			if (Static319.anInt5496 <= local119 && Static160.anInt3220 >= local111) {
				@Pc(226) int local226 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local7 + arg1);
				@Pc(234) int local234 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg1 - local7);
				if (local111 >= Static319.anInt5496) {
					Static212.method3267(local234, local226, arg4, Class10_Sub10_Sub1.lb[local111]);
				}
				if (Static160.anInt3220 >= local119) {
					Static212.method3267(local234, local226, arg4, Class10_Sub10_Sub1.lb[local119]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!sb;Lclient!za;)I")
	public static int method5483(@OriginalArg(1) Class219 arg0, @OriginalArg(2) Class50 arg1) {
		if (arg0.anInt6157 != -1) {
			return arg0.anInt6157;
		}
		if (arg0.anInt6166 != -1) {
			@Pc(35) Class259 local35 = arg1.anInterface7_8.method4447(arg1.method5830() ? arg0.anInt6166 : arg0.anInt6162);
			if (!local35.aBoolean476) {
				return local35.aShort108;
			}
		}
		return arg0.anInt6161;
	}
}
