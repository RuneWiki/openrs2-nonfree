import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
	public static int anInt9432;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
	public static final int[] anIntArray813 = new int[1];

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
	public static final int[] anIntArray814 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
	public static final int[] anIntArray815 = new int[1000];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8252(@OriginalArg(0) String arg0) {
		@Pc(6) Class3_Sub34 local6 = Static202.method3100();
		local6.aClass3_Sub25_Sub1_2.method8614(Static515.aClass224_11.anInt6057);
		local6.aClass3_Sub25_Sub1_2.method8649(0);
		@Pc(21) int local21 = local6.aClass3_Sub25_Sub1_2.anInt9765;
		local6.aClass3_Sub25_Sub1_2.method8649(649);
		@Pc(30) int[] local30 = Static528.method7625(local6);
		@Pc(34) int local34 = local6.aClass3_Sub25_Sub1_2.anInt9765;
		local6.aClass3_Sub25_Sub1_2.method8583(arg0);
		local6.aClass3_Sub25_Sub1_2.method8614(Static609.anInt9834);
		local6.aClass3_Sub25_Sub1_2.anInt9765 += 7;
		local6.aClass3_Sub25_Sub1_2.method8587(local6.aClass3_Sub25_Sub1_2.anInt9765, local34, local30);
		local6.aClass3_Sub25_Sub1_2.method8629(local6.aClass3_Sub25_Sub1_2.anInt9765 - local21);
		Static441.method6275(local6);
		Static219.anInt4163 = 0;
		Static433.anInt8266 = 1;
		Static40.anInt933 = 0;
		Static421.anInt6742 = -3;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!sja;)V")
	public static void method8253(@OriginalArg(0) Class321 arg0) {
		Static645.aClass321_3 = arg0;
	}
}
