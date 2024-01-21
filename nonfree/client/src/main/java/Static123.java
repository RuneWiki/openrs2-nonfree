import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!n", name = "f", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
	public static final int[] anIntArray275 = new int[32];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "[Lclient!o;")
	public static final Class67[] aClass67Array1 = new Class67[24];

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public static int anInt2756 = -1;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_820 = Static181.method2795(":clan:");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt2757 = 1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static155.anIntArrayArrayArray8[arg0][local16][local20] == -Static18.anInt2019) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static27.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5;
			if (!Static166.method2577(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static166.method2577(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static166.method2577(local20, local156, local182)) {
				return false;
			} else if (Static166.method2577(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static101.method1745(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static166.method2577(local16 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5, local20 + 1) && Static166.method2577(local16 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static166.method2577(local16 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static166.method2577(local16 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method2100(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static183.aBoolean46) {
			try {
				@Pc(20) Class11 local20 = (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
				local20.method1826(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static183.aBoolean46 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)[Lclient!nb;")
	public static Class2_Sub2_Sub17[] method2101() {
		@Pc(16) Class2_Sub2_Sub17[] local16 = new Class2_Sub2_Sub17[Static200.anInt3968];
		for (@Pc(18) int local18 = 0; local18 < Static200.anInt3968; local18++) {
			@Pc(28) int local28 = Static163.anIntArray314[local18] * Static131.anIntArray284[local18];
			@Pc(32) byte[] local32 = Static151.aByteArrayArray14[local18];
			@Pc(35) int[] local35 = new int[local28];
			for (@Pc(37) int local37 = 0; local37 < local28; local37++) {
				local35[local37] = Static153.anIntArray317[local32[local37] & 0xFF];
			}
			local16[local18] = new Class2_Sub2_Sub17_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[local18], Static124.anIntArray251[local18], Static163.anIntArray314[local18], Static131.anIntArray284[local18], local35);
		}
		Static17.method372();
		return local16;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILclient!rb;JLclient!rb;Lclient!rb;)V")
	public static void method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) Class24 arg7) {
		@Pc(3) Class104 local3 = new Class104();
		local3.aClass24_8 = arg4;
		local3.anInt4060 = arg1 * 128 + 64;
		local3.anInt4061 = arg2 * 128 + 64;
		local3.anInt4062 = arg3;
		local3.aLong142 = arg5;
		local3.aClass24_7 = arg6;
		local3.aClass24_9 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub23 local42 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3554; local46++) {
				@Pc(52) Class78 local52 = local42.aClass78Array3[local46];
				if ((local52.aLong107 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass24_4.method2978();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4065 = -local34;
		if (Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub23(arg0, arg1, arg2);
		}
		Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass104_1 = local3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
	public static void method2103() {
		Static19.anInt540 = -1;
		Static138.aClass28_139 = null;
		Static137.anInt2903 = 2;
		Static211.anInt4194 = 0;
		Static92.anInt1969 = 1;
		Static156.anInt4252 = -1;
		Static207.aBoolean188 = false;
	}
}
