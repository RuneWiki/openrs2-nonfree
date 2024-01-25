import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!as;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_51 = new Class256(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Z")
	public static boolean aBoolean236 = true;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public static void method1996() {
		if (Static300.aClass269_9 != Static343.aClass269_11) {
			try {
				Static461.method3590(Static405.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!md;)Lclient!uc;")
	public static Class31_Sub4 method1998(@OriginalArg(1) Class2_Sub20 arg0) {
		return new Class31_Sub4(arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3748(), arg0.method3737());
	}
}
