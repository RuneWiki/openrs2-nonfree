import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lclient!pd;")
	public static Class20 aClass20_40;

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1039 = Static28.method504("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lclient!lf;")
	public static Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1040 = Static28.method504("Ausw-=hlen");

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1041 = Static28.method504("<col=ff0000>");

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1042 = Static28.method504("Schlie-8en");

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1043 = Static28.method504(")3runescape)3com");

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "Lclient!jf;")
	public static Class42 aClass42_9 = new Class42(4096);

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1044 = Static28.method504(" (X");

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1045 = Static28.method504("sl_button");

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "Lclient!ba;")
	public static Class7 aClass7_2 = new Class7();

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
	public static void method1362() {
		Class4_Sub2_Sub11.anIntArray220 = null;
		aClass39_1041 = null;
		aClass42_9 = null;
		aClass51_1 = null;
		aClass20_40 = null;
		aClass39_1045 = null;
		aClass39_1044 = null;
		aClass39_1039 = null;
		aClass39_1042 = null;
		aClass39_1040 = null;
		aClass7_2 = null;
		aClass39_1043 = null;
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
	public static void method1364() {
		Static23.aClass12_19.method233();
		Static63.aClass12_43.method233();
		Static52.aClass12_36.method233();
		Static1.aClass12_1.method233();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZII[B)Z")
	public static boolean method1365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) int local3 = -1;
		@Pc(12) Class4_Sub16 local12 = new Class4_Sub16(arg2);
		@Pc(14) boolean local14 = true;
		label68: while (true) {
			@Pc(18) int local18 = local12.method1450();
			if (local18 == 0) {
				return local14;
			}
			local3 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(60) int local60;
				@Pc(93) Class4_Sub2_Sub10 local93;
				do {
					@Pc(69) int local69;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method1450();
										if (local37 == 0) {
											continue label68;
										}
										local12.method1474();
									}
									local37 = local12.method1450();
									if (local37 == 0) {
										continue label68;
									}
									local29 += local37 - 1;
									@Pc(54) int local54 = local29 >> 6 & 0x3F;
									local60 = local12.method1474() >> 2;
									@Pc(64) int local64 = local29 & 0x3F;
									local69 = local54 + arg0;
									local73 = arg1 + local64;
								} while (local69 <= 0);
							} while (local73 <= 0);
						} while (local69 >= 103);
					} while (local73 >= 103);
					local93 = Static73.method1207(local3);
				} while (local60 == 22 && Static123.aBoolean150 && local93.anInt1404 == 0 && local93.anInt1407 != 1 && !local93.aBoolean74);
				local31 = true;
				if (!local93.method917()) {
					local14 = false;
					Static111.anInt2777++;
				}
			}
		}
	}
}
