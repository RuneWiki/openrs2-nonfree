import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	public static int anInt7916;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_397 = new Class305(0, 3);

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Z")
	public static final boolean aBoolean586 = false;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_398 = new Class305(1, -1);

	@OriginalMember(owner = "client!so", name = "t", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method6977(@OriginalArg(1) Class4 arg0) {
		if (Static197.anInt4015 < 2 && !Static181.aBoolean310 || Static360.aClass91_10 != null) {
			return;
		}
		@Pc(39) String local39;
		if (Static181.aBoolean310 && Static197.anInt4015 < 2) {
			local39 = Static151.aString116 + Static354.aClass45_99.method1474(Static544.anInt7853) + Static201.aString84 + " ->";
		} else if (Static451.aBoolean585 && Static25.aClass241_1.method6303(81) && Static197.anInt4015 > 2) {
			local39 = Static140.method2620((Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284.aClass1_284);
		} else {
			@Pc(68) Class1_Sub25 local68 = (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284;
			local39 = Static140.method2620(local68);
			@Pc(74) int[] local74 = null;
			if (Static337.method5699(local68.anInt4365)) {
				local74 = Static181.aClass316_1.method8107((int) local68.aLong114).anIntArray443;
			} else if (local68.anInt4368 != -1) {
				local74 = Static181.aClass316_1.method8107(local68.anInt4368).anIntArray443;
			} else if (Static459.method7010(local68.anInt4365)) {
				@Pc(106) Class1_Sub41 local106 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local68.aLong114);
				if (local106 != null) {
					@Pc(111) Class20_Sub1_Sub1_Sub2 local111 = local106.aClass20_Sub1_Sub1_Sub2_2;
					@Pc(114) Class283 local114 = local111.aClass283_1;
					if (local114.anIntArray743 != null) {
						local114 = local114.method7368(Static417.aClass10_1);
					}
					if (local114 != null) {
						local74 = local114.anIntArray744;
					}
				}
			} else if (Static456.method6996(local68.anInt4365)) {
				@Pc(152) Class51 local152;
				if (local68.anInt4365 == 1010) {
					local152 = Static398.aClass18_4.method609((int) local68.aLong114);
				} else {
					local152 = Static398.aClass18_4.method609((int) (local68.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local152.anIntArray108 != null) {
					local152 = local152.method1625(Static417.aClass10_1);
				}
				if (local152 != null) {
					local74 = local152.anIntArray106;
				}
			}
			if (local74 != null) {
				local39 = local39 + Static19.method550(local74);
			}
		}
		if (Static197.anInt4015 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static197.anInt4015 - 2) + Static242.aClass45_70.method1474(Static544.anInt7853);
		}
		if (Static134.aClass91_5 != null) {
			@Pc(222) Class36 local222 = Static134.aClass91_5.method2289(arg0);
			if (local222 == null) {
				local222 = Static511.aClass36_4;
			}
			local222.method7960(Static52.anInt4671, local39, Static134.aClass91_5.anInt2447, Static187.anInt3881, Static527.anIntArray813, Static329.anIntArray610, Static193.anInt3949, Static134.aClass91_5.anInt2394, Static134.aClass91_5.anInt2384, Static134.aClass91_5.anInt2428, Static134.aClass91_5.anInt2378, Static204.aClass104Array38, Static425.aRandom1, Static134.aClass91_5.anInt2399);
			Static193.method3693(Static329.anIntArray610[3], Static329.anIntArray610[1], Static329.anIntArray610[2], Static329.anIntArray610[0]);
		} else if (Static14.aClass91_1 != null && Static332.aClass250_4 == Static71.aClass250_1) {
			@Pc(287) int local287 = Static511.aClass36_4.method7957(Static527.anIntArray813, Static204.aClass104Array38, local39, Static91.anInt9225 + 4, Static425.aRandom1, Static184.anInt3831 + 16, Static187.anInt3881);
			Static193.method3693(16, Static184.anInt3831, local287 + Static270.aClass96_10.method2370(local39), Static91.anInt9225 + 4);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6978(@OriginalArg(1) String arg0) {
		return Static46.method1319(arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method6979() {
		@Pc(12) Class208 local12 = null;
		try {
			@Pc(20) Class311 local20 = Static473.aClass229_14.method6071("3", false);
			while (local20.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (local20.anInt9169 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local12 = (Class208) local20.anObject17;
			@Pc(52) byte[] local52 = new byte[(int) local12.method5702()];
			if (local52.length == 0) {
				Static429.aString183 = "";
				Static260.aString112 = "";
			} else {
				@Pc(75) int local75;
				for (@Pc(63) int local63 = 0; local63 < local52.length; local63 += local75) {
					local75 = local12.method5705(local52, local63, local52.length - local63);
					if (local75 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(100) Class1_Sub17 local100 = new Class1_Sub17(local52);
				@Pc(104) int local104 = local100.method4487();
				if (local104 > 50) {
					throw new RuntimeException("Bad length");
				}
				local100.anInt4872 = local104 + 1;
				if (!local100.method4503()) {
					throw new RuntimeException("Invalid CRC");
				}
				local100.anInt4872 = 1;
				@Pc(137) int local137 = local100.method4487();
				if (local137 > 1) {
					throw new RuntimeException("Invalid version " + local137);
				}
				Static260.aString112 = local100.method4483();
				Static429.aString183 = local100.method4483();
				if (local137 < 1) {
					Static313.anInt5989 = Static27.anInt767;
				} else {
					Static313.anInt5989 = local100.method4494();
				}
			}
		} catch (@Pc(174) Exception local174) {
			Static429.aString183 = "";
			Static260.aString112 = "";
		}
		try {
			if (local12 != null) {
				local12.method5704();
			}
		} catch (@Pc(185) Exception local185) {
		}
	}
}
