import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array6;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!sf;")
	public static Class5 aClass5_51;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!ua;")
	public static Class72 aClass72_4;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_934 = Static106.method1849("Prepared visibility map");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_930 = aClass66_934;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[104][104];

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!sc;")
	private static Class66 aClass66_931 = Static106.method1849("glow3:");

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_932 = aClass66_931;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_933 = aClass66_931;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_935 = Static106.method1849("Versteckt");

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static int anInt1780 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1243() {
		anIntArrayArray17 = null;
		aClass66_932 = null;
		aClass5_51 = null;
		aClass66_934 = null;
		aClass66_931 = null;
		aClass66_930 = null;
		aClass72_4 = null;
		aClass66_933 = null;
		aClass1_Sub1_Sub2_Sub3Array6 = null;
		aClass66_935 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([Lclient!sc;III)Lclient!sc;")
	public static Class66 method1244(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg0[local9 + arg1] == null) {
				arg0[arg1 + local9] = Static50.aClass66_845;
			}
			local7 += arg0[arg1 + local9].anInt2583;
		}
		@Pc(45) byte[] local45 = new byte[local7];
		@Pc(47) int local47 = 0;
		@Pc(57) Class66 local57;
		for (@Pc(49) int local49 = 0; local49 < arg2; local49++) {
			local57 = arg0[arg1 + local49];
			Static139.method1493(local57.aByteArray29, 0, local45, local47, local57.anInt2583);
			local47 += local57.anInt2583;
		}
		local57 = new Class66();
		local57.anInt2583 = local7;
		local57.aByteArray29 = local45;
		return local57;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JZ)V")
	public static void method1245(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static27.anInt730; local19++) {
			if (Static43.aLongArray5[local19] == arg0) {
				Static27.anInt730--;
				for (@Pc(41) int local41 = local19; local41 < Static27.anInt730; local41++) {
					Static88.aClass66Array20[local41] = Static88.aClass66Array20[local41 + 1];
					Static9.anIntArray56[local41] = Static9.anIntArray56[local41 + 1];
					Static43.aLongArray5[local41] = Static43.aLongArray5[local41 + 1];
					Static8.anIntArray55[local41] = Static8.anIntArray55[local41 + 1];
				}
				Static60.anInt1850 = Static112.anInt2674;
				Static127.aClass1_Sub12_Sub1_2.method1227(142);
				Static127.aClass1_Sub12_Sub1_2.method1195(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method1246() {
		if (Static73.aClass34_4 != null) {
			Static73.aClass34_4.method1104();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!tb;")
	public static Class1_Sub1_Sub15 method1247(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub15 local10 = (Class1_Sub1_Sub15) Static34.aClass60_10.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static18.aClass5_18.method107(arg0, 12);
		local10 = new Class1_Sub1_Sub15();
		if (local20 != null) {
			local10.method1870(new Class1_Sub12(local20));
		}
		local10.method1880();
		Static34.aClass60_10.method1741((long) arg0, local10);
		return local10;
	}
}
