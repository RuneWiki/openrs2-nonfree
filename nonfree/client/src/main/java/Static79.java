import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Lclient!ed;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lclient!uf;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!ne", name = "Nb", descriptor = "I")
	public static int anInt946;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_356 = Static134.method2017("Stufe)2");

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lclient!v;")
	private static Class76 aClass76_363 = Static134.method2017("wishes to trade with you)3");

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_357 = aClass76_363;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array6 = new Class76[8];

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_358 = Static134.method2017("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Lclient!v;")
	private static Class76 aClass76_359 = Static134.method2017("Invalid username or password)3");

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!v;")
	private static Class76 aClass76_360 = Static134.method2017("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lclient!v;")
	public static Class76 aClass76_361 = Static134.method2017("null");

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Lclient!v;")
	private static Class76 aClass76_362 = Static134.method2017("Password: ");

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "Lclient!v;")
	public static Class76 aClass76_364 = aClass76_359;

	@OriginalMember(owner = "client!ne", name = "ob", descriptor = "Lclient!v;")
	public static Class76 aClass76_365 = aClass76_360;

	@OriginalMember(owner = "client!ne", name = "Bb", descriptor = "Lclient!v;")
	private static Class76 aClass76_366 = Static134.method2017("Type");

	@OriginalMember(owner = "client!ne", name = "Fb", descriptor = "Lclient!v;")
	public static Class76 aClass76_367 = aClass76_362;

	@OriginalMember(owner = "client!ne", name = "Ib", descriptor = "Lclient!v;")
	public static Class76 aClass76_368 = aClass76_366;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIILclient!v;Lclient!v;)V")
	public static void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class76 arg4, @OriginalArg(6) Class76 arg5) {
		if (Static32.aBoolean56 || Static10.anInt206 >= 500) {
			return;
		}
		Static114.aClass76Array26[Static10.anInt206] = arg4;
		Static62.aClass76Array14[Static10.anInt206] = arg5;
		Static95.anIntArray311[Static10.anInt206] = arg0;
		Static33.anIntArray106[Static10.anInt206] = arg1;
		Static35.anIntArray108[Static10.anInt206] = arg3;
		Static26.anIntArray83[Static10.anInt206] = arg2;
		Static10.anInt206++;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public static void method559(@OriginalArg(1) int arg0) {
		if (!Static45.method816(arg0)) {
			return;
		}
		@Pc(19) Class4_Sub8[] local19 = Static29.aClass4_Sub8ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class4_Sub8 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt527 = 0;
				local27.anInt519 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V")
	public static void method564() {
		aClass76_362 = null;
		aClass76_357 = null;
		aClass76_358 = null;
		aClass76_367 = null;
		aClass76_359 = null;
		aClass76_356 = null;
		aClass76_363 = null;
		aClass76_360 = null;
		aClass75_3 = null;
		aClass22_2 = null;
		aClass76_361 = null;
		aClass76_366 = null;
		aClass76_364 = null;
		aClass76_368 = null;
		aClass76_365 = null;
		aClass76Array6 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method567() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(9) int local9 = 0; local9 < Static10.anInt206 - 1; local9++) {
				if (Static95.anIntArray311[local9] < 1000 && Static95.anIntArray311[local9 + 1] > 1000) {
					local3 = false;
					@Pc(31) Class76 local31 = Static62.aClass76Array14[local9];
					Static62.aClass76Array14[local9] = Static62.aClass76Array14[local9 + 1];
					Static62.aClass76Array14[local9 + 1] = local31;
					@Pc(49) Class76 local49 = Static114.aClass76Array26[local9];
					Static114.aClass76Array26[local9] = Static114.aClass76Array26[local9 + 1];
					Static114.aClass76Array26[local9 + 1] = local49;
					@Pc(67) int local67 = Static95.anIntArray311[local9];
					Static95.anIntArray311[local9] = Static95.anIntArray311[local9 + 1];
					Static95.anIntArray311[local9 + 1] = local67;
					@Pc(85) int local85 = Static35.anIntArray108[local9];
					Static35.anIntArray108[local9] = Static35.anIntArray108[local9 + 1];
					Static35.anIntArray108[local9 + 1] = local85;
					@Pc(103) int local103 = Static26.anIntArray83[local9];
					Static26.anIntArray83[local9] = Static26.anIntArray83[local9 + 1];
					Static26.anIntArray83[local9 + 1] = local103;
					@Pc(121) int local121 = Static33.anIntArray106[local9];
					Static33.anIntArray106[local9] = Static33.anIntArray106[local9 + 1];
					Static33.anIntArray106[local9 + 1] = local121;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V")
	public static void method584() {
		Static104.aClass28_9 = new Class28(32);
	}
}
