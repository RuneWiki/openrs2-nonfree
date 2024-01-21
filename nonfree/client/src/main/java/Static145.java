import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_112;

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[J")
	public static final long[] aLongArray28 = new long[200];

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_959 = Static81.method1507("Art");

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_960 = Static81.method1507("(Y<)4col>");

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_961 = Static81.method1507("level)2");

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
	public static final int[] anIntArray274 = new int[100];

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_962 = Static81.method1507("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_963 = Static81.method1507("Spieler");

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "[Lclient!se;")
	public static final Class5_Sub6[] aClass5_Sub6Array1 = new Class5_Sub6[4];

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
	public static int anInt3265 = -1;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "[S")
	public static final short[] aShortArray38 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "Lclient!dj;")
	public static Class24 aClass24_964 = aClass24_961;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_965 = Static81.method1507("null");

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public static void method2522() {
		if (Static108.aClass53_3 != null) {
			Static108.aClass53_3.method1713();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[Lclient!dj;I)Lclient!dj;")
	public static Class24 method2523(@OriginalArg(1) int arg0, @OriginalArg(2) Class24[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg1[arg2 + local7] == null) {
				arg1[arg2 + local7] = Static60.aClass24_1057;
			}
			local5 += arg1[arg2 + local7].anInt1084;
		}
		@Pc(41) int local41 = 0;
		@Pc(44) byte[] local44 = new byte[local5];
		@Pc(54) Class24 local54;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			local54 = arg1[arg2 + local46];
			Static214.method348(local54.aByteArray13, 0, local44, local41, local54.anInt1084);
			local41 += local54.anInt1084;
		}
		local54 = new Class24();
		local54.aByteArray13 = local44;
		local54.anInt1084 = local5;
		return local54;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIB)I")
	public static int method2525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
