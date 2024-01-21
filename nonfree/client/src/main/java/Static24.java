import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!pd;")
	public static Class20 aClass20_13;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
	public static boolean aBoolean19;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "I")
	public static int anInt503;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_294 = Static28.method504("::errortest");

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!s;")
	public static Class4_Sub16 aClass4_Sub16_2 = new Class4_Sub16(new byte[5000]);

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!ja;")
	private static Class39 aClass39_295 = Static28.method504("Your account is already logged in)3");

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!ja;")
	public static Class39 aClass39_296 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!ja;")
	public static Class39 aClass39_297 = Static28.method504("AUS");

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_298 = Static28.method504("b12_full");

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Lclient!ja;")
	public static Class39 aClass39_299 = null;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static27.method502(arg7)) {
			Static96.aClass4_Sub5Array2 = null;
			Static71.method1193(arg5, arg6, Static109.aClass4_Sub5ArrayArray1[arg7], arg2, arg1, arg3, -1, arg0, arg4);
			if (Static96.aClass4_Sub5Array2 != null) {
				Static71.method1193(Static87.anInt2230, Static28.anInt758, Static96.aClass4_Sub5Array2, arg2, arg1, arg3, -1412584499, arg0, arg4);
				Static96.aClass4_Sub5Array2 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static13.aBooleanArray3[local25] = true;
			}
		} else {
			Static13.aBooleanArray3[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILclient!bd;)V")
	public static void method327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub2_Sub2 arg3) {
		if (Static125.anInt3122 >= 50 || Static72.anInt794 == 0 || (arg3.anIntArray34 == null || arg3.anIntArray34.length <= arg1)) {
			return;
		}
		@Pc(26) int local26 = arg3.anIntArray34[arg1];
		if (local26 == 0) {
			return;
		}
		@Pc(33) int local33 = local26 >> 8;
		Static31.anIntArray91[Static125.anInt3122] = local33;
		@Pc(43) int local43 = local26 >> 4 & 0x7;
		@Pc(49) int local49 = (arg0 - 64) / 128;
		@Pc(53) int local53 = local26 & 0xF;
		@Pc(59) int local59 = (arg2 - 64) / 128;
		Static84.anIntArray221[Static125.anInt3122] = local43;
		Static68.anIntArray193[Static125.anInt3122] = 0;
		Static14.aClass62Array1[Static125.anInt3122] = null;
		Static30.anIntArray87[Static125.anInt3122] = local53 + (local59 << 8) + (local49 << 16);
		Static125.anInt3122++;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	public static void method333() {
		aClass20_13 = null;
		aClass39_294 = null;
		aBooleanArray7 = null;
		aClass39_296 = null;
		aClass39_297 = null;
		aClass39_295 = null;
		aClass39_298 = null;
		aClass39_299 = null;
		aClass4_Sub16_2 = null;
	}
}
