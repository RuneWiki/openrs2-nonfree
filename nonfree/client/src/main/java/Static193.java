import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	public static int anInt3629;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	public static int anInt3630;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public static final int anInt3623 = 1400;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_80 = new Class205(30, -1);

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_50 = new Class32("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_81 = new Class205(42, 2);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
	public static void method3304() {
		Static42.aClass30_38.method692();
		for (@Pc(13) Class2_Sub26 local13 = (Class2_Sub26) Static195.aClass30_28.method694(); local13 != null; local13 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			if (local13.anInt3594 < 1000) {
				local13.method5617();
				Static42.aClass30_38.method685(local13);
			}
		}
		Static42.aClass30_38.method697(Static195.aClass30_28);
		@Pc(39) int local39 = -1;
		if (Static29.aClass2_Sub19_1 != null) {
			local39 = Static29.aClass2_Sub19_1.method2379();
		}
		if (!Static269.aBoolean349) {
			if (local39 == 0 && (Static267.anInt4642 == 1 && Static285.anInt4946 > 2 || Static98.method1943())) {
				local39 = 2;
			}
			if (local39 == 2 && Static285.anInt4946 > 0 && Static29.aClass2_Sub19_1 != null) {
				if (Static242.aClass4_22 == null && Static6.anInt204 == 0) {
					Static264.method4081(Static29.aClass2_Sub19_1.method2378(), Static29.aClass2_Sub19_1.method2380());
				} else {
					Static144.anInt2880 = 2;
				}
			}
			if (local39 == 0 && Static285.anInt4946 > 0) {
				Static120.method2471();
			}
			if (Static242.aClass4_22 != null || Static6.anInt204 != 0) {
				return;
			}
			Static15.aClass2_Sub26_1 = null;
			Static144.anInt2880 = 0;
			return;
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		if (local39 == -1) {
			local60 = Static311.aClass129_1.method2997();
			local64 = Static311.aClass129_1.method2989();
			if (local60 < Static236.anInt2045 - 10 || Static108.anInt5290 + Static236.anInt2045 + 10 < local60 || Static255.anInt4503 - 10 > local64 || Static320.anInt5473 + Static255.anInt4503 + 10 < local64) {
				Static269.aBoolean349 = false;
				Static29.method507(Static320.anInt5473, Static108.anInt5290, Static236.anInt2045, Static255.anInt4503);
			}
		}
		if (local39 != 0) {
			return;
		}
		local60 = Static236.anInt2045;
		local64 = Static255.anInt4503;
		@Pc(123) int local123 = Static108.anInt5290;
		@Pc(127) int local127 = Static29.aClass2_Sub19_1.method2378();
		@Pc(131) int local131 = Static29.aClass2_Sub19_1.method2380();
		@Pc(133) int local133 = -1;
		@Pc(151) int local151;
		for (@Pc(135) int local135 = 0; local135 < Static285.anInt4946; local135++) {
			if (Static284.aBoolean372) {
				local151 = (Static285.anInt4946 - local135 - 1) * 16 + local64 + 33;
				if (local60 < local127 && local127 < local123 + local60 && local151 - 13 < local131 && local151 + 4 > local131) {
					local133 = local135;
				}
			} else {
				local151 = local64 + (Static285.anInt4946 - local135 - 1) * 16 + 31;
				if (local127 > local60 && local127 < local123 + local60 && local131 > local151 - 13 && local151 + 3 > local131) {
					local133 = local135;
				}
			}
		}
		if (local133 != -1) {
			local151 = 0;
			@Pc(236) Class83 local236 = new Class83(Static195.aClass30_28);
			for (@Pc(241) Class2_Sub26 local241 = (Class2_Sub26) local236.method2274(); local241 != null; local241 = (Class2_Sub26) local236.method2277()) {
				if (local133 == local151) {
					Static53.method897(local131, local127, local241);
				}
				local151++;
			}
		}
		Static269.aBoolean349 = false;
		Static29.method507(Static320.anInt5473, Static108.anInt5290, Static236.anInt2045, Static255.anInt4503);
		return;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!kk;I)V")
	public static void method3305(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static266.aClass128_3 != null) {
			@Pc(20) int local20;
			try {
				Static266.aClass128_3.method2974(0L);
				Static266.aClass128_3.method2970(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5344(local8, 24);
	}
}
