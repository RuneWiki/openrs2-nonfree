import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt5784 = 500;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Lclient!kfa;")
	public static final Class178 aClass178_7 = new Class178();

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_33 = new Class112(10);

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public static final int[] anIntArray335 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method4902() {
		for (@Pc(6) Class3_Sub1_Sub4 local6 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local6 != null; local6 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
			if (Static483.method7096(local6.anInt3485)) {
				Static383.method6061(local6);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Z")
	public static boolean method4905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static191.method3803(arg1, arg0) || Static631.method8541(arg0, arg1);
	}
}
