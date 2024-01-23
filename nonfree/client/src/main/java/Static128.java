import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
	public static int[] anIntArray263 = new int[50];

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString80 = null;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[F")
	public static float[] method2181() {
		@Pc(7) float local7 = Static201.method3575() + Static201.method3585();
		@Pc(9) int local9 = Static201.method3584();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static244.aFloatArray30[3] = 1.0F;
		@Pc(31) float local31 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static244.aFloatArray30[1] = local7 * local46 * local31 * Static97.aFloatArray32[1];
		Static244.aFloatArray30[0] = local7 * Static97.aFloatArray32[0] * local18 * local46;
		Static244.aFloatArray30[2] = local38 * Static97.aFloatArray32[2] * local46 * local7;
		return Static244.aFloatArray30;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!kb;Lclient!kb;I)V")
	public static void method2186(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		Static293.aClass83_202 = arg1;
		Static83.aClass83_52 = arg0;
		Static293.aClass83_202.method2317(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(33) int local33 = (int) (Math.random() * 41.0D) - 20;
		Static38.anInt1156 = local19 + local33;
		@Pc(44) int local44 = (int) (Math.random() * 21.0D) - 10;
		Static238.anInt5221 = local26 + local33;
		Static16.anInt452 = local44 + local33;
	}
}
