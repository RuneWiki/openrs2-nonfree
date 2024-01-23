import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ng", name = "Yb", descriptor = "I")
	public static int anInt3147;

	@OriginalMember(owner = "client!ng", name = "Zb", descriptor = "Lclient!ea;")
	public static Class2_Sub3 aClass2_Sub3_5;

	@OriginalMember(owner = "client!ng", name = "Z", descriptor = "Lclient!id;")
	public static Class43 aClass43_13 = new Class43(64);

	@OriginalMember(owner = "client!ng", name = "Mb", descriptor = "Lclient!i;")
	public static Class41 aClass41_859 = Static184.method2923("(U");

	@OriginalMember(owner = "client!ng", name = "Wb", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ng", name = "Xb", descriptor = "[Lclient!jj;")
	public static Class51[] aClass51Array2 = new Class51[5000];

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)V")
	public static void method2137(@OriginalArg(0) int arg0) {
		if (!Static187.method2974(arg0)) {
			return;
		}
		@Pc(21) Class80[] local21 = Static68.aClass80ArrayArray1[arg0];
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(29) Class80 local29 = local21[local23];
			if (local29 != null) {
				local29.anInt3687 = 0;
				local29.anInt3634 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Object;Lclient!qg;)V")
	public static void method2138(@OriginalArg(1) Object arg0, @OriginalArg(2) Class83 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static19.method344(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!nb;I)V")
	public static void method2139(@OriginalArg(0) Class15 arg0) {
		Static93.aClass15_21 = arg0;
		Static26.anInt657 = Static93.aClass15_21.method390(16);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)Z")
	public static boolean method2149(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!nc;III)V")
	public static void method2150(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub7 local12;
		if (arg2 < Static44.anInt1331) {
			local12 = Static27.aClass2_Sub7ArrayArrayArray4[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass78_1 != null && local12.aClass78_1.aClass12_7.method2716()) {
				arg0.method2714(local12.aClass78_1.aClass12_7, 128, 0, 0, true);
			}
		}
		if (arg3 < Static44.anInt1331) {
			local12 = Static27.aClass2_Sub7ArrayArrayArray4[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass78_1 != null && local12.aClass78_1.aClass12_7.method2716()) {
				arg0.method2714(local12.aClass78_1.aClass12_7, 0, 0, 128, true);
			}
		}
		if (arg2 < Static44.anInt1331 && arg3 < Static59.anInt1642) {
			local12 = Static27.aClass2_Sub7ArrayArrayArray4[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass78_1 != null && local12.aClass78_1.aClass12_7.method2716()) {
				arg0.method2714(local12.aClass78_1.aClass12_7, 128, 0, 128, true);
			}
		}
		if (arg2 < Static44.anInt1331 && arg3 > 0) {
			local12 = Static27.aClass2_Sub7ArrayArrayArray4[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass78_1 != null && local12.aClass78_1.aClass12_7.method2716()) {
				arg0.method2714(local12.aClass78_1.aClass12_7, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(ZI)V")
	public static void method2155(@OriginalArg(0) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static50.anInt2134; local7++) {
			@Pc(15) Class12_Sub3_Sub2 local15 = Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local7]];
			@Pc(24) long local24 = (long) Static23.anIntArray47[local7] << 32 | 0x20000000L;
			if (local15 != null && local15.method2727() && arg0 == local15.aClass2_Sub2_Sub12_1.aBoolean145 && local15.aClass2_Sub2_Sub12_1.method1892()) {
				@Pc(49) int local49 = local15.anInt3961 >> 7;
				@Pc(54) int local54 = local15.anInt3949 >> 7;
				if (local49 >= 0 && local49 < 104 && local54 >= 0 && local54 < 104) {
					if (local15.anInt3932 == 1 && (local15.anInt3961 & 0x7F) == 64 && (local15.anInt3949 & 0x7F) == 64) {
						if (Static186.anInt4273 == Static137.anIntArrayArray27[local49][local54]) {
							continue;
						}
						Static137.anIntArrayArray27[local49][local54] = Static186.anInt4273;
					}
					if (!local15.aClass2_Sub2_Sub12_1.aBoolean144) {
						local24 |= Long.MIN_VALUE;
					}
					local15.anInt3926 = Static212.method3261(local15.anInt3961 + (local15.anInt3932 - 1) * 64, local15.anInt3949 - (-(local15.anInt3932 * 64) + 64), anInt3147);
					Static111.method1899(anInt3147, local15.anInt3961, local15.anInt3949, local15.anInt3926, (local15.anInt3932 - 1) * 64 + 60, local15, local15.anInt3916, local24, local15.aBoolean243);
				}
			}
		}
	}
}
