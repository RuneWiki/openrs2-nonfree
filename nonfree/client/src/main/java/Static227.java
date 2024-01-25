import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!qh;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public static int anInt4416;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!ht;")
	public static Class165 aClass165_4;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt4418 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V")
	public static void method4060(@OriginalArg(1) boolean arg0) {
		Static302.method4850();
		if (!Static292.method4772(Static37.anInt498)) {
			return;
		}
		@Pc(23) Class260[] local23 = Static525.aClass260Array1;
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class260 local31 = local23[local25];
			local31.anInt7200++;
			if (local31.anInt7200 < 50 && !arg0) {
				return;
			}
			local31.anInt7200 = 0;
			if (!local31.aBoolean538 && local31.aClass141_1 != null) {
				@Pc(70) Class6_Sub13 local70 = Static30.method353(Static479.aClass241_99, local31.aClass270_2);
				local31.method6404(local70);
				try {
					local31.method6399();
				} catch (@Pc(79) IOException local79) {
					local31.aBoolean538 = true;
				}
			}
		}
		Static302.method4850();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!vo;Lclient!vo;I)V")
	public static void method4062(@OriginalArg(0) Class381 arg0, @OriginalArg(1) Class381 arg1) {
		@Pc(13) Class6_Sub13 local13 = Static30.method353(Static456.aClass241_98, Static525.aClass260_4.aClass270_2);
		local13.aClass6_Sub15_Sub1_1.method3023(arg1.anInt10089);
		local13.aClass6_Sub15_Sub1_1.method3040(arg1.anInt10149);
		local13.aClass6_Sub15_Sub1_1.method3045(arg0.anInt10112);
		local13.aClass6_Sub15_Sub1_1.method3024(arg0.anInt10089);
		local13.aClass6_Sub15_Sub1_1.method2984(arg0.anInt10149);
		local13.aClass6_Sub15_Sub1_1.method3045(arg1.anInt10112);
		Static525.aClass260_4.method6404(local13);
	}
}
