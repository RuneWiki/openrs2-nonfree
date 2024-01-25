import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!tf;")
	public static final Class319 aClass319_4 = new Class319();

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_115 = new Class272(63, 4);

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
	public static int anInt3692 = -1;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIJLjava/lang/String;IBZLjava/lang/String;IZ)V")
	public static void method3272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (!Static255.aBoolean352 && Static151.anInt3123 < 500) {
			@Pc(20) int local20 = arg8 == -1 ? Static212.anInt4226 : arg8;
			@Pc(34) Class3_Sub44 local34 = new Class3_Sub44(arg4, arg7, local20, arg0, arg2, arg3, arg5, arg1, arg6, arg9);
			Static187.aClass130_15.method3548(local34);
			Static151.anInt3123++;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IBII)V")
	public static void method3277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static529.anInt8344 + arg1;
		@Pc(13) int local13 = Static463.anInt7588 + arg0;
		if (Static554.aClass63ArrayArrayArray4 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static400.anInt6818 || arg0 >= Static271.anInt5050 || !Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932) && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != arg2) {
			return;
		}
		@Pc(51) long local51 = (long) (local9 | local13 << 14 | arg2 << 28);
		@Pc(62) Class3_Sub46 local62 = (Class3_Sub46) Static508.aClass310_33.method6601(local51);
		if (local62 == null) {
			Static446.method6256(arg2, arg1, arg0);
			return;
		}
		@Pc(76) Class3_Sub35 local76 = (Class3_Sub35) local62.aClass130_64.method3543();
		if (local76 == null) {
			Static446.method6256(arg2, arg1, arg0);
			return;
		}
		@Pc(90) Class9_Sub1_Sub5_Sub1 local90 = (Class9_Sub1_Sub5_Sub1) Static446.method6256(arg2, arg1, arg0);
		if (local90 == null) {
			local90 = new Class9_Sub1_Sub5_Sub1(arg1 << 9, Static29.aClass139Array6[arg2].method6889(arg1, arg0), arg0 << 9, arg2, arg2);
		} else {
			local90.anInt9006 = local90.anInt8994 = -1;
		}
		local90.anInt8998 = local76.anInt6127;
		local90.anInt9007 = local76.anInt6129;
		label56: while (true) {
			@Pc(133) Class3_Sub35 local133 = (Class3_Sub35) local62.aClass130_64.method3551();
			if (local133 == null) {
				break;
			}
			if (local133.anInt6129 != local90.anInt9007) {
				local90.anInt8997 = local133.anInt6127;
				local90.anInt9006 = local133.anInt6129;
				while (true) {
					@Pc(154) Class3_Sub35 local154 = (Class3_Sub35) local62.aClass130_64.method3551();
					if (local154 == null) {
						break label56;
					}
					if (local154.anInt6129 != local90.anInt9007 && local90.anInt9006 != local154.anInt6129) {
						local90.anInt8994 = local154.anInt6129;
						local90.anInt9003 = local154.anInt6127;
					}
				}
			}
		}
		@Pc(198) int local198 = Static130.method2562((arg0 << 9) + 256, arg2, (arg1 << 9) + 256);
		local90.aByte126 = (byte) arg2;
		local90.anInt8975 = arg1 << 9;
		local90.anInt8977 = local198;
		local90.aByte125 = (byte) arg2;
		local90.anInt8980 = arg0 << 9;
		if (Static425.method6053(arg1, arg0)) {
			local90.aByte125++;
		}
		Static37.method656(arg2, arg1, arg0, local198, local90);
	}
}
