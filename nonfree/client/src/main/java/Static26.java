import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!iu;")
	public static Class123 aClass123_46;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Lclient!pp;")
	public static final Class198 aClass198_1 = new Class198("", 13);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZBLjava/lang/String;ILjava/lang/String;ZJZII)V")
	public static void method686(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class6_Sub1 local30 = new Class6_Sub1(128);
		local30.method6439(10);
		local30.method6453((arg7 ? 4 : 0) | (arg1 ? 1 : 0) | (arg5 ? 2 : 0));
		local30.method6475(arg6);
		local30.method6461(local8[0]);
		local30.method6448(arg2);
		local30.method6461(local8[1]);
		local30.method6453(Static128.anInt2737);
		local30.method6439(arg9);
		local30.method6439(arg8);
		local30.method6461(local8[2]);
		local30.method6453(arg3);
		local30.method6453(arg0);
		local30.method6461(local8[3]);
		local30.method6432(Static370.aBigInteger2, Static292.aBigInteger1);
		@Pc(124) Class6_Sub1 local124 = new Class6_Sub1(350);
		local124.method6448(arg4);
		@Pc(136) int local136 = 8 - Static16.method471(arg4) % 8;
		for (@Pc(138) int local138 = 0; local138 < local136; local138++) {
			local124.method6439((int) (Math.random() * 255.0D));
		}
		local124.method6454(local8);
		Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
		Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_8.anInt6416);
		Static109.aClass6_Sub1_Sub1_5.method6453(local30.anInt7898 + local124.anInt7898 + 2);
		Static109.aClass6_Sub1_Sub1_5.method6453(582);
		Static109.aClass6_Sub1_Sub1_5.method6440(local30.aByteArray96, local30.anInt7898);
		Static109.aClass6_Sub1_Sub1_5.method6440(local124.aByteArray96, local124.anInt7898);
		Static103.anInt2234 = 0;
		Static203.anInt3801 = -3;
		Static17.anInt529 = 1;
		Static2.anInt6387 = 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public static void method687(@OriginalArg(1) boolean arg0) {
		Static93.method1656(arg0, Static199.anInt3767, Static348.anInt6272, Static36.anInt1129);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method689(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg0 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg3 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg0 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local21;
			if (arg4[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}
}
