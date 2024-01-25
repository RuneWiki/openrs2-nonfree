import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_7 = new Class193("", 17);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!tq;Lclient!tq;I)V")
	public static void method5051(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class239 arg1) {
		Static298.method4373(Static210.aClass25_52);
		Static449.aClass6_Sub15_Sub1_2.method3107(arg1.anInt6423);
		Static449.aClass6_Sub15_Sub1_2.method3120(arg0.anInt6423);
		Static449.aClass6_Sub15_Sub1_2.method3117(arg1.anInt6492);
		Static449.aClass6_Sub15_Sub1_2.method3136(arg0.anInt6492);
		Static449.aClass6_Sub15_Sub1_2.method3106(arg0.anInt6487);
		Static449.aClass6_Sub15_Sub1_2.method3106(arg1.anInt6487);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method5052() {
		if (Static270.aBoolean332) {
			return;
		}
		Static165.aBoolean204 = true;
		if (Static8.aClass173_Sub1_1.aBoolean311) {
			Static397.aFloat99 = (int) Static397.aFloat99 - 65 & 0xFFFFFF80;
		} else {
			Static201.aFloat66 += (-24.0F - Static201.aFloat66) / 2.0F;
		}
		Static270.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!be;IIIJIIILclient!tq;)V")
	public static void method5056(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class239 arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg1 * arg1;
		if (arg3 < (long) local11) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg7.anInt6435 / 2, arg7.anInt6408 / 2);
		if (local31 * local31 >= local11) {
			Static31.method409(arg0, Static273.aClass12Array15[arg2], arg4, arg1, arg6, arg7, arg5);
			return;
		}
		local31 -= 10;
		@Pc(51) int local51;
		if (Static9.anInt164 == 4) {
			local51 = (int) Static397.aFloat99 & 0x3FFF;
		} else {
			local51 = Static71.anInt1484 + (int) Static397.aFloat99 & 0x3FFF;
		}
		@Pc(64) int local64 = Class6_Sub1_Sub18.anIntArray642[local51];
		@Pc(68) int local68 = Class6_Sub1_Sub18.anIntArray643[local51];
		if (Static9.anInt164 != 4) {
			local68 = local68 * 256 / (Static393.anInt5623 + 256);
			local64 = local64 * 256 / (Static393.anInt5623 + 256);
		}
		@Pc(100) int local100 = local64 * arg4 + local68 * arg1 >> 15;
		@Pc(111) int local111 = arg4 * local68 - local64 * arg1 >> 15;
		@Pc(117) double local117 = Math.atan2((double) local100, (double) local111);
		@Pc(124) int local124 = (int) (Math.sin(local117) * (double) local31);
		@Pc(131) int local131 = (int) ((double) local31 * Math.cos(local117));
		Static139.aClass12Array11[arg2].method5670((float) arg7.anInt6435 / 2.0F + (float) arg6 + (float) local124, (float) -local131 + (float) arg7.anInt6408 / 2.0F + (float) arg5, 4096, (int) (-local117 / 6.283185307179586D * 65535.0D));
	}
}
