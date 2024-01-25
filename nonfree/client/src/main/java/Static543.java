import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wr", name = "bb", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_204 = new Class88(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!wr", name = "jb", descriptor = "I")
	public static int anInt6966 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5917(@OriginalArg(1) Class42 arg0) {
		if (Static8.anInt118 < 2 && !Static73.aBoolean136 || Static191.aClass198_6 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static73.aBoolean136 && Static8.anInt118 < 2) {
			local34 = Static274.aString59 + Static409.aClass88_222.method2391(Static345.anInt6495) + Static497.aString104 + " ->";
		} else if (Static435.aBoolean553 && Static23.aClass5_3.method211(81) && Static8.anInt118 > 2) {
			local34 = Static329.method5245((Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284.aClass12_284);
		} else {
			@Pc(53) Class12_Sub20 local53 = (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284;
			local34 = Static329.method5245(local53);
			@Pc(59) int[] local59 = null;
			if (Static179.method3558(local53.anInt4329)) {
				local59 = Static150.aClass254_2.method6340((int) local53.aLong116).anIntArray174;
			} else if (local53.anInt4328 != -1) {
				local59 = Static150.aClass254_2.method6340(local53.anInt4328).anIntArray174;
			} else if (Static197.method3743(local53.anInt4329)) {
				@Pc(129) Class12_Sub41 local129 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local53.aLong116);
				if (local129 != null) {
					@Pc(134) Class30_Sub1_Sub1_Sub2 local134 = local129.aClass30_Sub1_Sub1_Sub2_2;
					@Pc(137) Class130 local137 = local134.aClass130_1;
					if (local137.anIntArray308 != null) {
						local137 = local137.method3570(Static393.aClass31_1);
					}
					if (local137 != null) {
						local59 = local137.anIntArray310;
					}
				}
			} else if (Static350.method5484(local53.anInt4329)) {
				@Pc(94) Class279 local94;
				if (local53.anInt4329 == 1008) {
					local94 = Static49.aClass155_2.method4063((int) local53.aLong116);
				} else {
					local94 = Static49.aClass155_2.method4063((int) (local53.aLong116 >>> 32 & 0x7FFFFFFFL));
				}
				if (local94.anIntArray620 != null) {
					local94 = local94.method6881(Static393.aClass31_1);
				}
				if (local94 != null) {
					local59 = local94.anIntArray621;
				}
			}
			if (local59 != null) {
				local34 = local34 + Static169.method3401(local59);
			}
		}
		if (Static8.anInt118 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static8.anInt118 - 2) + Static269.aClass88_149.method2391(Static345.anInt6495);
		}
		if (Static129.aClass198_17 != null) {
			@Pc(260) Class80 local260 = Static129.aClass198_17.method4817(arg0);
			if (local260 == null) {
				local260 = Static12.aClass80_1;
			}
			local260.method7763(Static66.anIntArray173, Static515.anIntArray677, Static70.anInt1703, Static129.aClass198_17.anInt5715, Static519.aClass84Array15, Static171.anInt3907, Static279.aRandom1, Static129.aClass198_17.anInt5762, Static129.aClass198_17.anInt5771, Static302.anInt5830, Static129.aClass198_17.anInt5773, Static129.aClass198_17.anInt5738, Static129.aClass198_17.anInt5709, local34);
			Static480.method7208(Static66.anIntArray173[1], Static66.anIntArray173[0], Static66.anIntArray173[3], Static66.anIntArray173[2]);
		} else if (Static488.aClass198_15 != null && Static468.aClass138_6 == Static293.aClass138_7) {
			@Pc(240) int local240 = Static12.aClass80_1.method7776(Static515.anIntArray677, Static302.anInt5830, Static82.anInt1961 + 4, local34, Static279.aRandom1, Static519.aClass84Array15, Static157.anInt3414 + 16);
			Static480.method7208(Static157.anInt3414, Static82.anInt1961 + 4, 16, Static445.aClass244_7.method6147(local34) + local240);
			return;
		}
	}
}
