import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public static int anInt6042;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public static int anInt6047;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_77 = new Class179(59, 7);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method5051() {
		if (Static305.anInt5269 != -1) {
			Static194.method3011(Static305.anInt5269, false, -1, -1);
			Static305.anInt5269 = -1;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method5054(@OriginalArg(1) Class1_Sub19 arg0) {
		if (arg0.aClass1_Sub20_5 != null) {
			arg0.aClass1_Sub20_5.anInt2445 = 0;
		}
		arg0.aBoolean302 = false;
		for (@Pc(23) Class1_Sub19 local23 = arg0.method3649(); local23 != null; local23 = arg0.method3651()) {
			method5054(local23);
		}
	}
}
