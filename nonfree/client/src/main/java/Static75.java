import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "[Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array4;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_758 = Static23.method501("Handel)4Duell");

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!mc;")
	public static Class42 aClass42_759 = Static23.method501("backvmid1");

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_760 = Static23.method501("");

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public static int anInt1419 = 99;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "J")
	public static long aLong43 = 0L;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_761 = Static23.method501("mapfunction");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	public static int anInt1420 = -1;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!mc;")
	public static Class42 aClass42_762 = Static23.method501(" x ");

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_763 = Static23.method501("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_764 = Static23.method501("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method991() {
		while (true) {
			if (Static80.aClass1_Sub8_Sub1_2.method1234(Static20.anInt644) >= 11) {
				@Pc(12) int local12 = Static80.aClass1_Sub8_Sub1_2.method1238(11);
				if (local12 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local12] == null) {
						Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub8_Sub1_Sub2();
						local19 = true;
						if (Static79.aClass1_Sub8Array1[local12] != null) {
							Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local12].method1771(Static79.aClass1_Sub8Array1[local12]);
						}
					}
					Static68.anIntArray240[Static27.anInt770++] = local12;
					@Pc(55) Class1_Sub1_Sub8_Sub1_Sub2 local55 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local12];
					local55.anInt2559 = Static27.anInt768;
					@Pc(65) int local65 = Static105.anIntArray404[Static80.aClass1_Sub8_Sub1_2.method1238(3)];
					if (local19) {
						local55.anInt2564 = local65;
					}
					@Pc(75) int local75 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
					@Pc(80) int local80 = Static80.aClass1_Sub8_Sub1_2.method1238(5);
					@Pc(85) int local85 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
					if (local80 > 15) {
						local80 -= 32;
					}
					if (local85 == 1) {
						Static77.anIntArray313[Static63.anInt1520++] = local12;
					}
					@Pc(105) int local105 = Static80.aClass1_Sub8_Sub1_2.method1238(5);
					if (local105 > 15) {
						local105 -= 32;
					}
					local55.method1762(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0] + local105, local75 == 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0] + local80);
					continue;
				}
			}
			Static80.aClass1_Sub8_Sub1_2.method1231();
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method992() {
		Static37.aClass37_14.method976();
		Static18.aClass37_10.method976();
		Static12.aClass37_6.method976();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method994() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!mc;Lclient!mc;Lclient!mc;Z)V")
	public static void method995(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2) {
		Static39.aClass42_240 = arg2;
		Static39.aClass42_242 = arg0;
		Static39.aClass42_236 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method998() {
		aClass1_Sub1_Sub1_Sub4Array4 = null;
		aClass42_758 = null;
		aClass42_759 = null;
		aCRC32_3 = null;
		aClass1_Sub1_Sub1_Sub4_14 = null;
		aClass42_760 = null;
		aClass42_761 = null;
		aClass42_763 = null;
		aClass42_762 = null;
		aClass42_764 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ja;ZLclient!ja;II)Lclient!ea;")
	public static Class1_Sub1_Sub5 method999(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1303(arg2);
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			@Pc(29) byte[] local29 = arg1.method1308(arg2, local12[local19]);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(59) byte[] local59 = arg0.method1308(local49, 0);
				if (local59 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub5(arg1, arg0, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
