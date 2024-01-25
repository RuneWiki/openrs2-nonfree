import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!q;")
	public static Class209 aClass209_6;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!hq;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7790(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static344.method5101(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static184.anInt5417; local33++) {
			@Pc(39) String local39 = Static333.aStringArray26[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static344.method5101(local39);
			if (local39 != null && local39.equals(local20)) {
				Static184.anInt5417--;
				for (@Pc(63) int local63 = local33; local63 < Static184.anInt5417; local63++) {
					Static333.aStringArray26[local63] = Static333.aStringArray26[local63 + 1];
					Static498.aStringArray34[local63] = Static498.aStringArray34[local63 + 1];
					Static476.anIntArray532[local63] = Static476.anIntArray532[local63 + 1];
					Static38.aStringArray4[local63] = Static38.aStringArray4[local63 + 1];
					Static298.anIntArray349[local63] = Static298.anIntArray349[local63 + 1];
					Static138.aBooleanArray3[local63] = Static138.aBooleanArray3[local63 + 1];
				}
				Static18.anInt603 = Static274.anInt5077;
				@Pc(132) Class1_Sub48 local132 = Static320.method4867(Static442.aClass170_2, Static336.aClass319_107);
				local132.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0));
				local132.aClass1_Sub20_Sub1_2.method4399(arg0);
				Static34.method813(local132);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBI[ILclient!ag;I)Lclient!po;")
	public static Class200_Sub3 method7794(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class12_Sub1 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(28) int local28 = arg4 * local12 + arg2[local12];
			for (@Pc(30) int local30 = 0; local30 < arg0[local12]; local30++) {
				local10[local28++] = -1;
			}
		}
		return new Class200_Sub3(arg3, arg4, arg1, local10);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!ag;ZII[I)Lclient!ck;")
	public static Class52_Sub1_Sub1 method7797(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3) {
		if (arg1.aBoolean22 || Static119.method2029(arg0) && Static119.method2029(arg2)) {
			return new Class52_Sub1_Sub1(arg1, 3553, arg0, arg2, false, arg3);
		} else if (arg1.aBoolean21) {
			return new Class52_Sub1_Sub1(arg1, 34037, arg0, arg2, false, arg3);
		} else {
			return new Class52_Sub1_Sub1(arg1, arg0, arg2, Static200.method3428(arg0), Static200.method3428(arg2), arg3);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lclient!wv;")
	public static Class365 method7803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class365 local7 = Static374.method5437(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass365Array2 == null || local7.aClass365Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass365Array2[arg1];
		}
	}
}
