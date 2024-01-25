import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_6 = new Class211();

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
	public static final int[] anIntArray114 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method1813(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class183 local3 = new Class183();
		local3.anInt5557 = arg1 >> 7;
		local3.anInt5555 = arg2 >> 7;
		local3.anInt5548 = arg3 >> 7;
		local3.anInt5552 = arg4 >> 7;
		local3.anInt5549 = arg0;
		local3.anInt5556 = arg1;
		local3.anInt5564 = arg2;
		local3.anInt5550 = arg3;
		local3.anInt5553 = arg4;
		local3.anInt5551 = arg5;
		local3.anInt5561 = arg6;
		Static225.aClass183Array1[Static5.anInt176++] = local3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
	public static void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class6 local17 = Static115.aClass6ArrayArray1[arg1][arg0];
		if (local17 != null) {
			Static252.anInt4902 = local17.anInt192;
			Static13.anInt468 = local17.anInt191;
			Static34.anInt909 = local17.anInt182;
		}
		Static261.method4493();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!sa;")
	public static Class25_Sub1 method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class103 local14 = local7.aClass103_1; local14 != null; local14 = local14.aClass103_2) {
			@Pc(18) Class25_Sub1 local18 = local14.aClass25_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort76 == arg1 && local18.aShort75 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!sa;Z)Z")
	public static boolean method1817(@OriginalArg(0) Class25_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static130.aClass3Array2 == Static93.aClass3Array1;
		@Pc(8) int local8 = 0;
		arg0.method5095();
		if (arg0.aShort76 < 0 || arg0.aShort75 < 0 || arg0.aShort73 >= Static12.anInt378 || arg0.aShort74 >= Static248.anInt4822) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort76; local30 <= arg0.aShort73; local30++) {
			for (local34 = arg0.aShort75; local34 <= arg0.aShort74; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort76) {
					local37++;
				}
				if (local30 < arg0.aShort73) {
					local37 += 4;
				}
				if (local34 > arg0.aShort75) {
					local37 += 8;
				}
				if (local34 < arg0.aShort74) {
					local37 += 2;
				}
				Static168.method3164(arg0.aByte62, local30, local34);
				@Pc(71) Class51 local71 = Static138.aClass51ArrayArrayArray1[arg0.aByte62][local30][local34];
				@Pc(76) Class103 local76 = Static316.method5380(local37, arg0);
				@Pc(79) Class103 local79 = local71.aClass103_1;
				if (local79 == null) {
					local71.aClass103_1 = local76;
				} else {
					while (local79.aClass103_2 != null) {
						local79 = local79.aClass103_2;
					}
					local79.aClass103_2 = local76;
				}
				local71.aByte12 = (byte) (local71.aByte12 | local37);
				if (local6 && Static267.anIntArrayArray40[local30][local34] != 0) {
					local8 = Static267.anIntArrayArray40[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort76; local34 <= arg0.aShort73; local34++) {
				for (local37 = arg0.aShort75; local37 <= arg0.aShort74; local37++) {
					if (Static267.anIntArrayArray40[local34][local37] == 0) {
						Static267.anIntArrayArray40[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static108.aClass25_Sub1Array3[Static77.anInt1849++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static169.anInt3450; local3++) {
			@Pc(9) Rectangle local9 = Class5_Sub3.aRectangleArray3[local3];
			if (local9.x + local9.width > arg1 && arg1 + arg2 > local9.x && arg0 < local9.height + local9.y && arg0 + arg3 > local9.y) {
				Static39.aBooleanArray3[local3] = true;
			}
		}
	}
}
