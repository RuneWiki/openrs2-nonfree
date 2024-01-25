import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!vr;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lclient!mfa;")
	public static final Class2_Sub13[] aClass2_Sub13Array3 = new Class2_Sub13[8];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method4045() {
		if (Static318.anInt5802 < 102) {
			Static318.anInt5802 += 6;
		}
		@Pc(23) int local23;
		if (Static421.anInt7733 != -1 && Static99.method1701() > Static175.aLong94) {
			for (local23 = Static421.anInt7733; local23 < Static64.aStringArray3.length; local23++) {
				if (Static64.aStringArray3[local23].startsWith("pause")) {
					@Pc(42) int local42 = 5;
					try {
						local42 = Integer.parseInt(Static64.aStringArray3[local23].substring(6));
					} catch (@Pc(51) Exception local51) {
					}
					Static455.method7295("Pausing for " + local42 + " seconds...");
					Static421.anInt7733 = local23 + 1;
					Static175.aLong94 = Static99.method1701() + (long) (local42 * 1000);
					return;
				}
				Static356.aString80 = Static64.aStringArray3[local23];
				Static201.method3842(false);
			}
			Static421.anInt7733 = -1;
		}
		if (Static511.anInt9099 != 0) {
			Static211.anInt4367 -= Static511.anInt9099 * 5;
			if (Static211.anInt4367 >= Static491.anInt8810) {
				Static211.anInt4367 = Static491.anInt8810 - 1;
			}
			Static511.anInt9099 = 0;
			if (Static211.anInt4367 < 0) {
				Static211.anInt4367 = 0;
			}
		}
		for (local23 = 0; local23 < Static257.anInt4926; local23++) {
			@Pc(117) Interface21 local117 = Static595.anInterface21Array2[local23];
			@Pc(121) int local121 = local117.method5149();
			@Pc(125) char local125 = local117.method5145();
			@Pc(129) int local129 = local117.method5148();
			if (local121 == 84) {
				Static201.method3842(false);
			}
			if (local121 == 80) {
				Static201.method3842(true);
			} else if (local121 == 66 && (local129 & 0x4) != 0) {
				if (Static673.aClipboard3 != null) {
					@Pc(163) String local163 = "";
					for (@Pc(168) int local168 = Static244.aStringArray82.length - 1; local168 >= 0; local168--) {
						if (Static244.aStringArray82[local168] != null && Static244.aStringArray82[local168].length() > 0) {
							local163 = local163 + Static244.aStringArray82[local168] + '\n';
						}
					}
					Static673.aClipboard3.setContents(new StringSelection(local163), (ClipboardOwner) null);
				}
			} else if (local121 == 67 && (local129 & 0x4) != 0) {
				if (Static673.aClipboard3 != null) {
					@Pc(220) Transferable local220 = Static673.aClipboard3.getContents((Object) null);
					if (local220 != null) {
						try {
							@Pc(227) String local227 = (String) local220.getTransferData(DataFlavor.stringFlavor);
							if (local227 != null) {
								@Pc(234) String[] local234 = Static184.method3569('\n', local227);
								Static517.method8016(local234);
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			} else if (local121 == 85 && Static154.anInt3391 > 0) {
				Static356.aString80 = Static356.aString80.substring(0, Static154.anInt3391 - 1) + Static356.aString80.substring(Static154.anInt3391);
				Static154.anInt3391--;
			} else if (local121 == 101 && Static154.anInt3391 < Static356.aString80.length()) {
				Static356.aString80 = Static356.aString80.substring(0, Static154.anInt3391) + Static356.aString80.substring(Static154.anInt3391 + 1);
			} else if (local121 == 96 && Static154.anInt3391 > 0) {
				Static154.anInt3391--;
			} else if (local121 == 97 && Static154.anInt3391 < Static356.aString80.length()) {
				Static154.anInt3391++;
			} else if (local121 == 102) {
				Static154.anInt3391 = 0;
			} else if (local121 == 103) {
				Static154.anInt3391 = Static356.aString80.length();
			} else if (local121 == 104 && Static376.anInt7119 < Static244.aStringArray82.length) {
				Static376.anInt7119++;
				Static64.method1174();
				Static154.anInt3391 = Static356.aString80.length();
			} else if (local121 == 105 && Static376.anInt7119 > 0) {
				Static376.anInt7119--;
				Static64.method1174();
				Static154.anInt3391 = Static356.aString80.length();
			} else if (Static483.method7665(local125) || local125 == '\\' || local125 == '/' || local125 == '.' || local125 == ':' || local125 == ',' || local125 == ' ' || local125 == '_' || local125 == '-' || local125 == '+' || local125 == '[' || local125 == ']') {
				Static356.aString80 = Static356.aString80.substring(0, Static154.anInt3391) + Static595.anInterface21Array2[local23].method5145() + Static356.aString80.substring(Static154.anInt3391);
				Static154.anInt3391++;
			}
		}
		Static257.anInt4926 = 0;
		Static499.anInt8894 = 0;
		Static403.method6620();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method4047() {
		Static598.anInt10389 = -1;
		Static292.aClass71_8 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)Z")
	public static boolean method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static267.method9821(arg0, arg1) || Static39.method9318(arg0, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method4049() {
		@Pc(9) int local9 = Static99.anInt1769 * 512 + 256;
		@Pc(15) int local15 = Static362.anInt9575 * 512 + 256;
		@Pc(24) int local24 = Static10.method154(local15, local9, Static547.anInt9550) - Static278.anInt5148;
		if (Static428.anInt7848 >= 100) {
			Static598.anInt10387 = Static362.anInt9575 * 512 + 256;
			Static108.anInt1987 = Static99.anInt1769 * 512 + 256;
			Static229.anInt4615 = Static10.method154(Static598.anInt10387, Static108.anInt1987, Static547.anInt9550) - Static278.anInt5148;
		} else {
			if (local9 > Static108.anInt1987) {
				Static108.anInt1987 += Static339.anInt6006 + Static428.anInt7848 * (local9 - Static108.anInt1987) / 1000;
				if (local9 < Static108.anInt1987) {
					Static108.anInt1987 = local9;
				}
			}
			if (local24 > Static229.anInt4615) {
				Static229.anInt4615 += (local24 - Static229.anInt4615) * Static428.anInt7848 / 1000 + Static339.anInt6006;
				if (Static229.anInt4615 > local24) {
					Static229.anInt4615 = local24;
				}
			}
			if (local9 < Static108.anInt1987) {
				Static108.anInt1987 -= (Static108.anInt1987 - local9) * Static428.anInt7848 / 1000 + Static339.anInt6006;
				if (Static108.anInt1987 < local9) {
					Static108.anInt1987 = local9;
				}
			}
			if (local15 > Static598.anInt10387) {
				Static598.anInt10387 += (local15 - Static598.anInt10387) * Static428.anInt7848 / 1000 + Static339.anInt6006;
				if (local15 < Static598.anInt10387) {
					Static598.anInt10387 = local15;
				}
			}
			if (Static229.anInt4615 > local24) {
				Static229.anInt4615 -= Static339.anInt6006 + Static428.anInt7848 * (Static229.anInt4615 - local24) / 1000;
				if (Static229.anInt4615 < local24) {
					Static229.anInt4615 = local24;
				}
			}
			if (Static598.anInt10387 > local15) {
				Static598.anInt10387 -= Static428.anInt7848 * (Static598.anInt10387 - local15) / 1000 + Static339.anInt6006;
				if (local15 > Static598.anInt10387) {
					Static598.anInt10387 = local15;
				}
			}
		}
		local9 = Static483.anInt8676 * 512 + 256;
		local15 = Static46.anInt958 * 512 + 256;
		local24 = Static10.method154(local15, local9, Static547.anInt9550) - Static4.anInt75;
		@Pc(245) int local245 = local9 - Static108.anInt1987;
		@Pc(250) int local250 = local24 - Static229.anInt4615;
		@Pc(255) int local255 = local15 - Static598.anInt10387;
		@Pc(266) int local266 = (int) Math.sqrt((double) (local255 * local255 + local245 * local245));
		@Pc(277) int local277 = (int) (Math.atan2((double) local250, (double) local266) * 2607.5945876176133D) & 0x3FFF;
		@Pc(288) int local288 = (int) (-2607.5945876176133D * Math.atan2((double) local245, (double) local255)) & 0x3FFF;
		if (local277 < 1024) {
			local277 = 1024;
		}
		if (local277 > 3072) {
			local277 = 3072;
		}
		if (local277 > Static550.anInt9633) {
			Static550.anInt9633 += Static384.anInt7269 + Static82.anInt1460 * (local277 - Static550.anInt9633 >> 3) / 1000 << 3;
			if (Static550.anInt9633 > local277) {
				Static550.anInt9633 = local277;
			}
		}
		if (Static550.anInt9633 > local277) {
			Static550.anInt9633 -= Static384.anInt7269 + Static82.anInt1460 * (Static550.anInt9633 - local277 >> 3) / 1000 << 3;
			if (local277 > Static550.anInt9633) {
				Static550.anInt9633 = local277;
			}
		}
		@Pc(353) int local353 = local288 - Static152.anInt3290;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static152.anInt3290 += Static384.anInt7269 + local353 * Static82.anInt1460 / 1000 << 3;
			Static152.anInt3290 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static152.anInt3290 -= -local353 * Static82.anInt1460 / 1000 + Static384.anInt7269 << 3;
			Static152.anInt3290 &= 0x3FFF;
		}
		@Pc(410) int local410 = local288 - Static152.anInt3290;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		Static297.anInt5413 = 0;
		if (local410 < 0 && local353 > 0 || local410 > 0 && local353 < 0) {
			Static152.anInt3290 = local288;
		}
	}
}
