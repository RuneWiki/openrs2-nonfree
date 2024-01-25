import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!us;")
	public static final Class344 aClass344_35 = new Class344(68, -1);

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static int anInt3676 = 2;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
	public static final int[] anIntArray192 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3252(@OriginalArg(1) String arg0) {
		@Pc(6) Class3_Sub26 local6 = Static588.method8070();
		local6.aClass3_Sub15_Sub1_3.method8448(Static577.aClass240_42.anInt7401);
		local6.aClass3_Sub15_Sub1_3.method8464(0);
		@Pc(21) int local21 = local6.aClass3_Sub15_Sub1_3.anInt10282;
		local6.aClass3_Sub15_Sub1_3.method8464(636);
		@Pc(30) int[] local30 = Static474.method7013(local6);
		@Pc(34) int local34 = local6.aClass3_Sub15_Sub1_3.anInt10282;
		local6.aClass3_Sub15_Sub1_3.method8417(arg0);
		local6.aClass3_Sub15_Sub1_3.method8448(Static380.anInt7247);
		local6.aClass3_Sub15_Sub1_3.anInt10282 += 7;
		local6.aClass3_Sub15_Sub1_3.method8456(local34, local30, local6.aClass3_Sub15_Sub1_3.anInt10282);
		local6.aClass3_Sub15_Sub1_3.method8397(local6.aClass3_Sub15_Sub1_3.anInt10282 - local21);
		Static472.method5189(local6);
		Static567.anInt9650 = 1;
		Static544.anInt9356 = 0;
		Static6.anInt67 = 0;
		Static278.anInt7456 = -3;
	}
}
