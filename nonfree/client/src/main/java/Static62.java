import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!hs;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "[Lclient!mg;")
	public static Class155[] aClass155Array1;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_18 = new Class242("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_29 = new Class36(47, 3);

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)I")
	public static int method1209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBZI)I")
	public static int method1210(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub39 local15 = Static195.method2229(arg2, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray588.length; local29++) {
				if (local15.anIntArray589[local29] == arg0) {
					local27 += local15.anIntArray588[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILclient!kq;)V")
	public static void method1211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub5 arg4) {
		@Pc(4) Class53 local4 = Static444.method5715(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt7144 = (arg1 << Static372.anInt7558) + Static40.anInt1024;
		arg4.anInt7148 = arg3;
		arg4.anInt7147 = (arg2 << Static372.anInt7558) + Static40.anInt1024;
		for (@Pc(28) Class165 local28 = local4.aClass165_1; local28 != null; local28 = local28.aClass165_2) {
			if (local28.aClass6_Sub2_2.aBoolean419) {
				@Pc(38) int local38 = local28.aClass6_Sub2_2.method4752();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt7148 += local8;
			arg4.aBoolean480 = true;
		}
		local4.aClass6_Sub5_1 = arg4;
	}
}
