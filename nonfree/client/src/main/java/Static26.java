import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!gw;Z)Lclient!vb;")
	public static Class298 method1175(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(12) Class298 local12 = new Class298();
		local12.anInt8545 = arg0.method3056();
		local12.aClass1_Sub1_Sub17_1 = Static111.aClass109_1.method3268(local12.anInt8545);
		return local12;
	}
}
