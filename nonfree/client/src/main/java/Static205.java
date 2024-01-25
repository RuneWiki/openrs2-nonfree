import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!jq", name = "Jb", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_56 = new Class198("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "[I")
	public static final int[] anIntArray194 = new int[3];

	@OriginalMember(owner = "client!jq", name = "sb", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_82 = new Class129(53, 6);

	@OriginalMember(owner = "client!jq", name = "Eb", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_83 = new Class129(109, 6);

	@OriginalMember(owner = "client!jq", name = "Gb", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_84 = new Class129(26, 8);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IFIILclient!cc;IFFIIF[BFI)V")
	public static void method2728(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class3 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) byte[] arg7, @OriginalArg(12) float arg8) {
		@Pc(20) float[] local20 = new float[16384];
		@Pc(26) int local26;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
			local26 = arg1;
			arg2.method36(arg0 / (float) 128, local20, arg6 / (float) 16, arg3 / (float) 128, arg4 * 127.0F, arg5, 0);
			arg3 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg7[local26] = (byte) ((float) arg7[local26] + local20[local56]);
				local26++;
			}
			arg0 *= 2.0F;
			arg6 *= 2.0F;
			arg4 *= arg8;
		}
		local26 = arg1;
		for (local56 = 0; local56 < 16384; local56++) {
			arg7[local26] -= -127;
			local26++;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public static void method2741() {
		if (Static216.aClass1_Sub1_1.method3587(Static146.anInt2644) || Static6.anInt131 == Static123.anInt2187) {
			Static53.method830(Static407.aClass200_9);
			if (Static230.anInt7229 != Static6.anInt131) {
				Static353.method4566();
			}
		} else {
			Static36.method615(false, 10, Static375.anInt6241, Static345.anInt5641);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!fi;II)V")
	public static void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray5 != null) {
			@Pc(13) Class5_Sub33 local13 = new Class5_Sub33();
			local13.anObjectArray35 = arg1.anObjectArray5;
			local13.aClass76_12 = arg1;
			Static181.method2470(local13);
		}
		Static374.anInt6237 = arg1.anInt2057;
		Static127.anInt2221 = arg1.anInt2115;
		Static143.anInt2595 = arg1.anInt2100;
		Static333.anInt5333 = arg1.anInt2066;
		Static277.anInt4336 = arg0;
		Static360.anInt5869 = arg1.anInt2055;
		Static423.aBoolean478 = true;
		Static154.anInt6464 = arg2;
		Static53.method833(arg1);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
	public static void method2752() {
		if (Static407.aClass200_9 == null) {
			return;
		}
		Static322.aClass107_10.method2329();
		Static45.method34();
		Static157.method2216();
		Static109.method1497();
		Static127.method1778();
		Static422.method5609();
		if (Static51.aClass207_1 != null) {
			Static51.aClass207_1.method4569();
		}
		Static327.method864();
		Static159.method2247();
		Static74.method1086();
		Static182.method2493(false);
		Static245.method3169();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class2_Sub1_Sub3_Sub2 local47 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local41];
			if (local47 != null) {
				local47.aClass5_Sub11_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass57Array3.length; local54++) {
					local47.aClass57Array3[local54] = null;
				}
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static111.anInt1879; local77++) {
			@Pc(84) Class2_Sub1_Sub3_Sub1 local84 = Static277.aClass5_Sub7Array1[local77].aClass2_Sub1_Sub3_Sub1_1;
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < local84.aClass57Array3.length; local88++) {
					local84.aClass57Array3[local88] = null;
				}
			}
		}
		Static43.aClass29_5 = null;
		Static344.aClass29_6 = null;
		Static407.aClass200_9.method5827();
		Static407.aClass200_9 = null;
	}
}
