import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "Z")
	public static boolean aBoolean424 = true;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZIZIZBLjava/lang/String;JLjava/lang/String;II)V")
	public static void method5053(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class2_Sub16 local30 = new Class2_Sub16(128);
		local30.method5358(10);
		local30.method5351((arg0 ? 1 : 0) | (arg4 ? 2 : 0) | (arg2 ? 4 : 0));
		local30.method5368(arg6);
		local30.method5355(local8[0]);
		local30.method5362(arg5);
		local30.method5355(local8[1]);
		local30.method5351(Static16.anInt383);
		local30.method5358(arg3);
		local30.method5358(arg8);
		local30.method5355(local8[2]);
		local30.method5351(arg1);
		local30.method5351(arg9);
		local30.method5355(local8[3]);
		local30.method5347(Static200.aBigInteger1, Static278.aBigInteger2);
		@Pc(121) Class2_Sub16 local121 = new Class2_Sub16(350);
		local121.method5362(arg7);
		@Pc(134) int local134 = 8 - Static204.method3471(arg7) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local121.method5358((int) (Math.random() * 255.0D));
		}
		local121.method5367(local8);
		Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
		Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_8.anInt444);
		Static372.aClass2_Sub16_Sub2_4.method5351(local30.anInt6145 + local121.anInt6145 + 2);
		Static372.aClass2_Sub16_Sub2_4.method5351(573);
		Static372.aClass2_Sub16_Sub2_4.method5344(local30.aByteArray112, local30.anInt6145);
		Static372.aClass2_Sub16_Sub2_4.method5344(local121.aByteArray112, local121.anInt6145);
		Static100.anInt2067 = 0;
		Static106.anInt2303 = -3;
		Static93.anInt1906 = 0;
		Static349.anInt4698 = 1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public static void method5059(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub10_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class107 local8 = Static90.aClass107Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static341.anInt5833; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static12.anInt312; local15++) {
						local1 = local8.method4668(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static333.anInt5694;
							@Pc(32) int local32 = local12 << Static333.anInt5694;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class107 local41 = Static90.aClass107Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4685(local15, local12) - local41.method4685(local15, local12);
									@Pc(67) int local67 = local8.method4685(local15 + 1, local12) - local41.method4685(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4685(local15 + 1, local12 + 1) - local41.method4685(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4685(local15, local12 + 1) - local41.method4685(local15, local12 + 1);
									local41.method4677(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
