import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!oo", name = "R", descriptor = "Lclient!o;")
	public static final Class169 aClass169_243 = new Class169("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
	public static int anInt4474 = -1;

	@OriginalMember(owner = "client!oo", name = "T", descriptor = "Lclient!ea;")
	public static final Class62 aClass62_1 = Static230.method5261();

	@OriginalMember(owner = "client!oo", name = "U", descriptor = "[Lclient!vn;")
	public static final Class238[] aClass238Array1 = new Class238[4];

	@OriginalMember(owner = "client!oo", name = "V", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_33 = new Class227(200);

	@OriginalMember(owner = "client!oo", name = "W", descriptor = "Lclient!ic;")
	public static final Class1_Sub16 aClass1_Sub16_1 = new Class1_Sub16(0, 0);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!vg;I)V")
	public static void method3958(@OriginalArg(1) Class1_Sub33_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static385.aBoolean578 = false;
		Static143.anInt2673 = 0;
		Static32.method499(arg0);
		Static394.method5586(arg0);
		if (Static385.aBoolean578) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.lb) {
			throw new RuntimeException("gpi1 pos:" + arg0.lb + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(II)V")
	public static void method3960(@OriginalArg(1) int arg0) {
		Static86.anInt1593 = arg0;
		@Pc(14) Class227 local14 = Static366.aClass227_46;
		synchronized (Static366.aClass227_46) {
			Static366.aClass227_46.method4871();
		}
		local14 = Static109.aClass227_16;
		synchronized (Static109.aClass227_16) {
			Static109.aClass227_16.method4871();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method3961(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static56.anInt1157 >= 100) {
			Static118.method1733(Static100.aClass169_345.method3680(Static48.anInt952));
			return;
		}
		@Pc(30) String local30 = Static125.method1826(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(35) int local35 = 0; local35 < Static56.anInt1157; local35++) {
			@Pc(43) String local43 = Static125.method1826(Static250.aStringArray59[local35]);
			if (local43 != null && local43.equals(local30)) {
				Static118.method1733(arg0 + Static389.aClass169_341.method3680(Static48.anInt952));
				return;
			}
			if (Static256.aStringArray60[local35] != null) {
				local73 = Static125.method1826(Static256.aStringArray60[local35]);
				if (local73 != null && local73.equals(local30)) {
					Static118.method1733(arg0 + Static389.aClass169_341.method3680(Static48.anInt952));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static248.anInt4157; local103++) {
			local73 = Static125.method1826(Static175.aStringArray45[local103]);
			if (local73 != null && local73.equals(local30)) {
				Static118.method1733(Static289.aClass169_268.method3680(Static48.anInt952) + arg0 + Static113.aClass169_99.method3680(Static48.anInt952));
				return;
			}
			if (Static334.aStringArray78[local103] != null) {
				@Pc(146) String local146 = Static125.method1826(Static334.aStringArray78[local103]);
				if (local146 != null && local146.equals(local30)) {
					Static118.method1733(Static289.aClass169_268.method3680(Static48.anInt952) + arg0 + Static113.aClass169_99.method3680(Static48.anInt952));
					return;
				}
			}
		}
		if (Static125.method1826(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6).equals(local30)) {
			Static118.method1733(Static351.aClass169_310.method3680(Static48.anInt952));
		} else {
			Static177.method1119(Static38.aClass48_23);
			Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg0) + 1);
			Static209.aClass1_Sub33_Sub2_2.method5143(arg0);
			Static209.aClass1_Sub33_Sub2_2.method5165(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!je;)Lclient!je;")
	public static Class117 method3962(@OriginalArg(1) Class117 arg0) {
		if (arg0.anInt3066 != -1) {
			return Static13.method107(arg0.anInt3066);
		}
		@Pc(19) int local19 = arg0.anInt3093 >>> 16;
		@Pc(24) Class60 local24 = new Class60(Static22.aClass77_29);
		for (@Pc(29) Class1_Sub38 local29 = (Class1_Sub38) local24.method1160(); local29 != null; local29 = (Class1_Sub38) local24.method1159()) {
			if (local29.anInt5050 == local19) {
				return Static13.method107((int) local29.aLong207);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!re;I)Lclient!lb;")
	public static Class43_Sub3 method3963(@OriginalArg(0) Class1_Sub33 arg0) {
		return new Class43_Sub3(arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5180(), arg0.method5159(), arg0.method5174());
	}
}
