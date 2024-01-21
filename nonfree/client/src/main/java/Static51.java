import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!g", name = "db", descriptor = "I")
	public static int anInt1460 = 1;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "[I")
	public static int[] anIntArray164 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "Lclient!td;")
	public static Class79 aClass79_6 = new Class79(64);

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_533 = Static169.method2903("wave2:");

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "Lclient!ed;")
	public static Class23 aClass23_534 = aClass23_533;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_535 = aClass23_533;

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "I")
	public static int anInt1467 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!jg;ILclient!rf;)V")
	public static void method941(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class74 arg2) {
		@Pc(5) Class1_Sub14 local5 = new Class1_Sub14();
		local5.anInt2960 = arg0.method861();
		local5.anInt2961 = arg0.method868();
		local5.aByteArrayArrayArray71 = new byte[local5.anInt2960][][];
		local5.aClass63Array2 = new Class63[local5.anInt2960];
		local5.anIntArray393 = new int[local5.anInt2960];
		local5.anIntArray392 = new int[local5.anInt2960];
		local5.anIntArray391 = new int[local5.anInt2960];
		local5.aClass63Array1 = new Class63[local5.anInt2960];
		for (@Pc(56) int local56 = 0; local56 < local5.anInt2960; local56++) {
			try {
				@Pc(62) int local62 = arg0.method861();
				@Pc(85) String local85;
				@Pc(94) String local94;
				@Pc(96) int local96;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local85 = new String(arg0.method864().method653());
					local94 = new String(arg0.method864().method653());
					local96 = 0;
					if (local62 == 1) {
						local96 = arg0.method868();
					}
					local5.anIntArray393[local56] = local62;
					local5.anIntArray391[local56] = local96;
					local5.aClass63Array2[local56] = arg2.method2481(Static12.method241(local85), local94);
				} else if (local62 == 3 || local62 == 4) {
					local85 = new String(arg0.method864().method653());
					local94 = new String(arg0.method864().method653());
					local96 = arg0.method861();
					@Pc(163) String[] local163 = new String[local96];
					for (@Pc(165) int local165 = 0; local165 < local96; local165++) {
						local163[local165] = new String(arg0.method864().method653());
					}
					@Pc(187) byte[][] local187 = new byte[local96][];
					@Pc(202) int local202;
					if (local62 == 3) {
						for (@Pc(194) int local194 = 0; local194 < local96; local194++) {
							local202 = arg0.method868();
							local187[local194] = new byte[local202];
							arg0.method857(local202, local187[local194]);
						}
					}
					@Pc(228) Class[] local228 = new Class[local96];
					local5.anIntArray393[local56] = local62;
					for (local202 = 0; local202 < local96; local202++) {
						local228[local202] = Static12.method241(local163[local202]);
					}
					local5.aClass63Array1[local56] = arg2.method2477(Static12.method241(local85), local228, local94);
					local5.aByteArrayArrayArray71[local56] = local187;
				}
			} catch (@Pc(268) ClassNotFoundException local268) {
				local5.anIntArray392[local56] = -1;
			} catch (@Pc(275) SecurityException local275) {
				local5.anIntArray392[local56] = -2;
			} catch (@Pc(282) NullPointerException local282) {
				local5.anIntArray392[local56] = -3;
			} catch (@Pc(289) Exception local289) {
				local5.anIntArray392[local56] = -4;
			} catch (@Pc(296) Throwable local296) {
				local5.anIntArray392[local56] = -5;
			}
		}
		Static45.aClass56_3.method1856(local5);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!na;IZ)V")
	public static void method942(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static140.method2469(arg0.anInt1838, arg0.anInt1825, arg1);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	public static void method943() {
		aClass23_533 = null;
		anIntArray164 = null;
		aCalendar1 = null;
		aClass79_6 = null;
		aClass23_535 = null;
		aClass23_534 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method944(@OriginalArg(1) Class23 arg0) {
		if (Static30.aClass1_Sub24Array2 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method643();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static30.aClass1_Sub24Array2.length && Static30.aClass1_Sub24Array2[local10].aLong140 != local14) {
			local10++;
		}
		if (Static30.aClass1_Sub24Array2.length > local10 && Static30.aClass1_Sub24Array2[local10] != null) {
			Static25.aClass1_Sub8_Sub1_1.method919(5);
			Static25.aClass1_Sub8_Sub1_1.method873(Static30.aClass1_Sub24Array2[local10].aLong140);
		}
	}
}
