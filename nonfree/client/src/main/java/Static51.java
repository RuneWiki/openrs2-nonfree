import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public static final int anInt1087 = 1400;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	public static int anInt1089 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public static void method1157() {
		@Pc(8) Class3_Sub43 local8 = (Class3_Sub43) Static655.aClass338_233.method8177();
		@Pc(19) boolean local19 = Static678.aClass260_21 != null || Static231.anInt4294 > 0;
		@Pc(31) int local31 = local8.method7774();
		@Pc(35) int local35 = local8.method7777();
		if (local19) {
			Static261.anInt4675 = 1;
		}
		if (local19) {
			Static569.aClass3_Sub11_Sub14_5 = Static150.aClass3_Sub11_Sub14_2;
		} else {
			Static242.method6995(Static150.aClass3_Sub11_Sub14_2, local35, local31);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)I")
	public static int method1158(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
