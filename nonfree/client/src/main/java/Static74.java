import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
	public static int anInt1417;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_52 = new Class102(45, 4);

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_53 = new Class102(80, -1);

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "F")
	public static float aFloat16 = 0.25F;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIII)V")
	public static void method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static124.method879(arg4);
		@Pc(10) int local10 = 0;
		@Pc(20) int local20 = arg4 - arg3;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(32) int local32 = -arg4;
		@Pc(34) int local34 = local20;
		@Pc(37) int local37 = -local20;
		@Pc(39) int local39 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (Static219.anInt6125 <= arg1 && arg1 <= Static155.anInt2670) {
			@Pc(49) int[] local49 = Static229.anIntArrayArray26[arg1];
			local58 = Static331.method4435(arg5 - arg4, Static215.anInt3546, Static317.anInt6670);
			local66 = Static331.method4435(arg4 + arg5, Static215.anInt3546, Static317.anInt6670);
			local75 = Static331.method4435(arg5 - local20, Static215.anInt3546, Static317.anInt6670);
			local83 = Static331.method4435(arg5 + local20, Static215.anInt3546, Static317.anInt6670);
			Static216.method2862(local58, local75, arg2, local49);
			Static216.method2862(local75, local83, arg0, local49);
			Static216.method2862(local83, local66, arg2, local49);
		}
		@Pc(103) int local103 = -1;
		while (local29 > local10) {
			local103 += 2;
			local39 += 2;
			local32 += local39;
			local37 += local103;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static241.anIntArray335[local34] = local10;
			}
			local10++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(219) int[] local219;
			@Pc(149) int local149;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local149 = arg1 - local29;
				local58 = arg1 + local29;
				if (Static219.anInt6125 <= local58 && Static155.anInt2670 >= local149) {
					if (local29 < local20) {
						local66 = Static241.anIntArray335[local29];
						local75 = Static331.method4435(arg5 + local10, Static215.anInt3546, Static317.anInt6670);
						local83 = Static331.method4435(arg5 - local10, Static215.anInt3546, Static317.anInt6670);
						local203 = Static331.method4435(arg5 + local66, Static215.anInt3546, Static317.anInt6670);
						local212 = Static331.method4435(arg5 - local66, Static215.anInt3546, Static317.anInt6670);
						if (Static155.anInt2670 >= local58) {
							local219 = Static229.anIntArrayArray26[local58];
							Static216.method2862(local83, local212, arg2, local219);
							Static216.method2862(local212, local203, arg0, local219);
							Static216.method2862(local203, local75, arg2, local219);
						}
						if (local149 >= Static219.anInt6125) {
							local219 = Static229.anIntArrayArray26[local149];
							Static216.method2862(local83, local212, arg2, local219);
							Static216.method2862(local212, local203, arg0, local219);
							Static216.method2862(local203, local75, arg2, local219);
						}
					} else {
						local66 = Static331.method4435(local10 + arg5, Static215.anInt3546, Static317.anInt6670);
						local75 = Static331.method4435(arg5 - local10, Static215.anInt3546, Static317.anInt6670);
						if (Static155.anInt2670 >= local58) {
							Static216.method2862(local75, local66, arg2, Static229.anIntArrayArray26[local58]);
						}
						if (Static219.anInt6125 <= local149) {
							Static216.method2862(local75, local66, arg2, Static229.anIntArrayArray26[local149]);
						}
					}
				}
			}
			local149 = arg1 - local10;
			local58 = arg1 + local10;
			if (local58 >= Static219.anInt6125 && local149 <= Static155.anInt2670) {
				local66 = arg5 + local29;
				local75 = arg5 - local29;
				if (Static317.anInt6670 <= local66 && Static215.anInt3546 >= local75) {
					local66 = Static331.method4435(local66, Static215.anInt3546, Static317.anInt6670);
					local75 = Static331.method4435(local75, Static215.anInt3546, Static317.anInt6670);
					if (local10 >= local20) {
						if (local58 <= Static155.anInt2670) {
							Static216.method2862(local75, local66, arg2, Static229.anIntArrayArray26[local58]);
						}
						if (Static219.anInt6125 <= local149) {
							Static216.method2862(local75, local66, arg2, Static229.anIntArrayArray26[local149]);
						}
					} else {
						local83 = local10 > local34 ? Static241.anIntArray335[local10] : local34;
						local203 = Static331.method4435(local83 + arg5, Static215.anInt3546, Static317.anInt6670);
						local212 = Static331.method4435(arg5 - local83, Static215.anInt3546, Static317.anInt6670);
						if (local58 <= Static155.anInt2670) {
							local219 = Static229.anIntArrayArray26[local58];
							Static216.method2862(local75, local212, arg2, local219);
							Static216.method2862(local212, local203, arg0, local219);
							Static216.method2862(local203, local66, arg2, local219);
						}
						if (Static219.anInt6125 <= local149) {
							local219 = Static229.anIntArrayArray26[local149];
							Static216.method2862(local75, local212, arg2, local219);
							Static216.method2862(local212, local203, arg0, local219);
							Static216.method2862(local203, local66, arg2, local219);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ha;ZZI)V")
	public static void method1091(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt2585;
		@Pc(12) int local12 = (int) arg0.aLong225;
		arg0.method5703();
		if (arg2) {
			Static184.method2531(local8);
		}
		Static21.method137(local8);
		@Pc(27) Class16 local27 = Static338.method4534(local12);
		if (local27 != null) {
			Static176.method70(local27);
		}
		Static320.method4352();
		if (!arg1 && Static142.anInt2523 != -1) {
			Static361.method4757(1, Static142.anInt2523);
		}
		@Pc(57) Class18 local57 = new Class18(Static418.aClass72_44);
		for (@Pc(62) Class2_Sub21 local62 = (Class2_Sub21) local57.method266(); local62 != null; local62 = (Class2_Sub21) local57.method269()) {
			if (!local62.method5702()) {
				local62 = (Class2_Sub21) local57.method266();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt2586 == 3) {
				@Pc(88) int local88 = (int) local62.aLong225;
				if (local88 >>> 16 == local8) {
					method1091(local62, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/lang/String;Lclient!pg;)Lclient!ud;")
	public static Class242 method1096(@OriginalArg(2) String arg0, @OriginalArg(3) Class163_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static411.anIntArray562, 0);
		if (Static411.anIntArray562[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class242(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
	public static void method1099(@OriginalArg(0) int arg0) {
		Static3.anInt24 = arg0;
		@Pc(7) Class132 local7 = Static55.aClass132_7;
		synchronized (Static55.aClass132_7) {
			Static55.aClass132_7.method2698();
		}
		local7 = Static192.aClass132_24;
		synchronized (Static192.aClass132_24) {
			Static192.aClass132_24.method2698();
		}
	}
}
