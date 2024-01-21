import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[[Lclient!qc;")
	public static Class1_Sub1_Sub12[][] aClass1_Sub1_Sub12ArrayArray1;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_788 = Static23.method501("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!mc;")
	private static Class42 aClass42_789 = Static23.method501("Choose Option");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_790 = Static23.method501("System)2Update in: ");

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_791 = Static23.method501("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	public static int anInt1458 = 0;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!mc;")
	private static Class42 aClass42_794 = Static23.method501("On");

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!mc;")
	public static Class42 aClass42_792 = aClass42_794;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_793 = aClass42_789;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!mc;")
	public static Class42 aClass42_795 = Static23.method501("Icons redrawn");

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[50][];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public static void method1016(@OriginalArg(0) int arg0) {
		if (!Static107.method1831(arg0)) {
			return;
		}
		@Pc(14) Class1_Sub1_Sub12[] local14 = aClass1_Sub1_Sub12ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class1_Sub1_Sub12 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2157 = 0;
				local22.anInt2147 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1018() {
		aClass42_791 = null;
		aClass42_790 = null;
		aClass42_795 = null;
		aClass42_789 = null;
		aByteArrayArray7 = null;
		aClass42_792 = null;
		aClass1_Sub1_Sub12ArrayArray1 = null;
		aByteArrayArrayArray7 = null;
		aClass42_794 = null;
		aClass42_788 = null;
		aClass42_793 = null;
		anObject2 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!ib;)V")
	public static void method1021(@OriginalArg(1) Class1_Sub1_Sub8_Sub1 arg0) {
		arg0.aBoolean141 = false;
		@Pc(21) Class1_Sub1_Sub14 local21;
		if (arg0.anInt2563 != -1) {
			local21 = Static30.method574(arg0.anInt2563);
			arg0.anInt2581++;
			if (arg0.anInt2600 < local21.anIntArray355.length && local21.anIntArray357[arg0.anInt2600] < arg0.anInt2581) {
				arg0.anInt2581 = 1;
				arg0.anInt2600++;
			}
			if (local21.anIntArray355.length <= arg0.anInt2600) {
				arg0.anInt2581 = 0;
				arg0.anInt2600 = 0;
			}
		}
		if (arg0.anInt2560 != -1 && arg0.anInt2572 <= Static27.anInt768) {
			if (arg0.anInt2593 < 0) {
				arg0.anInt2593 = 0;
			}
			@Pc(89) int local89 = Static53.method1838(arg0.anInt2560).anInt1784;
			if (local89 == -1) {
				arg0.anInt2560 = -1;
			} else {
				@Pc(101) Class1_Sub1_Sub14 local101 = Static30.method574(local89);
				arg0.anInt2558++;
				if (local101.anIntArray355.length > arg0.anInt2593 && arg0.anInt2558 > local101.anIntArray357[arg0.anInt2593]) {
					arg0.anInt2593++;
					arg0.anInt2558 = 1;
				}
				if (local101.anIntArray355.length <= arg0.anInt2593 && (arg0.anInt2593 < 0 || local101.anIntArray355.length <= arg0.anInt2593)) {
					arg0.anInt2560 = -1;
				}
			}
		}
		if (arg0.anInt2601 != -1 && arg0.anInt2570 <= 1) {
			local21 = Static30.method574(arg0.anInt2601);
			if (local21.anInt2318 == 1 && arg0.anInt2569 > 0 && Static27.anInt768 >= arg0.anInt2549 && arg0.anInt2588 < Static27.anInt768) {
				arg0.anInt2570 = 1;
				return;
			}
		}
		if (arg0.anInt2601 != -1 && arg0.anInt2570 == 0) {
			local21 = Static30.method574(arg0.anInt2601);
			arg0.anInt2604++;
			if (local21.anIntArray355.length > arg0.anInt2607 && local21.anIntArray357[arg0.anInt2607] < arg0.anInt2604) {
				arg0.anInt2607++;
				arg0.anInt2604 = 1;
			}
			if (local21.anIntArray355.length <= arg0.anInt2607) {
				arg0.anInt2607 -= local21.anInt2313;
				arg0.anInt2596++;
				if (arg0.anInt2596 >= local21.anInt2324) {
					arg0.anInt2601 = -1;
				}
				if (arg0.anInt2607 < 0 || arg0.anInt2607 >= local21.anIntArray355.length) {
					arg0.anInt2601 = -1;
				}
			}
			arg0.aBoolean141 = local21.aBoolean129;
		}
		if (arg0.anInt2570 > 0) {
			arg0.anInt2570--;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;BII)Lclient!pb;")
	public static Class31 method1022(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class31_Sub2");
			@Pc(18) Class31 local18 = (Class31) local14.getDeclaredConstructor().newInstance();
			local18.method997(arg1, arg2, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class31_Sub1 local31 = new Class31_Sub1();
			local31.method997(arg1, arg2, arg0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public static void method1025() {
		for (@Pc(12) int local12 = 0; local12 < Static63.anInt1520; local12++) {
			@Pc(18) int local18 = Static77.anIntArray313[local12];
			@Pc(22) Class1_Sub1_Sub8_Sub1_Sub1 local22 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local18];
			@Pc(26) int local26 = Static80.aClass1_Sub8_Sub1_2.method1186();
			if ((local26 & 0x80) != 0) {
				local22.anInt2587 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local22.anInt2554 = Static80.aClass1_Sub8_Sub1_2.method1216();
			}
			if ((local26 & 0x4) != 0) {
				local22.aClass42_1380 = Static80.aClass1_Sub8_Sub1_2.method1201();
				local22.anInt2557 = 100;
			}
			if ((local26 & 0x10) != 0) {
				local22.anInt2590 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (local22.anInt2590 == 65535) {
					local22.anInt2590 = -1;
				}
			}
			@Pc(90) int local90;
			@Pc(94) int local94;
			if ((local26 & 0x20) != 0) {
				local90 = Static80.aClass1_Sub8_Sub1_2.method1220();
				local94 = Static80.aClass1_Sub8_Sub1_2.method1220();
				local22.method1757(local94, Static27.anInt768, local90);
				local22.anInt2586 = Static27.anInt768 + 300;
				local22.anInt2608 = Static80.aClass1_Sub8_Sub1_2.method1211();
				local22.anInt2548 = Static80.aClass1_Sub8_Sub1_2.method1211();
			}
			if ((local26 & 0x1) != 0) {
				local22.anInt2560 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local90 = Static80.aClass1_Sub8_Sub1_2.method1203();
				if (local22.anInt2560 == 65535) {
					local22.anInt2560 = -1;
				}
				local22.anInt2605 = local90 >> 16;
				local22.anInt2572 = (local90 & 0xFFFF) + Static27.anInt768;
				local22.anInt2593 = 0;
				local22.anInt2558 = 0;
				if (Static27.anInt768 < local22.anInt2572) {
					local22.anInt2593 = -1;
				}
			}
			if ((local26 & 0x8) != 0) {
				local90 = Static80.aClass1_Sub8_Sub1_2.method1220();
				local94 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local22.method1757(local94, Static27.anInt768, local90);
				local22.anInt2586 = Static27.anInt768 + 300;
				local22.anInt2608 = Static80.aClass1_Sub8_Sub1_2.method1207();
				local22.anInt2548 = Static80.aClass1_Sub8_Sub1_2.method1186();
			}
			if ((local26 & 0x40) != 0) {
				local22.aClass1_Sub1_Sub6_1 = Static43.method771(Static80.aClass1_Sub8_Sub1_2.method1206());
				local22.anInt2552 = local22.aClass1_Sub1_Sub6_1.anInt763;
				local22.anInt2578 = local22.aClass1_Sub1_Sub6_1.anInt787;
				local22.anInt2585 = local22.aClass1_Sub1_Sub6_1.anInt765;
				local22.anInt2579 = local22.aClass1_Sub1_Sub6_1.anInt781;
				local22.anInt2599 = local22.aClass1_Sub1_Sub6_1.anInt760;
				local22.anInt2556 = local22.aClass1_Sub1_Sub6_1.anInt785;
				local22.anInt2561 = local22.aClass1_Sub1_Sub6_1.anInt774;
				local22.anInt2577 = local22.aClass1_Sub1_Sub6_1.anInt767;
				local22.anInt2567 = local22.aClass1_Sub1_Sub6_1.anInt769;
			}
			if ((local26 & 0x2) != 0) {
				local90 = Static80.aClass1_Sub8_Sub1_2.method1216();
				if (local90 == 65535) {
					local90 = -1;
				}
				local94 = Static80.aClass1_Sub8_Sub1_2.method1207();
				if (local90 == local22.anInt2601 && local90 != -1) {
					@Pc(334) int local334 = Static30.method574(local90).anInt2331;
					if (local334 == 1) {
						local22.anInt2604 = 0;
						local22.anInt2596 = 0;
						local22.anInt2607 = 0;
						local22.anInt2570 = local94;
					}
					if (local334 == 2) {
						local22.anInt2596 = 0;
					}
				} else if (local90 == -1 || local22.anInt2601 == -1 || Static30.method574(local90).anInt2317 >= Static30.method574(local22.anInt2601).anInt2317) {
					local22.anInt2607 = 0;
					local22.anInt2570 = local94;
					local22.anInt2596 = 0;
					local22.anInt2601 = local90;
					local22.anInt2569 = local22.anInt2603;
					local22.anInt2604 = 0;
				}
			}
		}
	}
}
