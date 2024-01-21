import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Lclient!uf;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
	public static final int[] anIntArray469 = new int[100];

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
	public static int anInt3888 = 0;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
	public static int anInt3889 = 0;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1497 = Static120.method1824("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
	public static int anInt3892 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIB)I")
	public static int method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 2 << 10) + (arg2 >> 5 << 7);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static61.method895(arg6, Static34.anInt790, Static17.anInt440);
		@Pc(25) int local25 = Static61.method895(arg2, Static34.anInt790, Static17.anInt440);
		@Pc(31) int local31 = Static61.method895(arg3, Static172.anInt3861, Static85.anInt1779);
		@Pc(37) int local37 = Static61.method895(arg4, Static172.anInt3861, Static85.anInt1779);
		@Pc(45) int local45 = Static61.method895(arg5 + arg6, Static34.anInt790, Static17.anInt440);
		@Pc(54) int local54 = Static61.method895(arg2 - arg5, Static34.anInt790, Static17.anInt440);
		for (@Pc(56) int local56 = local19; local56 < local45; local56++) {
			Static46.method726(local31, arg0, Static96.anIntArrayArray27[local56], local37);
		}
		for (@Pc(76) int local76 = local25; local76 > local54; local76--) {
			Static46.method726(local31, arg0, Static96.anIntArrayArray27[local76], local37);
		}
		@Pc(98) int local98 = Static61.method895(arg3 + arg5, Static172.anInt3861, Static85.anInt1779);
		@Pc(107) int local107 = Static61.method895(arg4 - arg5, Static172.anInt3861, Static85.anInt1779);
		for (@Pc(109) int local109 = local45; local109 <= local54; local109++) {
			@Pc(115) int[] local115 = Static96.anIntArrayArray27[local109];
			Static46.method726(local31, arg0, local115, local98);
			Static46.method726(local98, arg1, local115, local107);
			Static46.method726(local107, arg0, local115, local37);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!qf;)Lclient!qf;")
	public static Class77 method2789(@OriginalArg(1) Class77 arg0) {
		@Pc(11) Class77 local11 = Static23.method368(arg0);
		if (local11 == null) {
			local11 = arg0.aClass77_13;
		}
		return local11;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)I")
	public static int method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)Lclient!bh;")
	public static Class3_Sub1_Sub2 method2793(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) Static162.aClass5_50.method139((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static192.aClass1_33.method60(Static26.method423(arg0), Static112.method1743(arg0));
		local6 = new Class3_Sub1_Sub2();
		local6.anInt351 = arg0;
		if (local24 != null) {
			local6.method266(new Class3_Sub17(local24));
		}
		local6.method275();
		if (local6.anInt362 != -1) {
			local6.method265(method2793(local6.anInt362), method2793(local6.anInt374));
		}
		if (!Static150.aBoolean137 && local6.aBoolean23) {
			local6.aClass80Array4 = null;
			local6.aBoolean22 = false;
			local6.aClass80Array3 = null;
			local6.aClass80_116 = Static118.aClass80_1031;
			local6.anInt350 = 0;
		}
		Static162.aClass5_50.method145(local6, (long) arg0);
		return local6;
	}
}
