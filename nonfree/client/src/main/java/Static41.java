import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "J")
	public static long aLong34;

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_13;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lclient!gd;")
	private static Class23 aClass23_756 = Static15.method178("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_757 = Static15.method178("mapscene");

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "Lclient!gd;")
	public static Class23 aClass23_758 = Static15.method178("@gr3@");

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "[I")
	public static int[] anIntArray167 = new int[100];

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lclient!gd;")
	public static Class23 aClass23_759 = aClass23_756;

	@OriginalMember(owner = "client!ib", name = "mb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_760 = Static15.method178(")2");

	@OriginalMember(owner = "client!ib", name = "nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_761 = Static15.method178("Weiter");

	@OriginalMember(owner = "client!ib", name = "sb", descriptor = "[I")
	public static int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!ib", name = "yb", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZZ[B)V")
	public static void method887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (Static97.aClass11_1 == null) {
			return;
		}
		if (Static19.anInt494 >= 0) {
			arg1 -= 20;
			if (arg1 < 1) {
				arg1 = 1;
			}
			Static11.anInt219 = arg1;
			if (Static19.anInt494 == 0) {
				Static87.anInt2854 = 0;
			} else {
				@Pc(31) int local31 = Static106.method1801(Static19.anInt494);
				@Pc(35) int local35 = local31 - Static5.anInt144;
				Static87.anInt2854 = (local35 + arg1 + 3599) / arg1;
			}
			Static26.aBoolean48 = arg2;
			Static42.aByteArray7 = arg3;
			Static95.anInt2488 = arg0;
		} else if (Static11.anInt219 == 0) {
			method891(arg3, arg2, arg0);
		} else {
			Static95.anInt2488 = arg0;
			Static26.aBoolean48 = arg2;
			Static42.aByteArray7 = arg3;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIZI)V")
	public static void method891(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static97.aClass11_1 == null) {
			return;
		}
		if (Static19.anInt494 >= 0) {
			Static97.aClass11_1.method1103();
			Static42.aByteArray7 = null;
			Static19.anInt494 = -1;
			Static11.anInt219 = 20;
			Static5.anInt144 = 0;
		}
		if (arg0 == null) {
			return;
		}
		if (Static11.anInt219 > 0) {
			Static97.aClass11_1.method1105(arg2);
			Static11.anInt219 = 0;
		}
		Static19.anInt494 = arg2;
		Static97.aClass11_1.method1104(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rb;IZLclient!rb;I)Lclient!ve;")
	public static Class1_Sub1_Sub18 method892(@OriginalArg(0) Class55 arg0, @OriginalArg(3) Class55 arg1, @OriginalArg(4) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(10) int[] local10 = arg1.method1875(arg2);
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(21) byte[] local21 = arg1.method1883(arg2, local10[local12]);
			if (local21 == null) {
				local5 = false;
			} else {
				@Pc(40) int local40 = (local21[0] & 0xFF) << 8 | local21[1] & 0xFF;
				@Pc(48) byte[] local48 = arg0.method1883(local40, 0);
				if (local48 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub18(arg1, arg0, arg2, false);
		} catch (@Pc(77) Exception local77) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method893() {
		for (@Pc(3) int local3 = 0; local3 < Static20.anInt691; local3++) {
			@Pc(17) int local17 = Static98.anIntArray346[local3];
			@Pc(21) Class1_Sub1_Sub2_Sub1_Sub1 local21 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local17];
			if (local21 != null) {
				Static67.method1264(local21.aClass1_Sub1_Sub16_1.anInt2749, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public static void method894() {
		aClass23_761 = null;
		aClass23_759 = null;
		aClass23_756 = null;
		anIntArray168 = null;
		aClass23_760 = null;
		aClass1_Sub1_Sub6_Sub3_13 = null;
		aClass23_758 = null;
		anIntArray167 = null;
		aClass23_757 = null;
	}
}
