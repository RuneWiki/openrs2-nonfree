import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "[Lclient!uo;")
	public static Class201[] aClass201Array1;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[S")
	public static short[] aShortArray111;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "Lclient!lq;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "[Lclient!jo;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	public static int anInt5438 = 0;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[1000][];

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
	public static int anInt5445 = 0;

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
	public static int anInt5447 = 0;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public static void method4593() {
		@Pc(5) Class103 local5 = Static325.aClass103_64;
		synchronized (Static325.aClass103_64) {
			Static325.aClass103_64.method2678();
		}
		local5 = Static251.aClass103_66;
		synchronized (Static251.aClass103_66) {
			Static251.aClass103_66.method2678();
		}
		@Pc(40) Class62 local40 = Static17.aClass62_3;
		synchronized (Static17.aClass62_3) {
			Static17.aClass62_3.method1386();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sb;I)I")
	public static int method4594(@OriginalArg(0) Class22_Sub2_Sub1 arg0) {
		if (arg0.anInt5111 == 0) {
			return 0;
		}
		@Pc(41) int local41;
		@Pc(47) int local47;
		if (arg0.anInt5140 != -1 && arg0.anInt5140 < 32768) {
			@Pc(32) Class22_Sub2_Sub1_Sub2 local32 = Static69.aClass22_Sub2_Sub1_Sub2Array1[arg0.anInt5140];
			if (local32 != null) {
				local41 = arg0.anInt5973 - local32.anInt5973;
				local47 = arg0.anInt5967 - local32.anInt5967;
				if (local41 != 0 || local47 != 0) {
					arg0.method4405((int) (Math.atan2((double) local41, (double) local47) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(81) int local81;
		if (arg0.anInt5140 >= 32768) {
			local81 = arg0.anInt5140 - 32768;
			if (Static4.anInt77 == local81) {
				local81 = 2047;
			}
			@Pc(90) Class22_Sub2_Sub1_Sub1 local90 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local81];
			if (local90 != null) {
				local47 = arg0.anInt5973 - local90.anInt5973;
				@Pc(105) int local105 = arg0.anInt5967 - local90.anInt5967;
				if (local47 != 0 || local105 != 0) {
					arg0.method4405((int) (Math.atan2((double) local47, (double) local105) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5078 != 0 || arg0.anInt5091 != 0) && (arg0.anInt5151 == 0 || arg0.anInt5146 > 0)) {
			local81 = arg0.anInt5973 - (arg0.anInt5078 - Static350.anInt6609 - Static350.anInt6609) * 64;
			local41 = arg0.anInt5967 - (arg0.anInt5091 - Static237.anInt4696 - Static237.anInt4696) * 64;
			if (local81 != 0 || local41 != 0) {
				arg0.method4405((int) (Math.atan2((double) local81, (double) local41) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5078 = 0;
			arg0.anInt5091 = 0;
		}
		return arg0.method4419();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public static void method4595(@OriginalArg(1) int arg0) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(5, arg0);
		local8.method4788();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	public static void method4596() {
		Static222.aClass103_43.method2678();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	public static void method4597() {
		@Pc(5) Class103 local5 = Static307.aClass103_63;
		synchronized (Static307.aClass103_63) {
			Static307.aClass103_63.method2678();
		}
		local5 = Static294.aClass103_68;
		synchronized (Static294.aClass103_68) {
			Static294.aClass103_68.method2678();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method4598(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class7_Sub1_Sub15 local10 = Static315.method5104(2, arg1);
		local10.method4790();
		local10.aString363 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)I")
	public static int method4600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
