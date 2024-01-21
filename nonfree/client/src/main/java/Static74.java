import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1043 = Static63.method1251(" ");

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1044 = Static63.method1251("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1046 = Static63.method1251("Accept challenge");

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1045 = aClass45_1046;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1047 = aClass45_1043;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!ca;")
	public static Class10 aClass10_10 = new Class10();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!sc;)V")
	public static void method1690(@OriginalArg(1) Class5_Sub2_Sub6_Sub4 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static35.anIntArray162.length; local9++) {
			Static35.anIntArray162[local9] = 0;
		}
		@Pc(41) int local41;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local41 = (int) ((double) 256 * Math.random() * 128.0D);
			Static35.anIntArray162[local41] = (int) (Math.random() * 256.0D);
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(73) int local73;
		for (local41 = 0; local41 < 20; local41++) {
			for (local60 = 1; local60 < 255; local60++) {
				for (local64 = 1; local64 < 127; local64++) {
					local73 = local64 + (local60 << 7);
					Static79.anIntArray314[local73] = (Static35.anIntArray162[local73 - 1] + Static35.anIntArray162[local73 + 1] + Static35.anIntArray162[local73 - 128] + Static35.anIntArray162[local73 - -128]) / 4;
				}
			}
			@Pc(120) int[] local120 = Static35.anIntArray162;
			Static35.anIntArray162 = Static79.anIntArray314;
			Static79.anIntArray314 = local120;
		}
		if (arg0 == null) {
			return;
		}
		local60 = 0;
		for (local64 = 0; local64 < arg0.anInt2727; local64++) {
			for (local73 = 0; local73 < arg0.anInt2731; local73++) {
				if (arg0.aByteArray37[local60++] != 0) {
					@Pc(155) int local155 = local64 + arg0.anInt2728 + 16;
					@Pc(162) int local162 = arg0.anInt2729 + local73 + 16;
					@Pc(169) int local169 = local162 + (local155 << 7);
					Static35.anIntArray162[local169] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1693() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1694() {
		aClass45_1043 = null;
		aClass45_1047 = null;
		aClass45_1046 = null;
		aClass45_1044 = null;
		aClass10_10 = null;
		aClass45_1045 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mb;ZLclient!mb;Lclient!sd;)Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 method1696(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(13) int local13 = arg2.method746(arg1);
		@Pc(19) int local19 = arg2.method753(arg0, local13);
		return Static11.method232(arg2, local19, local13);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!sd;Lclient!sd;B)V")
	public static void method1697(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1) {
		Static71.aClass29_48 = arg1;
		Static85.aClass29_57 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
	public static boolean method1698(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public static boolean method1699(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ia;)I")
	public static int method1700(@OriginalArg(1) Class5_Sub2_Sub8 arg0) {
		@Pc(26) Class5_Sub3 local26 = (Class5_Sub3) Static38.aClass66_6.method1812((long) arg0.anInt1288 + ((long) arg0.anInt1262 << 32));
		return local26 == null ? arg0.anInt1273 : local26.anInt419;
	}
}
