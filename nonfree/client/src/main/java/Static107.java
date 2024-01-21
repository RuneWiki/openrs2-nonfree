import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!ie;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1147 = Static56.method816(" )2>");

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1152 = Static56.method816("Close");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1148 = aClass34_1152;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	public static int[] anIntArray334 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1149 = Static56.method816("Loaded input handler");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1150 = Static56.method816("k");

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
	public static int[] anIntArray335 = new int[32];

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1151 = aClass34_1149;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_9 = null;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt2463 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZJ)V")
	public static void method1511(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static97.method1360(arg0 - 1L);
			Static97.method1360(1L);
		} else {
			Static97.method1360(arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Z")
	public static boolean method1512(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!h;I)V")
	public static void method1513(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub1_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt2009 && arg0 != -1) {
			@Pc(50) int local50 = Static47.method733(arg0).anInt711;
			if (local50 == 1) {
				arg1.anInt2052 = 0;
				arg1.anInt2060 = 0;
				arg1.anInt2027 = arg2;
				arg1.anInt2015 = 0;
			}
			if (local50 == 2) {
				arg1.anInt2052 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt2009 == -1 || Static47.method733(arg0).anInt723 >= Static47.method733(arg1.anInt2009).anInt723) {
			arg1.anInt2060 = 0;
			arg1.anInt2009 = arg0;
			arg1.anInt2015 = 0;
			arg1.anInt2052 = 0;
			arg1.anInt2027 = arg2;
			arg1.anInt2005 = arg1.anInt2032;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1514() {
		aClass34_1152 = null;
		aClass34_1147 = null;
		aClass34_1151 = null;
		aByteArrayArrayArray6 = null;
		anIntArray334 = null;
		aFrame1 = null;
		aClass34_1148 = null;
		aClass8_Sub24_9 = null;
		aClass35_4 = null;
		aClass34_1149 = null;
		anIntArray335 = null;
		aClass34_1150 = null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method1515() {
		Static10.aClass8_Sub20_Sub1_1.method1897();
		@Pc(15) int local15 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static10.aClass8_Sub20_Sub1_1.method1899(2);
		if (local26 == 0) {
			Static3.anIntArray4[Static95.anInt2240++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local26 == 1) {
			local50 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
			Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1222(local50, false);
			local60 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			if (local60 == 1) {
				Static3.anIntArray4[Static95.anInt2240++] = 2047;
			}
			return;
		}
		@Pc(102) int local102;
		if (local26 == 2) {
			local50 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
			Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1222(local50, true);
			local60 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
			Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1222(local60, true);
			local102 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			if (local102 == 1) {
				Static3.anIntArray4[Static95.anInt2240++] = 2047;
			}
		} else if (local26 == 3) {
			local50 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			local60 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			if (local60 == 1) {
				Static3.anIntArray4[Static95.anInt2240++] = 2047;
			}
			local102 = Static10.aClass8_Sub20_Sub1_1.method1899(7);
			@Pc(150) int local150 = Static10.aClass8_Sub20_Sub1_1.method1899(7);
			Static42.anInt1024 = Static10.aClass8_Sub20_Sub1_1.method1899(2);
			Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1226(local50 == 1, local102, local150);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!oc;")
	public static RuntimeException_Sub1 method1516(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString5 = local9.aString5 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
