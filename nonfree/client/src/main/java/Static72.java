import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt4675;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!oe;")
	public static Class72 aClass72_272;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "[I")
	public static int[] anIntArray746;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "Lclient!fd;")
	public static Class2_Sub3_Sub7_Sub1_Sub1 aClass2_Sub3_Sub7_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!qe;")
	private static Class78 aClass78_828 = Static199.method3560("Jan");

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!qe;")
	private static Class78 aClass78_832 = Static199.method3560("Feb");

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!qe;")
	private static Class78 aClass78_834 = Static199.method3560("Mar");

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!qe;")
	private static Class78 aClass78_829 = Static199.method3560("Apr");

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!qe;")
	private static Class78 aClass78_837 = Static199.method3560("May");

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "Lclient!qe;")
	private static Class78 aClass78_842 = Static199.method3560("Jun");

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "Lclient!qe;")
	private static Class78 aClass78_836 = Static199.method3560("Jul");

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!qe;")
	private static Class78 aClass78_839 = Static199.method3560("Aug");

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!qe;")
	private static Class78 aClass78_843 = Static199.method3560("Sep");

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "Lclient!qe;")
	private static Class78 aClass78_838 = Static199.method3560("Oct");

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!qe;")
	private static Class78 aClass78_831 = Static199.method3560("Nov");

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "Lclient!qe;")
	private static Class78 aClass78_840 = Static199.method3560("Dec");

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array37 = new Class78[] { aClass78_828, aClass78_832, aClass78_834, aClass78_829, aClass78_837, aClass78_842, aClass78_836, aClass78_839, aClass78_843, aClass78_838, aClass78_831, aClass78_840 };

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_830 = Static199.method3560("::noclip");

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_833 = Static199.method3560("headicons_prayer");

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_835 = Static199.method3560("loc)3dat");

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "[I")
	public static int[] anIntArray745 = new int[25];

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
	public static int anInt4686 = 0;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Lclient!qe;")
	public static Class78 aClass78_841 = Static199.method3560("<col=ff7000>");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)V")
	public static void method3702(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < anInt4686; local10++) {
			if (arg0 == Static100.aLongArray6[local10]) {
				anInt4686--;
				for (@Pc(27) int local27 = local10; local27 < anInt4686; local27++) {
					Static100.aLongArray6[local27] = Static100.aLongArray6[local27 + 1];
					Static15.aClass78Array1[local27] = Static15.aClass78Array1[local27 + 1];
				}
				Static140.anInt3198 = Static133.anInt3087;
				Static161.aClass2_Sub23_Sub1_5.method2155(184);
				Static161.aClass2_Sub23_Sub1_5.method2103(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qe;ZZ)V")
	public static void method3711(@OriginalArg(0) Class78 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) Class78 local3 = arg0.method3005();
		@Pc(6) short[] local6 = new short[16];
		@Pc(8) int local8 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static34.anInt575; local14++) {
			@Pc(19) Class2_Sub3_Sub23 local19 = Static32.method3209(local14);
			if ((!arg1 || local19.aBoolean153) && local19.anInt3495 == -1 && local19.anInt3510 == -1 && local19.anInt3489 == 0 && local19.aClass78_640.method3005().method3036(local3) != -1) {
				if (local8 >= 250) {
					Static42.aShortArray25 = null;
					Static112.anInt2453 = -1;
					return;
				}
				if (local8 >= local6.length) {
					@Pc(74) short[] local74 = new short[local6.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local8; local76++) {
						local74[local76] = local6[local76];
					}
					local6 = local74;
				}
				local6[local8++] = (short) local14;
			}
		}
		Static112.anInt2453 = local8;
		@Pc(104) Class78[] local104 = new Class78[Static112.anInt2453];
		Static42.aShortArray25 = local6;
		Static100.anInt2195 = 0;
		for (@Pc(110) int local110 = 0; local110 < Static112.anInt2453; local110++) {
			local104[local110] = Static32.method3209(local6[local110]).aClass78_640;
		}
		Static193.method3528(Static42.aShortArray25, local104);
	}
}
