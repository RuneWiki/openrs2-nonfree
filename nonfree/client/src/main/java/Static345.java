import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
	public static void method5138() {
		for (@Pc(3) int local3 = 0; local3 < Static428.anInt7363; local3++) {
			@Pc(9) int local9 = Static444.anIntArray617[local3];
			@Pc(16) Class4_Sub50 local16 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local9);
			if (local16 != null) {
				@Pc(21) Class10_Sub1_Sub2_Sub1 local21 = local16.aClass10_Sub1_Sub2_Sub1_1;
				Static209.method7921(local21.aClass54_1.anInt1260, local21);
			}
		}
	}
}
