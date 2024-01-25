import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	public static int anInt5939;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	public static int anInt5943;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "[Lclient!pq;")
	public static final Class193[] aClass193Array1 = new Class193[4];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)Lclient!wi;")
	public static Class1_Sub43 method4702(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub43) Static401.aClass199_172.method4387(local17);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	public static void method4703() {
		Static11.anInt185 = -1;
		Static191.anInt3304 = 0;
		Static232.anInt4096 = -1;
		Static247.anInt4472 = -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ug;I)Lclient!gd;")
	public static Class1_Sub4 method4705(@OriginalArg(0) Class1_Sub28 arg0) {
		arg0.method5337();
		@Pc(13) int local13 = arg0.method5337();
		@Pc(17) Class1_Sub4 local17 = Static395.method5158(local13);
		local17.anInt7270 = arg0.method5337();
		@Pc(26) int local26 = arg0.method5337();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) int local39 = arg0.method5337();
			local17.method5690(arg0, local39);
		}
		local17.method5686();
		return local17;
	}
}
