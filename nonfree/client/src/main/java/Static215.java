import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public static int anInt4848;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_100 = new Class215(65, -1);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4187(@OriginalArg(0) Class20 arg0) {
		if (Static644.aClass341_70.method8527() == 0) {
			return;
		}
		@Pc(23) Class2_Sub19 local23;
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 0) {
			for (local23 = (Class2_Sub19) Static644.aClass341_70.method8524(); local23 != null; local23 = (Class2_Sub19) Static644.aClass341_70.method8519()) {
				Static635.aClass336_2.method8416(arg0, local23.anInt4213, local23.anInt4214, Static529.aClass68_10, local23.aBoolean311 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null, local23.anInt4210, false, arg0, local23.anInt4215, false, local23.anInt4211);
				local23.method9253();
			}
			Static132.method3031();
			return;
		}
		if (Static36.aClass20_1 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static36.aClass20_1 = Static348.method5945(0, Static216.anInterface4_10, 0, local72, Static384.aClass157_195);
			Static297.aClass68_8 = Static36.aClass20_1.method7289(Static48.method1704(Static265.anInt5654, Static348.aClass157_177), Static652.method7581(Static214.aClass157_106, Static265.anInt5654));
		}
		for (local23 = (Class2_Sub19) Static644.aClass341_70.method8524(); local23 != null; local23 = (Class2_Sub19) Static644.aClass341_70.method8519()) {
			Static635.aClass336_2.method8416(Static36.aClass20_1, local23.anInt4213, local23.anInt4214, Static297.aClass68_8, local23.aBoolean311 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null, local23.anInt4210, false, arg0, local23.anInt4215, false, local23.anInt4211);
			local23.method9253();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg4[local31] += arg2[arg1++];
				@Pc(43) int local43 = arg6++;
				arg4[local43] += arg2[arg1++];
				@Pc(55) int local55 = arg6++;
				arg4[local55] += arg2[arg1++];
				@Pc(67) int local67 = arg6++;
				arg4[local67] += arg2[arg1++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local31 = arg6++;
				arg4[local31] += arg2[arg1++];
			}
			arg6 += arg7;
			arg1 += arg0;
		}
	}
}
