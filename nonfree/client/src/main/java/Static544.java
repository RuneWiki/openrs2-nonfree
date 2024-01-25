import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "[[Lclient!pe;")
	public static Class240[][] aClass240ArrayArray1;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
	public static int anInt9625 = -1;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_155 = new Class45(19, 12);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V")
	public static void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class12_Sub4_Sub1 local10 = Static389.method6156(4, arg3);
		local10.method820();
		local10.anInt806 = arg0;
		local10.anInt803 = arg2;
		local10.anInt808 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static void method7975() {
		Static389.aBoolean533 = false;
		Static480.method7208(Static105.anInt2405, Static301.anInt5821, Static298.anInt3270, Static253.anInt5213);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)V")
	public static void method7976(@OriginalArg(0) int arg0) {
		if (Static72.anIntArray181 == null || Static72.anIntArray181.length < arg0) {
			Static72.anIntArray181 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7977(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static365.method5698("\n", arg0, "%0a"));
	}
}
