import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
	public static int anInt8612;

	@OriginalMember(owner = "client!sea", name = "n", descriptor = "Lclient!at;")
	public static Class20 aClass20_47;

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
	public static int anInt8609 = -1;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "([Lclient!lo;ILclient!vf;)Lclient!ir;")
	public static Class175 method7425(@OriginalArg(0) Class224[] arg0, @OriginalArg(2) Class100_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong166 <= 0L) {
				return null;
			}
		}
		if (3 != 3) {
			anInt8609 = 96;
		}
		@Pc(47) long local47 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(49) int local49 = 0; local49 < arg0.length; local49++) {
			OpenGL.glAttachObjectARB(local47, arg0[local49].aLong166);
		}
		OpenGL.glLinkProgramARB(local47);
		OpenGL.glGetObjectParameterivARB(local47, 35714, Static413.anIntArray416, 0);
		if (Static413.anIntArray416[0] == 0) {
			if (Static413.anIntArray416[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local47, 35716, Static413.anIntArray416, 1);
			if (Static413.anIntArray416[1] > 1) {
				@Pc(110) byte[] local110 = new byte[Static413.anIntArray416[1]];
				OpenGL.glGetInfoLogARB(local47, Static413.anIntArray416[1], Static413.anIntArray416, 0, local110, 0);
				System.out.println(new String(local110));
			}
			if (Static413.anIntArray416[0] == 0) {
				for (@Pc(134) int local134 = 0; local134 < arg0.length; local134++) {
					OpenGL.glDetachObjectARB(local47, arg0[local134].aLong166);
				}
				OpenGL.glDeleteObjectARB(local47);
				return null;
			}
		}
		return new Class175(arg1, local47, arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static352.method5185(arg7, arg5, arg1)) {
			return false;
		}
		@Pc(16) int local16 = Static93.anIntArray88[2];
		@Pc(20) int local20 = Static93.anIntArray88[0];
		@Pc(24) int local24 = Static93.anIntArray88[1];
		if (!Static352.method5185(arg4, arg8, arg0)) {
			return false;
		}
		@Pc(37) int local37 = Static93.anIntArray88[2];
		@Pc(49) int local49 = Static93.anIntArray88[1];
		@Pc(53) int local53 = Static93.anIntArray88[0];
		if (Static352.method5185(arg3, arg6, arg2)) {
			@Pc(66) int local66 = Static93.anIntArray88[1];
			@Pc(70) int local70 = Static93.anIntArray88[2];
			@Pc(74) int local74 = Static93.anIntArray88[0];
			return Static550.method4219(local49, local24, local53, local74, local37, local20, local70, local16, local66);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)I")
	public static int method7428() {
		if (Static388.aClass238_11 == null) {
			if (!Static490.aBoolean536 && Static396.aClass5_Sub1_Sub13_2 != null) {
				return Static396.aClass5_Sub1_Sub13_2.anInt6065;
			}
			@Pc(27) int local27 = Static300.aClass164_1.method4999();
			@Pc(31) int local31 = Static300.aClass164_1.method5000();
			@Pc(56) int local56;
			@Pc(58) int local58;
			@Pc(76) int local76;
			@Pc(155) Class5_Sub1_Sub13 local155;
			if (Static83.aBoolean120) {
				@Pc(318) Class153 local318;
				if (Static32.anInt5104 < local27 && Static32.anInt5104 + Static482.anInt7810 > local27) {
					local56 = -1;
					for (local58 = 0; local58 < Static530.anInt8424; local58++) {
						if (Static116.aBoolean570) {
							local76 = local58 * 16 + Static619.anInt9981 + 33;
							if (local31 > local76 - 13 && local31 <= local76 + 3) {
								local56 = local58;
							}
						} else {
							local76 = Static619.anInt9981 + local58 * 16 + 31;
							if (local76 - 13 < local31 && local31 <= local76 + 3) {
								local56 = local58;
							}
						}
					}
					if (local56 != -1) {
						local76 = 0;
						local318 = new Class153(Static244.aClass388_5);
						for (@Pc(444) Class5_Sub1_Sub20 local444 = (Class5_Sub1_Sub20) local318.method3423(); local444 != null; local444 = (Class5_Sub1_Sub20) local318.method3425()) {
							if (local76++ == local56) {
								return ((Class5_Sub1_Sub13) local444.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65).anInt6065;
							}
						}
					}
				} else if (Static272.aClass5_Sub1_Sub20_1 != null && local27 > Static240.anInt4167 && Static240.anInt4167 + Static498.anInt8035 > local27) {
					local56 = -1;
					for (local58 = 0; local58 < Static272.aClass5_Sub1_Sub20_1.anInt9857; local58++) {
						if (Static116.aBoolean570) {
							local76 = Static145.anInt2900 + local58 * 16 + 33;
							if (local76 - 13 < local31 && local76 + 3 >= local31) {
								local56 = local58;
							}
						} else {
							local76 = Static145.anInt2900 + local58 * 16 + 31;
							if (local31 > local76 - 13 && local76 + 3 >= local31) {
								local56 = local58;
							}
						}
					}
					if (local56 != -1) {
						local76 = 0;
						local318 = new Class153(Static272.aClass5_Sub1_Sub20_1.aClass388_14);
						for (local155 = (Class5_Sub1_Sub13) local318.method3423(); local155 != null; local155 = (Class5_Sub1_Sub13) local318.method3425()) {
							if (local76++ == local56) {
								return local155.anInt6065;
							}
						}
					}
				}
			} else if (Static32.anInt5104 < local27 && local27 < Static32.anInt5104 + Static482.anInt7810) {
				local56 = -1;
				for (local58 = 0; local58 < Static651.anInt10662; local58++) {
					if (Static116.aBoolean570) {
						local76 = (Static651.anInt10662 - local58 - 1) * 16 + Static619.anInt9981 + 33;
						if (local31 > local76 - 13 && local31 <= local76 + 3) {
							local56 = local58;
						}
					} else {
						local76 = (Static651.anInt10662 - local58 - 1) * 16 + Static619.anInt9981 + 31;
						if (local31 > local76 - 13 && local31 <= local76 + 3) {
							local56 = local58;
						}
					}
				}
				if (local56 != -1) {
					local76 = 0;
					@Pc(150) Class215 local150 = new Class215(Static399.aClass20_33);
					for (local155 = (Class5_Sub1_Sub13) local150.method4913(); local155 != null; local155 = (Class5_Sub1_Sub13) local150.method4911()) {
						if (local56 == local76++) {
							return local155.anInt6065;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	public static void method7430() {
		@Pc(7) int local7 = Static274.anInt4921;
		@Pc(9) int[] local9 = Static605.anIntArray544;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2_Sub1 local24 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt6873 > 0) {
				local24.anInt6873--;
				if (local24.anInt6873 == 0) {
					local24.aString79 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static438.anInt7239; local57++) {
			@Pc(64) long local64 = (long) Static558.anIntArray500[local57];
			@Pc(70) Class5_Sub9 local70 = (Class5_Sub9) Static677.aClass306_37.method6943(local64);
			if (local70 != null) {
				@Pc(75) Class4_Sub1_Sub1_Sub2_Sub2 local75 = local70.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				if (local75.anInt6873 > 0) {
					local75.anInt6873--;
					if (local75.anInt6873 == 0) {
						local75.aString79 = null;
					}
				}
			}
		}
	}
}
