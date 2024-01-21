import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array3;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "[S")
	public static short[] aShortArray10;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!dd;")
	public static Class17 aClass17_10 = new Class17(64);

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "Lclient!ai;")
	public static Class6 aClass6_606 = Static38.method685("Fertigkeit)2");

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[I")
	public static int[] anIntArray145 = new int[128];

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_607 = Static38.method685("gleiten:");

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
	public static int anInt1983 = 255;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
	public static int anInt1985 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V")
	public static void method1301(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static68.anInt1729; local16++) {
			if (Static138.aLongArray6[local16] == arg0) {
				Static68.anInt1729--;
				for (@Pc(34) int local34 = local16; local34 < Static68.anInt1729; local34++) {
					Static138.aLongArray6[local34] = Static138.aLongArray6[local34 + 1];
					Static10.aClass6Array2[local34] = Static10.aClass6Array2[local34 + 1];
				}
				Static86.anInt2209 = Static7.anInt124;
				Static66.aClass2_Sub13_Sub1_2.method1455(127);
				Static66.aClass2_Sub13_Sub1_2.method1418(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method1302() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1303() {
		aClass2_Sub3_Sub2_Sub1Array3 = null;
		aClass17_10 = null;
		aClass2_Sub3_Sub2_Sub3Array4 = null;
		aClass6_606 = null;
		aClass6_607 = null;
		aShortArray10 = null;
		anIntArray145 = null;
	}
}
