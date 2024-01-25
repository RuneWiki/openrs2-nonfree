import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static int anInt7840;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lclient!ag;")
	public static Class10_Sub1[] aClass10_Sub1Array3;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_11 = new Class210(13, 0, 1, 0);

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Lclient!tga;")
	public static final Class315 aClass315_7 = new Class315("WTWIP", 3);

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_106 = new Class61(8, 8);

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!vj;II)V")
	public static void method6487(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class130 local13 = arg1.method7026();
		@Pc(23) int local23 = arg1.lb - arg1.aClass155_7.anInt4352 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg1.anInt8467 > 25) {
				arg1.aBoolean592 = false;
				if (arg3 < 0 && local13.anInt3786 != -1) {
					arg1.anInt8491 = local13.anInt3786;
				} else if (arg3 <= 0 || local13.anInt3810 == -1) {
					arg1.anInt8491 = local13.anInt3822;
				} else {
					arg1.anInt8491 = local13.anInt3810;
				}
			} else if (!arg1.aBoolean592 || !local13.method3357(arg1.anInt8491)) {
				arg1.anInt8491 = local13.method3356();
				arg1.aBoolean592 = arg1.anInt8491 != -1;
			}
		} else if (arg1.anInt8465 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(114) int local114 = Static263.anIntArray636[arg0] - arg1.aClass155_7.anInt4352 & 0x3FFF;
			if (arg2 == 2 && local13.anInt3824 != -1) {
				if (local114 > 2048 && local114 <= 6144 && local13.anInt3813 != -1) {
					arg1.anInt8491 = local13.anInt3813;
				} else if (local114 >= 10240 && local114 < 14336 && local13.anInt3789 != -1) {
					arg1.anInt8491 = local13.anInt3789;
				} else if (local114 <= 6144 || local114 >= 10240 || local13.anInt3782 == -1) {
					arg1.anInt8491 = local13.anInt3824;
				} else {
					arg1.anInt8491 = local13.anInt3782;
				}
			} else if (arg2 == 0 && local13.anInt3797 != -1) {
				if (local114 > 2048 && local114 <= 6144 && local13.anInt3798 != -1) {
					arg1.anInt8491 = local13.anInt3798;
				} else if (local114 >= 10240 && local114 < 14336 && local13.anInt3803 != -1) {
					arg1.anInt8491 = local13.anInt3803;
				} else if (local114 <= 6144 || local114 >= 10240 || local13.anInt3795 == -1) {
					arg1.anInt8491 = local13.anInt3797;
				} else {
					arg1.anInt8491 = local13.anInt3795;
				}
			} else if (local114 > 2048 && local114 <= 6144 && local13.anInt3820 != -1) {
				arg1.anInt8491 = local13.anInt3820;
			} else if (local114 >= 10240 && local114 < 14336 && local13.anInt3815 != -1) {
				arg1.anInt8491 = local13.anInt3815;
			} else if (local114 <= 6144 || local114 >= 10240 || local13.anInt3806 == -1) {
				arg1.anInt8491 = local13.anInt3822;
			} else {
				arg1.anInt8491 = local13.anInt3806;
			}
			arg1.aBoolean592 = false;
		} else if (local23 == 0 && arg1.anInt8467 <= 25) {
			if (arg2 == 2 && local13.anInt3824 != -1) {
				arg1.anInt8491 = local13.anInt3824;
			} else if (arg2 == 0 && local13.anInt3797 != -1) {
				arg1.anInt8491 = local13.anInt3797;
			} else {
				arg1.anInt8491 = local13.anInt3822;
			}
			arg1.aBoolean592 = false;
		} else {
			if (arg2 == 2 && local13.anInt3824 != -1) {
				if (arg3 < 0 && local13.anInt3805 != -1) {
					arg1.anInt8491 = local13.anInt3805;
				} else if (arg3 <= 0 || local13.anInt3804 == -1) {
					arg1.anInt8491 = local13.anInt3824;
				} else {
					arg1.anInt8491 = local13.anInt3804;
				}
			} else if (arg2 == 0 && local13.anInt3797 != -1) {
				if (arg3 < 0 && local13.anInt3814 != -1) {
					arg1.anInt8491 = local13.anInt3814;
				} else if (arg3 <= 0 || local13.anInt3801 == -1) {
					arg1.anInt8491 = local13.anInt3797;
				} else {
					arg1.anInt8491 = local13.anInt3801;
				}
			} else if (arg3 < 0 && local13.anInt3817 != -1) {
				arg1.anInt8491 = local13.anInt3817;
			} else if (arg3 <= 0 || local13.anInt3783 == -1) {
				arg1.anInt8491 = local13.anInt3822;
			} else {
				arg1.anInt8491 = local13.anInt3783;
			}
			arg1.aBoolean592 = false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public static void method6489() {
		if (Static551.anInt9250 != 0) {
			Static335.anInt6552 -= Static551.anInt9250 * 5;
			if (Static335.anInt6552 >= Static174.anInt3757) {
				Static335.anInt6552 = Static174.anInt3757 - 1;
			}
			if (Static335.anInt6552 < 0) {
				Static335.anInt6552 = 0;
			}
			Static551.anInt9250 = 0;
		}
		if (Static202.anInt4245 < 102) {
			Static202.anInt4245 += 6;
		}
		for (@Pc(47) int local47 = 0; local47 < Static176.anInt3771; local47++) {
			@Pc(53) Interface24 local53 = Static247.anInterface24Array1[local47];
			@Pc(57) int local57 = local53.method6739();
			@Pc(61) char local61 = local53.method6735();
			@Pc(65) int local65 = local53.method6737();
			if (local57 == 84) {
				Static557.method96(false);
			}
			if (local57 == 80) {
				Static557.method96(true);
			} else if (local57 == 66 && (local65 & 0x4) != 0) {
				if (Static168.aClipboard1 != null) {
					@Pc(92) String local92 = "";
					for (@Pc(97) int local97 = Static192.aStringArray13.length - 1; local97 >= 0; local97--) {
						if (Static192.aStringArray13[local97] != null && Static192.aStringArray13[local97].length() > 0) {
							local92 = local92 + Static192.aStringArray13[local97] + '\n';
						}
					}
					Static168.aClipboard1.setContents(new StringSelection(local92), null);
				}
			} else if (local57 == 67 && (local65 & 0x4) != 0) {
				if (Static168.aClipboard1 != null) {
					@Pc(155) Transferable local155 = Static168.aClipboard1.getContents(null);
					if (local155 != null) {
						try {
							@Pc(162) String local162 = (String) local155.getTransferData(DataFlavor.stringFlavor);
							if (local162 != null) {
								@Pc(169) String[] local169 = Static246.method4172(local162, '\n');
								if (local169.length <= 1) {
									Static221.aString45 = Static221.aString45 + local162;
								} else {
									for (@Pc(188) int local188 = 0; local188 < local169.length; local188++) {
										Static221.aString45 = local169[local188];
										Static557.method96(false);
									}
								}
							}
						} catch (@Pc(204) Exception local204) {
						}
					}
				}
			} else if (local57 == 85 && Static292.anInt5390 > 0) {
				Static221.aString45 = Static221.aString45.substring(0, Static292.anInt5390 - 1) + Static221.aString45.substring(Static292.anInt5390);
				Static292.anInt5390--;
			} else if (local57 == 101 && Static292.anInt5390 < Static221.aString45.length()) {
				Static221.aString45 = Static221.aString45.substring(0, Static292.anInt5390) + Static221.aString45.substring(Static292.anInt5390 + 1);
			} else if (local57 == 96 && Static292.anInt5390 > 0) {
				Static292.anInt5390--;
			} else if (local57 == 97 && Static292.anInt5390 < Static221.aString45.length()) {
				Static292.anInt5390++;
			} else if (local57 == 102) {
				Static292.anInt5390 = 0;
			} else if (local57 == 103) {
				Static292.anInt5390 = Static221.aString45.length();
			} else if (local57 == 104 && Static326.anInt5812 < Static192.aStringArray13.length) {
				Static326.anInt5812++;
				Static252.method4229();
				Static292.anInt5390 = Static221.aString45.length();
			} else if (local57 == 105 && Static326.anInt5812 > 0) {
				Static326.anInt5812--;
				Static252.method4229();
				Static292.anInt5390 = Static221.aString45.length();
			} else if (Static88.method2052(local61) || local61 == ':' || local61 == ',' || local61 == ' ' || local61 == '_' || local61 == '-' || local61 == '+' || local61 == '[' || local61 == ']') {
				Static221.aString45 = Static221.aString45.substring(0, Static292.anInt5390) + Static247.anInterface24Array1[local47].method6735() + Static221.aString45.substring(Static292.anInt5390);
				Static292.anInt5390++;
			}
		}
		Static176.anInt3771 = 0;
		Static545.anInt9177 = 0;
		Static39.method670();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	public static void method6490() {
		if (Static380.aBoolean501) {
			return;
		}
		Static532.method7405(Static306.aClass100ArrayArrayArray1);
		if (Static391.aClass100ArrayArrayArray3 != null) {
			Static532.method7405(Static391.aClass100ArrayArrayArray3);
		}
		Static380.aBoolean501 = true;
	}
}
