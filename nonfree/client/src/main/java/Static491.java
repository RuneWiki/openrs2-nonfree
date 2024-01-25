import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	public static int anInt8435;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	public static int anInt8433 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)Z")
	public static boolean method6618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static134.method2612(arg0, arg1) || Static295.method4420(arg0, arg1);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	public static void method6619() {
		@Pc(16) byte[] local16;
		if (Static154.anObject9 == null) {
			@Pc(9) Class44_Sub1_Sub2 local9 = new Class44_Sub1_Sub2();
			local16 = local9.method4581();
			Static154.anObject9 = Static342.method4996(local16);
		}
		if (Static21.anObject1 == null) {
			@Pc(32) Class44_Sub2_Sub1 local32 = new Class44_Sub2_Sub1();
			local16 = local32.method2635();
			Static21.anObject1 = Static342.method4996(local16);
		}
	}
}
