import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_22 = new Class186(59, 12);

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_25 = new Class231("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static81.anInt1574 && arg4 <= Static99.anInt1808 && Static81.anInt1574 <= arg6 && arg6 <= Static99.anInt1808 && arg2 >= Static81.anInt1574 && arg2 <= Static99.anInt1808 && Static81.anInt1574 <= arg8 && arg8 <= Static99.anInt1808 && arg0 >= Static97.anInt1796 && arg0 <= Static85.anInt1636 && Static97.anInt1796 <= arg1 && Static85.anInt1636 >= arg1 && arg3 >= Static97.anInt1796 && Static85.anInt1636 >= arg3 && arg7 >= Static97.anInt1796 && Static85.anInt1636 >= arg7) {
			Static375.method5206(arg1, arg8, arg4, arg7, arg2, arg5, arg6, arg0, arg3);
		} else {
			Static283.method4262(arg1, arg8, arg3, arg5, arg6, arg7, arg4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIJIIIZLjava/lang/String;ZLjava/lang/String;Z)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) String arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) String arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class6_Sub15 local28 = new Class6_Sub15(128);
		local28.method3075(10);
		local28.method3100((arg5 ? 4 : 0) | (arg9 ? 1 : 0) | (arg7 ? 2 : 0));
		local28.method3115(arg2);
		local28.method3107(local8[0]);
		local28.method3094(arg6);
		local28.method3107(local8[1]);
		local28.method3100(Static441.anInt7213);
		local28.method3075(arg1);
		local28.method3075(arg4);
		local28.method3107(local8[2]);
		local28.method3100(arg0);
		local28.method3100(arg3);
		local28.method3107(local8[3]);
		local28.method3087(Static35.aBigInteger1, Static318.aBigInteger2);
		@Pc(114) Class6_Sub15 local114 = new Class6_Sub15(350);
		local114.method3094(arg8);
		@Pc(127) int local127 = 8 - Static384.method5308(arg8) % 8;
		for (@Pc(133) int local133 = 0; local133 < local127; local133++) {
			local114.method3075((int) (Math.random() * 255.0D));
		}
		local114.method3076(local8);
		Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
		Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_8.anInt414);
		Static449.aClass6_Sub15_Sub1_2.method3100(local114.anInt3487 + local28.anInt3487 + 2);
		Static449.aClass6_Sub15_Sub1_2.method3100(581);
		Static449.aClass6_Sub15_Sub1_2.method3135(local28.anInt3487, local28.aByteArray51);
		Static449.aClass6_Sub15_Sub1_2.method3135(local114.anInt3487, local114.aByteArray51);
		Static201.anInt3540 = -3;
		Static376.anInt5177 = 0;
		Static90.anInt1675 = 1;
		Static264.anInt4544 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1502(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		@Pc(12) int local12 = local8.method3111();
		@Pc(16) int local16 = local8.method3109();
		if (local16 < 0 || Static386.anInt6359 != 0 && Static386.anInt6359 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(46) byte[] local46 = new byte[local16];
			local8.method3127(local46, local16);
			return local46;
		} else {
			@Pc(58) int local58 = local8.method3109();
			if (local58 < 0 || Static386.anInt6359 != 0 && Static386.anInt6359 < local58) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local58];
			if (local12 == 1) {
				Static440.method5918(local72, local58, arg0, local16);
			} else {
				Static290.aClass120_1.method2735(local72, local8);
			}
			return local72;
		}
	}
}
