import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
	public static int anInt7064;

	@OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
	public static int anInt7065;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_212 = new Class214(77, 10);

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
	public static final int[] anIntArray570 = new int[32];

	@OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
	public static int anInt7070 = 0;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
	public static void method5641() {
		Static379.aBoolean483 = false;
		Static290.aClipboard1 = null;
		Static208.method3674();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method5642(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static203.method3622(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0.charAt(local30) != arg1; local30++) {
			}
			local15[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
	public static void method5644(@OriginalArg(0) int arg0) {
		Static113.anInt2426 = -1;
		Static241.anInt4715 = arg0;
		Static113.anInt2426 = -1;
		Static142.method2614();
	}
}
