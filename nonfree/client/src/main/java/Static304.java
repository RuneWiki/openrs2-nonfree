import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
	public static int anInt6522;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_168 = new Class163(21, 3);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5405(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static281.method3884(Static428.method5838(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public static void method5407() {
		if (Static464.aBoolean522) {
			return;
		}
		Static179.aBoolean252 = true;
		Static464.aBoolean522 = true;
		if (Static39.aClass79_Sub1_1.aBoolean160) {
			Static275.aFloat61 = (int) Static275.aFloat61 - 17 & 0xFFFFFFF0;
		} else {
			Static313.aFloat87 += (-12.0F - Static313.aFloat87) / 2.0F;
		}
	}
}
