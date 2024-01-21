import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lclient!e;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_223 = Static193.method3027("<col=00ff00>");

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_224 = Static193.method3027("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array8 = new Class70[100];

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public static void method368() {
		Static74.aClass85_15.method2557();
		Static42.aClass94_2.method3157();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!pg;")
	public static Class3_Sub3_Sub20 method370(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub20 local10 = (Class3_Sub3_Sub20) Static32.aClass85_3.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static33.method578(Static142.aClass52_32, Static181.aClass52_36, arg0);
		if (local10 != null) {
			Static32.aClass85_3.method2560(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Lclient!oc;")
	public static Class70 method371(@OriginalArg(0) long arg0) {
		Static155.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static155.aCalendar2.get(7);
		@Pc(22) int local22 = Static155.aCalendar2.get(5);
		@Pc(26) int local26 = Static155.aCalendar2.get(2);
		@Pc(30) int local30 = Static155.aCalendar2.get(1);
		@Pc(34) int local34 = Static155.aCalendar2.get(11);
		@Pc(38) int local38 = Static155.aCalendar2.get(12);
		@Pc(42) int local42 = Static155.aCalendar2.get(13);
		return Static207.method3296(new Class70[] { Static27.aClass70Array11[local18 - 1], Static27.aClass70_268, Static107.method2404(local22 / 10), Static107.method2404(local22 % 10), Static28.aClass70_282, Static35.aClass70Array14[local26], Static28.aClass70_282, Static107.method2404(local30), Static166.aClass70_1602, Static107.method2404(local34 / 10), Static107.method2404(local34 % 10), Static74.aClass70_686, Static107.method2404(local38 / 10), Static107.method2404(local38 % 10), Static74.aClass70_686, Static107.method2404(local42 / 10), Static107.method2404(local42 % 10), Static32.aClass70_313 });
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lclient!oc;B)[Lclient!oc;")
	public static Class70[] method372(@OriginalArg(0) Class70[] arg0) {
		@Pc(13) Class70[] local13 = new Class70[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static207.method3296(new Class70[] { Static107.method2404(local15), Static156.aClass70_1539 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static207.method3296(new Class70[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}
}
