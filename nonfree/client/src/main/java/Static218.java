import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public static int anInt4655;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static int anInt4659;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt4657 = 0;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public static int anInt4660 = -1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3845(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static604.method8337(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static544.anInt9412; local30++) {
			@Pc(36) String local36 = Static277.aStringArray16[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static604.method8337(local36);
			if (local36 != null && local36.equals(local20)) {
				Static544.anInt9412--;
				for (@Pc(60) int local60 = local30; local60 < Static544.anInt9412; local60++) {
					Static277.aStringArray16[local60] = Static277.aStringArray16[local60 + 1];
					Static545.aStringArray34[local60] = Static545.aStringArray34[local60 + 1];
					Static284.anIntArray265[local60] = Static284.anIntArray265[local60 + 1];
					Static304.aStringArray18[local60] = Static304.aStringArray18[local60 + 1];
					Static130.anIntArray538[local60] = Static130.anIntArray538[local60 + 1];
					Static366.aBooleanArray17[local60] = Static366.aBooleanArray17[local60 + 1];
				}
				Static617.anInt10423 = Static51.anInt1750;
				@Pc(129) Class6_Sub17 local129 = Static330.method7824(Static190.aClass185_42, Static569.aClass134_2);
				local129.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0));
				local129.aClass6_Sub8_Sub1_2.method8205(arg0);
				Static452.method6867(local129);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public static void method3848(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static491.aClass6_Sub5_Sub13_2 != null) {
			Static43.anInt1589 = Static491.aClass6_Sub5_Sub13_2.anInt4042;
		} else {
			Static43.anInt1589 = -1;
		}
		Static23.aClass302_1 = null;
		Static382.anInt7220 = 0;
		Static491.aClass6_Sub5_Sub13_2 = null;
		Static15.aClass163_8 = null;
		Static491.method6569();
		Static491.aClass163_49.method4970();
		Static335.aClass333_6 = null;
		Static335.aClass333_7 = null;
		Static291.aClass4_13 = null;
		Static399.aClass333_9 = null;
		Static528.aClass333_13 = null;
		Static491.aClass374_2 = null;
		Static181.anInt3980 = -1;
		Static461.aClass333_11 = null;
		Static315.anInt6316 = -1;
		Static476.aClass333_12 = null;
		Static394.aClass333_10 = null;
		Static264.aClass333_4 = null;
		if (Static491.aClass345_4 != null) {
			Static491.aClass345_4.method8045();
			Static491.aClass345_4.method8046(64, 128);
		}
		if (Static491.aClass341_4 != null) {
			Static491.aClass341_4.method8003(64, 64);
		}
		if (Static491.aClass310_3 != null) {
			Static491.aClass310_3.method7478(64);
		}
		Static39.aClass214_1.method5869(64);
	}
}
