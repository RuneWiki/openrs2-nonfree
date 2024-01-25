import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!bo;")
	public static Class32 aClass32_2;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "[S")
	public static final short[] aShortArray129 = new short[] { 25, 51, 19, 13, 59, 48, 44, 45 };

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray105 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static final int anInt7980 = 1337;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static int anInt7981 = 0;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_17 = new Class31(11, 0, 1, 2);

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_121 = new Class306("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
	public static int method6618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!dg;ILclient!jj;)V")
	public static void method6619(@OriginalArg(0) int arg0, @OriginalArg(2) Class49_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub6_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(29) int local29;
		if ((arg2 & 0x2) != 0) {
			local18 = arg3.method3967();
			if (local18 == 65535) {
				local18 = -1;
			}
			local29 = arg3.method3941();
			Static400.method6040(arg1, local18, local29);
		}
		@Pc(48) int local48;
		if ((arg2 & 0x20000) != 0) {
			local18 = Static436.anInt6850;
			local29 = arg3.method3936();
			local48 = arg3.method3918();
			arg1.method3795(local18, local48, local29);
		}
		if ((arg2 & 0x200) != 0) {
			local18 = arg3.method3918();
			@Pc(68) int[] local68 = new int[local18];
			@Pc(71) int[] local71 = new int[local18];
			@Pc(74) int[] local74 = new int[local18];
			for (@Pc(76) int local76 = 0; local76 < local18; local76++) {
				@Pc(82) int local82 = arg3.method3914();
				if (local82 == 65535) {
					local82 = -1;
				}
				local68[local76] = local82;
				local71[local76] = arg3.method3912();
				local74[local76] = arg3.method3967();
			}
			Static125.method2134(local74, arg1, local71, local68);
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt1760 = arg3.method3967();
			if (arg1.anInt4338 == 0) {
				arg1.method3783(arg1.anInt1760);
				arg1.anInt1760 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			local18 = arg3.method3914();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg1.anInt4323 = local18;
		}
		if ((arg2 & 0x4) != 0) {
			local18 = arg3.method3916();
			if (local18 == 65535) {
				local18 = -1;
			}
			local29 = arg3.method3955();
			local48 = arg3.method3941();
			arg1.method3796(local29, false, local18, local48);
		}
		if ((arg2 & 0x4000) != 0) {
			arg1.anInt4267 = arg3.method3944();
			arg1.anInt4285 = arg3.method3944();
			arg1.anInt4309 = arg3.method3928();
			arg1.anInt4320 = arg3.method3928();
			arg1.anInt4322 = arg3.method3916() + Static436.anInt6850;
			arg1.anInt4278 = arg3.method3943() + Static436.anInt6850;
			arg1.anInt4271 = arg3.method3912();
			arg1.anInt4339 = 0;
			if (arg1.aBoolean112) {
				arg1.anInt4285 += arg1.anInt1761;
				arg1.anInt4320 += arg1.anInt1761;
				arg1.anInt4338 = 0;
				arg1.anInt4267 += arg1.anInt1745;
				arg1.anInt4309 += arg1.anInt1745;
			} else {
				arg1.anInt4338 = 1;
				arg1.anInt4320 += arg1.anIntArray427[0];
				arg1.anInt4267 += arg1.anIntArray428[0];
				arg1.anInt4285 += arg1.anIntArray427[0];
				arg1.anInt4309 += arg1.anIntArray428[0];
			}
		}
		if ((arg2 & 0x10) != 0) {
			local18 = arg3.method3936();
			local29 = arg3.method3918();
			arg1.method3795(Static436.anInt6850, local29, local18);
			arg1.anInt4279 = Static436.anInt6850 + 300;
			arg1.anInt4311 = arg3.method3912();
		}
		if ((arg2 & 0x800) != 0) {
			local18 = arg3.method3967();
			local29 = arg3.method3925();
			if (local18 == 65535) {
				local18 = -1;
			}
			local48 = arg3.method3941();
			arg1.method3796(local29, true, local18, local48);
		}
		if ((arg2 & 0x400) != 0) {
			local7 = arg3.method3911();
		}
		if ((arg2 & 0x2000) != 0) {
			arg1.aBoolean111 = arg3.method3918() == 1;
		}
		if ((arg2 & 0x1) != 0) {
			local18 = arg3.method3922();
			@Pc(408) byte[] local408 = new byte[local18];
			@Pc(413) Class1_Sub6 local413 = new Class1_Sub6(local408);
			arg3.method3963(local408, local18);
			Static243.aClass1_Sub6Array1[arg0] = local413;
			arg1.method1533(local413);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.aString40 = arg3.method3954();
			if (arg1.aString40.charAt(0) == '~') {
				arg1.aString40 = arg1.aString40.substring(1);
				Static363.method5419(arg1.aString40, 0, arg1.method1535(), 2, arg1.method1531());
			} else if (Static63.aClass49_Sub2_Sub2_Sub1_1 == arg1) {
				Static363.method5419(arg1.aString40, 0, arg1.method1535(), 2, arg1.method1531());
			}
			arg1.anInt4269 = 0;
			arg1.anInt4332 = 150;
			arg1.anInt4335 = 0;
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte55 = arg3.method3928();
			arg1.aByte58 = arg3.method3944();
			arg1.aByte57 = arg3.method3911();
			arg1.aByte56 = (byte) arg3.method3941();
			arg1.anInt4261 = Static436.anInt6850 + arg3.method3943();
			arg1.anInt4326 = Static436.anInt6850 + arg3.method3914();
		}
		if ((arg2 & 0x8) != 0) {
			Static166.aByteArray44[arg0] = arg3.method3910();
		}
		if ((arg2 & 0x1000) != 0) {
			local18 = arg3.method3916();
			arg1.anInt4276 = arg3.method3918();
			arg1.anInt4299 = arg3.method3941();
			arg1.anInt4321 = local18 & 0x7FFF;
			arg1.aBoolean305 = (local18 & 0x8000) != 0;
			arg1.anInt4280 = arg1.anInt4276 + Static436.anInt6850 + arg1.anInt4321;
		}
		if (!arg1.aBoolean112) {
			return;
		}
		if (local7 == 127) {
			arg1.method1540(arg1.anInt1745, arg1.anInt1761);
			return;
		}
		@Pc(612) byte local612;
		if (local7 == -1) {
			local612 = Static166.aByteArray44[arg0];
		} else {
			local612 = local7;
		}
		arg1.method1538(arg1.anInt1745, local612, arg1.anInt1761);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	public static int method6620() {
		return Static289.anInt5474++;
	}
}
