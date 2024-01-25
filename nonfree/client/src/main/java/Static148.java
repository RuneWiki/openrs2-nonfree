import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "[Lclient!ec;")
	public static Class65_Sub1[] aClass65_Sub1Array2;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!gi;")
	public static Class93 aClass93_8 = null;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_36 = new Class208(57, 4);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_37 = new Class208(22, 2);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public static int anInt2711 = 0;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILclient!mn;IZ)V")
	public static void method2247(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class171 arg2) {
		Static312.anInt5619 = arg1;
		Static389.anInt6735 = arg0;
		Static252.anInt4350 = 0;
		Static293.aBoolean366 = false;
		Static332.anInt5976 = 2;
		Static378.aClass171_98 = arg2;
		Static452.anInt951 = 1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;BIIIIIII)V")
	public static void method2248(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Interface6 local9 = (Interface6) Static45.method700(arg3, arg5, arg4);
		@Pc(18) Class192 local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(42) int local42;
		if (local9 != null) {
			local18 = Static249.aClass39_2.method748(local9.method5718());
			local24 = local9.method5723() & 0x3;
			local28 = local9.method5721();
			if (local18.anInt5434 == -1) {
				local42 = arg6;
				if (local18.anInt5419 > 0) {
					local42 = arg2;
				}
				if (local28 == 0 || local28 == 2) {
					if (local24 == 0) {
						arg0.method5976(4, arg1, local42, arg7);
					} else if (local24 == 1) {
						arg0.method6022(arg7, local42, arg1, 4);
					} else if (local24 == 2) {
						arg0.method5976(4, arg1 + 3, local42, arg7);
					} else if (local24 == 3) {
						arg0.method6022(arg7 + 3, local42, arg1, 4);
					}
				}
				if (local28 == 3) {
					if (local24 == 0) {
						arg0.method5996(1, arg7, local42, arg1, 1);
					} else if (local24 == 1) {
						arg0.method5996(1, arg7, local42, arg1 + 3, 1);
					} else if (local24 == 2) {
						arg0.method5996(1, arg7 + 3, local42, arg1 + 3, 1);
					} else if (local24 == 3) {
						arg0.method5996(1, arg7 + 3, local42, arg1, 1);
					}
				}
				if (local28 == 2) {
					if (local24 == 0) {
						arg0.method6022(arg7, local42, arg1, 4);
					} else if (local24 == 1) {
						arg0.method5976(4, arg1 + 3, local42, arg7);
					} else if (local24 == 2) {
						arg0.method6022(arg7 + 3, local42, arg1, 4);
					} else if (local24 == 3) {
						arg0.method5976(4, arg1, local42, arg7);
					}
				}
			} else {
				Static108.method1793(arg1, local24, local18, arg0, arg7);
			}
		}
		local9 = (Interface6) Static345.method4857(arg3, arg5, arg4, jq.class);
		if (local9 != null) {
			local18 = Static249.aClass39_2.method748(local9.method5718());
			local24 = local9.method5723() & 0x3;
			local28 = local9.method5721();
			if (local18.anInt5434 != -1) {
				Static108.method1793(arg1, local24, local18, arg0, arg7);
			} else if (local28 == 9) {
				local42 = -1118482;
				if (local18.anInt5419 > 0) {
					local42 = -1179648;
				}
				if (local24 == 0 || local24 == 2) {
					arg0.method6011(arg1, arg7 + 3, arg1 + 3, arg7, local42);
				} else {
					arg0.method6011(arg1, arg7, arg1 + 3, arg7 + 3, local42);
				}
			}
		}
		local9 = (Interface6) Static115.method1883(arg3, arg5, arg4);
		if (local9 == null) {
			return;
		}
		local18 = Static249.aClass39_2.method748(local9.method5718());
		local24 = local9.method5723() & 0x3;
		if (local18.anInt5434 != -1) {
			Static108.method1793(arg1, local24, local18, arg0, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!na;[Lclient!im;I)Lclient!mv;")
	public static Class177 method2249(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class124[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong145 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg1.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg1[local31].aLong145);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static221.anIntArray340, 0);
		if (Static221.anIntArray340[0] == 0) {
			if (Static221.anIntArray340[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static221.anIntArray340, 1);
			if (Static221.anIntArray340[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static221.anIntArray340[1]];
				OpenGL.glGetInfoLogARB(local29, Static221.anIntArray340[1], Static221.anIntArray340, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static221.anIntArray340[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg1.length; local113++) {
					OpenGL.glDetachObjectARB(local29, arg1[local113].aLong145);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class177(arg0, local29, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method2251(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static380.anInt6600;
		for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
			@Pc(32) Class110 local32 = Static461.aClass34_1.method629(arg0[local24]);
			if (local32.anInt2794 != -1) {
				@Pc(45) Class41 local45 = (Class41) Static442.aClass188_57.method4158((long) local32.anInt2794);
				if (local45 == null) {
					@Pc(53) Class190 local53 = Static470.method4242(Static446.aClass171_101, local32.anInt2794, 0);
					if (local53 != null) {
						local45 = Static257.aClass75_8.method5986(local53);
						Static442.aClass188_57.method4155((long) local32.anInt2794, local45);
					}
				}
				if (local45 != null) {
					Static243.aClass41Array8[local9] = local45;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method2252() {
		Static197.aClass188_33.method4156();
	}
}
