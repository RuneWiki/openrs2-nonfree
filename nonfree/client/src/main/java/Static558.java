import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
	public static int anInt9397 = 0;

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
	public static boolean aBoolean721 = false;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZII)V")
	public static void method8061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static617.aClass57_14 == null) {
			return;
		}
		@Pc(11) int local11 = Static3.anInt23;
		@Pc(13) int local13 = Static171.anInt2921;
		Static378.method5533(arg1, arg0);
		if (Static659.anInt10597 == 0) {
			Static651.anInterface6_1 = null;
			Static651.anInterface6_1 = Static617.aClass57_14.method7668(Static617.aClass57_14.method7649(Static227.anInt3689, Static370.anInt10370), Static617.aClass57_14.method7653(Static227.anInt3689, Static370.anInt10370));
		} else if (Static659.anInt10597 == 1 && (Static376.anInterface6Array1 == null || local11 != Static3.anInt23 || Static171.anInt2921 != local13)) {
			Static376.anInterface6Array1 = new Interface6[Static3.anInt23 * Static171.anInt2921];
			for (@Pc(62) int local62 = 0; local62 < Static376.anInterface6Array1.length; local62++) {
				Static376.anInterface6Array1[local62] = Static617.aClass57_14.method7668(Static617.aClass57_14.method7649(Static324.anInt10471, Static625.anInt10198), Static617.aClass57_14.method7653(Static324.anInt10471, Static625.anInt10198));
			}
			Static615.anIntArray561 = new int[Static171.anInt2921 * Static3.anInt23];
			Static156.anInt2449 = 1;
		}
		Static554.aBoolean714 = true;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8062(@OriginalArg(1) String arg0) {
		@Pc(6) Class5_Sub50 local6 = Static552.method7994();
		local6.aClass5_Sub23_Sub2_2.method8502(Static157.aClass45_11.anInt829);
		local6.aClass5_Sub23_Sub2_2.method8480(0);
		@Pc(21) int local21 = local6.aClass5_Sub23_Sub2_2.anInt9869;
		local6.aClass5_Sub23_Sub2_2.method8480(652);
		@Pc(37) int[] local37 = Static425.method6321(local6);
		@Pc(41) int local41 = local6.aClass5_Sub23_Sub2_2.anInt9869;
		local6.aClass5_Sub23_Sub2_2.method8538(arg0);
		local6.aClass5_Sub23_Sub2_2.method8502(Static323.anInt5795);
		local6.aClass5_Sub23_Sub2_2.anInt9869 += 7;
		local6.aClass5_Sub23_Sub2_2.method8534(local41, local6.aClass5_Sub23_Sub2_2.anInt9869, local37);
		local6.aClass5_Sub23_Sub2_2.method8533(local6.aClass5_Sub23_Sub2_2.anInt9869 - local21);
		Static494.method7120(local6);
		Static222.anInt3623 = 1;
		Static467.anInt7942 = 0;
		Static436.anInt7486 = 0;
		Static67.anInt1085 = -3;
	}
}
