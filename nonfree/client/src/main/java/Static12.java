import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt206;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_19 = new Class221(45, 3);

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_12 = new Class157(39, 2);

	@OriginalMember(owner = "client!al", name = "D", descriptor = "I")
	public static int anInt213 = 104;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "S")
	public static short aShort1 = 320;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "I")
	public static int anInt215 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIII)V")
	public static void method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == arg6) {
			Static41.method4704(arg2, arg5, arg1, arg4, arg0, arg3);
		} else if (arg0 - arg2 >= Static108.anInt2266 && arg0 + arg2 <= Static205.anInt4504 && arg3 - arg6 >= Static197.anInt4298 && Static38.anInt553 >= arg6 + arg3) {
			Static334.method5448(arg5, arg6, arg2, arg4, arg3, arg1, arg0);
		} else {
			Static177.method3426(arg4, arg0, arg6, arg5, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public static void method175() {
		if (Static96.aBoolean178) {
			return;
		}
		if (Static311.aBoolean549) {
			Static99.aFloat33 = (int) Static99.aFloat33 + 47 & 0xFFFFFFF0;
		} else {
			Static90.aFloat32 += (12.0F - Static90.aFloat32) / 2.0F;
		}
		Static273.aBoolean493 = true;
		Static96.aBoolean178 = true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!ok;")
	public static Class150 method176(@OriginalArg(0) int arg0) {
		@Pc(12) Class150 local12 = (Class150) Static263.aClass107_39.method3021((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static124.aClass104_77.method2756(34, arg0);
		local12 = new Class150();
		if (local22 != null) {
			local12.method4287(arg0, new Class2_Sub12(local22));
		}
		Static263.aClass107_39.method3018((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)Z")
	public static boolean method177() {
		return Static66.aBoolean117;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII[Lclient!fh;IZ)V")
	public static void method179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) Class68 local9 = arg2[local3];
			if (local9 != null && arg3 == local9.anInt1830) {
				Static339.method5548(arg1, local9, arg0, arg4);
				Static249.method4404(arg1, local9, arg0);
				if (local9.anInt1854 > local9.anInt1881 - local9.anInt1874) {
					local9.anInt1854 = local9.anInt1881 - local9.anInt1874;
				}
				if (local9.anInt1854 < 0) {
					local9.anInt1854 = 0;
				}
				if (local9.anInt1872 > local9.anInt1894 - local9.anInt1845) {
					local9.anInt1872 = local9.anInt1894 - local9.anInt1845;
				}
				if (local9.anInt1872 < 0) {
					local9.anInt1872 = 0;
				}
				if (local9.anInt1871 == 0) {
					Static266.method4679(local9, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
	public static void method180() {
		for (@Pc(6) Class2_Sub31 local6 = (Class2_Sub31) Static103.aClass180_24.method4919(); local6 != null; local6 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			if (Static80.method1627(local6.anInt5368)) {
				Static110.method2141(local6);
			}
		}
		if (Static225.anInt4918 == 1) {
			Static258.aBoolean470 = false;
			Static237.method4317(Static118.anInt2499, Static130.anInt2766, Static118.anInt2488, Static220.anInt4855);
			return;
		}
		Static237.method4317(Static118.anInt2499, Static130.anInt2766, Static118.anInt2488, Static220.anInt4855);
		@Pc(48) int local48 = Static99.aClass82_3.method2230(Static251.aClass140_124.method4155(Static239.anInt2803));
		for (@Pc(53) Class2_Sub31 local53 = (Class2_Sub31) Static103.aClass180_24.method4919(); local53 != null; local53 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			@Pc(61) int local61 = Static309.method5160(local53);
			if (local61 > local48) {
				local48 = local61;
			}
		}
		Static130.anInt2766 = Static225.anInt4918 * 16 + (Static257.aBoolean463 ? 26 : 22);
		Static118.anInt2488 = local48 + 8;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
	public static int method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 <= arg2) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method188(@OriginalArg(0) Class2_Sub12 arg0) {
		if (arg0.aByteArray30.length - arg0.anInt3606 < 1) {
			return;
		}
		@Pc(31) int local31 = arg0.method3124();
		if (local31 < 0 || local31 > 1 || arg0.aByteArray30.length - arg0.anInt3606 < 2) {
			return;
		}
		@Pc(53) int local53 = arg0.method3104();
		if (local53 * 6 != arg0.aByteArray30.length - arg0.anInt3606) {
			return;
		}
		while (true) {
			@Pc(69) int local69;
			@Pc(73) int local73;
			do {
				do {
					do {
						if (arg0.aByteArray30.length <= arg0.anInt3606) {
							return;
						}
						local69 = arg0.method3104();
						local73 = arg0.method3135();
					} while (local69 >= Static20.anIntArray40.length);
				} while (!Static18.aBooleanArray4[local69]);
			} while (Static111.method2169(local69).aChar5 == '1' && (local73 < -1 || local73 > 1));
			Static20.anIntArray40[local69] = local73;
		}
	}
}
