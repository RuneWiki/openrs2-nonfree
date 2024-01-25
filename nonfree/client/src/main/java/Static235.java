import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "Lclient!jj;")
	public static Class193 aClass193_3;

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_19 = new Class313(16);

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_4 = new Class344(9, 16);

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIII)V")
	public static void method3407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static147.anInt2695 = arg2;
		Static568.anInt8628 = arg1;
		Static293.anInt4473 = arg0;
		Static488.anInt7677 = arg3;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BII)V")
	public static void method3411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class3_Sub29 local22 = Static507.method6901(Static617.aClass144_93, Static95.aClass292_2.aClass88_2);
		local22.aClass3_Sub2_Sub1_1.method2024(arg1);
		local22.aClass3_Sub2_Sub1_1.method2037(arg0);
		Static95.aClass292_2.method6855(local22);
	}
}
