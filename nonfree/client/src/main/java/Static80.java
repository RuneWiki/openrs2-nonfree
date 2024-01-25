import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!fp;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!bfa;")
	public static final Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/awt/Component;ILclient!kj;I)Lclient!fa;")
	public static Class107 method1216(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class202 arg3) {
		if (Static227.anInt3654 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class107 local35 = (Class107) Class.forName("Class107_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt10318 = arg2;
			local35.anIntArray599 = new int[(Static135.aBoolean154 ? 2 : 1) * 256];
			local35.method8609(arg1);
			local35.anInt10325 = (arg2 & 0xFFFFFC00) + 1024;
			if (local35.anInt10325 > 16384) {
				local35.anInt10325 = 16384;
			}
			local35.method8603(local35.anInt10325);
			if (Static53.anInt4076 > 0 && Static569.aClass70_1 == null) {
				Static569.aClass70_1 = new Class70();
				Static569.aClass70_1.aClass202_1 = arg3;
				arg3.method4737(Static569.aClass70_1, Static53.anInt4076);
			}
			if (Static569.aClass70_1 != null) {
				if (Static569.aClass70_1.aClass107Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static569.aClass70_1.aClass107Array1[arg0] = local35;
			}
			return local35;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class107_Sub2 local114 = new Class107_Sub2(arg3, arg0);
				local114.anInt10318 = arg2;
				local114.anIntArray599 = new int[(Static135.aBoolean154 ? 2 : 1) * 256];
				local114.method8609(arg1);
				local114.anInt10325 = 16384;
				local114.method8603(local114.anInt10325);
				if (Static53.anInt4076 > 0 && Static569.aClass70_1 == null) {
					Static569.aClass70_1 = new Class70();
					Static569.aClass70_1.aClass202_1 = arg3;
					arg3.method4737(Static569.aClass70_1, Static53.anInt4076);
				}
				if (Static569.aClass70_1 != null) {
					if (Static569.aClass70_1.aClass107Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static569.aClass70_1.aClass107Array1[arg0] = local114;
				}
				return local114;
			} catch (@Pc(178) Throwable local178) {
				return new Class107();
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIBILclient!ha;)V")
	public static void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class143 arg7) {
		@Pc(13) Interface10 local13 = (Interface10) Static322.method5015(arg5, arg4, arg0);
		@Pc(22) Class81 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local13 != null) {
			local22 = Static400.aClass140_4.method2839(local13.method8668());
			local28 = local13.method8671() & 0x3;
			local32 = local13.method8670();
			if (local22.anInt1888 == -1) {
				local39 = arg3;
				if (local22.anInt1885 > 0) {
					local39 = arg2;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg7.method6245(4, local39, arg1, arg6);
					} else if (local28 == 1) {
						arg7.method6243(arg6, local39, 4, arg1);
					} else if (local28 == 2) {
						arg7.method6245(4, local39, arg1, arg6 + 3);
					} else if (local28 == 3) {
						arg7.method6243(arg6, local39, 4, arg1 + 3);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg7.method6252(arg1, arg6, local39, 1, 1);
					} else if (local28 == 1) {
						arg7.method6252(arg1, arg6 + 3, local39, 1, 1);
					} else if (local28 == 2) {
						arg7.method6252(arg1 + 3, arg6 + 3, local39, 1, 1);
					} else if (local28 == 3) {
						arg7.method6252(arg1 + 3, arg6, local39, 1, 1);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg7.method6243(arg6, local39, 4, arg1);
					} else if (local28 == 1) {
						arg7.method6245(4, local39, arg1, arg6 + 3);
					} else if (local28 == 2) {
						arg7.method6243(arg6, local39, 4, arg1 + 3);
					} else if (local28 == 3) {
						arg7.method6245(4, local39, arg1, arg6);
					}
				}
			} else {
				Static578.method7882(arg6, arg1, local28, arg7, local22);
			}
		}
		local13 = (Interface10) Static156.method2369(arg5, arg4, arg0, ija.class);
		if (local13 != null) {
			local22 = Static400.aClass140_4.method2839(local13.method8668());
			local28 = local13.method8671() & 0x3;
			local32 = local13.method8670();
			if (local22.anInt1888 != -1) {
				Static578.method7882(arg6, arg1, local28, arg7, local22);
			} else if (local32 == 9) {
				local39 = -1118482;
				if (local22.anInt1885 > 0) {
					local39 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg7.method6202(arg6 + 3, local39, arg6, arg1, arg1 + 3);
				} else {
					arg7.method6202(arg6 + 3, local39, arg6, arg1 + 3, arg1);
				}
			}
		}
		local13 = (Interface10) Static198.method2808(arg5, arg4, arg0);
		if (local13 == null) {
			return;
		}
		local22 = Static400.aClass140_4.method2839(local13.method8668());
		local28 = local13.method8671() & 0x3;
		if (local22.anInt1888 != -1) {
			Static578.method7882(arg6, arg1, local28, arg7, local22);
			return;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBIIII)V")
	public static void method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static655.aClass5_Sub36_29.aClass2_Sub6_5.method3364() != 0 && arg4 != 0 && Static331.anInt6013 < 50 && arg1 != -1) {
			Static515.aClass178Array2[Static331.anInt6013++] = new Class178((byte) 1, arg1, arg4, arg2, arg5, arg3, arg0, (Class41_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static518.aFrame4 != null && (arg2 != 3 || Static293.anInt4551 != arg3 || arg0 != Static413.anInt7059)) {
			Static419.method6179(Static150.aClass202_2, Static518.aFrame4);
			Static518.aFrame4 = null;
		}
		if (arg2 == 3 && Static518.aFrame4 == null) {
			Static518.aFrame4 = Static140.method2105(arg0, arg3, Static150.aClass202_2, 0);
			if (Static518.aFrame4 != null) {
				Static413.anInt7059 = arg0;
				Static293.anInt4551 = arg3;
				Static185.method2703();
			}
		}
		if (arg2 == 3 && Static518.aFrame4 == null) {
			method1224(-1, arg1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, true);
			return;
		}
		@Pc(71) Container local71;
		@Pc(86) Insets local86;
		if (Static518.aFrame4 != null) {
			Static197.anInt3210 = arg3;
			local71 = Static518.aFrame4;
			Static267.anInt4239 = arg0;
		} else if (Static634.aFrame5 == null) {
			if (Static285.anApplet5 == null) {
				local71 = Static279.anApplet_Sub1_1;
			} else {
				local71 = Static285.anApplet5;
			}
			Static197.anInt3210 = local71.getSize().width;
			Static267.anInt4239 = local71.getSize().height;
		} else {
			local86 = Static634.aFrame5.getInsets();
			Static197.anInt3210 = Static634.aFrame5.getSize().width - local86.right - local86.left;
			@Pc(102) int local102 = -local86.top;
			Static267.anInt4239 = Static634.aFrame5.getSize().height + local102 - local86.bottom;
			local71 = Static634.aFrame5;
		}
		if (arg2 == 1) {
			Static316.anInt8165 = Static427.anInt10577;
			Static563.anInt9176 = Static345.anInt6198;
			Static10.anInt176 = (Static197.anInt3210 - Static345.anInt6198) / 2;
			Static415.anInt7087 = 0;
		} else {
			Static420.method6184();
		}
		if (Static71.aClass267_2 != Static99.aClass267_3) {
			@Pc(159) boolean local159;
			if (Static563.anInt9176 < 1024 && Static316.anInt8165 < 768) {
				local159 = true;
			} else {
				local159 = false;
			}
		}
		if (arg4) {
			Static535.method8704();
		} else {
			Static105.aCanvas2.setSize(Static563.anInt9176, Static316.anInt8165);
			if (Static305.aBoolean315) {
				Static535.method8693(Static105.aCanvas2);
			} else {
				Static563.aClass143_13.method6266(Static105.aCanvas2, Static563.anInt9176, Static316.anInt8165);
			}
			if (local71 == Static634.aFrame5) {
				local86 = Static634.aFrame5.getInsets();
				Static105.aCanvas2.setLocation(Static10.anInt176 + local86.left, local86.top + Static415.anInt7087);
			} else {
				Static105.aCanvas2.setLocation(Static10.anInt176, Static415.anInt7087);
			}
		}
		if (arg2 < 2) {
			Static81.aBoolean103 = false;
		} else {
			Static81.aBoolean103 = true;
		}
		if (Static131.anInt2222 != -1) {
			Static469.method6939(true);
		}
		if (Static537.aClass240_34 != null && Static427.method8766(Static539.anInt8853)) {
			Static288.method3976();
		}
		for (@Pc(227) int local227 = 0; local227 < 100; local227++) {
			Static425.aBooleanArray18[local227] = true;
		}
		Static594.aBoolean710 = true;
	}
}
