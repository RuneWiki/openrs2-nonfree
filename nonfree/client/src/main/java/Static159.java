import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	public static int anInt3285;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	public static int anInt3286;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	public static void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(6, arg0);
		local8.method1198();
		local8.anInt1465 = arg1;
	}
}
