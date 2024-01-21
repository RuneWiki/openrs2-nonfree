import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!sd;")
	public static Class73 aClass73_811 = Static122.method531("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_812 = Static122.method531("blinken2:");

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!sd;")
	private static Class73 aClass73_814 = Static122.method531("Continue");

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_813 = aClass73_814;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method1117() {
		aClass73_813 = null;
		aClass73_814 = null;
		aClass73_811 = null;
		aClass73_812 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(JB)V")
	public static void method1118(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static107.anInt2468; local17++) {
			if (Static63.aLongArray1[local17] == arg0) {
				Static107.anInt2468--;
				for (@Pc(39) int local39 = local17; local39 < Static107.anInt2468; local39++) {
					Static63.aLongArray1[local39] = Static63.aLongArray1[local39 + 1];
					Static116.aClass73Array18[local39] = Static116.aClass73Array18[local39 + 1];
				}
				Static116.anInt2760 = Static84.anInt1893;
				Static139.aClass3_Sub12_Sub1_3.method1400(186);
				Static139.aClass3_Sub12_Sub1_3.method1382(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ud;Z)V")
	public static void method1119(@OriginalArg(0) Class3_Sub1_Sub4_Sub7 arg0) {
		if (Static44.anInt1024 == arg0.anInt3131 || arg0.anInt3184 == -1 || arg0.anInt3173 != 0 || arg0.anInt3164 + 1 > Static98.method1697(arg0.anInt3184).anIntArray136[arg0.anInt3172]) {
			@Pc(38) int local38 = arg0.anInt3131 - arg0.anInt3128;
			@Pc(44) int local44 = Static44.anInt1024 - arg0.anInt3128;
			@Pc(54) int local54 = arg0.anInt3140 * 64 + arg0.anInt3158 * 128;
			@Pc(64) int local64 = arg0.anInt3140 * 64 + arg0.anInt3165 * 128;
			@Pc(74) int local74 = arg0.anInt3140 * 64 + arg0.anInt3143 * 128;
			arg0.anInt3169 = ((local38 - local44) * local64 + local44 * local74) / local38;
			@Pc(99) int local99 = arg0.anInt3140 * 64 + arg0.anInt3166 * 128;
			arg0.anInt3159 = ((local38 - local44) * local54 + local44 * local99) / local38;
		}
		if (arg0.anInt3167 == 0) {
			arg0.anInt3139 = 1024;
		}
		if (arg0.anInt3167 == 1) {
			arg0.anInt3139 = 1536;
		}
		arg0.anInt3181 = 0;
		if (arg0.anInt3167 == 2) {
			arg0.anInt3139 = 0;
		}
		if (arg0.anInt3167 == 3) {
			arg0.anInt3139 = 512;
		}
		arg0.anInt3138 = arg0.anInt3139;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lclient!kg;")
	public static Class3_Sub1_Sub12 method1120(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) Static180.aClass7_29.method183((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static121.aClass13_23.method348(16, arg0);
		local6 = new Class3_Sub1_Sub12();
		if (local20 != null) {
			local6.method1507(new Class3_Sub12(local20));
		}
		Static180.aClass7_29.method186(local6, (long) arg0);
		return local6;
	}
}
