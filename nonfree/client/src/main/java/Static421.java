import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
	public static int[] anIntArray844;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method8910(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static310.anInt5466 >= 100) {
			Static88.method1388(Static76.aClass58_40.method1237(Static321.anInt5554));
			return;
		}
		@Pc(25) String local25 = Static250.method3883(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(30) int local30 = 0; local30 < Static310.anInt5466; local30++) {
			@Pc(45) String local45 = Static250.method3883(Static368.aStringArray26[local30]);
			if (local45 != null && local45.equals(local25)) {
				Static88.method1388(arg0 + Static76.aClass58_41.method1237(Static321.anInt5554));
				return;
			}
			if (Static107.aStringArray9[local30] != null) {
				local76 = Static250.method3883(Static107.aStringArray9[local30]);
				if (local76 != null && local76.equals(local25)) {
					Static88.method1388(arg0 + Static76.aClass58_41.method1237(Static321.anInt5554));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static74.anInt1238; local103++) {
			local76 = Static250.method3883(Static182.aStringArray13[local103]);
			if (local76 != null && local76.equals(local25)) {
				Static88.method1388(Static76.aClass58_46.method1237(Static321.anInt5554) + arg0 + Static76.aClass58_47.method1237(Static321.anInt5554));
				return;
			}
			if (Static228.aStringArray17[local103] != null) {
				@Pc(147) String local147 = Static250.method3883(Static228.aStringArray17[local103]);
				if (local147 != null && local147.equals(local25)) {
					Static88.method1388(Static76.aClass58_46.method1237(Static321.anInt5554) + arg0 + Static76.aClass58_47.method1237(Static321.anInt5554));
					return;
				}
			}
		}
		if (Static250.method3883(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42).equals(local25)) {
			Static88.method1388(Static76.aClass58_43.method1237(Static321.anInt5554));
			return;
		}
		@Pc(205) Class5_Sub40 local205 = Static25.method507(Static98.aClass208_2, Static443.aClass181_63);
		local205.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg0) + 1);
		local205.aClass5_Sub12_Sub2_2.method8619(arg0);
		local205.aClass5_Sub12_Sub2_2.method8647(arg1 ? 1 : 0);
		Static612.method8496(local205);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	public static void method8914() {
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_2, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub28_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub25_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub13_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub26_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub14_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub29_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub11_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub23_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_2, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub4_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub27_1, 0);
		Static358.method6960();
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub19_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 1);
		Static246.method3759();
		Static571.method8044();
		Static9.aBoolean5 = true;
	}
}
