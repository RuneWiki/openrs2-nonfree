import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array1;

	@OriginalMember(owner = "client!ca", name = "kb", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array2;

	@OriginalMember(owner = "client!ca", name = "lb", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array3;

	@OriginalMember(owner = "client!ca", name = "Fb", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!ca", name = "Pb", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!ca", name = "zb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_162 = Static158.method3034("Please try using a different world)3");

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_158 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "Mb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_168 = Static158.method3034("K");

	@OriginalMember(owner = "client!ca", name = "qb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_159 = aClass60_168;

	@OriginalMember(owner = "client!ca", name = "rb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_160 = aClass60_168;

	@OriginalMember(owner = "client!ca", name = "sb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_161 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "Ab", descriptor = "Lclient!ob;")
	public static Class60 aClass60_163 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "Bb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_164 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "Cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_165 = Static158.method3034("ams");

	@OriginalMember(owner = "client!ca", name = "Eb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_166 = Static158.method3034("blinken3:");

	@OriginalMember(owner = "client!ca", name = "Ib", descriptor = "Lclient!ob;")
	public static Class60 aClass60_167 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "Nb", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array5 = new Class60[500];

	@OriginalMember(owner = "client!ca", name = "Qb", descriptor = "I")
	public static int anInt705 = 0;

	@OriginalMember(owner = "client!ca", name = "Rb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_169 = aClass60_162;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([Lclient!cd;[II[III)V")
	public static void method542(@OriginalArg(0) Class14[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 <= arg2) {
			return;
		}
		@Pc(12) int local12 = arg4 + 1;
		@Pc(16) int local16 = arg2 - 1;
		@Pc(23) int local23 = (arg2 + arg4) / 2;
		@Pc(27) Class14 local27 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local27;
		while (local16 < local12) {
			@Pc(41) boolean local41 = true;
			@Pc(44) int local44;
			@Pc(59) int local59;
			@Pc(54) int local54;
			do {
				local12--;
				for (local44 = 0; local44 < 4; local44++) {
					if (arg3[local44] == 2) {
						local54 = local27.anInt764;
						local59 = arg0[local12].anInt764;
					} else if (arg3[local44] == 1) {
						local54 = local27.anInt761;
						local59 = arg0[local12].anInt761;
						if (local59 == -1 && arg1[local44] == 1) {
							local59 = 2001;
						}
						if (local54 == -1 && arg1[local44] == 1) {
							local54 = 2001;
						}
					} else if (arg3[local44] == 3) {
						local54 = local27.aBoolean27 ? 1 : 0;
						local59 = arg0[local12].aBoolean27 ? 1 : 0;
					} else {
						local54 = local27.anInt767;
						local59 = arg0[local12].anInt767;
					}
					if (local59 != local54) {
						if ((arg1[local44] != 1 || local54 >= local59) && (arg1[local44] != 0 || local54 <= local59)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			local41 = true;
			do {
				local16++;
				for (local44 = 0; local44 < 4; local44++) {
					if (arg3[local44] == 2) {
						local59 = arg0[local16].anInt764;
						local54 = local27.anInt764;
					} else if (arg3[local44] == 1) {
						local54 = local27.anInt761;
						local59 = arg0[local16].anInt761;
						if (local59 == -1 && arg1[local44] == 1) {
							local59 = 2001;
						}
						if (local54 == -1 && arg1[local44] == 1) {
							local54 = 2001;
						}
					} else if (arg3[local44] == 3) {
						local59 = arg0[local16].aBoolean27 ? 1 : 0;
						local54 = local27.aBoolean27 ? 1 : 0;
					} else {
						local54 = local27.anInt767;
						local59 = arg0[local16].anInt767;
					}
					if (local59 != local54) {
						if ((arg1[local44] != 1 || local59 >= local54) && (arg1[local44] != 0 || local54 >= local59)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			if (local16 < local12) {
				@Pc(334) Class14 local334 = arg0[local16];
				arg0[local16] = arg0[local12];
				arg0[local12] = local334;
			}
		}
		method542(arg0, arg1, arg2, arg3, local12);
		method542(arg0, arg1, local12 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)I")
	public static int method546(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZBIZ)Lclient!ca;")
	public static Class13_Sub1 method547(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class69 local10 = null;
		if (Static158.aClass40_5 != null) {
			local10 = new Class69(arg2, Static158.aClass40_5, Static1.aClass40Array1[arg2], 1000000);
		}
		return new Class13_Sub1(local10, Static118.aClass69_3, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg1 >= Static64.anInt1962 && arg1 + arg2 <= Static123.anInt3379 && arg5 - arg1 >= Static36.anInt1076 && Static117.anInt951 >= arg5 + arg1) {
			Static159.method3417(arg2, arg5, arg1, arg3, arg0, arg4);
		} else {
			Static94.method2238(arg1, arg5, arg3, arg4, arg0, arg2);
		}
	}
}
