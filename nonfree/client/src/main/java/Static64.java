import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt1649;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_14;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array16 = new Class76[100];

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt1644 = 0;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_685 = Static134.method2017("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_686 = Static134.method2017("Titelbild geladen)3");

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt1653 = 0;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	public static int anInt1655 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1097(@OriginalArg(0) int arg0) {
		@Pc(31) byte[] local31;
		if (arg0 == 100 && Static54.anInt2512 > 0) {
			local31 = Static101.aByteArrayArray10[--Static54.anInt2512];
			Static101.aByteArrayArray10[Static54.anInt2512] = null;
			return local31;
		} else if (arg0 == 5000 && Static79.anInt907 > 0) {
			local31 = Static92.aByteArrayArray9[--Static79.anInt907];
			Static92.aByteArrayArray9[Static79.anInt907] = null;
			return local31;
		} else if (arg0 == 30000 && Static81.anInt2005 > 0) {
			local31 = Static26.aByteArrayArray1[--Static81.anInt2005];
			Static26.aByteArrayArray1[Static81.anInt2005] = null;
			return local31;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1098() {
		aClass76_686 = null;
		aClass76_685 = null;
		anIntArray222 = null;
		aClass17_Sub1_14 = null;
		aClass76Array16 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!dd;IBIII)V")
	public static void method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static30.aBoolean82) {
			Static87.anInt1971 = 32;
		} else {
			Static87.anInt1971 = 0;
		}
		Static30.aBoolean82 = false;
		@Pc(134) int local134;
		if (Static122.anInt2680 != 0) {
			if (arg1 <= arg0 && arg0 < arg1 + 16 && arg5 <= arg6 && arg6 < arg5 + 16) {
				arg2.anInt494 -= 4;
				Static63.method1095(arg2);
			} else if (arg1 <= arg0 && arg0 < arg1 + 16 && arg4 + arg5 - 16 <= arg6 && arg6 < arg5 + arg4) {
				arg2.anInt494 += 4;
				Static63.method1095(arg2);
			} else if (arg1 - Static87.anInt1971 <= arg0 && Static87.anInt1971 + arg1 + 16 > arg0 && arg5 + 16 <= arg6 && arg4 + arg5 - 16 > arg6) {
				local134 = (arg4 - 32) * arg4 / arg3;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(151) int local151 = arg6 - arg5 - local134 / 2 - 16;
				@Pc(158) int local158 = arg4 - local134 - 32;
				arg2.anInt494 = (arg3 - arg4) * local151 / local158;
				Static63.method1095(arg2);
				Static30.aBoolean82 = true;
			}
		}
		if (Static124.anInt2718 == 0) {
			return;
		}
		local134 = arg2.anInt513;
		if (arg0 >= arg1 - local134 && arg5 <= arg6 && arg0 < arg1 + 16 && arg4 + arg5 >= arg6) {
			arg2.anInt494 += Static124.anInt2718 * 45;
			Static63.method1095(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)Z")
	public static boolean method1100(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class4_Sub10 local17 = new Class4_Sub10(arg1);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method568();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(39) int local39;
				while (!local31) {
					local39 = local17.method568();
					if (local39 == 0) {
						continue label54;
					}
					local33 += local39 - 1;
					@Pc(69) int local69 = local33 & 0x3F;
					@Pc(75) int local75 = local33 >> 6 & 0x3F;
					@Pc(79) int local79 = arg2 + local75;
					@Pc(84) int local84 = local69 + arg0;
					@Pc(90) int local90 = local17.method599() >> 2;
					if (local79 > 0 && local84 > 0 && local79 < 103 && local84 < 103) {
						@Pc(108) Class4_Sub4_Sub8 local108 = Static104.method1600(local19);
						if (local90 != 22 || !Static76.aBoolean119 || local108.anInt1511 != 0 || local108.anInt1500 == 1 || local108.aBoolean94) {
							local31 = true;
							if (!local108.method1008()) {
								Static134.anInt2840++;
								local12 = false;
							}
						}
					}
				}
				local39 = local17.method568();
				if (local39 == 0) {
					break;
				}
				local17.method599();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!v;ZLclient!dd;)Lclient!v;")
	public static Class76 method1101(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class4_Sub8 arg1) {
		if (arg0.method1861(Static121.aClass76_1238) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(29) int local29 = arg0.method1861(Static115.aClass76_1183);
			if (local29 == -1) {
				while (true) {
					local29 = arg0.method1861(Static105.aClass76_1108);
					if (local29 == -1) {
						while (true) {
							local29 = arg0.method1861(Static134.aClass76_1328);
							if (local29 == -1) {
								while (true) {
									local29 = arg0.method1861(Static67.aClass76_721);
									if (local29 == -1) {
										while (true) {
											local29 = arg0.method1861(Static40.aClass76_484);
											if (local29 == -1) {
												while (true) {
													local29 = arg0.method1861(Static82.aClass76_892);
													if (local29 == -1) {
														return arg0;
													}
													@Pc(251) Class76 local251 = Static133.aClass76_1322;
													if (Static134.aClass24_8 != null) {
														local251 = Static3.method1521(Static134.aClass24_8.anInt816);
														try {
															if (Static134.aClass24_8.anObject10 != null) {
																@Pc(267) byte[] local267 = ((String) Static134.aClass24_8.anObject10).getBytes("ISO-8859-1");
																local251 = Static94.method1510(0, local267, local267.length);
															}
														} catch (@Pc(276) UnsupportedEncodingException local276) {
														}
													}
													arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), local251, arg0.method1874(local29 + 4) });
												}
											}
											arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), Static49.method856(Static32.method480(arg1, 4)), arg0.method1874(local29 + 2) });
										}
									}
									arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), Static49.method856(Static32.method480(arg1, 3)), arg0.method1874(local29 + 2) });
								}
							}
							arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), Static49.method856(Static32.method480(arg1, 2)), arg0.method1874(local29 + 2) });
						}
					}
					arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), Static49.method856(Static32.method480(arg1, 1)), arg0.method1874(local29 + 2) });
				}
			}
			arg0 = Static59.method1017(new Class76[] { arg0.method1876(local29, 0), Static49.method856(Static32.method480(arg1, 0)), arg0.method1874(local29 + 2) });
		}
	}
}
