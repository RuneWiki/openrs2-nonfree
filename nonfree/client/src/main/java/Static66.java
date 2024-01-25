import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
	public static int anInt1295;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_3 = new Class83(16);

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
	public static int anInt1306 = 0;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_1 = new Class94();

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([ILclient!wp;I[I[I)V")
	public static void method1347(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg3[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg1.aClass107Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass107Array3[local28] = null;
					} else {
						@Pc(51) Class372 local51 = Static243.aClass343_3.method8356(local18);
						@Pc(54) int local54 = local51.anInt10254;
						@Pc(59) Class107 local59 = arg1.aClass107Array3[local28];
						if (local59 != null) {
							if (local59.anInt3426 == local18) {
								if (local54 == 0) {
									local59 = arg1.aClass107Array3[local28] = null;
								} else if (local54 == 1) {
									local59.anInt3419 = 0;
									local59.anInt3421 = 1;
									local59.anInt3424 = 0;
									local59.anInt3423 = local26;
									local59.anInt3418 = 0;
									if (!arg1.aBoolean819) {
										Static548.method7844(arg1, local51, 0);
									}
								} else if (local54 == 2) {
									local59.anInt3419 = 0;
								}
							} else if (local51.anInt10249 >= Static243.aClass343_3.method8356(local59.anInt3426).anInt10249) {
								local59 = arg1.aClass107Array3[local28] = null;
							}
						}
						if (local59 == null) {
							local59 = arg1.aClass107Array3[local28] = new Class107();
							local59.anInt3418 = 0;
							local59.anInt3426 = local18;
							local59.anInt3419 = 0;
							local59.anInt3423 = local26;
							local59.anInt3421 = 1;
							local59.anInt3424 = 0;
							if (!arg1.aBoolean819) {
								Static548.method7844(arg1, local51, 0);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
	public static int method1348(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!aj;ILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class13 method1349(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static238.method4026()) {
			throw new RuntimeException("");
		} else if (Static379.method5472("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class13_Sub1_Sub1 local53 = new Class13_Sub1_Sub1(local24, arg3, local34, arg2, arg1, arg0);
			local53.method7421();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!gaa;I)Z")
	public static boolean method1350(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method3402(2);
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(104) int local104;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (local8 == 0) {
			if (arg1.method3402(1) != 0) {
				method1350(arg0, arg1);
			}
			local28 = arg1.method3402(6);
			local35 = arg1.method3402(6);
			@Pc(47) boolean local47 = arg1.method3402(1) == 1;
			if (local47) {
				Static272.anIntArray429[Static185.anInt3761++] = arg0;
			}
			if (Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(70) Class251 local70 = Static583.aClass251Array1[arg0];
			@Pc(78) Class28_Sub1_Sub1_Sub1_Sub1 local78 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[arg0] = new Class28_Sub1_Sub1_Sub1_Sub1();
			local78.anInt10762 = arg0;
			if (Static188.aClass3_Sub25Array1[arg0] != null) {
				local78.method9104(Static188.aClass3_Sub25Array1[arg0]);
			}
			local78.method9324(true, local70.anInt6812);
			local78.anInt10743 = local70.anInt6814;
			local104 = local70.anInt6816;
			local108 = local104 >> 28;
			local114 = local104 >> 14 & 0xFF;
			@Pc(118) int local118 = local104 & 0xFF;
			@Pc(127) int local127 = local28 + (local114 << 6) - Static287.anInt4910;
			local78.aBoolean793 = local70.aBoolean488;
			@Pc(140) int local140 = (local118 << 6) + local35 - Static72.anInt1361;
			local78.aBoolean792 = local70.aBoolean487;
			local78.aByteArray111[0] = Static185.aByteArray28[arg0];
			local78.aByte174 = local78.aByte173 = (byte) local108;
			if (Static488.method7052(local127, local140)) {
				local78.aByte173++;
			}
			local78.method9113(local127, local140);
			local78.aBoolean795 = false;
			Static583.aClass251Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method3402(2);
			local35 = Static583.aClass251Array1[arg0].anInt6816;
			Static583.aClass251Array1[arg0].anInt6816 = (((local35 >> 28) + local28 & 0x3) << 28) + (local35 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(239) int local239;
			@Pc(244) int local244;
			@Pc(252) int local252;
			if (local8 != 2) {
				local28 = arg1.method3402(18);
				local35 = local28 >> 16;
				local239 = local28 >> 8 & 0xFF;
				local244 = local28 & 0xFF;
				local252 = Static583.aClass251Array1[arg0].anInt6816;
				local104 = (local252 >> 28) + local35 & 0x3;
				local108 = (local252 >> 14) + local239 & 0xFF;
				local114 = local244 + local252 & 0xFF;
				Static583.aClass251Array1[arg0].anInt6816 = local114 + (local104 << 28) + (local108 << 14);
				return false;
			}
			local28 = arg1.method3402(5);
			local35 = local28 >> 3;
			local239 = local28 & 0x7;
			local244 = Static583.aClass251Array1[arg0].anInt6816;
			local252 = local35 + (local244 >> 28) & 0x3;
			local104 = local244 >> 14 & 0xFF;
			local108 = local244 & 0xFF;
			if (local239 == 0) {
				local104--;
				local108--;
			}
			if (local239 == 1) {
				local108--;
			}
			if (local239 == 2) {
				local108--;
				local104++;
			}
			if (local239 == 3) {
				local104--;
			}
			if (local239 == 4) {
				local104++;
			}
			if (local239 == 5) {
				local108++;
				local104--;
			}
			if (local239 == 6) {
				local108++;
			}
			if (local239 == 7) {
				local108++;
				local104++;
			}
			Static583.aClass251Array1[arg0].anInt6816 = local108 + (local252 << 28) + (local104 << 14);
			return false;
		}
	}
}
