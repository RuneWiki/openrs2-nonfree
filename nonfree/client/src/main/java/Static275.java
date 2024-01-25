import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!pq", name = "Y", descriptor = "Lclient!mj;")
	public static Class156 aClass156_4;

	@OriginalMember(owner = "client!pq", name = "Z", descriptor = "Lclient!it;")
	public static Class119 aClass119_2;

	@OriginalMember(owner = "client!pq", name = "T", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_64 = new Class244(23, -1);

	@OriginalMember(owner = "client!pq", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!pq", name = "X", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_65 = new Class244(45, 0);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
	public static void method4304(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static68.anInt1346 != -1) {
				Static293.method4553(Static68.anInt1346);
			}
			for (@Pc(21) Class3_Sub22 local21 = (Class3_Sub22) Static29.aClass44_26.method950(); local21 != null; local21 = (Class3_Sub22) Static29.aClass44_26.method949()) {
				if (!local21.method5702()) {
					local21 = (Class3_Sub22) Static29.aClass44_26.method950();
					if (local21 == null) {
						break;
					}
				}
				Static53.method985(local21, false, true);
			}
			Static68.anInt1346 = -1;
			Static29.aClass44_26 = new Class44(8);
			Static295.method4560();
			Static68.anInt1346 = Static350.anInt5894;
			Static45.method706(false);
			Static71.method1197();
			Static124.method2008(Static68.anInt1346);
		}
		Static197.method3099();
		Static103.anInt2047 = -1;
		Static183.method2872(Static93.anInt1914);
		Static226.aClass28_Sub1_Sub1_Sub2_2 = new Class28_Sub1_Sub1_Sub2();
		Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0] = 52;
		Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 = 6656;
		Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 = 6656;
		Static339.anInt5726 = 0;
		Static206.anInt3639 = 0;
		Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0] = 52;
		if (Static88.anInt1815 == 2) {
			Static339.anInt5726 = Static258.anInt4650 << 7;
			Static206.anInt3639 = Static37.anInt658 << 7;
		} else {
			Static126.method2019();
		}
		Static347.method5256();
		if (Static206.anInt3639 == 0 || Static339.anInt5726 == 0) {
			Static310.method4763(10);
		} else {
			Static162.method2512();
			Static310.method4763(28);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method4305(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static166.method5546(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(III)Lclient!lr;")
	public static Class3_Sub7_Sub8 method4307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7_Sub8 local15 = (Class3_Sub7_Sub8) Static292.aClass44_31.method942((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class3_Sub7_Sub8(arg0, arg1);
			Static292.aClass44_31.method948(local15.aLong240, local15);
		}
		return local15;
	}
}
