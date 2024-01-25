import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!rha", name = "z", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_16 = new Class48(1, 3);

	@OriginalMember(owner = "client!rha", name = "D", descriptor = "Z")
	public static boolean aBoolean730 = false;

	@OriginalMember(owner = "client!rha", name = "E", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!rha", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString83 = "";

	@OriginalMember(owner = "client!rha", name = "G", descriptor = "[I")
	public static int[] anIntArray480 = null;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IILjava/lang/String;)Lclient!jm;")
	public static Class32 method7287(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class32 local8;
		try {
			local8 = (Class32) Class.forName("Class32_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class32_Sub2();
		}
		local8.aString89 = arg1;
		local8.anInt9485 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method7291(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static264.anInt4921 >= 100) {
			Static491.method7052(Static64.aClass52_39.method907(Static544.anInt8937));
			return;
		}
		@Pc(21) String local21 = Static79.method1039(arg1);
		if (local21 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(26) int local26 = 0; local26 < Static264.anInt4921; local26++) {
			@Pc(38) String local38 = Static79.method1039(Static593.aStringArray55[local26]);
			if (local38 != null && local38.equals(local21)) {
				Static491.method7052(arg1 + Static64.aClass52_40.method907(Static544.anInt8937));
				return;
			}
			if (Static650.aStringArray57[local26] != null) {
				local69 = Static79.method1039(Static650.aStringArray57[local26]);
				if (local69 != null && local69.equals(local21)) {
					Static491.method7052(arg1 + Static64.aClass52_40.method907(Static544.anInt8937));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static253.anInt4604; local100++) {
			local69 = Static79.method1039(Static326.aStringArray31[local100]);
			if (local69 != null && local69.equals(local21)) {
				Static491.method7052(Static64.aClass52_45.method907(Static544.anInt8937) + arg1 + Static64.aClass52_46.method907(Static544.anInt8937));
				return;
			}
			if (Static558.aStringArray43[local100] != null) {
				@Pc(143) String local143 = Static79.method1039(Static558.aStringArray43[local100]);
				if (local143 != null && local143.equals(local21)) {
					Static491.method7052(Static64.aClass52_45.method907(Static544.anInt8937) + arg1 + Static64.aClass52_46.method907(Static544.anInt8937));
					return;
				}
			}
		}
		if (Static79.method1039(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45).equals(local21)) {
			Static491.method7052(Static64.aClass52_42.method907(Static544.anInt8937));
			return;
		}
		@Pc(201) Class5_Sub21 local201 = Static64.method905(Static263.aClass49_1, Static534.aClass305_84);
		local201.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg1) + 1);
		local201.aClass5_Sub41_Sub2_1.method7854(arg1);
		local201.aClass5_Sub41_Sub2_1.method7798(arg0 ? 1 : 0);
		Static495.method7092(local201);
	}
}
