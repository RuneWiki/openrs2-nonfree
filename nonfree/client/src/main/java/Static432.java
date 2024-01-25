import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	public static int anInt7683;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!fe;")
	public static Class74 aClass74_33 = new Class74(8);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method6289() {
		Static387.aClass6_Sub4_Sub2_3.method726();
		Static445.anInt7975 = 1;
		Static35.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II[B)[B")
	public static byte[] method6293(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static459.method6338(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
