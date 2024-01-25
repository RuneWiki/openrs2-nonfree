import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	public static void method3338() {
		for (@Pc(3) int local3 = 0; local3 < Static60.anInt1599; local3++) {
			@Pc(9) int local9 = Static529.anIntArray535[local3];
			@Pc(16) Class3_Sub39 local16 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local9);
			if (local16 != null) {
				@Pc(21) Class25_Sub2_Sub2_Sub5_Sub2 local21 = local16.aClass25_Sub2_Sub2_Sub5_Sub2_2;
				Static196.method3428(local21.aClass213_1.anInt6196, local21);
			}
		}
	}
}
