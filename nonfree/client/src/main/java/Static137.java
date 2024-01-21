import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
	public static int[] anIntArray290 = new int[2000];

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_932 = Static38.method685("<br>(X100(U(Y");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method2124() {
		anIntArray290 = null;
		aClass6_932 = null;
		aClass2_Sub3_Sub2_Sub3Array5 = null;
		aBooleanArray14 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!me;)Lclient!pf;")
	public static Class2_Sub1 method2125(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(9) int local9 = arg0.method1402();
		@Pc(13) int local13 = arg0.method1402();
		@Pc(24) Class local24 = Static32.method594(local13);
		try {
			@Pc(28) Class2_Sub1 local28 = (Class2_Sub1) local24.getDeclaredConstructor().newInstance();
			if (local28 != null) {
				local28.anInt4154 = local9;
				local28.anInt4155 = arg0.method1402();
				@Pc(42) int local42 = arg0.method1402();
				for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
					@Pc(50) int local50 = arg0.method1402();
					local28.method2799(arg0, local50);
				}
			}
			local28.method2789();
			return local28;
		} catch (@Pc(69) IllegalAccessException local69) {
			throw new RuntimeException();
		} catch (@Pc(74) InstantiationException local74) {
			throw new RuntimeException();
		}
	}
}
