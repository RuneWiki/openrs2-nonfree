import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_110 = new Class186(65, 4);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	public static void method5006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub1_Sub12 local15 = Static449.method5975(arg0, 13);
		local15.method3043();
		local15.anInt3397 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method5009() {
		Static35.aClass135_1 = new Class135(8);
		Static3.anInt6328 = 0;
		for (@Pc(21) Class48_Sub1 local21 = (Class48_Sub1) Static62.aClass128_2.method2831(); local21 != null; local21 = (Class48_Sub1) Static62.aClass128_2.method2832()) {
			local21.method1292();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ro;I)V")
	public static void method5013(@OriginalArg(0) Class6_Sub33 arg0) {
		if (!Static206.aBoolean239) {
			arg0.method5977();
			Static228.anInt3878--;
		}
	}
}
