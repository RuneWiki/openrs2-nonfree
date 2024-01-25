import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_4 = new Class340();

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "Lclient!to;")
	public static Class317 aClass317_2 = new Class317();

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
	public static int anInt4641 = 0;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("cff7bf28c6fa72669ad586b7a27c8c24f1b4d18125fdcbbe5493c69e1476f139a833b4a2b1011f91e047d6d2327516df5b6715d204493e4d865e671fb1f52831762fc8f2cb94c0e29e96b590774b6df068f00d361949cbe8fcc329e90d4a65e988551c656880c2456ac6219662fc202944f1dc2a58ad3e9159c55bb4857574f66c92685f2faf89d1653e73c5bb62fb79c97388352296beb218fb0033f0d483b599fa7b7dd70faefe45da739cacdc05904503e972a495254fd9327b83bcb521a84578468d105970f206c44d67c763776331b431901c8184bf57c38fa3cc42ed4ad6c1da0f1dc042a4688cf08ede84dc8a461f6d5b9a30a860abca9ec72ab5db561f7b97ce18a180016b0d99225c73f4ddc4ff75374d1ab9b1961407222e7f4b7a4764aab202d874830852a6e56089635db0752e4b7b9e693bf914f96ea525982db7993a6627c89b0aaa45fcc515890350112b1174b89df181e63891511630612fc1bc9bb66382b32899c31bdf9c4f75b59a8950f983750e79686b9694bc7960d01d8706044b6bc26c86847fbf1e5e9ebb1d6720ad5141d5b5edec7d0c68a264bc5976edb402df55d3500eb8e3dbff36f810d9bfddd4082584490138aa5e98e8ce5f551fb157414dfbfaccec280714d4f65b08ede816853901a95c72096cbee81e84d78c40ff84d369ecbc63d5ef92028b7e849616354dd1ad9153bc487156c7ef", 16);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	public static boolean method4054() {
		return Static564.aBoolean693;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public static void method4064() {
		for (@Pc(7) int local7 = 0; local7 < Static70.anInt1217; local7++) {
			@Pc(13) int local13 = Static452.anIntArray465[local7];
			@Pc(21) Class1_Sub4_Sub2_Sub1_Sub1 local21 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) local13)).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			@Pc(25) int local25 = Static319.aClass4_Sub11_Sub1_2.method4905();
			if ((local25 & 0x1) != 0) {
				local25 += Static319.aClass4_Sub11_Sub1_2.method4905() << 8;
			}
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			if ((local25 & 0x800) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4923();
				local53 = Static319.aClass4_Sub11_Sub1_2.method4927();
				if (local49 == 65535) {
					local49 = -1;
				}
				local62 = Static319.aClass4_Sub11_Sub1_2.method4905();
				local21.method6928(local53, local49, local62, true);
			}
			if ((local25 & 0x20) != 0) {
				local21.aString76 = Static319.aClass4_Sub11_Sub1_2.method4920();
				local21.anInt8399 = 100;
			}
			if ((local25 & 0x100) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4923();
				local21.anInt8410 = Static319.aClass4_Sub11_Sub1_2.method4947();
				local21.anInt8443 = Static319.aClass4_Sub11_Sub1_2.method4916();
				local21.anInt8370 = local49 & 0x7FFF;
				local21.aBoolean591 = (local49 & 0x8000) != 0;
				local21.anInt8439 = local21.anInt8410 + local21.anInt8370 + Static106.anInt2418;
			}
			if ((local25 & 0x2) != 0) {
				if (local21.aClass283_1.method6831()) {
					Static553.method8014(local21);
				}
				local21.method4510(Static237.aClass31_1.method478(Static319.aClass4_Sub11_Sub1_2.method4936()));
				local21.method6920(local21.aClass283_1.anInt8266);
				local21.anInt8394 = local21.aClass283_1.anInt8234 << 3;
				if (local21.aClass283_1.method6831()) {
					Static57.method963(local21.anIntArray463[0], 0, local21, local21.aByte126, local21.anIntArray462[0], null, null);
				}
			}
			if ((local25 & 0x40) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4950();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static319.aClass4_Sub11_Sub1_2.method4931();
				local62 = Static319.aClass4_Sub11_Sub1_2.method4938();
				local21.method6928(local53, local49, local62, false);
			}
			if ((local25 & 0x4) != 0) {
				@Pc(234) int[] local234 = new int[4];
				for (local53 = 0; local53 < 4; local53++) {
					local234[local53] = Static319.aClass4_Sub11_Sub1_2.method4955();
					if (local234[local53] == 65535) {
						local234[local53] = -1;
					}
				}
				local62 = Static319.aClass4_Sub11_Sub1_2.method4916();
				Static240.method7432(local234, local62, local21);
			}
			if ((local25 & 0x10) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4942();
				local53 = Static319.aClass4_Sub11_Sub1_2.method4916();
				local21.method6931(Static106.anInt2418, local53, local49);
				local21.anInt8444 = Static106.anInt2418 + 300;
				local21.anInt8385 = Static319.aClass4_Sub11_Sub1_2.method4938();
			}
			if ((local25 & 0x80) != 0) {
				local21.anInt8405 = Static319.aClass4_Sub11_Sub1_2.method4955();
				if (local21.anInt8405 == 65535) {
					local21.anInt8405 = -1;
				}
			}
			@Pc(339) int local339;
			@Pc(354) int local354;
			@Pc(328) int[] local328;
			@Pc(331) int[] local331;
			if ((local25 & 0x1000) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4905();
				local328 = new int[local49];
				local331 = new int[local49];
				for (@Pc(333) int local333 = 0; local333 < local49; local333++) {
					local339 = Static319.aClass4_Sub11_Sub1_2.method4950();
					if ((local339 & 0xC000) == 49152) {
						local354 = Static319.aClass4_Sub11_Sub1_2.method4955();
						local328[local333] = local354 | local339 << 16;
					} else {
						local328[local333] = local339;
					}
					local331[local333] = Static319.aClass4_Sub11_Sub1_2.method4955();
				}
				local21.method6929(local331, local328);
			}
			if ((local25 & 0x200) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4938();
				local328 = new int[local49];
				local331 = new int[local49];
				@Pc(394) int[] local394 = new int[local49];
				for (local339 = 0; local339 < local49; local339++) {
					local354 = Static319.aClass4_Sub11_Sub1_2.method4955();
					if (local354 == 65535) {
						local354 = -1;
					}
					local328[local339] = local354;
					local331[local339] = Static319.aClass4_Sub11_Sub1_2.method4905();
					local394[local339] = Static319.aClass4_Sub11_Sub1_2.method4955();
				}
				Static184.method6376(local331, local394, local328, local21);
			}
			if ((local25 & 0x4000) != 0) {
				local21.anInt8382 = Static319.aClass4_Sub11_Sub1_2.method4952();
				local21.anInt8423 = Static319.aClass4_Sub11_Sub1_2.method4925();
				local21.anInt8408 = Static319.aClass4_Sub11_Sub1_2.method4953();
				local21.lb = Static319.aClass4_Sub11_Sub1_2.method4901();
				local21.anInt8426 = Static319.aClass4_Sub11_Sub1_2.method4955() + Static106.anInt2418;
				local21.anInt8413 = Static319.aClass4_Sub11_Sub1_2.method4955() + Static106.anInt2418;
				local21.anInt8400 = Static319.aClass4_Sub11_Sub1_2.method4905();
				local21.anInt8382 += local21.anIntArray463[0];
				local21.anInt8445 = 0;
				local21.anInt8447 = 1;
				local21.anInt8423 += local21.anIntArray462[0];
				local21.lb += local21.anIntArray462[0];
				local21.anInt8408 += local21.anIntArray463[0];
			}
			if ((local25 & 0x2000) != 0) {
				local21.aByte105 = Static319.aClass4_Sub11_Sub1_2.method4952();
				local21.aByte106 = Static319.aClass4_Sub11_Sub1_2.method4901();
				local21.aByte107 = Static319.aClass4_Sub11_Sub1_2.method4925();
				local21.aByte104 = (byte) Static319.aClass4_Sub11_Sub1_2.method4916();
				local21.anInt8377 = Static106.anInt2418 + Static319.aClass4_Sub11_Sub1_2.method4950();
				local21.anInt8418 = Static106.anInt2418 + Static319.aClass4_Sub11_Sub1_2.method4923();
			}
			if ((local25 & 0x400) != 0) {
				local49 = Static319.aClass4_Sub11_Sub1_2.method4942();
				local53 = Static319.aClass4_Sub11_Sub1_2.method4938();
				local21.method6931(Static106.anInt2418, local53, local49);
			}
			if ((local25 & 0x8) != 0) {
				local21.anInt5244 = Static319.aClass4_Sub11_Sub1_2.method4955();
				local21.anInt5258 = Static319.aClass4_Sub11_Sub1_2.method4950();
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IJ)V")
	public static void method4068(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static413.anInt8208;
		@Pc(24) int local24;
		@Pc(32) int local32;
		if (Static60.anInt983 != local12) {
			local24 = local12 - Static60.anInt983;
			local32 = (int) ((long) local24 * arg0 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local32 < local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local32 > local24) {
				local32 = local24;
			}
			Static60.anInt983 += local32;
		}
		@Pc(73) int local73 = Static339.anInt6576;
		if (local73 != Static557.anInt1156) {
			local24 = local73 - Static557.anInt1156;
			local32 = (int) (arg0 * (long) local24 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local32 < local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local24 < local32) {
				local32 = local24;
			}
			Static557.anInt1156 += local32;
		}
		if (!Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static213.aFloat141 += Static436.aFloat210 * (float) arg0 / 40.0F * 8.0F;
			Static201.aFloat128 += Static429.aFloat208 * (float) arg0 / 40.0F * 8.0F;
		}
		Static355.method5751();
	}
}
