import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt8575;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_9 = new Class8(8, 1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method7206(@OriginalArg(1) String arg0) {
		return Static596.method8084(arg0, 16);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7207(@OriginalArg(0) String arg0) {
		if (Static619.aClass211Array1 != null) {
			@Pc(19) Class2_Sub40 local19 = Static464.method6285(Static251.aClass131_1, Static389.aClass179_85);
			local19.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg0));
			local19.aClass2_Sub22_Sub2_2.method8540(arg0);
			Static528.method7295(local19);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)Z")
	public static boolean method7209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
