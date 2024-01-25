import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!iq;")
	public static Class104 aClass104_152;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static int anInt5915;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_140 = new Class140("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt5913 = 0;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static int anInt5914 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public static int anInt5916 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method5002() {
		Static198.aByteArrayArrayArray8 = null;
		Static335.aByteArrayArrayArray13 = null;
		Static178.anIntArray529 = null;
		Static314.aByteArrayArrayArray11 = null;
		Static363.anIntArray536 = null;
		Static311.anIntArray475 = null;
		Static327.anIntArrayArrayArray12 = null;
		Static209.anIntArray531 = null;
		Static182.aByteArrayArrayArray3 = null;
		Static190.anIntArray481 = null;
		Static18.aByteArrayArrayArray1 = null;
		Static2.anIntArray5 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!jk;I)V")
	public static void method5003(@OriginalArg(0) Class2_Sub12_Sub2 arg0) {
		arg0.method3165();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static9.anInt173; local12++) {
			local18 = Static195.anIntArray322[local12];
			if ((Static157.aByteArray31[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static157.aByteArray31[local18] = (byte) (Static157.aByteArray31[local18] | 0x2);
				} else {
					local49 = arg0.method3172(1);
					if (local49 == 0) {
						local10 = Static87.method1734(arg0);
						Static157.aByteArray31[local18] = (byte) (Static157.aByteArray31[local18] | 0x2);
					} else {
						Static72.method1483(arg0, local18);
					}
				}
			}
		}
		arg0.method3164();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3165();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static9.anInt173; local18++) {
			local49 = Static195.anIntArray322[local18];
			if ((Static157.aByteArray31[local49] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static157.aByteArray31[local49] = (byte) (Static157.aByteArray31[local49] | 0x2);
				} else {
					local124 = arg0.method3172(1);
					if (local124 == 0) {
						local10 = Static87.method1734(arg0);
						Static157.aByteArray31[local49] = (byte) (Static157.aByteArray31[local49] | 0x2);
					} else {
						Static72.method1483(arg0, local49);
					}
				}
			}
		}
		arg0.method3164();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3165();
		@Pc(201) int local201;
		for (local49 = 0; local49 < Static132.anInt2839; local49++) {
			local124 = Static228.anIntArray389[local49];
			if ((Static157.aByteArray31[local124] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static157.aByteArray31[local124] = (byte) (Static157.aByteArray31[local124] | 0x2);
				} else {
					local201 = arg0.method3172(1);
					if (local201 == 0) {
						local10 = Static87.method1734(arg0);
						Static157.aByteArray31[local124] = (byte) (Static157.aByteArray31[local124] | 0x2);
					} else if (Static356.method5686(local124, arg0)) {
						Static157.aByteArray31[local124] = (byte) (Static157.aByteArray31[local124] | 0x2);
					}
				}
			}
		}
		arg0.method3164();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3165();
		for (local124 = 0; local124 < Static132.anInt2839; local124++) {
			local201 = Static228.anIntArray389[local124];
			if ((Static157.aByteArray31[local201] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static157.aByteArray31[local201] = (byte) (Static157.aByteArray31[local201] | 0x2);
				} else {
					@Pc(301) int local301 = arg0.method3172(1);
					if (local301 == 0) {
						local10 = Static87.method1734(arg0);
						Static157.aByteArray31[local201] = (byte) (Static157.aByteArray31[local201] | 0x2);
					} else if (Static356.method5686(local201, arg0)) {
						Static157.aByteArray31[local201] = (byte) (Static157.aByteArray31[local201] | 0x2);
					}
				}
			}
		}
		arg0.method3164();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static132.anInt2839 = 0;
		Static9.anInt173 = 0;
		for (local201 = 1; local201 < 2048; local201++) {
			Static157.aByteArray31[local201] = (byte) (Static157.aByteArray31[local201] >> 1);
			@Pc(373) Class1_Sub2_Sub3_Sub1 local373 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local201];
			if (local373 == null) {
				Static228.anIntArray389[Static132.anInt2839++] = local201;
			} else {
				Static195.anIntArray322[Static9.anInt173++] = local201;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mr;Z)V")
	public static void method5004(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static6.anInt91 == arg0.anInt6933 || arg0.anInt6915 == -1 || arg0.anInt6900 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class84 local26 = Static91.method1822(arg0.anInt6915);
			if (local26.aBoolean235 || local26.anIntArray198[arg0.anInt6895] < arg0.anInt6921 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(53) int local53 = arg0.anInt6933 - arg0.anInt6956;
			@Pc(59) int local59 = Static6.anInt91 - arg0.anInt6956;
			@Pc(71) int local71 = arg0.anInt6910 * 128 + arg0.method5787() * 64;
			@Pc(82) int local82 = arg0.anInt6918 * 128 + arg0.method5787() * 64;
			@Pc(93) int local93 = arg0.anInt6911 * 128 + arg0.method5787() * 64;
			@Pc(104) int local104 = arg0.lb * 128 + arg0.method5787() * 64;
			arg0.anInt6893 = (local71 * (local53 - local59) + local93 * local59) / local53;
			arg0.anInt6888 = ((local53 - local59) * local82 + local59 * local104) / local53;
		}
		arg0.anInt6964 = 0;
		if (arg0.anInt6950 == 0) {
			arg0.method5785(8192);
		}
		if (arg0.anInt6950 == 1) {
			arg0.method5785(12288);
		}
		if (arg0.anInt6950 == 2) {
			arg0.method5785(0);
		}
		if (arg0.anInt6950 == 3) {
			arg0.method5785(4096);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILclient!fh;ILclient!or;IILclient!dr;)V")
	public static void method5006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class124 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class37 arg7) {
		@Pc(9) Class66 local9 = Static312.method5209(arg1);
		if (local9 == null || !local9.aBoolean157 || !local9.method1811()) {
			return;
		}
		@Pc(41) int local41;
		if (local9.anIntArray137 != null) {
			@Pc(39) int[] local39 = new int[local9.anIntArray137.length];
			@Pc(53) int local53;
			for (local41 = 0; local41 < local39.length / 2; local41++) {
				if (Static135.anInt2910 == 4) {
					local53 = (int) Static366.aFloat48 & 0x3FFF;
				} else {
					local53 = Static85.anInt1601 + (int) Static366.aFloat48 & 0x3FFF;
				}
				@Pc(66) int local66 = Class101.anIntArray234[local53];
				@Pc(70) int local70 = Class101.anIntArray235[local53];
				if (Static135.anInt2910 != 4) {
					local66 = local66 * 256 / (Static267.anInt5561 + 256);
					local70 = local70 * 256 / (Static267.anInt5561 + 256);
				}
				local39[local41 * 2] = arg5 + arg2.anInt1874 / 2 + ((arg6 + local9.anIntArray137[local41 * 2] * 4) * local70 + (arg0 + local9.anIntArray137[local41 * 2 + 1] * 4) * local66 >> 15);
				local39[local41 * 2 + 1] = arg3 + arg2.anInt1845 / 2 - (local70 * (local9.anIntArray137[local41 * 2 + 1] * 4 + arg0) - local66 * (arg6 + local9.anIntArray137[local41 * 2] * 4) >> 15);
			}
			Static277.method4765(arg7, local39, local9.anInt1763, arg2.anIntArray142, arg2.anIntArray147);
			for (local53 = 0; local53 < local39.length / 2 - 1; local53++) {
				arg7.method3673(local39[local53 * 2], local39[local53 * 2 + 1], local39[(local53 + 1) * 2], local39[(local53 + 1) * 2 + 1], local9.anInt1742, arg4, arg5, arg3);
			}
			arg7.method3673(local39[local39.length - 2], local39[local39.length - 1], local39[0], local39[1], local9.anInt1742, arg4, arg5, arg3);
		}
		@Pc(279) Class46 local279 = null;
		if (local9.anInt1739 != -1) {
			local279 = local9.method1805(arg7, false);
			if (local279 != null) {
				Static343.method3355(local279, arg4, arg2, arg3, arg5, arg6, arg0);
			}
		}
		if (local9.aString18 == null) {
			return;
		}
		local41 = 0;
		if (local279 != null) {
			local41 = local279.method5023();
		}
		@Pc(312) Class71 local312 = Static295.aClass71_5;
		@Pc(314) Class82 local314 = Static142.aClass82_6;
		if (local9.anInt1746 == 1) {
			local314 = Static213.aClass82_7;
			local312 = Static272.aClass71_4;
		}
		if (local9.anInt1746 == 2) {
			local312 = Static25.aClass71_1;
			local314 = Static99.aClass82_3;
		}
		Static157.method3242(local41, local314, arg2, arg0, arg5, arg3, arg6, local312, arg4, local9.aString18, local9.anInt1747);
		return;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!iq;ZILclient!iq;)V")
	public static void method5007(@OriginalArg(1) Class104 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class104 arg2) {
		Static105.aClass104_70 = arg0;
		Static244.aClass104_134 = arg2;
		Static288.aBoolean514 = true;
		Static311.anInt6168 = arg1;
	}
}
