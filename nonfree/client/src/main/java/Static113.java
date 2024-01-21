import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Lclient!eh;")
	public static Class28 aClass28_120;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_18;

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "Lclient!pc;")
	public static Class77 aClass77_67;

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "Lclient!eh;")
	public static Class28 aClass28_121;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "Lclient!s;")
	public static final Class86 aClass86_35 = new Class86(128);

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
	public static int anInt2594 = -1;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
	public static int anInt2598 = -1;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_766 = Static181.method2795("0(U");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lclient!bc;")
	public static Class2_Sub2_Sub3 method1987(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub3 local15 = (Class2_Sub2_Sub3) Static11.aClass86_6.method2643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static39.aClass28_46.method852(Static4.method88(arg0), Static7.method109(arg0));
		local15 = new Class2_Sub2_Sub3();
		local15.anInt453 = arg0;
		if (local29 != null) {
			local15.method337(new Class2_Sub3(local29));
		}
		local15.method340();
		if (local15.anInt466 != -1) {
			local15.method338(method1987(local15.anInt423), method1987(local15.anInt466));
		}
		if (local15.anInt450 != -1) {
			local15.method335(method1987(local15.anInt450), method1987(local15.anInt462));
		}
		if (!Static153.aBoolean155 && local15.aBoolean25) {
			local15.anInt456 = 0;
			local15.aClass83Array9 = null;
			local15.aClass83_87 = Static101.aClass83_675;
			local15.aBoolean24 = false;
			local15.aClass83Array8 = null;
		}
		Static11.aClass86_6.method2647(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
	public static int method1991(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public static void method1993() {
		for (@Pc(12) Class2_Sub13 local12 = (Class2_Sub13) Static33.aClass63_3.method2114(); local12 != null; local12 = (Class2_Sub13) Static33.aClass63_3.method2108()) {
			@Pc(17) int local17 = local12.anInt1869;
			if (Static133.method2211(local17)) {
				@Pc(23) boolean local23 = true;
				@Pc(27) Class5[] local27 = Static175.aClass5ArrayArray1[local17];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					if (local27[local29] != null) {
						local23 = local27[local29].aBoolean7;
						break;
					}
				}
				if (!local23) {
					@Pc(57) int local57 = (int) local12.aLong149;
					@Pc(63) Class5 local63 = Static74.method1401(local57);
					if (local63 != null) {
						Static121.method2085(local63);
					}
				}
			}
		}
	}
}
