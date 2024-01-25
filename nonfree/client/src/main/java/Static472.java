import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt6106;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public static int anInt6105 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!us;")
	public static final Class344 aClass344_76 = new Class344(0, 7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!gaa;)V")
	public static void method5186(@OriginalArg(1) Class108 arg0) {
		if (arg0.anInt4018 == 5 && arg0.anInt4059 != -1) {
			Static525.method7483(Static47.aClass33_3, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)Lclient!ng;")
	public static Class3_Sub1_Sub16 method5188() {
		return Static361.aClass3_Sub1_Sub16_2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ida;I)V")
	public static void method5189(@OriginalArg(0) Class3_Sub26 arg0) {
		Static573.aClass276_59.method6906(arg0);
		arg0.anInt5180 = arg0.aClass3_Sub15_Sub1_3.anInt10282;
		Static266.anInt8465 += arg0.anInt5180;
		arg0.aClass3_Sub15_Sub1_3.anInt10282 = 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!tn;I)Lclient!fm;")
	public static Class102_Sub1 method5190(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(14) Class102 local14 = Static190.method3795(arg0);
		@Pc(18) int local18 = arg0.method8450();
		return new Class102_Sub1(local14.anInt3823, local14.aClass117_6, local14.aClass178_6, local14.anInt3827, local14.anInt3822, local18);
	}
}
