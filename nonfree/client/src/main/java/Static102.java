import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public static int anInt2164;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!dh;")
	public static Class33 aClass33_16 = new Class33(20);

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "[Lclient!p;")
	public static Class4_Sub17[] aClass4_Sub17Array1 = new Class4_Sub17[2048];

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
	public static int[] anIntArray224 = new int[32];

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[5];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!tk;I)V")
	public static void method1649(@OriginalArg(0) Class164 arg0) {
		@Pc(7) Class50 local7 = null;
		try {
			@Pc(14) Class123 local14 = arg0.method3947("runescape");
			while (local14.anInt3791 == 0) {
				Static122.method2061(1L);
			}
			if (local14.anInt3791 == 1) {
				local7 = (Class50) local14.anObject4;
				@Pc(49) Class4_Sub17 local49 = Static87.method1404();
				local7.method1251(local49.aByteArray30, 0, local49.anInt2400);
			}
		} catch (@Pc(59) Exception local59) {
		}
		try {
			if (local7 != null) {
				local7.method1254();
			}
		} catch (@Pc(67) Exception local67) {
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method1650() {
		aStringArray16 = null;
		aClass4_Sub17Array1 = null;
		anIntArray224 = null;
		aClass33_16 = null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!lc;I)Lclient!hi;")
	public static Class59 method1651(@OriginalArg(1) Class98 arg0, @OriginalArg(2) int arg1) {
		return Static243.method3715(arg1, arg0) ? Static225.method3588() : null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method1652(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(18) int local18 = Static280.method4224(arg1, arg0);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(38) int local38;
			for (local38 = local25; arg1 != arg0.charAt(local38); local38++) {
			}
			local23[local27++] = arg0.substring(local25, local38);
			local25 = local38 + 1;
		}
		local23[local18] = arg0.substring(local25);
		return local23;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public static void method1653(@OriginalArg(0) int arg0) {
		Static157.method2484();
		Static19.method355();
		@Pc(12) int local12 = Static261.method3955(arg0).anInt2807;
		if (local12 == 0) {
			return;
		}
		@Pc(19) int local19 = Static221.anIntArray393[arg0];
		if (local12 == 6) {
			Static6.anInt153 = local19;
		}
		if (local12 == 5) {
			Static76.anInt1445 = local19;
		}
		if (local12 == 9) {
			Static165.anInt3293 = local19;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBII)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static141.anInt2889 < arg4 || arg2 < Static171.anInt3392) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg1 < Static211.anInt4200) {
			arg1 = Static211.anInt4200;
			local27 = false;
		} else if (arg1 <= Static154.anInt3126) {
			local27 = true;
		} else {
			local27 = false;
			arg1 = Static154.anInt3126;
		}
		@Pc(53) boolean local53;
		if (arg0 < Static211.anInt4200) {
			local53 = false;
			arg0 = Static211.anInt4200;
		} else if (arg0 > Static154.anInt3126) {
			arg0 = Static154.anInt3126;
			local53 = false;
		} else {
			local53 = true;
		}
		if (Static171.anInt3392 <= arg4) {
			Static129.method2127(arg0, arg1, arg3, Static234.anIntArrayArray40[arg4++]);
		} else {
			arg4 = Static171.anInt3392;
		}
		if (arg2 > Static141.anInt2889) {
			arg2 = Static141.anInt2889;
		} else {
			Static129.method2127(arg0, arg1, arg3, Static234.anIntArrayArray40[arg2--]);
		}
		@Pc(101) int local101;
		if (local27 && local53) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				@Pc(108) int[] local108 = Static234.anIntArrayArray40[local101];
				local108[arg1] = local108[arg0] = arg3;
			}
		} else if (local27) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				Static234.anIntArrayArray40[local101][arg1] = arg3;
			}
		} else if (local53) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				Static234.anIntArrayArray40[local101][arg0] = arg3;
			}
		}
	}
}
