import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Lclient!rg;")
	public static Class1_Sub2_Sub16_Sub2 aClass1_Sub2_Sub16_Sub2_2;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Lclient!kb;")
	public static Class83 aClass83_173;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "Lclient!si;")
	public static Class1_Sub31 aClass1_Sub31_2;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString174 = "Ok";

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!gn;)V")
	public static void method4273(@OriginalArg(1) Class66 arg0) {
		@Pc(7) Class97 local7 = null;
		try {
			@Pc(18) Class43 local18 = arg0.method1606("runescape");
			while (local18.anInt1456 == 0) {
				Static230.method4022(1L);
			}
			if (local18.anInt1456 == 1) {
				local7 = (Class97) local18.anObject3;
				@Pc(37) Class1_Sub16 local37 = Static139.method4747();
				local7.method2930(local37.anInt3328, 0, local37.aByteArray39);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local7 != null) {
				local7.method2931();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!kb;B)V")
	public static void method4274(@OriginalArg(0) Class83 arg0) {
		Static44.aClass83_29 = arg0;
		Static202.anInt4503 = Static44.aClass83_29.method2317(4);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)I")
	public static int method4275() {
		return Static275.aClass155_44.method4353();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4276(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static143.method2587("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIB)I")
	public static int method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ok;B)V")
	public static void method4279(@OriginalArg(0) Class116 arg0) {
		@Pc(15) int local15 = arg0.anInt4301;
		if (local15 == 324) {
			if (Static31.anInt805 == -1) {
				Static31.anInt805 = arg0.anInt4308;
				Static20.anInt5575 = arg0.anInt4293;
			}
			if (Static22.aClass147_1.aBoolean287) {
				arg0.anInt4308 = Static31.anInt805;
			} else {
				arg0.anInt4308 = Static20.anInt5575;
			}
		} else if (local15 == 325) {
			if (Static31.anInt805 == -1) {
				Static20.anInt5575 = arg0.anInt4293;
				Static31.anInt805 = arg0.anInt4308;
			}
			if (Static22.aClass147_1.aBoolean287) {
				arg0.anInt4308 = Static20.anInt5575;
			} else {
				arg0.anInt4308 = Static31.anInt805;
			}
		} else if (local15 == 327) {
			arg0.anInt4362 = 150;
			arg0.anInt4361 = (int) (Math.sin((double) Static32.anInt809 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4385 = -1;
			arg0.anInt4382 = 5;
		} else if (local15 == 328) {
			if (Static239.aClass25_Sub1_Sub1_2.aString26 == null) {
				arg0.anInt4385 = 0;
			} else {
				arg0.anInt4362 = 150;
				arg0.anInt4361 = (int) (Math.sin((double) Static32.anInt809 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4382 = 5;
				arg0.anInt4385 = ((int) Static94.method4774(Static239.aClass25_Sub1_Sub1_2.aString26) << 11) + 2047;
				arg0.anInt4369 = 0;
				arg0.anInt4374 = Static239.aClass25_Sub1_Sub1_2.anInt1640;
				arg0.anInt4367 = Static239.aClass25_Sub1_Sub1_2.anInt1646;
				arg0.anInt4380 = Static239.aClass25_Sub1_Sub1_2.anInt1677;
			}
		}
	}
}
