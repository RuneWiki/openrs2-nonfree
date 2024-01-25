import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public static int anInt6353 = 0;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray177 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!va", name = "n", descriptor = "[B")
	public static final byte[] aByteArray89 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!va", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray78 = new String[100];

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
	public static final boolean aBoolean464 = false;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method5378(@OriginalArg(2) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local48 >= '0' && local48 <= '9') {
				local87 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local87 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local87 = local48 - 'W';
			} else {
				return false;
			}
			if (local87 >= 10) {
				return false;
			}
			if (local33) {
				local87 = -local87;
			}
			@Pc(121) int local121 = local37 * 10 + local87;
			if (local121 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local121;
		}
		return local35;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!br;Lclient!br;B)V")
	public static void method5380(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1) {
		Static15.aClass4_Sub11_Sub1_2.method706(254);
		Static15.aClass4_Sub11_Sub1_2.method3452(arg1.anInt728);
		Static15.aClass4_Sub11_Sub1_2.method3443(arg1.anInt770);
		Static15.aClass4_Sub11_Sub1_2.method3459(arg1.anInt791);
		Static15.aClass4_Sub11_Sub1_2.method3443(arg0.anInt791);
		Static15.aClass4_Sub11_Sub1_2.method3452(arg0.anInt728);
		Static15.aClass4_Sub11_Sub1_2.method3402(arg0.anInt770);
	}
}
