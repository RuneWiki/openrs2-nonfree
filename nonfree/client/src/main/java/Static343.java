import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public static int anInt6447;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!bg;B)Lclient!sb;")
	public static Class1_Sub3 method5439(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method4532();
		@Pc(13) int local13 = arg0.method4532();
		@Pc(25) Class1_Sub3 local25 = Static96.method5287(local13);
		local25.anInt6591 = arg0.method4532();
		@Pc(34) int local34 = arg0.method4532();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method4532();
			local25.method5526(local42, arg0);
		}
		local25.method5535();
		return local25;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!uo;Lclient!jn;I)I")
	public static int method5441(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class108 arg1) {
		if (arg1.anInt3155 != -1) {
			return arg1.anInt3155;
		}
		if (arg1.anInt3150 != -1) {
			@Pc(32) Class154 local32 = Static357.anInterface2_7.method4244(arg0.method2178() ? arg1.anInt3150 : arg1.anInt3158);
			if (!local32.aBoolean443) {
				return local32.aShort54;
			}
		}
		return arg1.anInt3153;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!wo;)V")
	public static void method5444(@OriginalArg(1) Class216 arg0) {
		Static203.aClass216_68 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method5445() {
		Static342.aClass1_Sub8_Sub1_7.method3229(218);
		Static342.aClass1_Sub8_Sub1_7.method4542(Static190.anInt4079);
	}
}
